DESCRIPTION = "Transmission RPC is a python module that can communicate with the bittorrent client Transmission through json-rpc"
HOMEPAGE = "http://bitbucket.org/blueluna/transmissionrpc/wiki/Home"
SECTION = "devel/python"
PRIORITY = "optional"
LICENSE = "MIT"
RDEPENDS:${PN} = "python-simplejson"
PV = "0.7+hg${SRCREV}"

SRC_URI = "hg://bitbucket.org/blueluna;protocol=https;branch=master;module=transmissionrpc;rev=${SRCREV}"

S = "${WORKDIR}/transmissionrpc"

inherit setuptools

include python-package-split.inc
