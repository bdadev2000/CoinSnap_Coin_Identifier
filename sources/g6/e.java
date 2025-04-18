package g6;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: f, reason: collision with root package name */
    public static final com.facebook.b f18218f = new com.facebook.b(27, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f18219g = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f18220b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f18221c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f18222d = new AtomicBoolean(false);

    public e(Activity activity) {
        this.f18220b = new WeakReference(activity);
    }

    public final void a() {
        if (m6.a.b(this)) {
            return;
        }
        try {
            androidx.activity.d dVar = new androidx.activity.d(this, 21);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                dVar.run();
            } else {
                this.f18221c.post(dVar);
            }
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (m6.a.b(this)) {
            return;
        }
        try {
            a();
        } catch (Throwable th2) {
            m6.a.a(this, th2);
        }
    }
}
