package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SliderKt$Slider$13 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SliderState f11385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f11386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11387c;
    public final /* synthetic */ SliderColors d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11388f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f11389g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f11390h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11391i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f11392j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$13(SliderState sliderState, Modifier modifier, boolean z2, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, q qVar, q qVar2, int i2, int i3) {
        super(2);
        this.f11385a = sliderState;
        this.f11386b = modifier;
        this.f11387c = z2;
        this.d = sliderColors;
        this.f11388f = mutableInteractionSource;
        this.f11389g = qVar;
        this.f11390h = qVar2;
        this.f11391i = i2;
        this.f11392j = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        SliderKt.e(this.f11385a, this.f11386b, this.f11387c, this.d, this.f11388f, this.f11389g, this.f11390h, (Composer) obj, RecomposeScopeImplKt.a(this.f11391i | 1), this.f11392j);
        return b0.f30125a;
    }
}
