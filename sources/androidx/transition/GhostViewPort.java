package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
class GhostViewPort extends ViewGroup implements GhostView {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f21578c = 0;

    /* renamed from: a, reason: collision with root package name */
    public ViewGroup f21579a;

    /* renamed from: b, reason: collision with root package name */
    public View f21580b;

    /* renamed from: androidx.transition.GhostViewPort$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements ViewTreeObserver.OnPreDrawListener {
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        throw null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        CanvasUtils.a(canvas, true);
        canvas.setMatrix(null);
        ViewUtils.b(null, 0);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        throw null;
    }
}
