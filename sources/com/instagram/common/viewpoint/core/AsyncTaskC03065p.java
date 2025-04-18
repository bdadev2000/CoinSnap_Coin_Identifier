package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class AsyncTaskC03065p extends AsyncTask<C03085r, Void, Drawable> {
    public static byte[] A03;
    public static String[] A04 = {"Er5x4Nf8UA9tVLePD2EX", "DtYF9X90t5u", "I941X6fzqWLmgCmjxes", "iBgQ7OI2DFUGAw4NUel9vSUdaaiAzSqO", "QcmiodlDN7oY3kgnmckrDpvdiERsjn9V", "z", "b", "KLyCCmbDECCjA8c7XM6gY8wQDdZdMwfW"};
    public final InterfaceC03075q A00;
    public final C1045Zs A01;
    public final boolean A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final Drawable A00(C03085r... c03085rArr) {
        if (!KQ.A02(this) && c03085rArr != null) {
            try {
                if (c03085rArr.length >= 1) {
                    String str = c03085rArr[0].A01;
                    String str2 = c03085rArr[0].A00;
                    Bitmap bitmap = null;
                    try {
                        bitmap = new C03226f(this.A01).A0N(str, -1, -1);
                    } catch (Throwable th) {
                        this.A01.A07().AA0(A01(0, 7, 4), C8E.A1V, new C8F(th));
                    }
                    if (bitmap != null) {
                        return W7.A05(this.A01, bitmap, this.A02, str2);
                    }
                    return null;
                }
            } catch (Throwable th2) {
                KQ.A00(th2, this);
                return null;
            }
        }
        return null;
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            int i6 = (copyOfRange[i5] ^ i4) ^ 36;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A04[2] = "XzO4PGfz9rpTObXE3Krp6";
            copyOfRange[i5] = (byte) i6;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{71, 69, 78, 69, 82, 73, 67};
    }

    static {
        A02();
    }

    public AsyncTaskC03065p(C1045Zs c1045Zs, InterfaceC03075q interfaceC03075q, boolean z2) {
        this.A01 = c1045Zs;
        this.A00 = interfaceC03075q;
        this.A02 = z2;
    }

    public /* synthetic */ AsyncTaskC03065p(C1045Zs c1045Zs, InterfaceC03075q interfaceC03075q, boolean z2, C1067aE c1067aE) {
        this(c1045Zs, interfaceC03075q, z2);
    }

    private final void A03(Drawable drawable) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.AC9(drawable);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Drawable doInBackground(C03085r[] c03085rArr) {
        if (KQ.A02(this)) {
            return null;
        }
        try {
            return A00(c03085rArr);
        } catch (Throwable th) {
            KQ.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) {
        if (KQ.A02(this)) {
            return;
        }
        try {
            A03(drawable);
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
