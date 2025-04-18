package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SliderKt$Slider$6 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SliderColors f11409b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11410c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$6(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z2) {
        super(3);
        this.f11408a = mutableInteractionSource;
        this.f11409b = sliderColors;
        this.f11410c = z2;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        SliderDefaults.f11221a.a(this.f11408a, null, this.f11409b, this.f11410c, 0L, (Composer) obj2, 196608, 18);
        return b0.f30125a;
    }
}
