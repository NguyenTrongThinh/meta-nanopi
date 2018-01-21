# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   hostapd-0.8/COPYING
#
LICENSE = "GPLv2 & GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7 \
                    file://hostapd-0.8/COPYING;md5=c54ce9345727175ff66d17b67ff51f58"

SRC_URI = "git://github.com/lwfinger/rtl8188eu.git;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "c5113ffec0e7081b1facc1f809e4d03e5d60e9d4"

S = "${WORKDIR}/git"

inherit module

EXTRA_OEMAKE_append_task-install = " -C ${STAGING_KERNEL_DIR} M=${S}"
EXTRA_OEMAKE += "KSRC=${STAGING_KERNEL_DIR}"


COMPATIBLE_MACHINE = "(nanopi-neo)"
KERNEL_MODULE_AUTOLOAD = "8188eu"

FILES_${PN} += "${base_libdir}/firmware/rtlwifi"
PACKAGE_ARCH = "${MACHINE_ARCH}"

do_install_append() {
	install -d ${D}${base_libdir}/firmware/rtlwifi
	install -m 0644 ${S}/rtl8188eufw.bin ${D}${base_libdir}/firmware/rtlwifi
}

