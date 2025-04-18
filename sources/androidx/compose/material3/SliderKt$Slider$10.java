package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SliderKt$Slider$10 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SliderColors f11381b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11382c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$10(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z2) {
        super(3);
        this.f11380a = mutableInteractionSource;
        this.f11381b = sliderColors;
        this.f11382c = z2;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        SliderDefaults.f11221a.a(this.f11380a, null, this.f11381b, this.f11382c, 0L, (Composer) obj2, 196608, 18);
        return b0.f30125a;
    }
}
