package k;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: k.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2422k {
    public static final ExecutorC2421j b = new ExecutorC2421j(new j2.f(2));

    /* renamed from: c, reason: collision with root package name */
    public static final int f21310c = -100;

    /* renamed from: d, reason: collision with root package name */
    public static P.l f21311d = null;

    /* renamed from: f, reason: collision with root package name */
    public static P.l f21312f = null;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f21313g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f21314h = false;

    /* renamed from: i, reason: collision with root package name */
    public static final x.c f21315i = new x.c(0);

    /* renamed from: j, reason: collision with root package name */
    public static final Object f21316j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final Object f21317k = new Object();

    public static boolean d(Context context) {
        if (f21313g == null) {
            try {
                int i9 = AbstractServiceC2406C.b;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC2406C.class), AbstractC2405B.a() | 128).metaData;
                if (bundle != null) {
                    f21313g = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f21313g = Boolean.FALSE;
            }
        }
        return f21313g.booleanValue();
    }

    public static void h(AbstractC2422k abstractC2422k) {
        synchronized (f21316j) {
            try {
                Iterator it = f21315i.iterator();
                while (it.hasNext()) {
                    AbstractC2422k abstractC2422k2 = (AbstractC2422k) ((WeakReference) it.next()).get();
                    if (abstractC2422k2 == abstractC2422k || abstractC2422k2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void e();

    public abstract void f();

    public abstract boolean i(int i9);

    public abstract void j(int i9);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);
}
