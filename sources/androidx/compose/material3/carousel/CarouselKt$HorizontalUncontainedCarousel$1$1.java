package androidx.compose.material3.carousel;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class CarouselKt$HorizontalUncontainedCarousel$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Density f12685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f12686b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselKt$HorizontalUncontainedCarousel$1$1(float f2, Density density) {
        super(2);
        this.f12685a = density;
        this.f12686b = f2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        Density density = this.f12685a;
        float y1 = density.y1(this.f12686b);
        if (floatValue == 0.0f || y1 == 0.0f) {
            return KeylineList.f12726h;
        }
        float min = Math.min(y1 + floatValue2, floatValue);
        int max = Math.max(1, (int) Math.floor(floatValue / min));
        float f2 = floatValue - (max * min);
        int i2 = f2 > 0.0f ? 1 : 0;
        float y12 = density.y1(CarouselDefaults.f12646c);
        float max2 = Math.max(1.5f * f2, y12);
        float f3 = 0.85f * min;
        if (max2 > f3) {
            max2 = Math.max(f3, f2 * 1.2f);
        }
        return KeylinesKt.a(floatValue, floatValue2, Math.max(Math.min(y12, y1), max2 * 0.5f), y12, new Arrangement(0, 0.0f, 0, max2, i2, min, max));
    }
}
