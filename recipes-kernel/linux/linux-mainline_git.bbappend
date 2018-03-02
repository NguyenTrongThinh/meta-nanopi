require recipes-kernel/linux/linux-dtb.inc
PV = "4.16+git${SRCPV}"
SRCREV_pn-${PN} = "${AUTOREV}"

FILESEXTRAPATHS_append := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-Add-eMMC-Device-Tree.patch \
	file://0002-Enable-sunxi-codec.patch \
	file://defconfig"
