package a5;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class q extends ProxySelector {

    /* renamed from: d, reason: collision with root package name */
    public static final List f232d = Collections.singletonList(Proxy.NO_PROXY);
    public final ProxySelector a = ProxySelector.getDefault();

    /* renamed from: b, reason: collision with root package name */
    public final String f233b;

    /* renamed from: c, reason: collision with root package name */
    public final int f234c;

    public q(String str, int i10) {
        this.f233b = str;
        this.f234c = i10;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.a.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            if (this.f233b.equalsIgnoreCase(uri.getHost()) && this.f234c == uri.getPort()) {
                return f232d;
            }
            return this.a.select(uri);
        }
        throw new IllegalArgumentException("URI can't be null");
    }
}
