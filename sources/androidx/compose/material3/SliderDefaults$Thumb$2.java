package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SliderDefaults$Thumb$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SliderDefaults f11228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f11230c;
    public final /* synthetic */ SliderColors d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f11231f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f11232g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11233h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11234i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Thumb$2(SliderDefaults sliderDefaults, MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z2, long j2, int i2, int i3) {
        super(2);
        this.f11228a = sliderDefaults;
        this.f11229b = mutableInteractionSource;
        this.f11230c = modifier;
        this.d = sliderColors;
        this.f11231f = z2;
        this.f11232g = j2;
        this.f11233h = i2;
        this.f11234i = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f11228a.a(this.f11229b, this.f11230c, this.d, this.f11231f, this.f11232g, (Composer) obj, RecomposeScopeImplKt.a(this.f11233h | 1), this.f11234i);
        return b0.f30125a;
    }
}
