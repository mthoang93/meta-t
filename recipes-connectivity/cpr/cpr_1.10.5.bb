SUMMARY = "C++ Requests: Curl for People"
DESCRIPTION = "C++ Requests: Curl for People, a spiritual port of Python Requests."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08beaae5deae1c43c065592da8f38095"

SRC_URI = "git://github.com/libcpr/cpr;branch=1.10.x;protocol=https"
SRCREV = "3b15fa82ea74739b574d705fea44959b58142eb8"

DEPENDS = "curl"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += "-DCPR_USE_SYSTEM_CURL=ON"