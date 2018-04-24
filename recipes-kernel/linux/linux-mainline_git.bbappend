PV = "4.16+git${SRCPV}"
SRCREV_pn-${PN} = "${AUTOREV}"

FILESEXTRAPATHS_append := "${THISDIR}/${PN}:"

DEFAULT_PREFERENCE = "1" 

SRC_URI += "file://0002-Enable-sunxi-codec.patch \
	file://defconfig"
