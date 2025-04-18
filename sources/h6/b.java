package h6;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.facebook.internal.i0;
import com.facebook.internal.x;
import com.facebook.internal.z;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class b {
    public static final b a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f18778b = new HashMap();

    public static final void a(String str) {
        if (m6.a.b(b.class)) {
            return;
        }
        try {
            a.b(str);
        } catch (Throwable th2) {
            m6.a.a(b.class, th2);
        }
    }

    public static final boolean c() {
        if (m6.a.b(b.class)) {
            return false;
        }
        try {
            z zVar = z.a;
            x b3 = z.b(com.facebook.x.b());
            if (b3 == null) {
                return false;
            }
            if (!b3.f11122c.contains(i0.Enabled)) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            m6.a.a(b.class, th2);
            return false;
        }
    }

    public final void b(String str) {
        if (m6.a.b(this)) {
            return;
        }
        HashMap hashMap = f18778b;
        try {
            NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) hashMap.get(str);
            if (registrationListener != null) {
                Object systemService = com.facebook.x.a().getSystemService("servicediscovery");
                if (systemService != null) {
                    try {
                        ((NsdManager) systemService).unregisterService(registrationListener);
                    } catch (IllegalArgumentException unused) {
                        com.facebook.x xVar = com.facebook.x.a;
                    }
                    hashMap.remove(str);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    public final boolean d(String str) {
        String replace$default;
        if (m6.a.b(this)) {
            return false;
        }
        try {
            HashMap hashMap = f18778b;
            if (hashMap.containsKey(str)) {
                return true;
            }
            com.facebook.x xVar = com.facebook.x.a;
            replace$default = StringsKt__StringsJVMKt.replace$default("16.1.3", '.', '|', false, 4, (Object) null);
            String str2 = "fbsdk_" + Intrinsics.stringPlus("android-", replace$default) + '_' + ((Object) str);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = com.facebook.x.a().getSystemService("servicediscovery");
            if (systemService != null) {
                a aVar = new a(str2, str);
                hashMap.put(str, aVar);
                ((NsdManager) systemService).registerService(nsdServiceInfo, 1, aVar);
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return false;
        }
    }
}
