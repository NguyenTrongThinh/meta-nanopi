# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
#
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ff49a906476adf4bc333008cfabb5a63"
FILESEXTRAPATHS_append := "${THISDIR}/${PN}_${PV}:"

SRC_URI = "git://github.com/NguyenTrongThinh/Linux-Device-Driver-for-Character-LCD-Kernel-Level.git;protocol=https;branch=personal"
SRC_URI += "file://0001-patch-lcd-pin.patch"
# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit module

COMPATIBLE_MACHINE = "(nanopi-neo)"
KERNEL_MODULE_AUTOLOAD = "klcd"
