include recipes-core/images/core-image-base.bb

SUMMARY = "My own custom Yocto image for the Raspberry Pi 3A+"
LICENSE = "MIT"

COMPATIBLE_MACHINE = "^rpi$"

#IMAGE_INSTALL ?= " packagegroup-core-boot \
#    packagegroup-core-x11 \
#    packagegroup-xfce-base \
#    kernel-modules \
#"

# Lines taken from core-image-minimal-xfce for xfce compatibility
inherit features_check
REQUIRED_DISTRO_FEATURES = "x11"
IMAGE_LINGUAS ?= " "
SYSTEMD_DEFAULT_TARGET = "graphical.target"
IMAGE_INSTALL:append = " packagegroup-core-x11"
IMAGE_INSTALL:append = " packagegroup-xfce-base"

IMAGE_INSTALL:append = " helloworld"
IMAGE_INSTALL:append = " util-linux"
IMAGE_INSTALL:append = " vim"
IMAGE_INSTALL:append = " ffmpeg"
