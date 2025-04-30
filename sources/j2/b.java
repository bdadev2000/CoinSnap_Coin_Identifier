package J2;

import G7.j;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.facebook.internal.E;
import com.facebook.internal.t;
import com.facebook.internal.w;
import com.facebook.r;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1569a = new Object();
    public static final HashMap b = new HashMap();

    public static final void a(String str) {
        if (O2.a.b(b.class)) {
            return;
        }
        try {
            f1569a.b(str);
        } catch (Throwable th) {
            O2.a.a(b.class, th);
        }
    }

    public static final boolean c() {
        if (O2.a.b(b.class)) {
            return false;
        }
        try {
            w wVar = w.f13674a;
            t b8 = w.b(r.b());
            if (b8 == null) {
                return false;
            }
            if (!b8.f13659c.contains(E.Enabled)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            O2.a.a(b.class, th);
            return false;
        }
    }

    public final void b(String str) {
        if (O2.a.b(this)) {
            return;
        }
        HashMap hashMap = b;
        try {
            NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) hashMap.get(str);
            if (registrationListener != null) {
                Object systemService = r.a().getSystemService("servicediscovery");
                if (systemService != null) {
                    try {
                        ((NsdManager) systemService).unregisterService(registrationListener);
                    } catch (IllegalArgumentException unused) {
                        r rVar = r.f13801a;
                    }
                    hashMap.remove(str);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    public final boolean d(String str) {
        if (O2.a.b(this)) {
            return false;
        }
        try {
            HashMap hashMap = b;
            if (hashMap.containsKey(str)) {
                return true;
            }
            r rVar = r.f13801a;
            String replace = "16.1.3".replace('.', '|');
            j.d(replace, "replace(...)");
            String str2 = "fbsdk_" + j.j(replace, "android-") + '_' + ((Object) str);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = r.a().getSystemService("servicediscovery");
            if (systemService != null) {
                a aVar = new a(str2, str);
                hashMap.put(str, aVar);
                ((NsdManager) systemService).registerService(nsdServiceInfo, 1, aVar);
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
        } catch (Throwable th) {
            O2.a.a(this, th);
            return false;
        }
    }
}
