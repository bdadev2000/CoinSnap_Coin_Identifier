package r8;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.vungle.ads.internal.presenter.q;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import q4.C2643b;
import u7.AbstractC2815f;

/* loaded from: classes3.dex */
public final class c extends m {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f22931e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f22932c;

    /* renamed from: d, reason: collision with root package name */
    public final s8.h f22933d;

    static {
        boolean z8 = false;
        if (C2643b.f() && Build.VERSION.SDK_INT < 30) {
            z8 = true;
        }
        f22931e = z8;
    }

    public c() {
        s8.e eVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName(G7.j.j(".OpenSSLSocketImpl", "com.android.org.conscrypt"));
            Class.forName(G7.j.j(".OpenSSLSocketFactoryImpl", "com.android.org.conscrypt"));
            Class.forName(G7.j.j(".SSLParametersImpl", "com.android.org.conscrypt"));
            eVar = new s8.e(cls);
        } catch (Exception e4) {
            m.f22950a.getClass();
            m.i(5, "unable to load android socket classes", e4);
            eVar = null;
        }
        ArrayList z8 = AbstractC2815f.z(new s8.m[]{eVar, new s8.l(s8.e.f22990f), new s8.l(s8.j.f22998a), new s8.l(s8.g.f22995a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = z8.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((s8.m) next).b()) {
                arrayList.add(next);
            }
        }
        this.f22932c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod(q.OPEN, String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f22933d = new s8.h(method3, method2, method);
    }

    @Override // r8.m
    public final e1.f b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        s8.b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new s8.b(x509TrustManager, x509TrustManagerExtensions);
        }
        if (bVar == null) {
            return new v8.a(c(x509TrustManager));
        }
        return bVar;
    }

    @Override // r8.m
    public final v8.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // r8.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        G7.j.e(list, "protocols");
        Iterator it = this.f22932c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((s8.m) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        s8.m mVar = (s8.m) obj;
        if (mVar != null) {
            mVar.d(sSLSocket, str, list);
        }
    }

    @Override // r8.m
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i9) {
        G7.j.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i9);
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e4);
            }
            throw e4;
        }
    }

    @Override // r8.m
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f22932c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((s8.m) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        s8.m mVar = (s8.m) obj;
        if (mVar == null) {
            return null;
        }
        return mVar.c(sSLSocket);
    }

    @Override // r8.m
    public final Object g() {
        s8.h hVar = this.f22933d;
        hVar.getClass();
        Method method = hVar.f22996a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, null);
            Method method2 = hVar.b;
            G7.j.b(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // r8.m
    public final boolean h(String str) {
        G7.j.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // r8.m
    public final void j(String str, Object obj) {
        G7.j.e(str, "message");
        s8.h hVar = this.f22933d;
        hVar.getClass();
        if (obj != null) {
            try {
                Method method = hVar.f22997c;
                G7.j.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        m.i(5, str, null);
    }
}
