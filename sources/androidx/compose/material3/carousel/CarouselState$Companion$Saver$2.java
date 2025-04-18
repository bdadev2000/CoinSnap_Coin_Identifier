package androidx.compose.material3.carousel;

import java.util.List;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;

/* loaded from: classes.dex */
public final class CarouselState$Companion$Saver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final CarouselState$Companion$Saver$2 f12719a = new r(1);

    /* renamed from: androidx.compose.material3.carousel.CarouselState$Companion$Saver$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f12720a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list) {
            super(0);
            this.f12720a = list;
        }

        @Override // q0.a
        public final Object invoke() {
            Object obj = this.f12720a.get(2);
            p0.a.q(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        p0.a.q(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        p0.a.q(obj3, "null cannot be cast to non-null type kotlin.Float");
        return new CarouselState(intValue, ((Float) obj3).floatValue(), new AnonymousClass1(list));
    }
}
