package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes3.dex */
final class SliderKt$RangeSlider$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SliderColors f11301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11302c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$1(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z2) {
        super(3);
        this.f11300a = mutableInteractionSource;
        this.f11301b = sliderColors;
        this.f11302c = z2;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        SliderDefaults.f11221a.a(this.f11300a, null, this.f11301b, this.f11302c, 0L, (Composer) obj2, 196614, 18);
        return b0.f30125a;
    }
}
