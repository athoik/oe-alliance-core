DESCRIPTION = "GigaBlue GB800XX CFE AddOn"
SECTION = "base"
PRIORITY = "required"
LICENSE = "proprietary"
MAINTAINER = "openMips"
PACKAGE_ARCH = "${MACHINE_ARCH}"

require conf/license/license-gplv2.inc

PR = "r18"

S = "${WORKDIR}"

SRC_URI_gb800se = " file://burn.bat"
SRC_URI_gb800solo = " file://burn.bat"
SRC_URI_gb800ue = " file://gb800ue/lcdwaitkey.bin file://gb800ue/lcdwarning.bin"
SRC_URI_gbquad = " file://gbquad/lcdwaitkey.bin file://gbquad/lcdwarning.bin"

ALLOW_EMPTY_${PN} = "1"

do_install_append_gb800solo() {
    install -d ${DEPLOY_DIR_IMAGE}
	install -m 0755 ${S}/burn.bat ${DEPLOY_DIR_IMAGE}/burn.bat
}
do_install_append_gb800se() {
    install -d ${DEPLOY_DIR_IMAGE}
	install -m 0755 ${S}/burn.bat ${DEPLOY_DIR_IMAGE}/burn.bat
}
do_install_append_gb800ue() {
    install -d ${DEPLOY_DIR_IMAGE}
	install -m 0755 ${S}/gb800ue/lcdwaitkey.bin ${DEPLOY_DIR_IMAGE}/lcdwaitkey.bin
	install -m 0755 ${S}/gb800ue/lcdwarning.bin ${DEPLOY_DIR_IMAGE}/lcdwarning.bin
}
do_install_append_gbquad() {
    install -d ${DEPLOY_DIR_IMAGE}
	install -m 0755 ${S}/gbquad/lcdwaitkey.bin ${DEPLOY_DIR_IMAGE}/lcdwaitkey.bin
	install -m 0755 ${S}/gbquad/lcdwaitkey.bin ${DEPLOY_DIR_IMAGE}/lcdwarning.bin
}
