package com.mbridge.msdk.foundation.tools;

import android.graphics.Bitmap;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Array;

/* loaded from: classes4.dex */
public final class o {
    public static int a = 2048;

    public static Bitmap a(Bitmap bitmap, int i10) {
        int i11;
        int[] iArr;
        if (i10 <= 0) {
            i11 = 10;
        } else {
            i11 = i10;
        }
        int width = bitmap.getWidth() / i11;
        int height = bitmap.getHeight() / i11;
        int i12 = 0;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, false);
        int width2 = createScaledBitmap.getWidth();
        int height2 = createScaledBitmap.getHeight();
        int i13 = width2 * height2;
        int[] iArr2 = new int[i13];
        createScaledBitmap.getPixels(iArr2, 0, width2, 0, 0, width2, height2);
        int i14 = width2 - 1;
        int i15 = height2 - 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[i13];
        int[] iArr6 = new int[Math.max(width2, height2)];
        int[] iArr7 = new int[20736];
        for (int i16 = 0; i16 < 20736; i16++) {
            iArr7[i16] = i16 / 81;
        }
        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 17, 3);
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i17 >= height2) {
                break;
            }
            int i20 = i12;
            int i21 = i20;
            int i22 = i21;
            int i23 = i22;
            int i24 = i23;
            int i25 = i24;
            int i26 = i25;
            int i27 = i26;
            int i28 = -8;
            int i29 = i27;
            for (int i30 = 8; i28 <= i30; i30 = 8) {
                int i31 = iArr2[Math.min(i14, Math.max(i28, i12)) + i18];
                int[] iArr9 = iArr8[i28 + 8];
                iArr9[i12] = (i31 & 16711680) >> 16;
                iArr9[1] = (i31 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr9[2] = i31 & 255;
                int abs = 9 - Math.abs(i28);
                int i32 = iArr9[i12];
                i29 = (i32 * abs) + i29;
                int i33 = iArr9[1];
                i20 = (i33 * abs) + i20;
                int i34 = iArr9[2];
                i21 = (abs * i34) + i21;
                if (i28 > 0) {
                    i25 += i32;
                    i26 += i33;
                    i27 += i34;
                } else {
                    i22 += i32;
                    i23 += i33;
                    i24 += i34;
                }
                i28++;
            }
            int i35 = i12;
            int i36 = 8;
            while (i35 < width2) {
                iArr3[i18] = iArr7[i29];
                iArr4[i18] = iArr7[i20];
                iArr5[i18] = iArr7[i21];
                int i37 = i29 - i22;
                int i38 = i20 - i23;
                int i39 = i21 - i24;
                int[] iArr10 = iArr8[((i36 - 8) + 17) % 17];
                int i40 = i22 - iArr10[i12];
                int i41 = i23 - iArr10[1];
                int i42 = i24 - iArr10[2];
                if (i17 == 0) {
                    iArr6[i35] = Math.min(i35 + 8 + 1, i14);
                }
                int i43 = iArr2[i19 + iArr6[i35]];
                int i44 = (i43 & 16711680) >> 16;
                iArr10[0] = i44;
                int i45 = (i43 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr10[1] = i45;
                int i46 = i43 & 255;
                iArr10[2] = i46;
                int i47 = i25 + i44;
                int i48 = i26 + i45;
                int i49 = i27 + i46;
                i29 = i37 + i47;
                i20 = i38 + i48;
                i21 = i39 + i49;
                i36 = (i36 + 1) % 17;
                int[] iArr11 = iArr8[i36 % 17];
                int i50 = iArr11[0];
                i22 = i40 + i50;
                int i51 = iArr11[1];
                i23 = i41 + i51;
                int i52 = iArr11[2];
                i24 = i42 + i52;
                i25 = i47 - i50;
                i26 = i48 - i51;
                i27 = i49 - i52;
                i18++;
                i35++;
                i12 = 0;
            }
            i19 += width2;
            i17++;
            i12 = 0;
        }
        int i53 = 0;
        while (i53 < width2) {
            int i54 = (-8) * width2;
            Bitmap bitmap2 = createScaledBitmap;
            int[] iArr12 = iArr6;
            int i55 = -8;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            int i64 = 0;
            for (int i65 = 8; i55 <= i65; i65 = 8) {
                int max = Math.max(0, i54) + i53;
                int[] iArr13 = iArr8[i55 + 8];
                iArr13[0] = iArr3[max];
                iArr13[1] = iArr4[max];
                iArr13[2] = iArr5[max];
                int abs2 = 9 - Math.abs(i55);
                i56 = (iArr3[max] * abs2) + i56;
                i57 = (iArr4[max] * abs2) + i57;
                i58 = (iArr5[max] * abs2) + i58;
                if (i55 > 0) {
                    i62 += iArr13[0];
                    i63 += iArr13[1];
                    i64 += iArr13[2];
                } else {
                    i59 += iArr13[0];
                    i60 += iArr13[1];
                    i61 += iArr13[2];
                }
                if (i55 < i15) {
                    i54 += width2;
                }
                i55++;
            }
            int i66 = i53;
            int i67 = 0;
            int i68 = 8;
            while (i67 < height2) {
                iArr2[i66] = (iArr2[i66] & ViewCompat.MEASURED_STATE_MASK) | (iArr7[i56] << 16) | (iArr7[i57] << 8) | iArr7[i58];
                int i69 = i56 - i59;
                int i70 = i57 - i60;
                int i71 = i58 - i61;
                int[] iArr14 = iArr8[((i68 - 8) + 17) % 17];
                int i72 = i59 - iArr14[0];
                int i73 = i60 - iArr14[1];
                int i74 = i61 - iArr14[2];
                if (i53 == 0) {
                    iArr = iArr7;
                    iArr12[i67] = Math.min(i67 + 9, i15) * width2;
                } else {
                    iArr = iArr7;
                }
                int i75 = iArr12[i67] + i53;
                int i76 = iArr3[i75];
                iArr14[0] = i76;
                int i77 = iArr4[i75];
                iArr14[1] = i77;
                int i78 = iArr5[i75];
                iArr14[2] = i78;
                int i79 = i62 + i76;
                int i80 = i63 + i77;
                int i81 = i64 + i78;
                i56 = i69 + i79;
                i57 = i70 + i80;
                i58 = i71 + i81;
                i68 = (i68 + 1) % 17;
                int[] iArr15 = iArr8[i68];
                int i82 = iArr15[0];
                i59 = i72 + i82;
                int i83 = iArr15[1];
                i60 = i73 + i83;
                int i84 = iArr15[2];
                i61 = i74 + i84;
                i62 = i79 - i82;
                i63 = i80 - i83;
                i64 = i81 - i84;
                i66 += width2;
                i67++;
                iArr7 = iArr;
            }
            i53++;
            createScaledBitmap = bitmap2;
            iArr6 = iArr12;
        }
        Bitmap bitmap3 = createScaledBitmap;
        bitmap3.setPixels(iArr2, 0, width2, 0, 0, width2, height2);
        return bitmap3;
    }
}
