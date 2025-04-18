package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SliderDefaults$Track$12 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SliderDefaults f11246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RangeSliderState f11247b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f11248c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SliderColors f11249f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f11250g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f11251h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f11252i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f11253j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11254k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11255l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Track$12(SliderDefaults sliderDefaults, RangeSliderState rangeSliderState, Modifier modifier, boolean z2, SliderColors sliderColors, p pVar, q qVar, float f2, float f3, int i2, int i3) {
        super(2);
        this.f11246a = sliderDefaults;
        this.f11247b = rangeSliderState;
        this.f11248c = modifier;
        this.d = z2;
        this.f11249f = sliderColors;
        this.f11250g = pVar;
        this.f11251h = qVar;
        this.f11252i = f2;
        this.f11253j = f3;
        this.f11254k = i2;
        this.f11255l = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f11246a.b(this.f11247b, this.f11248c, this.d, this.f11249f, this.f11250g, this.f11251h, this.f11252i, this.f11253j, (Composer) obj, RecomposeScopeImplKt.a(this.f11254k | 1), this.f11255l);
        return b0.f30125a;
    }
}
