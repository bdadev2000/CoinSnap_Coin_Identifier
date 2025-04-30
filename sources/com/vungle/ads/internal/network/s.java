package com.vungle.ads.internal.network;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* loaded from: classes3.dex */
public final class s extends ProxySelector {
    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        try {
            ProxySelector.getDefault().connectFailed(uri, socketAddress, iOException);
        } catch (Exception unused) {
        }
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        try {
            List<Proxy> select = ProxySelector.getDefault().select(uri);
            G7.j.d(select, "{\n                      …ri)\n                    }");
            return select;
        } catch (Exception unused) {
            return android.support.v4.media.session.a.w(Proxy.NO_PROXY);
        }
    }
}
