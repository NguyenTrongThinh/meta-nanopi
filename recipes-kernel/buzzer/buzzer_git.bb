LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a23a74b3f4caf9616230789d94217acb"

SRC_URI = "git://github.com/NguyenTrongThinh/buzzer-driver.git;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit module

COMPATIBLE_MACHINE = "(nanopi-neo)"
KERNEL_MODULE_AUTOLOAD = "buzzer"
