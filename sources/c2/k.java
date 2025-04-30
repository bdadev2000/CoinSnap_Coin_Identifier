package C2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.internal.p;
import com.facebook.internal.r;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f527a = new Object();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    public static final void a() {
        if (O2.a.b(k.class)) {
            return;
        }
        try {
            if (b.get()) {
                if (f527a.b()) {
                    r rVar = r.f13653a;
                    if (r.b(p.IapLoggingLib2)) {
                        e.e(com.facebook.r.a());
                        return;
                    }
                }
                d.b();
            }
        } catch (Throwable th) {
            O2.a.a(k.class, th);
        }
    }

    public final boolean b() {
        if (O2.a.b(this)) {
            return false;
        }
        try {
            Context a6 = com.facebook.r.a();
            ApplicationInfo applicationInfo = a6.getPackageManager().getApplicationInfo(a6.getPackageName(), 128);
            G7.j.d(applicationInfo, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
            if (string == null) {
                return false;
            }
            if (Integer.parseInt((String) O7.g.V(string, new String[]{"."}, 3, 2).get(0)) < 2) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return false;
        }
    }
}
