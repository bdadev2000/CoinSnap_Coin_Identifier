package com.bykv.vk.openvk.component.video.zp.lMd;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
class dT extends ProxySelector {
    private static final List<Proxy> zp = Collections.singletonList(Proxy.NO_PROXY);
    private final String KS;
    private final int jU;
    private final ProxySelector lMd = ProxySelector.getDefault();

    private dT(String str, int i9) {
        this.KS = str;
        this.jU = i9;
    }

    public static void zp(String str, int i9) {
        ProxySelector.setDefault(new dT(str, i9));
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.lMd.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        if (uri != null) {
            if (this.KS.equalsIgnoreCase(uri.getHost()) && this.jU == uri.getPort()) {
                return zp;
            }
            return this.lMd.select(uri);
        }
        throw new IllegalArgumentException("URI can't be null");
    }
}
