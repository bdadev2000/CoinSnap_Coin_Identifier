package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.material3.internal.ElevationKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Dp;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.ChipElevation$animateElevation$2$1", f = "Chip.kt", l = {2241, 2243}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ChipElevation$animateElevation$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f8247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Animatable f8248b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f8249c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Interaction f8250f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MutableState f8251g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipElevation$animateElevation$2$1(Animatable animatable, float f2, boolean z2, Interaction interaction, MutableState mutableState, g gVar) {
        super(2, gVar);
        this.f8248b = animatable;
        this.f8249c = f2;
        this.d = z2;
        this.f8250f = interaction;
        this.f8251g = mutableState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new ChipElevation$animateElevation$2$1(this.f8248b, this.f8249c, this.d, this.f8250f, this.f8251g, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ChipElevation$animateElevation$2$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f8247a;
        Interaction interaction = this.f8250f;
        MutableState mutableState = this.f8251g;
        if (i2 == 0) {
            q.m(obj);
            Animatable animatable = this.f8248b;
            float f2 = ((Dp) animatable.e.getValue()).f17486a;
            float f3 = this.f8249c;
            if (!Dp.a(f2, f3)) {
                if (this.d) {
                    Interaction interaction2 = (Interaction) mutableState.getValue();
                    this.f8247a = 2;
                    if (ElevationKt.a(animatable, f3, interaction2, interaction, this) == aVar) {
                        return aVar;
                    }
                } else {
                    Dp dp = new Dp(f3);
                    this.f8247a = 1;
                    if (animatable.e(dp, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return b0.f30125a;
        }
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        mutableState.setValue(interaction);
        return b0.f30125a;
    }
}
