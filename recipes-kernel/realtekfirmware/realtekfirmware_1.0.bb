DESCRIPTION = "Install realtek wifi firmware to file system"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

FILESEXTRAPATHS_append_nanopi-neo := "${THISDIR}/${PN}_${PV}:"

SRC_URI = "file://rtl8188eufw.bin;name=rtl8188eu"
SRC_URI[rtl8188eu.md5] = "aaef52a47852e599cbff63a3e7f96a94"

COMPATIBLE_MACHINE = "nanopi-neo"

PR = "r1"
S = "${WORKDIR}"

FILES_${PN} += "${base_libdir}/firmware/rtlwifi"

do_install() {
	install -d ${D}${base_libdir}/firmware/rtlwifi
	install -m 0644 ${S}/rtl8188eufw.bin ${D}${base_libdir}/firmware/rtlwifi
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
