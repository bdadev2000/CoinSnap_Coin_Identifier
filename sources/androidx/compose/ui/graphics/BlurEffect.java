package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public final class BlurEffect extends RenderEffect {

    /* renamed from: b, reason: collision with root package name */
    public final RenderEffect f14949b = null;

    /* renamed from: c, reason: collision with root package name */
    public final float f14950c;
    public final float d;
    public final int e;

    public BlurEffect(float f2, float f3, int i2) {
        this.f14950c = f2;
        this.d = f3;
        this.e = i2;
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    public final android.graphics.RenderEffect b() {
        return RenderEffectVerificationHelper.f15016a.a(this.f14949b, this.f14950c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlurEffect)) {
            return false;
        }
        BlurEffect blurEffect = (BlurEffect) obj;
        return this.f14950c == blurEffect.f14950c && this.d == blurEffect.d && TileMode.a(this.e, blurEffect.e) && p0.a.g(this.f14949b, blurEffect.f14949b);
    }

    public final int hashCode() {
        RenderEffect renderEffect = this.f14949b;
        return Integer.hashCode(this.e) + android.support.v4.media.d.b(this.d, android.support.v4.media.d.b(this.f14950c, (renderEffect != null ? renderEffect.hashCode() : 0) * 31, 31), 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=" + this.f14949b + ", radiusX=" + this.f14950c + ", radiusY=" + this.d + ", edgeTreatment=" + ((Object) TileMode.b(this.e)) + ')';
    }
}
