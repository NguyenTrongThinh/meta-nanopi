# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)
#
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/ilpianista/libsystemd-qt.git;protocol=https"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "${AUTOREV}"
FILES_${PN}_append = " /usr/lib/cmake"
S = "${WORKDIR}/git"

# NOTE: unable to map the following CMake package dependencies: Qt4
DEPENDS = "qtbase"

inherit cmake pkgconfig cmake_qt5

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DCMAKE_INSTALL_PREFIX=/usr"
