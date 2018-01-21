LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=410f2c0bd162908079fda25264ad7b45"

FILESEXTRAPATHS_append := "${THISDIR}/${PN}_${PV}:"

SRC_URI = "git://github.com/mciupak/nrf24.git;protocol=https"
SRC_URI += "file://0001-patch-makefile-yocto-build.patch"

# Modify these as desired
PV = "0.1.0+git${SRCPV}"
SRCREV = "0f699994bcad2425f5f9fe7cacc89e60cebb2dee"

S = "${WORKDIR}/git"

inherit module

EXTRA_OEMAKE_append_task-install = " -C ${STAGING_KERNEL_DIR} M=${S}"
EXTRA_OEMAKE += "KERNEL_DIR=${STAGING_KERNEL_DIR}"

COMPATIBLE_MACHINE = "(nanopi-neo)"
KERNEL_MODULE_AUTOLOAD = "nrf24"
