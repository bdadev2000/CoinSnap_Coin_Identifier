package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material3.internal.ElevationKt;
import androidx.compose.ui.unit.Dp;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.CardElevation$animateElevation$2$1", f = "Card.kt", l = {731, 741}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CardElevation$animateElevation$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f8125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Animatable f8126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f8127c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CardElevation f8128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Interaction f8129g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardElevation$animateElevation$2$1(Animatable animatable, float f2, boolean z2, CardElevation cardElevation, Interaction interaction, g gVar) {
        super(2, gVar);
        this.f8126b = animatable;
        this.f8127c = f2;
        this.d = z2;
        this.f8128f = cardElevation;
        this.f8129g = interaction;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new CardElevation$animateElevation$2$1(this.f8126b, this.f8127c, this.d, this.f8128f, this.f8129g, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((CardElevation$animateElevation$2$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f8125a;
        if (i2 == 0) {
            q.m(obj);
            Animatable animatable = this.f8126b;
            float f2 = ((Dp) animatable.e.getValue()).f17486a;
            float f3 = this.f8127c;
            if (!Dp.a(f2, f3)) {
                if (this.d) {
                    float f4 = ((Dp) animatable.e.getValue()).f17486a;
                    CardElevation cardElevation = this.f8128f;
                    PressInteraction.Press press = Dp.a(f4, cardElevation.f8118b) ? new PressInteraction.Press(0L) : Dp.a(f4, cardElevation.d) ? new Object() : Dp.a(f4, cardElevation.f8119c) ? new Object() : Dp.a(f4, cardElevation.e) ? new Object() : null;
                    this.f8125a = 2;
                    if (ElevationKt.a(animatable, f3, press, this.f8129g, this) == aVar) {
                        return aVar;
                    }
                } else {
                    Dp dp = new Dp(f3);
                    this.f8125a = 1;
                    if (animatable.e(dp, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
