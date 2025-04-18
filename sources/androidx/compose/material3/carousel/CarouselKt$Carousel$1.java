package androidx.compose.material3.carousel;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.p;

/* loaded from: classes.dex */
final class CarouselKt$Carousel$1 extends r implements q0.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CarouselState f12651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselPageSize f12652b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0.r f12653c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselKt$Carousel$1(CarouselState carouselState, CarouselPageSize carouselPageSize, q0.r rVar) {
        super(4);
        this.f12651a = carouselState;
        this.f12652b = carouselPageSize;
        this.f12653c = rVar;
    }

    @Override // q0.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int intValue2 = ((Number) obj4).intValue();
        Object u2 = composer.u();
        Object obj5 = Composer.Companion.f13690a;
        if (u2 == obj5) {
            u2 = new CarouselItemInfoImpl();
            composer.o(u2);
        }
        final CarouselItemInfoImpl carouselItemInfoImpl = (CarouselItemInfoImpl) u2;
        Object u3 = composer.u();
        if (u3 == obj5) {
            u3 = new CarouselItemScopeImpl(carouselItemInfoImpl);
            composer.o(u3);
        }
        Object obj6 = (CarouselItemScopeImpl) u3;
        Object u4 = composer.u();
        if (u4 == obj5) {
            u4 = new Shape() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$1$clipShape$1$1
                @Override // androidx.compose.ui.graphics.Shape
                public final Outline a(long j2, LayoutDirection layoutDirection, Density density) {
                    return new Outline.Rectangle((Rect) CarouselItemInfoImpl.this.d.getValue());
                }
            };
            composer.o(u4);
        }
        CarouselKt$Carousel$1$clipShape$1$1 carouselKt$Carousel$1$clipShape$1$1 = (CarouselKt$Carousel$1$clipShape$1$1) u4;
        CarouselState carouselState = this.f12651a;
        CarouselPageSize carouselPageSize = this.f12652b;
        boolean I = composer.I(carouselPageSize);
        Object u5 = composer.u();
        if (I || u5 == obj5) {
            u5 = new CarouselKt$Carousel$1$1$1(carouselPageSize);
            composer.o(u5);
        }
        Modifier a2 = LayoutModifierKt.a(Modifier.Companion.f14687a, new CarouselKt$carouselItem$1((a) u5, carouselState, intValue, carouselItemInfoImpl, carouselKt$Carousel$1$clipShape$1$1));
        MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
        int E = composer.E();
        PersistentCompositionLocalMap m2 = composer.m();
        Modifier c2 = ComposedModifierKt.c(composer, a2);
        ComposeUiNode.h8.getClass();
        a aVar = ComposeUiNode.Companion.f15895b;
        if (!(composer.j() instanceof Applier)) {
            ComposablesKt.a();
            throw null;
        }
        composer.z();
        if (composer.e()) {
            composer.B(aVar);
        } else {
            composer.n();
        }
        Updater.b(composer, e, ComposeUiNode.Companion.f15898g);
        Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
        p pVar = ComposeUiNode.Companion.f15900i;
        if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
            d.w(E, composer, E, pVar);
        }
        Updater.b(composer, c2, ComposeUiNode.Companion.d);
        this.f12653c.invoke(obj6, Integer.valueOf(intValue), composer, Integer.valueOf(intValue2 & 112));
        composer.p();
        return b0.f30125a;
    }
}
