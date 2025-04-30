package U3;

import android.animation.ValueAnimator;
import v1.EnumC2840a;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3152a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i9) {
        this.f3152a = i9;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3152a) {
            case 0:
                k kVar = (k) this.b;
                kVar.getClass();
                kVar.f3190d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                ((com.applovin.exoplayer2.ui.b) this.b).a(valueAnimator);
                return;
            default:
                v1.v vVar = (v1.v) this.b;
                EnumC2840a enumC2840a = vVar.f23535L;
                if (enumC2840a == null) {
                    enumC2840a = EnumC2840a.b;
                }
                if (enumC2840a == EnumC2840a.f23468c) {
                    vVar.invalidateSelf();
                    return;
                }
                D1.c cVar = vVar.f23552q;
                if (cVar != null) {
                    cVar.s(vVar.f23541c.a());
                    return;
                }
                return;
        }
    }
}
