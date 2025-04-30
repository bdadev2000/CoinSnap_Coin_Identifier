package com.applovin.impl;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m3 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f8892a = {0, 0, 0, 1};
    private static final String[] b = {"", "A", "B", "C"};

    public static String a(int i9, int i10, int i11) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static List a(boolean z8) {
        return Collections.singletonList(z8 ? new byte[]{1} : new byte[]{0});
    }

    public static String a(zg zgVar) {
        zgVar.d(24);
        int b8 = zgVar.b(2);
        boolean c9 = zgVar.c();
        int b9 = zgVar.b(5);
        int i9 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
            if (zgVar.c()) {
                i9 |= 1 << i10;
            }
        }
        int i11 = 6;
        int[] iArr = new int[6];
        for (int i12 = 0; i12 < 6; i12++) {
            iArr[i12] = zgVar.b(8);
        }
        StringBuilder sb = new StringBuilder(yp.a("hvc1.%s%d.%X.%c%d", b[b8], Integer.valueOf(b9), Integer.valueOf(i9), Character.valueOf(c9 ? 'H' : 'L'), Integer.valueOf(zgVar.b(8))));
        while (i11 > 0 && iArr[i11 - 1] == 0) {
            i11--;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i13])));
        }
        return sb.toString();
    }

    public static byte[] a(byte[] bArr, int i9, int i10) {
        byte[] bArr2 = f8892a;
        byte[] bArr3 = new byte[bArr2.length + i10];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i9, bArr3, bArr2.length, i10);
        return bArr3;
    }

    public static boolean a(List list) {
        return list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1;
    }

    public static Pair a(byte[] bArr) {
        yg ygVar = new yg(bArr);
        ygVar.f(9);
        int w2 = ygVar.w();
        ygVar.f(20);
        return Pair.create(Integer.valueOf(ygVar.A()), Integer.valueOf(w2));
    }
}
