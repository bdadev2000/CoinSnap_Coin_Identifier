package androidx.compose.material3.carousel;

import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes4.dex */
final class CarouselKt$Carousel$2$1$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CarouselPageSize f12659a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselKt$Carousel$2$1$1(CarouselPageSize carouselPageSize) {
        super(0);
        this.f12659a = carouselPageSize;
    }

    @Override // q0.a
    public final Object invoke() {
        return (Strategy) this.f12659a.d.getValue();
    }
}
