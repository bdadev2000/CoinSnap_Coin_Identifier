package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SliderKt$RangeSlider$9 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SliderColors f11358b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$9(SliderColors sliderColors, boolean z2) {
        super(3);
        this.f11357a = z2;
        this.f11358b = sliderColors;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj3).intValue();
        SliderDefaults.f11221a.b((RangeSliderState) obj, null, this.f11357a, this.f11358b, null, null, 0.0f, 0.0f, (Composer) obj2, (intValue & 14) | 100663296, 242);
        return b0.f30125a;
    }
}
