package com.bytedance.adsdk.lottie.COT;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class dQp implements Iv<com.bytedance.adsdk.lottie.KS.lMd.jU> {
    private int zp;

    public dQp(int i9) {
        this.zp = i9;
    }

    @Override // com.bytedance.adsdk.lottie.COT.Iv
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.lottie.KS.lMd.jU lMd(JsonReader jsonReader, float f9) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z8 = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z8) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.zp = 2;
        }
        if (z8) {
            jsonReader.endArray();
        }
        if (this.zp == -1) {
            this.zp = arrayList.size() / 4;
        }
        int i9 = this.zp;
        float[] fArr = new float[i9];
        int[] iArr = new int[i9];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.zp * 4; i12++) {
            int i13 = i12 / 4;
            double floatValue = ((Float) arrayList.get(i12)).floatValue();
            int i14 = i12 % 4;
            if (i14 == 0) {
                if (i13 > 0) {
                    float f10 = (float) floatValue;
                    if (fArr[i13 - 1] >= f10) {
                        fArr[i13] = f10 + 0.01f;
                    }
                }
                fArr[i13] = (float) floatValue;
            } else if (i14 == 1) {
                i10 = (int) (floatValue * 255.0d);
            } else if (i14 == 2) {
                i11 = (int) (floatValue * 255.0d);
            } else if (i14 == 3) {
                iArr[i13] = Color.argb(255, i10, i11, (int) (floatValue * 255.0d));
            }
        }
        return zp(new com.bytedance.adsdk.lottie.KS.lMd.jU(fArr, iArr), arrayList);
    }

    private com.bytedance.adsdk.lottie.KS.lMd.jU zp(com.bytedance.adsdk.lottie.KS.lMd.jU jUVar, List<Float> list) {
        int i9 = this.zp * 4;
        if (list.size() <= i9) {
            return jUVar;
        }
        float[] zp = jUVar.zp();
        int[] lMd = jUVar.lMd();
        int size = (list.size() - i9) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i10 = 0;
        while (i9 < list.size()) {
            if (i9 % 2 == 0) {
                fArr[i10] = list.get(i9).floatValue();
            } else {
                fArr2[i10] = list.get(i9).floatValue();
                i10++;
            }
            i9++;
        }
        float[] zp2 = zp(jUVar.zp(), fArr);
        int length = zp2.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            float f9 = zp2[i11];
            int binarySearch = Arrays.binarySearch(zp, f9);
            int binarySearch2 = Arrays.binarySearch(fArr, f9);
            if (binarySearch >= 0 && binarySearch2 <= 0) {
                iArr[i11] = zp(f9, lMd[binarySearch], fArr, fArr2);
            } else {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                iArr[i11] = zp(f9, fArr2[binarySearch2], zp, lMd);
            }
        }
        return new com.bytedance.adsdk.lottie.KS.lMd.jU(zp2, iArr);
    }

    public int zp(float f9, float f10, float[] fArr, int[] iArr) {
        if (iArr.length >= 2 && f9 != fArr[0]) {
            for (int i9 = 1; i9 < fArr.length; i9++) {
                float f11 = fArr[i9];
                if (f11 >= f9 || i9 == fArr.length - 1) {
                    int i10 = i9 - 1;
                    float f12 = fArr[i10];
                    float f13 = (f9 - f12) / (f11 - f12);
                    int i11 = iArr[i9];
                    int i12 = iArr[i10];
                    return Color.argb((int) (f10 * 255.0f), com.bytedance.adsdk.lottie.HWF.lMd.zp(f13, Color.red(i12), Color.red(i11)), com.bytedance.adsdk.lottie.HWF.lMd.zp(f13, Color.green(i12), Color.green(i11)), com.bytedance.adsdk.lottie.HWF.lMd.zp(f13, Color.blue(i12), Color.blue(i11)));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return iArr[0];
    }

    private int zp(float f9, int i9, float[] fArr, float[] fArr2) {
        float zp;
        if (fArr2.length >= 2 && f9 > fArr[0]) {
            for (int i10 = 1; i10 < fArr.length; i10++) {
                float f10 = fArr[i10];
                if (f10 >= f9 || i10 == fArr.length - 1) {
                    if (f10 <= f9) {
                        zp = fArr2[i10];
                    } else {
                        int i11 = i10 - 1;
                        float f11 = fArr[i11];
                        zp = com.bytedance.adsdk.lottie.HWF.COT.zp(fArr2[i11], fArr2[i10], (f9 - f11) / (f10 - f11));
                    }
                    return Color.argb((int) (zp * 255.0f), Color.red(i9), Color.green(i9), Color.blue(i9));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i9), Color.green(i9), Color.blue(i9));
    }

    public static float[] zp(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            float f9 = i10 < fArr.length ? fArr[i10] : Float.NaN;
            float f10 = i11 < fArr2.length ? fArr2[i11] : Float.NaN;
            if (!Float.isNaN(f10) && f9 >= f10) {
                if (!Float.isNaN(f9) && f10 >= f9) {
                    fArr3[i12] = f9;
                    i10++;
                    i11++;
                    i9++;
                } else {
                    fArr3[i12] = f10;
                    i11++;
                }
            } else {
                fArr3[i12] = f9;
                i10++;
            }
        }
        return i9 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i9);
    }
}
