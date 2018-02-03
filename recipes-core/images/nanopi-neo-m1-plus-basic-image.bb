include recipes-core/images/core-image-minimal.bb
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
COMPATIBLE_MACHINE = "(nanopi-neo-m1-plus)"

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
IDE_DEBUG_FEATURE = "debug-tweaks eclipse-debug package-management tools-debug"


# Support System monitor
SYS_MORNITOR = "htop"

# Support Time zone
TIME_ZONE = "tzdata tzdata-asia"

# Tool Debug
DEBUG_TOOL = "i2c-tools spitools"

# Software updater
SWUPDATER = "swupdate swupdate-www mtd-utils mtd-utils-ubifs libconfig util-linux-sfdisk"

#Support font
TTF_DEJAVU_FONTS = "ttf-dejavu-common ttf-dejavu-mathtexgyre ttf-dejavu-sans ttf-dejavu-sans-condensed \
			ttf-dejavu-sans-mono ttf-dejavu-serif ttf-dejavu-serif-condensed"
IMAGE_INSTALL += "${REMOTE_SSH_IMAGE} ${CONSOLE_TEXT_APP} ${SYS_MORNITOR} ${NETWORK_MANAGER} ${TIME_ZONE} ${DEBUG_TOOL} ${SWUPDATER} ${TTF_DEJAVU_FONTS}"

IMAGE_FEATURES += "${REMOTE_SSH_FEATURE} ${IDE_DEBUG_FEATURE}"
