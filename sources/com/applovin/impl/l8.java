package com.applovin.impl;

import java.io.EOFException;

/* loaded from: classes.dex */
public abstract class l8 {
    public static void a(boolean z8, String str) {
        if (!z8) {
            throw ah.a(str, null);
        }
    }

    public static boolean b(j8 j8Var, byte[] bArr, int i9, int i10) {
        try {
            j8Var.d(bArr, i9, i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean a(j8 j8Var, byte[] bArr, int i9, int i10, boolean z8) {
        try {
            return j8Var.b(bArr, i9, i10, z8);
        } catch (EOFException e4) {
            if (z8) {
                return false;
            }
            throw e4;
        }
    }

    public static int a(j8 j8Var, byte[] bArr, int i9, int i10) {
        int i11 = 0;
        while (i11 < i10) {
            int b = j8Var.b(bArr, i9 + i11, i10 - i11);
            if (b == -1) {
                break;
            }
            i11 += b;
        }
        return i11;
    }

    public static boolean a(j8 j8Var, int i9) {
        try {
            j8Var.a(i9);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
