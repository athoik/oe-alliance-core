SUMMARY = "Merge machine and distro options to create a enigma2 feeds machine task/package"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

ALLOW_EMPTY_${PN} = "1"

PV = "1.0"
PR = "r3"

inherit packagegroup

RRECOMMENDS_${PN} = "\
    enigma2-skins \
    enigma2-pliplugins \
    enigma2-plugin-extensions-cooltvguide \
    cdfs \
    enigma2-plugin-extensions-enhancedmoviecenter \
    "
