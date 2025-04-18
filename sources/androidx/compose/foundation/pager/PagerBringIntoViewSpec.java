package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import p0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PagerBringIntoViewSpec implements BringIntoViewSpec {

    /* renamed from: b, reason: collision with root package name */
    public final PagerState f5140b;

    /* renamed from: c, reason: collision with root package name */
    public final BringIntoViewSpec f5141c;
    public final AnimationSpec d;

    public PagerBringIntoViewSpec(PagerState pagerState, BringIntoViewSpec bringIntoViewSpec) {
        this.f5140b = pagerState;
        this.f5141c = bringIntoViewSpec;
        this.d = bringIntoViewSpec.b();
    }

    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    public final float a(float f2, float f3, float f4) {
        float a2 = this.f5141c.a(f2, f3, f4);
        PagerState pagerState = this.f5140b;
        if (a2 == 0.0f) {
            int i2 = pagerState.e;
            if (i2 == 0) {
                return 0.0f;
            }
            float f5 = i2 * (-1.0f);
            if (((Boolean) pagerState.G.getValue()).booleanValue()) {
                f5 += pagerState.o();
            }
            return a.z(f5, -f4, f4);
        }
        float f6 = pagerState.e * (-1);
        while (a2 > 0.0f && f6 < a2) {
            f6 += pagerState.o();
        }
        float f7 = f6;
        while (a2 < 0.0f && f7 > a2) {
            f7 -= pagerState.o();
        }
        return f7;
    }

    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    public final AnimationSpec b() {
        return this.d;
    }
}
