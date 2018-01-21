include recipes-core/images/core-image-minimal.bb
inherit populate_sdk_qt5
# Include modules in rootfs
IMAGE_INSTALL += " \
	kernel-modules \
	"
# Support Remote Control
REMOTE_SSH_FEATURE = "ssh-server-dropbear ssh-server-openssh"
REMOTE_SSH_IMAGE = "openssh openssh-sshd openssh-sftp openssh-sftp-server"
# Support Network
NETWORK_MANAGER = "connman connman-client"

# Support text app
CONSOLE_TEXT_APP = "nano"

# Support Debug tools
IDE_DEBUG_FEATURE = "debug-tweaks eclipse-debug qtcreator-debug package-management tools-debug"

#Support font

# Support System monitor
SYS_MORNITOR = "htop"

# Support Time zone
TIME_ZONE = "tzdata tzdata-asia"

# Tool Debug
DEBUG_TOOL = "i2c-tools spitools"

#Sunxi Tools

SUNXI_TOOLS="sunxi-tools"

# Kernel source dev

KERNEL_SRC_DEV="kernel-devsrc"
# Software updater
SWUPDATER = "swupdate swupdate-www mtd-utils mtd-utils-ubifs libconfig util-linux-sfdisk"


# Qt5 Embedded

QT5_CORE="qtbase qtdeclarative qtconnectivity \
	qtenginio qtmultimedia qtnetworkauth qtscript qtserialport \
	qtsystems"
TTF_DEJAVU_FONTS = "ttf-dejavu-common ttf-dejavu-mathtexgyre ttf-dejavu-sans ttf-dejavu-sans-condensed \
			ttf-dejavu-sans-mono ttf-dejavu-serif ttf-dejavu-serif-condensed"
IMAGE_INSTALL += "${REMOTE_SSH_IMAGE} ${CONSOLE_TEXT_APP} ${SYS_MORNITOR} ${NETWORK_MANAGER} ${TIME_ZONE} ${DEBUG_TOOL} ${QT5_CORE} ${SWUPDATER} ${TTF_DEJAVU_FONTS}"

IMAGE_FEATURES += "${REMOTE_SSH_FEATURE} ${IDE_DEBUG_FEATURE}"

#TOOLCHAIN_TARGET_TASK_append = " ${KERNEL_SRC_DEV}"
