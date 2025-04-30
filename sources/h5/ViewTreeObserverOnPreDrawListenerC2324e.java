package h5;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: h5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnPreDrawListenerC2324e implements ViewTreeObserver.OnPreDrawListener {
    public final Handler b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f20603c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f20604d;

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f20605f;

    public ViewTreeObserverOnPreDrawListenerC2324e(View view, b5.a aVar, b5.a aVar2) {
        this.f20603c = new AtomicReference(view);
        this.f20604d = aVar;
        this.f20605f = aVar2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.f20603c.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        Handler handler = this.b;
        handler.post(this.f20604d);
        handler.postAtFrontOfQueue(this.f20605f);
        return true;
    }
}
