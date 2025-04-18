package a6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.internal.t;
import com.facebook.internal.v;
import com.facebook.x;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes3.dex */
public final class i {
    public static final i a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f285b = new AtomicBoolean(false);

    public static final void a() {
        if (m6.a.b(i.class)) {
            return;
        }
        try {
            if (f285b.get()) {
                if (a.b()) {
                    v vVar = v.a;
                    if (v.c(t.IapLoggingLib2)) {
                        c.j(x.a());
                        return;
                    }
                }
                b.b();
            }
        } catch (Throwable th2) {
            m6.a.a(i.class, th2);
        }
    }

    public final boolean b() {
        List split$default;
        if (m6.a.b(this)) {
            return false;
        }
        try {
            Context a10 = x.a();
            ApplicationInfo applicationInfo = a10.getPackageManager().getApplicationInfo(a10.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
            if (string == null) {
                return false;
            }
            split$default = StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 3, 2, (Object) null);
            if (Integer.parseInt((String) split$default.get(0)) < 2) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return false;
        }
    }
}
