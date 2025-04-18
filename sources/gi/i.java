package gi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import wh.a0;
import wh.c0;

/* loaded from: classes5.dex */
public final class i extends l {

    /* renamed from: h, reason: collision with root package name */
    public static final c0 f18500h = new c0(15, 0);

    /* renamed from: c, reason: collision with root package name */
    public final Method f18501c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f18502d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f18503e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f18504f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f18505g;

    public i(Method putMethod, Method getMethod, Method removeMethod, Class clientProviderClass, Class serverProviderClass) {
        Intrinsics.checkNotNullParameter(putMethod, "putMethod");
        Intrinsics.checkNotNullParameter(getMethod, "getMethod");
        Intrinsics.checkNotNullParameter(removeMethod, "removeMethod");
        Intrinsics.checkNotNullParameter(clientProviderClass, "clientProviderClass");
        Intrinsics.checkNotNullParameter(serverProviderClass, "serverProviderClass");
        this.f18501c = putMethod;
        this.f18502d = getMethod;
        this.f18503e = removeMethod;
        this.f18504f = clientProviderClass;
        this.f18505g = serverProviderClass;
    }

    @Override // gi.l
    public final void a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            this.f18503e.invoke(null, sslSocket);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        }
    }

    @Override // gi.l
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            this.f18501c.invoke(null, sslSocket, Proxy.newProxyInstance(l.class.getClassLoader(), new Class[]{this.f18504f, this.f18505g}, new h(a0.h(protocols))));
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        }
    }

    @Override // gi.l
    public final String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f18502d.invoke(null, sslSocket));
            if (invocationHandler != null) {
                h hVar = (h) invocationHandler;
                boolean z10 = hVar.f18498b;
                if (!z10 && hVar.f18499c == null) {
                    l.i(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                    return null;
                }
                if (z10) {
                    return null;
                }
                return hVar.f18499c;
            }
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        }
    }
}
