package gi;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import hi.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import wh.a0;

/* loaded from: classes5.dex */
public final class a extends l {

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f18485d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f18486e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18487c;

    static {
        boolean z10 = false;
        z10 = false;
        f18485d = new a0(14, z10 ? 1 : 0);
        if (a0.x() && Build.VERSION.SDK_INT >= 29) {
            z10 = true;
        }
        f18486e = z10;
    }

    public a() {
        hi.a aVar;
        m[] mVarArr = new m[4];
        if (hi.a.a.m()) {
            aVar = new hi.a();
        } else {
            aVar = null;
        }
        mVarArr[0] = aVar;
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
        this.f18487c = arrayList;
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
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f18487c.iterator();
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
    public final String f(SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f18487c.iterator();
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
    public final boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
