package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

@RestrictTo
/* loaded from: classes3.dex */
public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    /* loaded from: classes3.dex */
    public static final class Distance implements Comparable<Distance> {
        int index = -1;
        double distance = -1.0d;

        @Override // java.lang.Comparable
        public int compareTo(Distance distance) {
            return Double.valueOf(this.distance).compareTo(Double.valueOf(distance.distance));
        }
    }

    private QuantizerWsmeans() {
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int[] iArr2, int i2) {
        int[] iArr3;
        int i3;
        int i4;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr = new double[iArr.length];
        int[] iArr4 = new int[iArr.length];
        PointProviderLab pointProviderLab = new PointProviderLab();
        int i5 = 0;
        for (int i6 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i6));
            if (num == null) {
                dArr[i5] = pointProviderLab.fromInt(i6);
                iArr4[i5] = i6;
                i5++;
                linkedHashMap.put(Integer.valueOf(i6), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i6), Integer.valueOf(num.intValue() + 1));
            }
        }
        int[] iArr5 = new int[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            iArr5[i7] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr4[i7]))).intValue();
        }
        int min = Math.min(i2, i5);
        if (iArr2.length != 0) {
            min = Math.min(min, iArr2.length);
        }
        double[][] dArr2 = new double[min];
        int i8 = 0;
        for (int i9 = 0; i9 < iArr2.length; i9++) {
            dArr2[i9] = pointProviderLab.fromInt(iArr2[i9]);
            i8++;
        }
        int i10 = min - i8;
        if (i10 > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
            }
        }
        int[] iArr6 = new int[i5];
        for (int i12 = 0; i12 < i5; i12++) {
            iArr6[i12] = random.nextInt(min);
        }
        int[][] iArr7 = new int[min];
        for (int i13 = 0; i13 < min; i13++) {
            iArr7[i13] = new int[min];
        }
        Distance[][] distanceArr = new Distance[min];
        for (int i14 = 0; i14 < min; i14++) {
            distanceArr[i14] = new Distance[min];
            for (int i15 = 0; i15 < min; i15++) {
                distanceArr[i14][i15] = new Distance();
            }
        }
        int[] iArr8 = new int[min];
        int i16 = 0;
        while (true) {
            if (i16 >= 10) {
                iArr3 = iArr8;
                i3 = 0;
                break;
            }
            int i17 = 0;
            while (i17 < min) {
                int i18 = i17 + 1;
                int i19 = i18;
                while (i19 < min) {
                    int[] iArr9 = iArr8;
                    double distance = pointProviderLab.distance(dArr2[i17], dArr2[i19]);
                    Distance distance2 = distanceArr[i19][i17];
                    distance2.distance = distance;
                    distance2.index = i17;
                    Distance distance3 = distanceArr[i17][i19];
                    distance3.distance = distance;
                    distance3.index = i19;
                    i19++;
                    iArr8 = iArr9;
                }
                int[] iArr10 = iArr8;
                Arrays.sort(distanceArr[i17]);
                for (int i20 = 0; i20 < min; i20++) {
                    iArr7[i17][i20] = distanceArr[i17][i20].index;
                }
                iArr8 = iArr10;
                i17 = i18;
            }
            int[] iArr11 = iArr8;
            int i21 = 0;
            int i22 = 0;
            while (i21 < i5) {
                double[] dArr3 = dArr[i21];
                int i23 = iArr6[i21];
                double distance4 = pointProviderLab.distance(dArr3, dArr2[i23]);
                int[][] iArr12 = iArr7;
                int[] iArr13 = iArr5;
                double d = distance4;
                int i24 = -1;
                int i25 = 0;
                while (i25 < min) {
                    Distance[][] distanceArr2 = distanceArr;
                    int i26 = i5;
                    if (distanceArr[i23][i25].distance < 4.0d * distance4) {
                        double distance5 = pointProviderLab.distance(dArr3, dArr2[i25]);
                        if (distance5 < d) {
                            i24 = i25;
                            d = distance5;
                        }
                    }
                    i25++;
                    i5 = i26;
                    distanceArr = distanceArr2;
                }
                Distance[][] distanceArr3 = distanceArr;
                int i27 = i5;
                if (i24 != -1 && Math.abs(Math.sqrt(d) - Math.sqrt(distance4)) > 3.0d) {
                    i22++;
                    iArr6[i21] = i24;
                }
                i21++;
                iArr7 = iArr12;
                iArr5 = iArr13;
                i5 = i27;
                distanceArr = distanceArr3;
            }
            int[] iArr14 = iArr5;
            int[][] iArr15 = iArr7;
            Distance[][] distanceArr4 = distanceArr;
            int i28 = i5;
            if (i22 == 0 && i16 != 0) {
                i3 = 0;
                iArr3 = iArr11;
                break;
            }
            double[] dArr4 = new double[min];
            double[] dArr5 = new double[min];
            double[] dArr6 = new double[min];
            char c2 = 0;
            Arrays.fill(iArr11, 0);
            int i29 = 0;
            while (true) {
                i4 = i28;
                if (i29 >= i4) {
                    break;
                }
                int i30 = iArr6[i29];
                double[] dArr7 = dArr[i29];
                int i31 = iArr14[i29];
                iArr11[i30] = iArr11[i30] + i31;
                double d2 = i31;
                dArr4[i30] = (dArr7[c2] * d2) + dArr4[i30];
                dArr5[i30] = (dArr7[1] * d2) + dArr5[i30];
                dArr6[i30] = (dArr7[2] * d2) + dArr6[i30];
                i29++;
                i16 = i16;
                i28 = i4;
                c2 = 0;
            }
            int i32 = i16;
            for (int i33 = 0; i33 < min; i33++) {
                int i34 = iArr11[i33];
                if (i34 == 0) {
                    dArr2[i33] = new double[]{FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE};
                } else {
                    double d3 = i34;
                    double d4 = dArr4[i33] / d3;
                    double d5 = dArr5[i33] / d3;
                    double d6 = dArr6[i33] / d3;
                    double[] dArr8 = dArr2[i33];
                    dArr8[0] = d4;
                    dArr8[1] = d5;
                    dArr8[2] = d6;
                }
            }
            iArr7 = iArr15;
            i16 = i32 + 1;
            iArr8 = iArr11;
            i5 = i4;
            iArr5 = iArr14;
            distanceArr = distanceArr4;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i35 = i3; i35 < min; i35++) {
            int i36 = iArr3[i35];
            if (i36 != 0) {
                int i37 = pointProviderLab.toInt(dArr2[i35]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(i37))) {
                    linkedHashMap2.put(Integer.valueOf(i37), Integer.valueOf(i36));
                }
            }
        }
        return linkedHashMap2;
    }
}
