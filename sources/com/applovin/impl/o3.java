package com.applovin.impl;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class o3 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f25812a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f25813b = {"", "A", "B", "C"};

    public static String a(int i2, int i3, int i4) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static List a(boolean z2) {
        return Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
    }

    public static String a(ch chVar) {
        chVar.d(24);
        int b2 = chVar.b(2);
        boolean c2 = chVar.c();
        int b3 = chVar.b(5);
        int i2 = 0;
        for (int i3 = 0; i3 < 32; i3++) {
            if (chVar.c()) {
                i2 |= 1 << i3;
            }
        }
        int i4 = 6;
        int[] iArr = new int[6];
        for (int i5 = 0; i5 < 6; i5++) {
            iArr[i5] = chVar.b(8);
        }
        int b4 = chVar.b(8);
        Object[] objArr = new Object[5];
        objArr[0] = f25813b[b2];
        objArr[1] = Integer.valueOf(b3);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Character.valueOf(c2 ? 'H' : 'L');
        objArr[4] = Integer.valueOf(b4);
        StringBuilder sb = new StringBuilder(xp.a("hvc1.%s%d.%X.%c%d", objArr));
        while (i4 > 0 && iArr[i4 - 1] == 0) {
            i4--;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }

    public static byte[] a(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = f25812a;
        byte[] bArr3 = new byte[bArr2.length + i3];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i2, bArr3, bArr2.length, i3);
        return bArr3;
    }

    public static boolean a(List list) {
        return list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1;
    }

    public static Pair a(byte[] bArr) {
        bh bhVar = new bh(bArr);
        bhVar.f(9);
        int w = bhVar.w();
        bhVar.f(20);
        return Pair.create(Integer.valueOf(bhVar.A()), Integer.valueOf(w));
    }
}
