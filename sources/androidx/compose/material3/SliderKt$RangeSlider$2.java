package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes3.dex */
final class SliderKt$RangeSlider$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SliderColors f11338b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11339c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$2(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z2) {
        super(3);
        this.f11337a = mutableInteractionSource;
        this.f11338b = sliderColors;
        this.f11339c = z2;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        SliderDefaults.f11221a.a(this.f11337a, null, this.f11338b, this.f11339c, 0L, (Composer) obj2, 196614, 18);
        return b0.f30125a;
    }
}
