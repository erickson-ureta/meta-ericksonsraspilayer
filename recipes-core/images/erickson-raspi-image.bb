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

# Networking support
IMAGE_INSTALL:append = " iwd"
IMAGE_INSTALL:append = " linux-firmware-bcm43430"

IMAGE_INSTALL:append = " ffmpeg"
IMAGE_INSTALL:append = " helloworld"
IMAGE_INSTALL:append = " util-linux"
IMAGE_INSTALL:append = " vim"
