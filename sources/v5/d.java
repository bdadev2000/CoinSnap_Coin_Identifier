package v5;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.r0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class d implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: g, reason: collision with root package name */
    public static final com.facebook.b f26036g = new com.facebook.b(18, 0);

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f26037h = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f26040d;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f26038b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public final Handler f26039c = new Handler(Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f26041f = new AtomicBoolean(false);

    public d(Activity activity) {
        this.f26040d = new WeakReference(activity);
    }

    public final void a(View view) {
        if (m6.a.b(this)) {
            return;
        }
        try {
            r0 r0Var = new r0(4, view, this);
            if (!m6.a.b(this)) {
                try {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        r0Var.run();
                    } else {
                        this.f26039c.post(r0Var);
                    }
                } catch (Throwable th2) {
                    m6.a.a(this, th2);
                }
            }
        } catch (Throwable th3) {
            m6.a.a(this, th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.view.View r14) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.d.b(android.view.View):void");
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (m6.a.b(this)) {
            return;
        }
        if (view != null) {
            try {
                a(view);
            } catch (Throwable th2) {
                m6.a.a(this, th2);
                return;
            }
        }
        if (view2 != null) {
            a(view2);
        }
    }
}
