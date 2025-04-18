package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.r;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class IndicationKt$indication$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Indication f2754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InteractionSource f2755b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicationKt$indication$2(Indication indication, InteractionSource interactionSource) {
        super(3);
        this.f2754a = indication;
        this.f2755b = interactionSource;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-353972293);
        IndicationInstance a2 = this.f2754a.a(this.f2755b, composer);
        boolean I = composer.I(a2);
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = new IndicationModifier(a2);
            composer.o(u2);
        }
        IndicationModifier indicationModifier = (IndicationModifier) u2;
        composer.D();
        return indicationModifier;
    }
}
