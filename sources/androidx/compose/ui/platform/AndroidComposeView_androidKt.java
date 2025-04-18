package androidx.compose.ui.platform;

/* loaded from: classes3.dex */
public final class AndroidComposeView_androidKt {
    public static final float a(int i2, float[] fArr, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static final void b(float[] fArr, float[] fArr2) {
        float a2 = a(0, fArr2, fArr, 0);
        float a3 = a(0, fArr2, fArr, 1);
        float a4 = a(0, fArr2, fArr, 2);
        float a5 = a(0, fArr2, fArr, 3);
        float a6 = a(1, fArr2, fArr, 0);
        float a7 = a(1, fArr2, fArr, 1);
        float a8 = a(1, fArr2, fArr, 2);
        float a9 = a(1, fArr2, fArr, 3);
        float a10 = a(2, fArr2, fArr, 0);
        float a11 = a(2, fArr2, fArr, 1);
        float a12 = a(2, fArr2, fArr, 2);
        float a13 = a(2, fArr2, fArr, 3);
        float a14 = a(3, fArr2, fArr, 0);
        float a15 = a(3, fArr2, fArr, 1);
        float a16 = a(3, fArr2, fArr, 2);
        float a17 = a(3, fArr2, fArr, 3);
        fArr[0] = a2;
        fArr[1] = a3;
        fArr[2] = a4;
        fArr[3] = a5;
        fArr[4] = a6;
        fArr[5] = a7;
        fArr[6] = a8;
        fArr[7] = a9;
        fArr[8] = a10;
        fArr[9] = a11;
        fArr[10] = a12;
        fArr[11] = a13;
        fArr[12] = a14;
        fArr[13] = a15;
        fArr[14] = a16;
        fArr[15] = a17;
    }
}
