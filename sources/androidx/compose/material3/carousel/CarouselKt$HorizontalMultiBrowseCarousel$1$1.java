package androidx.compose.material3.carousel;

import androidx.compose.material3.carousel.Arrangement;
import androidx.compose.ui.unit.Density;
import e0.q;
import kotlin.jvm.internal.r;
import q0.a;
import q0.p;

/* loaded from: classes4.dex */
final class CarouselKt$HorizontalMultiBrowseCarousel$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Density f12671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f12672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselState f12673c;
    public final /* synthetic */ float d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f12674f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselKt$HorizontalMultiBrowseCarousel$1$1(Density density, float f2, CarouselState carouselState, float f3, float f4) {
        super(2);
        this.f12671a = density;
        this.f12672b = f2;
        this.f12673c = carouselState;
        this.d = f3;
        this.f12674f = f4;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        Density density = this.f12671a;
        float y1 = density.y1(this.f12672b);
        int intValue = ((Number) ((a) this.f12673c.f12716a.getValue()).invoke()).intValue();
        float y12 = density.y1(this.d);
        float y13 = density.y1(this.f12674f);
        if (floatValue == 0.0f || y1 == 0.0f) {
            return KeylineList.f12726h;
        }
        int[] iArr = {1};
        int[] iArr2 = {1, 0};
        float min = Math.min(y1, floatValue);
        float z2 = p0.a.z(min / 3.0f, y12, y13);
        float f2 = (min + z2) / 2.0f;
        int[] iArr3 = floatValue < ((float) 2) * y12 ? new int[]{0} : iArr;
        int ceil = (int) Math.ceil(floatValue / min);
        int max = (ceil - Math.max(1, (int) Math.floor(((floatValue - (q.f0(iArr2) * f2)) - (q.f0(iArr3) * y13)) / min))) + 1;
        int[] iArr4 = new int[max];
        for (int i2 = 0; i2 < max; i2++) {
            iArr4[i2] = ceil - i2;
        }
        float y14 = density.y1(CarouselDefaults.f12646c);
        Arrangement a2 = Arrangement.Companion.a(floatValue, floatValue2, z2, y12, y13, iArr3, f2, iArr2, min, iArr4);
        if (a2 != null) {
            int i3 = a2.f12643g;
            int i4 = a2.e;
            int i5 = a2.f12641c;
            if (i3 + i4 + i5 > intValue) {
                for (int i6 = ((i3 + i4) + i5) - intValue; i6 > 0; i6--) {
                    if (i5 > 0) {
                        i5--;
                    } else if (i4 > 1) {
                        i4--;
                    }
                }
                a2 = Arrangement.Companion.a(floatValue, floatValue2, z2, y12, y13, new int[]{i5}, f2, new int[]{i4}, min, iArr4);
            }
        }
        return a2 == null ? KeylineList.f12726h : KeylinesKt.a(floatValue, floatValue2, y14, y14, a2);
    }
}
