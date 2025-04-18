package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;
import w0.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SliderKt$Slider$8 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f11413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f11414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f11415c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q0.a f11416f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SliderColors f11417g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11418h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11419i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f11420j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f11421k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f11422l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f11423m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f11424n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11425o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$8(float f2, l lVar, Modifier modifier, boolean z2, q0.a aVar, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, int i2, q qVar, q qVar2, d dVar, int i3, int i4, int i5) {
        super(2);
        this.f11413a = f2;
        this.f11414b = lVar;
        this.f11415c = modifier;
        this.d = z2;
        this.f11416f = aVar;
        this.f11417g = sliderColors;
        this.f11418h = mutableInteractionSource;
        this.f11419i = i2;
        this.f11420j = qVar;
        this.f11421k = qVar2;
        this.f11422l = dVar;
        this.f11423m = i3;
        this.f11424n = i4;
        this.f11425o = i5;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        SliderKt.d(this.f11413a, this.f11414b, this.f11415c, this.d, this.f11416f, this.f11417g, this.f11418h, this.f11419i, this.f11420j, this.f11421k, this.f11422l, (Composer) obj, RecomposeScopeImplKt.a(this.f11423m | 1), RecomposeScopeImplKt.a(this.f11424n), this.f11425o);
        return b0.f30125a;
    }
}
