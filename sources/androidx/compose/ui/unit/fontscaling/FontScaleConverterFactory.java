package androidx.compose.ui.unit.fontscaling;

import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayCompatKt;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
@RestrictTo
/* loaded from: classes3.dex */
public final class FontScaleConverterFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f17503a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b, reason: collision with root package name */
    public static volatile SparseArrayCompat f17504b = new SparseArrayCompat(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f17505c;

    static {
        Object[] objArr = new Object[0];
        f17505c = objArr;
        synchronized (objArr) {
            f17504b.f((int) 115.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f17504b.f((int) 130.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f17504b.f((int) 150.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f17504b.f((int) 180.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f17504b.f((int) 200.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f17504b.d(0) / 100.0f) - 0.01f <= 1.03f) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
    }

    public static FontScaleConverter a(float f2) {
        float d;
        FontScaleConverter fontScaleConverter;
        if (f2 < 1.03f) {
            return null;
        }
        int i2 = (int) (f2 * 100.0f);
        FontScaleConverter fontScaleConverter2 = (FontScaleConverter) f17504b.c(i2);
        if (fontScaleConverter2 != null) {
            return fontScaleConverter2;
        }
        SparseArrayCompat sparseArrayCompat = f17504b;
        if (sparseArrayCompat.f1609a) {
            SparseArrayCompatKt.a(sparseArrayCompat);
        }
        int a2 = ContainerHelpersKt.a(sparseArrayCompat.d, i2, sparseArrayCompat.f1610b);
        if (a2 >= 0) {
            return (FontScaleConverter) f17504b.h(a2);
        }
        int i3 = -(a2 + 1);
        int i4 = i3 - 1;
        if (i3 >= f17504b.g()) {
            FontScaleConverterTable fontScaleConverterTable = new FontScaleConverterTable(new float[]{1.0f}, new float[]{f2});
            b(f2, fontScaleConverterTable);
            return fontScaleConverterTable;
        }
        float[] fArr = f17503a;
        if (i4 < 0) {
            fontScaleConverter = new FontScaleConverterTable(fArr, fArr);
            d = 1.0f;
        } else {
            d = f17504b.d(i4) / 100.0f;
            fontScaleConverter = (FontScaleConverter) f17504b.h(i4);
        }
        float d2 = f17504b.d(i3) / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, d == d2 ? 0.0f : (f2 - d) / (d2 - d))) * 1.0f) + 0.0f;
        FontScaleConverter fontScaleConverter3 = (FontScaleConverter) f17504b.h(i3);
        float[] fArr2 = new float[9];
        for (int i5 = 0; i5 < 9; i5++) {
            float f3 = fArr[i5];
            float b2 = fontScaleConverter.b(f3);
            fArr2[i5] = ((fontScaleConverter3.b(f3) - b2) * max) + b2;
        }
        FontScaleConverterTable fontScaleConverterTable2 = new FontScaleConverterTable(fArr, fArr2);
        b(f2, fontScaleConverterTable2);
        return fontScaleConverterTable2;
    }

    public static void b(float f2, FontScaleConverterTable fontScaleConverterTable) {
        synchronized (f17505c) {
            SparseArrayCompat clone = f17504b.clone();
            clone.f((int) (f2 * 100.0f), fontScaleConverterTable);
            f17504b = clone;
        }
    }
}
