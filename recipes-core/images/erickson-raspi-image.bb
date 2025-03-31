include recipes-core/images/core-image-base.bb

SUMMARY = "My own custom Yocto image for the Raspberry Pi 3A+"
LICENSE = "MIT"

COMPATIBLE_MACHINE = "^rpi$"

IMAGE_FSTYPES:remove = " ext3"
IMAGE_FSTYPES:remove = " tar.bz2"
IMAGE_FSTYPES:append = " ext4"

# Lines taken from core-image-minimal-xfce for xfce compatibility
inherit features_check
REQUIRED_DISTRO_FEATURES = "x11"
IMAGE_LINGUAS ?= " "
SYSTEMD_DEFAULT_TARGET = "graphical.target"
IMAGE_INSTALL:append = " packagegroup-core-x11"
IMAGE_INSTALL:append = " packagegroup-xfce-base"

# Packages needed for wifi support
#IMAGE_INSTALL:append = " linux-firmware-bcm43430"
#IMAGE_INSTALL:append = " bluez5"
#IMAGE_INSTALL:append = " i2c-tools"
#IMAGE_INSTALL:append = " python3-smbus"
#IMAGE_INSTALL:append = " bridge-utils"
#IMAGE_INSTALL:append = " hostapd"
#IMAGE_INSTALL:append = " dhcp-server"
#IMAGE_INSTALL:append = " iptables"
#IMAGE_INSTALL:append = " wpa-supplicant"

# Everything else
IMAGE_INSTALL:append = " helloworld"
IMAGE_INSTALL:append = " util-linux"
IMAGE_INSTALL:append = " vim"
IMAGE_INSTALL:append = " ffmpeg"
