LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"
FILESEXTRAPATHS_append := "${THISDIR}/${PN}_${PV}:"

SRC_URI = "git://github.com/NguyenTrongThinh/hd44780-i2c.git;protocol=https"

# Modify these as desired
PV = "1.0.0+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit module

COMPATIBLE_MACHINE = "(nanopi-neo)"
KERNEL_MODULE_AUTOLOAD = "hd44780"
