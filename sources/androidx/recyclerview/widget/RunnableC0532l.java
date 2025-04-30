package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* renamed from: androidx.recyclerview.widget.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0532l implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5025c;

    public /* synthetic */ RunnableC0532l(Object obj, int i9) {
        this.b = i9;
        this.f5025c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f5025c;
        switch (this.b) {
            case 0:
                C0536p c0536p = (C0536p) obj;
                int i9 = c0536p.f5048A;
                ValueAnimator valueAnimator = c0536p.f5072z;
                if (i9 != 1) {
                    if (i9 != 2) {
                        return;
                    }
                } else {
                    valueAnimator.cancel();
                }
                c0536p.f5048A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            default:
                ((StaggeredGridLayoutManager) obj).checkForGaps();
                return;
        }
    }
}
