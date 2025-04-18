package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1973b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1974c;

    public /* synthetic */ l(Object obj, int i10) {
        this.f1973b = i10;
        this.f1974c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1973b;
        Object obj = this.f1974c;
        switch (i10) {
            case 0:
                p pVar = (p) obj;
                int i11 = pVar.A;
                ValueAnimator valueAnimator = pVar.f2006z;
                if (i11 != 1) {
                    if (i11 != 2) {
                        return;
                    }
                } else {
                    valueAnimator.cancel();
                }
                pVar.A = 3;
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
