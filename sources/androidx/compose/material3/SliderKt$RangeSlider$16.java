package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SliderKt$RangeSlider$16 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SliderColors f11326b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$16(SliderColors sliderColors, boolean z2) {
        super(3);
        this.f11325a = z2;
        this.f11326b = sliderColors;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj3).intValue();
        SliderDefaults.f11221a.b((RangeSliderState) obj, null, this.f11325a, this.f11326b, null, null, 0.0f, 0.0f, (Composer) obj2, (intValue & 14) | 100663296, 242);
        return b0.f30125a;
    }
}
