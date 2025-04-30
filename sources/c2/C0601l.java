package c2;

import W1.w;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: c2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0601l implements Handler.Callback {

    /* renamed from: h, reason: collision with root package name */
    public static final L4.f f5394h = new L4.f(18);
    public volatile com.bumptech.glide.m b;

    /* renamed from: c, reason: collision with root package name */
    public final L4.f f5395c;

    /* renamed from: d, reason: collision with root package name */
    public final x.b f5396d = new x.l();

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0595f f5397f;

    /* renamed from: g, reason: collision with root package name */
    public final E1.d f5398g;

    /* JADX WARN: Type inference failed for: r0v0, types: [x.l, x.b] */
    public C0601l() {
        InterfaceC0595f eVar;
        L4.f fVar = f5394h;
        this.f5395c = fVar;
        this.f5398g = new E1.d(fVar);
        if (w.f3599f && w.f3598e) {
            eVar = new C0594e();
        } else {
            eVar = new R3.e(17);
        }
        this.f5397f = eVar;
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void b(List list, x.b bVar) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                bVar.put(fragment.getView(), fragment);
                b(fragment.getChildFragmentManager().getFragments(), bVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [c2.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [c2.m, java.lang.Object] */
    public final com.bumptech.glide.m c(Context context) {
        if (context != null) {
            char[] cArr = j2.n.f21025a;
            if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return d((FragmentActivity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return c(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.b == null) {
                synchronized (this) {
                    try {
                        if (this.b == null) {
                            com.bumptech.glide.b a6 = com.bumptech.glide.b.a(context.getApplicationContext());
                            L4.f fVar = this.f5395c;
                            ?? obj = new Object();
                            ?? obj2 = new Object();
                            Context applicationContext = context.getApplicationContext();
                            fVar.getClass();
                            this.b = new com.bumptech.glide.m(a6, obj, obj2, applicationContext);
                        }
                    } finally {
                    }
                }
            }
            return this.b;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final com.bumptech.glide.m d(FragmentActivity fragmentActivity) {
        boolean z8;
        boolean z9;
        char[] cArr = j2.n.f21025a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            return c(fragmentActivity.getApplicationContext());
        }
        if (!fragmentActivity.isDestroyed()) {
            this.f5397f.b(fragmentActivity);
            Activity a6 = a(fragmentActivity);
            if (a6 != null && a6.isFinishing()) {
                z9 = false;
            } else {
                z9 = true;
            }
            return this.f5398g.n(fragmentActivity, com.bumptech.glide.b.a(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), z9);
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
