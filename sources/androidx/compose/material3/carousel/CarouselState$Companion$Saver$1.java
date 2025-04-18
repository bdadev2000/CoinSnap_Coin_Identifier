package androidx.compose.material3.carousel;

import androidx.compose.foundation.pager.PagerState;
import b1.f0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
public final class CarouselState$Companion$Saver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final CarouselState$Companion$Saver$1 f12718a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        CarouselState carouselState = (CarouselState) obj2;
        Integer valueOf = Integer.valueOf(carouselState.f12717b.j());
        PagerState pagerState = carouselState.f12717b;
        return f0.v(valueOf, Float.valueOf(pagerState.k()), Integer.valueOf(pagerState.m()));
    }
}
