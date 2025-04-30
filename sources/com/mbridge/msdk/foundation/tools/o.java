package com.mbridge.msdk.foundation.tools;

import android.graphics.Bitmap;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Array;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static int f16072a = 2048;

    public static Bitmap a(Bitmap bitmap, int i9) {
        int i10;
        int[] iArr;
        if (i9 <= 0) {
            i10 = 10;
        } else {
            i10 = i9;
        }
        int width = bitmap.getWidth() / i10;
        int height = bitmap.getHeight() / i10;
        int i11 = 0;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, false);
        int width2 = createScaledBitmap.getWidth();
        int height2 = createScaledBitmap.getHeight();
        int i12 = width2 * height2;
        int[] iArr2 = new int[i12];
        createScaledBitmap.getPixels(iArr2, 0, width2, 0, 0, width2, height2);
        int i13 = width2 - 1;
        int i14 = height2 - 1;
        int[] iArr3 = new int[i12];
        int[] iArr4 = new int[i12];
        int[] iArr5 = new int[i12];
        int[] iArr6 = new int[Math.max(width2, height2)];
        int[] iArr7 = new int[20736];
        for (int i15 = 0; i15 < 20736; i15++) {
            iArr7[i15] = i15 / 81;
        }
        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 17, 3);
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (i16 >= height2) {
                break;
            }
            int i19 = i11;
            int i20 = i19;
            int i21 = i20;
            int i22 = i21;
            int i23 = i22;
            int i24 = i23;
            int i25 = i24;
            int i26 = i25;
            int i27 = -8;
            int i28 = i26;
            for (int i29 = 8; i27 <= i29; i29 = 8) {
                int i30 = iArr2[Math.min(i13, Math.max(i27, i11)) + i17];
                int[] iArr9 = iArr8[i27 + 8];
                iArr9[i11] = (i30 & 16711680) >> 16;
                iArr9[1] = (i30 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr9[2] = i30 & 255;
                int abs = 9 - Math.abs(i27);
                int i31 = iArr9[i11];
                i28 = (i31 * abs) + i28;
                int i32 = iArr9[1];
                i19 = (i32 * abs) + i19;
                int i33 = iArr9[2];
                i20 = (abs * i33) + i20;
                if (i27 > 0) {
                    i24 += i31;
                    i25 += i32;
                    i26 += i33;
                } else {
                    i21 += i31;
                    i22 += i32;
                    i23 += i33;
                }
                i27++;
            }
            int i34 = i11;
            int i35 = 8;
            while (i34 < width2) {
                iArr3[i17] = iArr7[i28];
                iArr4[i17] = iArr7[i19];
                iArr5[i17] = iArr7[i20];
                int i36 = i28 - i21;
                int i37 = i19 - i22;
                int i38 = i20 - i23;
                int[] iArr10 = iArr8[(i35 + 9) % 17];
                int i39 = i21 - iArr10[i11];
                int i40 = i22 - iArr10[1];
                int i41 = i23 - iArr10[2];
                if (i16 == 0) {
                    iArr6[i34] = Math.min(i34 + 9, i13);
                }
                int i42 = iArr2[i18 + iArr6[i34]];
                int i43 = (i42 & 16711680) >> 16;
                iArr10[0] = i43;
                int i44 = (i42 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr10[1] = i44;
                int i45 = i42 & 255;
                iArr10[2] = i45;
                int i46 = i24 + i43;
                int i47 = i25 + i44;
                int i48 = i26 + i45;
                i28 = i36 + i46;
                i19 = i37 + i47;
                i20 = i38 + i48;
                i35 = (i35 + 1) % 17;
                int[] iArr11 = iArr8[i35 % 17];
                int i49 = iArr11[0];
                i21 = i39 + i49;
                int i50 = iArr11[1];
                i22 = i40 + i50;
                int i51 = iArr11[2];
                i23 = i41 + i51;
                i24 = i46 - i49;
                i25 = i47 - i50;
                i26 = i48 - i51;
                i17++;
                i34++;
                i11 = 0;
            }
            i18 += width2;
            i16++;
            i11 = 0;
        }
        int i52 = 0;
        while (i52 < width2) {
            int i53 = (-8) * width2;
            Bitmap bitmap2 = createScaledBitmap;
            int[] iArr12 = iArr6;
            int i54 = -8;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            for (int i64 = 8; i54 <= i64; i64 = 8) {
                int max = Math.max(0, i53) + i52;
                int[] iArr13 = iArr8[i54 + 8];
                iArr13[0] = iArr3[max];
                iArr13[1] = iArr4[max];
                iArr13[2] = iArr5[max];
                int abs2 = 9 - Math.abs(i54);
                i55 = (iArr3[max] * abs2) + i55;
                i56 = (iArr4[max] * abs2) + i56;
                i57 = (iArr5[max] * abs2) + i57;
                if (i54 > 0) {
                    i61 += iArr13[0];
                    i62 += iArr13[1];
                    i63 += iArr13[2];
                } else {
                    i58 += iArr13[0];
                    i59 += iArr13[1];
                    i60 += iArr13[2];
                }
                if (i54 < i14) {
                    i53 += width2;
                }
                i54++;
            }
            int i65 = i52;
            int i66 = 0;
            int i67 = 8;
            while (i66 < height2) {
                iArr2[i65] = (iArr2[i65] & ViewCompat.MEASURED_STATE_MASK) | (iArr7[i55] << 16) | (iArr7[i56] << 8) | iArr7[i57];
                int i68 = i55 - i58;
                int i69 = i56 - i59;
                int i70 = i57 - i60;
                int[] iArr14 = iArr8[(i67 + 9) % 17];
                int i71 = i58 - iArr14[0];
                int i72 = i59 - iArr14[1];
                int i73 = i60 - iArr14[2];
                if (i52 == 0) {
                    iArr = iArr7;
                    iArr12[i66] = Math.min(i66 + 9, i14) * width2;
                } else {
                    iArr = iArr7;
                }
                int i74 = iArr12[i66] + i52;
                int i75 = iArr3[i74];
                iArr14[0] = i75;
                int i76 = iArr4[i74];
                iArr14[1] = i76;
                int i77 = iArr5[i74];
                iArr14[2] = i77;
                int i78 = i61 + i75;
                int i79 = i62 + i76;
                int i80 = i63 + i77;
                i55 = i68 + i78;
                i56 = i69 + i79;
                i57 = i70 + i80;
                i67 = (i67 + 1) % 17;
                int[] iArr15 = iArr8[i67];
                int i81 = iArr15[0];
                i58 = i71 + i81;
                int i82 = iArr15[1];
                i59 = i72 + i82;
                int i83 = iArr15[2];
                i60 = i73 + i83;
                i61 = i78 - i81;
                i62 = i79 - i82;
                i63 = i80 - i83;
                i65 += width2;
                i66++;
                iArr7 = iArr;
            }
            i52++;
            createScaledBitmap = bitmap2;
            iArr6 = iArr12;
        }
        Bitmap bitmap3 = createScaledBitmap;
        bitmap3.setPixels(iArr2, 0, width2, 0, 0, width2, height2);
        return bitmap3;
    }
}
