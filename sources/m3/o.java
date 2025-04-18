package m3;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21577b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.f21577b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10 = this.a;
        Object obj = this.f21577b;
        switch (i10) {
            case 0:
                x xVar = (x) obj;
                a aVar = xVar.L;
                if (aVar == null) {
                    aVar = a.AUTOMATIC;
                }
                if (aVar == a.ENABLED) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    xVar.invalidateSelf();
                    return;
                }
                u3.c cVar = xVar.f21606q;
                if (cVar != null) {
                    cVar.q(xVar.f21593c.d());
                    return;
                }
                return;
            case 1:
                com.applovin.exoplayer2.ui.b.a((com.applovin.exoplayer2.ui.b) obj, valueAnimator);
                return;
            case 2:
                l9.e eVar = (l9.e) obj;
                int i11 = l9.e.P;
                eVar.getClass();
                eVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eVar.invalidate(eVar.f21186b);
                return;
            default:
                na.j jVar = (na.j) obj;
                jVar.getClass();
                jVar.f22658d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
