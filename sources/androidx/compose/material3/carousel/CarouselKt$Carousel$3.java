package androidx.compose.material3.carousel;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CarouselKt$Carousel$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CarouselState f12661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Orientation f12662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f12663c;
    public final /* synthetic */ PaddingValues d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12664f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Modifier f12665g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f12666h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TargetedFlingBehavior f12667i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q0.r f12668j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12669k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f12670l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselKt$Carousel$3(CarouselState carouselState, Orientation orientation, p pVar, PaddingValues paddingValues, int i2, Modifier modifier, float f2, TargetedFlingBehavior targetedFlingBehavior, q0.r rVar, int i3, int i4) {
        super(2);
        this.f12661a = carouselState;
        this.f12662b = orientation;
        this.f12663c = pVar;
        this.d = paddingValues;
        this.f12664f = i2;
        this.f12665g = modifier;
        this.f12666h = f2;
        this.f12667i = targetedFlingBehavior;
        this.f12668j = rVar;
        this.f12669k = i3;
        this.f12670l = i4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        CarouselKt.a(this.f12661a, this.f12662b, this.f12663c, this.d, this.f12664f, this.f12665g, this.f12666h, this.f12667i, this.f12668j, (Composer) obj, RecomposeScopeImplKt.a(this.f12669k | 1), this.f12670l);
        return b0.f30125a;
    }
}
