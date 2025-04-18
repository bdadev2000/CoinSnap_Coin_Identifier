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
/* loaded from: classes4.dex */
public final class SliderKt$RangeSlider$11 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f11304a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f11305b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Modifier f11306c;
    public final /* synthetic */ boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f11307f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q0.a f11308g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ SliderColors f11309h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11310i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11311j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f11312k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f11313l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f11314m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f11315n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11316o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f11317p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f11318q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$11(d dVar, l lVar, Modifier modifier, boolean z2, d dVar2, q0.a aVar, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, q qVar, q qVar2, q qVar3, int i2, int i3, int i4, int i5) {
        super(2);
        this.f11304a = dVar;
        this.f11305b = lVar;
        this.f11306c = modifier;
        this.d = z2;
        this.f11307f = dVar2;
        this.f11308g = aVar;
        this.f11309h = sliderColors;
        this.f11310i = mutableInteractionSource;
        this.f11311j = mutableInteractionSource2;
        this.f11312k = qVar;
        this.f11313l = qVar2;
        this.f11314m = qVar3;
        this.f11315n = i2;
        this.f11316o = i3;
        this.f11317p = i4;
        this.f11318q = i5;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        SliderKt.b(this.f11304a, this.f11305b, this.f11306c, this.d, this.f11307f, this.f11308g, this.f11309h, this.f11310i, this.f11311j, this.f11312k, this.f11313l, this.f11314m, this.f11315n, (Composer) obj, RecomposeScopeImplKt.a(this.f11316o | 1), RecomposeScopeImplKt.a(this.f11317p), this.f11318q);
        return b0.f30125a;
    }
}
