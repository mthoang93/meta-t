SUMMARY = "vSomeIp - C++ library for SOME/IP protocol"
DESCRIPTION = "An implementation of Scalable service-Oriented MiddlewarE over IP"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9741c346eef56131163e13b9db1241b3"

SRC_URI = "https://github.com/COVESA/vsomeip/archive/refs/tags/${PV}.tar.gz \
           file://0001-cmake-disable_test.patch \
"
SRC_URI[md5sum] = "5e6860a31e014346445595358f4ac9c7"

DEPENDS = "boost systemd"

S = "${WORKDIR}/vsomeip-${PV}"

inherit pkgconfig cmake

EXTRA_OECMAKE = ""

FILES:${PN} += "${sysconfdir}/${BPN}"

do_install:append() {
    mv ${D}/usr/etc ${D}
}
