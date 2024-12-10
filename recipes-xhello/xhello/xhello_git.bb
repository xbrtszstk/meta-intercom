# Copyright (c) 2024 Bartosz Szostak
# This software is released under the MIT License.
# See the LICENSE file for more details.

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=976d522e73fc2beb42998d5fd693c819"

SRC_URI = "git://github.com/xbrtszstk/xhello.git;branch=main;protocol=https"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "xhello"
PUBSPEC_IGNORE_LOCKFILE = "1"

inherit flutter-app
