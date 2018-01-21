RDEPENDS_${PN}_remove = " ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', '', 'qtdeclarative-plugins', d)}"
