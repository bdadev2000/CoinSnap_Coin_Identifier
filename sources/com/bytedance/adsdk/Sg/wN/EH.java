package com.bytedance.adsdk.Sg.wN;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class EH implements zG<com.bytedance.adsdk.Sg.tN.Sg.AlY> {
    private int YFl;

    public EH(int i10) {
        this.YFl = i10;
    }

    @Override // com.bytedance.adsdk.Sg.wN.zG
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.Sg.tN.Sg.AlY Sg(JsonReader jsonReader, float f10) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z10 = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z10) {
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
            this.YFl = 2;
        }
        if (z10) {
            jsonReader.endArray();
        }
        if (this.YFl == -1) {
            this.YFl = arrayList.size() / 4;
        }
        int i10 = this.YFl;
        float[] fArr = new float[i10];
        int[] iArr = new int[i10];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.YFl * 4; i13++) {
            int i14 = i13 / 4;
            double floatValue = ((Float) arrayList.get(i13)).floatValue();
            int i15 = i13 % 4;
            if (i15 == 0) {
                if (i14 > 0) {
                    float f11 = (float) floatValue;
                    if (fArr[i14 - 1] >= f11) {
                        fArr[i14] = f11 + 0.01f;
                    }
                }
                fArr[i14] = (float) floatValue;
            } else if (i15 == 1) {
                i11 = (int) (floatValue * 255.0d);
            } else if (i15 == 2) {
                i12 = (int) (floatValue * 255.0d);
            } else if (i15 == 3) {
                iArr[i14] = Color.argb(255, i11, i12, (int) (floatValue * 255.0d));
            }
        }
        return YFl(new com.bytedance.adsdk.Sg.tN.Sg.AlY(fArr, iArr), arrayList);
    }

    private com.bytedance.adsdk.Sg.tN.Sg.AlY YFl(com.bytedance.adsdk.Sg.tN.Sg.AlY alY, List<Float> list) {
        int i10 = this.YFl * 4;
        if (list.size() <= i10) {
            return alY;
        }
        float[] YFl = alY.YFl();
        int[] Sg = alY.Sg();
        int size = (list.size() - i10) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i11 = 0;
        while (i10 < list.size()) {
            if (i10 % 2 == 0) {
                fArr[i11] = list.get(i10).floatValue();
            } else {
                fArr2[i11] = list.get(i10).floatValue();
                i11++;
            }
            i10++;
        }
        float[] YFl2 = YFl(alY.YFl(), fArr);
        int length = YFl2.length;
        int[] iArr = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            float f10 = YFl2[i12];
            int binarySearch = Arrays.binarySearch(YFl, f10);
            int binarySearch2 = Arrays.binarySearch(fArr, f10);
            if (binarySearch >= 0 && binarySearch2 <= 0) {
                iArr[i12] = YFl(f10, Sg[binarySearch], fArr, fArr2);
            } else {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                iArr[i12] = YFl(f10, fArr2[binarySearch2], YFl, Sg);
            }
        }
        return new com.bytedance.adsdk.Sg.tN.Sg.AlY(YFl2, iArr);
    }

    public int YFl(float f10, float f11, float[] fArr, int[] iArr) {
        if (iArr.length >= 2 && f10 != fArr[0]) {
            for (int i10 = 1; i10 < fArr.length; i10++) {
                float f12 = fArr[i10];
                if (f12 >= f10 || i10 == fArr.length - 1) {
                    int i11 = i10 - 1;
                    float f13 = fArr[i11];
                    float f14 = (f10 - f13) / (f12 - f13);
                    int i12 = iArr[i10];
                    int i13 = iArr[i11];
                    return Color.argb((int) (f11 * 255.0f), com.bytedance.adsdk.Sg.vc.Sg.YFl(f14, Color.red(i13), Color.red(i12)), com.bytedance.adsdk.Sg.vc.Sg.YFl(f14, Color.green(i13), Color.green(i12)), com.bytedance.adsdk.Sg.vc.Sg.YFl(f14, Color.blue(i13), Color.blue(i12)));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return iArr[0];
    }

    private int YFl(float f10, int i10, float[] fArr, float[] fArr2) {
        float YFl;
        if (fArr2.length >= 2 && f10 > fArr[0]) {
            for (int i11 = 1; i11 < fArr.length; i11++) {
                float f11 = fArr[i11];
                if (f11 >= f10 || i11 == fArr.length - 1) {
                    if (f11 <= f10) {
                        YFl = fArr2[i11];
                    } else {
                        int i12 = i11 - 1;
                        float f12 = fArr[i12];
                        YFl = com.bytedance.adsdk.Sg.vc.wN.YFl(fArr2[i12], fArr2[i11], (f10 - f12) / (f11 - f12));
                    }
                    return Color.argb((int) (YFl * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    public static float[] YFl(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            float f10 = i11 < fArr.length ? fArr[i11] : Float.NaN;
            float f11 = i12 < fArr2.length ? fArr2[i12] : Float.NaN;
            if (!Float.isNaN(f11) && f10 >= f11) {
                if (!Float.isNaN(f10) && f11 >= f10) {
                    fArr3[i13] = f10;
                    i11++;
                    i12++;
                    i10++;
                } else {
                    fArr3[i13] = f11;
                    i12++;
                }
            } else {
                fArr3[i13] = f10;
                i11++;
            }
        }
        return i10 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i10);
    }
}
