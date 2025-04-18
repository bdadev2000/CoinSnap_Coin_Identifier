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
public final class SliderKt$RangeSlider$18 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RangeSliderState f11327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f11328b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11329c;
    public final /* synthetic */ SliderColors d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11330f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11331g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f11332h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f11333i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f11334j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11335k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11336l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$18(RangeSliderState rangeSliderState, Modifier modifier, boolean z2, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, q qVar, q qVar2, q qVar3, int i2, int i3) {
        super(2);
        this.f11327a = rangeSliderState;
        this.f11328b = modifier;
        this.f11329c = z2;
        this.d = sliderColors;
        this.f11330f = mutableInteractionSource;
        this.f11331g = mutableInteractionSource2;
        this.f11332h = qVar;
        this.f11333i = qVar2;
        this.f11334j = qVar3;
        this.f11335k = i2;
        this.f11336l = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        SliderKt.a(this.f11327a, this.f11328b, this.f11329c, this.d, this.f11330f, this.f11331g, this.f11332h, this.f11333i, this.f11334j, (Composer) obj, RecomposeScopeImplKt.a(this.f11335k | 1), this.f11336l);
        return b0.f30125a;
    }
}
