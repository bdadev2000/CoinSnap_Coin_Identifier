package I2;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f1440f = new HashMap();
    public final WeakReference b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f1441c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f1442d = new AtomicBoolean(false);

    public e(Activity activity) {
        this.b = new WeakReference(activity);
    }

    public final void a() {
        if (O2.a.b(this)) {
            return;
        }
        try {
            D3.b bVar = new D3.b(this, 2);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                bVar.run();
            } else {
                this.f1441c.post(bVar);
            }
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (O2.a.b(this)) {
            return;
        }
        try {
            a();
        } catch (Throwable th) {
            O2.a.a(this, th);
        }
    }
}
