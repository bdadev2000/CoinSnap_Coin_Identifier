package r8;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import q4.C2643b;
import u7.AbstractC2815f;

/* loaded from: classes3.dex */
public final class a extends m {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f22928d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f22929c;

    static {
        boolean z8;
        if (C2643b.f() && Build.VERSION.SDK_INT >= 29) {
            z8 = true;
        } else {
            z8 = false;
        }
        f22928d = z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        Object obj;
        if (C2643b.f() && Build.VERSION.SDK_INT >= 29) {
            obj = new Object();
        } else {
            obj = null;
        }
        ArrayList z8 = AbstractC2815f.z(new s8.m[]{obj, new s8.l(s8.e.f22990f), new s8.l(s8.j.f22998a), new s8.l(s8.g.f22995a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = z8.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((s8.m) next).b()) {
                arrayList.add(next);
            }
        }
        this.f22929c = arrayList;
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
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        G7.j.e(list, "protocols");
        Iterator it = this.f22929c.iterator();
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
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f22929c.iterator();
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
    public final boolean h(String str) {
        G7.j.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
