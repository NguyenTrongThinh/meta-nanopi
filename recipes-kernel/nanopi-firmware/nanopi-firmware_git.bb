DESCRIPTION = "Install ARMBIAN firmware to file system"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"


SRC_URI = "git://github.com/armbian/firmware.git;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"
FILES_${PN} += "${base_libdir}/firmware"
do_configure () {
	echo "Nothing to do configure"
}

do_compile () {
	echo "Nothing to do compile"
}

do_install () {
	install -d ${D}${base_libdir}/firmware
	cp -r ${S}/* ${D}${base_libdir}/firmware
}

