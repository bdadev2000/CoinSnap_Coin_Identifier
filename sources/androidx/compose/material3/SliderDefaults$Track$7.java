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
public final class SliderDefaults$Track$7 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SliderDefaults f11279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SliderState f11280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f11281c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SliderColors f11282f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f11283g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f11284h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f11285i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f11286j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11287k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11288l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Track$7(SliderDefaults sliderDefaults, SliderState sliderState, Modifier modifier, boolean z2, SliderColors sliderColors, p pVar, q qVar, float f2, float f3, int i2, int i3) {
        super(2);
        this.f11279a = sliderDefaults;
        this.f11280b = sliderState;
        this.f11281c = modifier;
        this.d = z2;
        this.f11282f = sliderColors;
        this.f11283g = pVar;
        this.f11284h = qVar;
        this.f11285i = f2;
        this.f11286j = f3;
        this.f11287k = i2;
        this.f11288l = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f11279a.c(this.f11280b, this.f11281c, this.d, this.f11282f, this.f11283g, this.f11284h, this.f11285i, this.f11286j, (Composer) obj, RecomposeScopeImplKt.a(this.f11287k | 1), this.f11288l);
        return b0.f30125a;
    }
}
