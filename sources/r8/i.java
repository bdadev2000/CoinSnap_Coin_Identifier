package r8;

import i8.A;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import u7.AbstractC2818i;

/* loaded from: classes3.dex */
public final class i extends m {

    /* renamed from: c, reason: collision with root package name */
    public final Method f22941c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f22942d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f22943e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f22944f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f22945g;

    public i(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f22941c = method;
        this.f22942d = method2;
        this.f22943e = method3;
        this.f22944f = cls;
        this.f22945g = cls2;
    }

    @Override // r8.m
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f22943e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to remove ALPN", e4);
        } catch (InvocationTargetException e9) {
            throw new AssertionError("failed to remove ALPN", e9);
        }
    }

    @Override // r8.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        G7.j.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((A) obj) != A.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2818i.E(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((A) it.next()).b);
        }
        try {
            this.f22941c.invoke(null, sSLSocket, Proxy.newProxyInstance(m.class.getClassLoader(), new Class[]{this.f22944f, this.f22945g}, new h(arrayList2)));
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to set ALPN", e4);
        } catch (InvocationTargetException e9) {
            throw new AssertionError("failed to set ALPN", e9);
        }
    }

    @Override // r8.m
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f22942d.invoke(null, sSLSocket));
            if (invocationHandler != null) {
                h hVar = (h) invocationHandler;
                boolean z8 = hVar.b;
                if (!z8 && hVar.f22940c == null) {
                    m.i(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                    return null;
                }
                if (z8) {
                    return null;
                }
                return hVar.f22940c;
            }
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to get ALPN selected protocol", e4);
        } catch (InvocationTargetException e9) {
            throw new AssertionError("failed to get ALPN selected protocol", e9);
        }
    }
}
