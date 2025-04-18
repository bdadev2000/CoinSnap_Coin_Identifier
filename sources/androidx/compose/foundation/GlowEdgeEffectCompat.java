package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.ui.unit.AndroidDensity_androidKt;

/* loaded from: classes4.dex */
final class GlowEdgeEffectCompat extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    public final float f2725a;

    /* renamed from: b, reason: collision with root package name */
    public float f2726b;

    public GlowEdgeEffectCompat(Context context) {
        super(context);
        this.f2725a = AndroidDensity_androidKt.a(context).getDensity() * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i2) {
        this.f2726b = 0.0f;
        super.onAbsorb(i2);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f2, float f3) {
        this.f2726b = 0.0f;
        super.onPull(f2, f3);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f2726b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f2) {
        this.f2726b = 0.0f;
        super.onPull(f2);
    }
}
