package h5;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: h5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnDrawListenerC2321b implements ViewTreeObserver.OnDrawListener {
    public final Handler b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f20599c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f20600d;

    public ViewTreeObserverOnDrawListenerC2321b(View view, b5.a aVar) {
        this.f20599c = new AtomicReference(view);
        this.f20600d = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.f20599c.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: h5.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewTreeObserverOnDrawListenerC2321b viewTreeObserverOnDrawListenerC2321b = ViewTreeObserverOnDrawListenerC2321b.this;
                viewTreeObserverOnDrawListenerC2321b.getClass();
                view.getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC2321b);
            }
        });
        this.b.postAtFrontOfQueue(this.f20600d);
    }
}
