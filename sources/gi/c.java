package gi;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.vungle.ads.internal.presenter.q;
import hi.m;
import hi.n;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import wh.a0;
import wh.c0;

/* loaded from: classes5.dex */
public final class c extends l {

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f18489e = new c0(14, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f18490f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18491c;

    /* renamed from: d, reason: collision with root package name */
    public final hi.i f18492d;

    static {
        boolean z10 = false;
        if (a0.x() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f18490f = z10;
    }

    public c() {
        n nVar;
        Method method;
        Method method2;
        m[] mVarArr = new m[4];
        int i10 = n.f19132g;
        Intrinsics.checkNotNullParameter("com.android.org.conscrypt", "packageName");
        Method method3 = null;
        try {
            Class<?> cls = Class.forName(Intrinsics.stringPlus("com.android.org.conscrypt", ".OpenSSLSocketImpl"));
            Class<?> cls2 = Class.forName(Intrinsics.stringPlus("com.android.org.conscrypt", ".OpenSSLSocketFactoryImpl"));
            Class<?> paramsClass = Class.forName(Intrinsics.stringPlus("com.android.org.conscrypt", ".SSLParametersImpl"));
            Intrinsics.checkNotNullExpressionValue(paramsClass, "paramsClass");
            nVar = new n(cls, cls2, paramsClass);
        } catch (Exception e2) {
            l.a.getClass();
            l.i(5, "unable to load android socket classes", e2);
            nVar = null;
        }
        mVarArr[0] = nVar;
        mVarArr[1] = new hi.l(hi.f.f19121f);
        mVarArr[2] = new hi.l(hi.j.a.u());
        mVarArr[3] = new hi.l(hi.h.a.u());
        List listOfNotNull = CollectionsKt.listOfNotNull((Object[]) mVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOfNotNull) {
            if (((m) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f18491c = arrayList;
        try {
            Class<?> cls3 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls3.getMethod("get", new Class[0]);
            method2 = cls3.getMethod(q.OPEN, String.class);
            method = cls3.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f18492d = new hi.i(method3, method2, method);
    }

    @Override // gi.l
    public final com.facebook.internal.i b(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        hi.b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new hi.b(trustManager, x509TrustManagerExtensions);
        }
        if (bVar == null) {
            return super.b(trustManager);
        }
        return bVar;
    }

    @Override // gi.l
    public final ji.d c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            return new b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.c(trustManager);
        }
    }

    @Override // gi.l
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f18491c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((m) obj).a(sslSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.d(sslSocket, str, protocols);
        }
    }

    @Override // gi.l
    public final void e(Socket socket, InetSocketAddress address, int i10) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i10);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e2);
            }
            throw e2;
        }
    }

    @Override // gi.l
    public final String f(SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f18491c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((m) obj).a(sslSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar == null) {
            return null;
        }
        return mVar.c(sslSocket);
    }

    @Override // gi.l
    public final Object g() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        hi.i iVar = this.f18492d;
        iVar.getClass();
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        Method method = iVar.a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, new Object[0]);
            Method method2 = iVar.f19128b;
            Intrinsics.checkNotNull(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // gi.l
    public final boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // gi.l
    public final void j(String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        hi.i iVar = this.f18492d;
        iVar.getClass();
        boolean z10 = false;
        if (obj != null) {
            try {
                Method method = iVar.f19129c;
                Intrinsics.checkNotNull(method);
                method.invoke(obj, new Object[0]);
                z10 = true;
            } catch (Exception unused) {
            }
        }
        if (!z10) {
            l.i(5, message, null);
        }
    }
}
