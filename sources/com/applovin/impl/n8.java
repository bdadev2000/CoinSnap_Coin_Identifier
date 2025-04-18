package com.applovin.impl;

import java.io.EOFException;

/* loaded from: classes.dex */
public abstract class n8 {
    public static void a(boolean z2, String str) {
        if (!z2) {
            throw dh.a(str, null);
        }
    }

    public static boolean b(l8 l8Var, byte[] bArr, int i2, int i3) {
        try {
            l8Var.d(bArr, i2, i3);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean a(l8 l8Var, byte[] bArr, int i2, int i3, boolean z2) {
        try {
            return l8Var.b(bArr, i2, i3, z2);
        } catch (EOFException e) {
            if (z2) {
                return false;
            }
            throw e;
        }
    }

    public static int a(l8 l8Var, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3) {
            int b2 = l8Var.b(bArr, i2 + i4, i3 - i4);
            if (b2 == -1) {
                break;
            }
            i4 += b2;
        }
        return i4;
    }

    public static boolean a(l8 l8Var, int i2) {
        try {
            l8Var.a(i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
