package x5;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final y5.c f27393b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f27394c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f27395d;

    /* renamed from: f, reason: collision with root package name */
    public final View.OnTouchListener f27396f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27397g;

    public h(y5.c mapping, View rootView, View hostView) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.f27393b = mapping;
        this.f27394c = new WeakReference(hostView);
        this.f27395d = new WeakReference(rootView);
        this.f27396f = y5.g.f(hostView);
        this.f27397g = true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        View view2 = (View) this.f27395d.get();
        View view3 = (View) this.f27394c.get();
        if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
            c.b(this.f27393b, view2, view3);
        }
        View.OnTouchListener onTouchListener = this.f27396f;
        if (onTouchListener != null && onTouchListener.onTouch(view, motionEvent)) {
            return true;
        }
        return false;
    }
}
