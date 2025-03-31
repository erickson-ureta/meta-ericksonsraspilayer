include recipes-core/images/core-image-base.bb

COMPATIBLE_MACHINE = "^rpi$"

IMAGE_INSTALL:append = "helloworld"
IMAGE_INSTALL:append = "util-linux"
IMAGE_INSTALL:append = "vim"
IMAGE_INSTALL:append = "ffmpeg"
