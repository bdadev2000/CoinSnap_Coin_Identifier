package androidx.compose.material.ripple;

import android.support.v4.media.d;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import q0.p;

@Stable
@d0.a
/* loaded from: classes3.dex */
public abstract class Ripple implements Indication {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7400a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7401b;

    /* renamed from: c, reason: collision with root package name */
    public final State f7402c;

    public Ripple(boolean z2, float f2, MutableState mutableState) {
        this.f7400a = z2;
        this.f7401b = f2;
        this.f7402c = mutableState;
    }

    @Override // androidx.compose.foundation.Indication
    public final IndicationInstance a(InteractionSource interactionSource, Composer composer) {
        long a2;
        composer.J(988743187);
        RippleTheme rippleTheme = (RippleTheme) composer.K(RippleThemeKt.f7465a);
        State state = this.f7402c;
        if (((Color) state.getValue()).f14964a != Color.f14962i) {
            composer.J(-303571590);
            composer.D();
            a2 = ((Color) state.getValue()).f14964a;
        } else {
            composer.J(-303521246);
            a2 = rippleTheme.a(composer);
            composer.D();
        }
        RippleIndicationInstance c2 = c(interactionSource, this.f7400a, this.f7401b, SnapshotStateKt.k(new Color(a2), composer), SnapshotStateKt.k(rippleTheme.b(composer), composer), composer, 0);
        boolean I = composer.I(interactionSource) | composer.w(c2);
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = new Ripple$rememberUpdatedInstance$1$1(interactionSource, c2, null);
            composer.o(u2);
        }
        EffectsKt.e(c2, interactionSource, (p) u2, composer);
        composer.D();
        return c2;
    }

    public abstract RippleIndicationInstance c(InteractionSource interactionSource, boolean z2, float f2, MutableState mutableState, MutableState mutableState2, Composer composer, int i2);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ripple)) {
            return false;
        }
        Ripple ripple = (Ripple) obj;
        return this.f7400a == ripple.f7400a && Dp.a(this.f7401b, ripple.f7401b) && p0.a.g(this.f7402c, ripple.f7402c);
    }

    public final int hashCode() {
        return this.f7402c.hashCode() + d.b(this.f7401b, Boolean.hashCode(this.f7400a) * 31, 31);
    }
}
