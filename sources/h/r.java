package h;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: b, reason: collision with root package name */
    public static final p0 f18648b = new p0(new q0(0), 0);

    /* renamed from: c, reason: collision with root package name */
    public static final int f18649c = -100;

    /* renamed from: d, reason: collision with root package name */
    public static j0.k f18650d = null;

    /* renamed from: f, reason: collision with root package name */
    public static j0.k f18651f = null;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f18652g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f18653h = false;

    /* renamed from: i, reason: collision with root package name */
    public static final r.c f18654i = new r.c(0);

    /* renamed from: j, reason: collision with root package name */
    public static final Object f18655j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final Object f18656k = new Object();

    public static boolean d(Context context) {
        if (f18652g == null) {
            try {
                int i10 = n0.f18637b;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) n0.class), m0.a() | 128).metaData;
                if (bundle != null) {
                    f18652g = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f18652g = Boolean.FALSE;
            }
        }
        return f18652g.booleanValue();
    }

    public static void h(r rVar) {
        synchronized (f18655j) {
            Iterator it = f18654i.iterator();
            while (it.hasNext()) {
                r rVar2 = (r) ((WeakReference) it.next()).get();
                if (rVar2 == rVar || rVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void b();

    public abstract void c();

    public abstract void f(Bundle bundle);

    public abstract void g();

    public abstract boolean i(int i10);

    public abstract void k(int i10);

    public abstract void l(View view);

    public abstract void m(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void n(CharSequence charSequence);
}
