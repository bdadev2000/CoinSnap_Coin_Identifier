package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SliderKt$RangeSliderImpl$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Modifier f11372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RangeSliderState f11373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11374c;
    public final /* synthetic */ MutableInteractionSource d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11375f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f11376g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f11377h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f11378i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f11379j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSliderImpl$3(Modifier modifier, RangeSliderState rangeSliderState, boolean z2, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, q qVar, q qVar2, q qVar3, int i2) {
        super(2);
        this.f11372a = modifier;
        this.f11373b = rangeSliderState;
        this.f11374c = z2;
        this.d = mutableInteractionSource;
        this.f11375f = mutableInteractionSource2;
        this.f11376g = qVar;
        this.f11377h = qVar2;
        this.f11378i = qVar3;
        this.f11379j = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        SliderKt.c(this.f11372a, this.f11373b, this.f11374c, this.d, this.f11375f, this.f11376g, this.f11377h, this.f11378i, (Composer) obj, RecomposeScopeImplKt.a(this.f11379j | 1));
        return b0.f30125a;
    }
}
