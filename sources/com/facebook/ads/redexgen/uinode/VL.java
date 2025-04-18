package com.facebook.ads.redexgen.uinode;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class VL implements JF {
    public static byte[] A01;
    public final C1070Yn A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{117, Ascii.DC4, Ascii.SYN, 1, 0, Ascii.DC4, Ascii.EM, 42, 1, Ascii.FS, Ascii.CAN, Ascii.DLE, 6, 1, Ascii.DC4, Ascii.CAN, 5, 52, 59, 62, 50, 57, 35, 8, 54, 39, 62, 8, 33, 50, 37, 36, 62, 56, 57, Ascii.RS, Ascii.DC2, 19, 9, Ascii.CAN, 19, 9, 71, 82, 82, 8, Ascii.SI, Ascii.DC2, Ascii.NAK, 0, Ascii.CR, Ascii.CR, 62, 19, 4, 7, 4, 19, 19, 4, 19, 4, Ascii.RS, 50, Ascii.SO, Ascii.EM, 17, 0, 2, 10, 0, 6, 4, 62, Ascii.SI, 0, Ascii.FF, 4};
    }

    public VL(C1070Yn c1070Yn) {
        this.A00 = c1070Yn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A03(String str, boolean z10, String str2, String str3, String str4, long j3) {
        this.A00.A0E().A9k(str);
        PackageManager packageManager = this.A00.getPackageManager();
        if (packageManager == null) {
            this.A00.A0E().A9p(str);
            return false;
        }
        ContentResolver contentResolver = this.A00.getContentResolver();
        if (contentResolver == null) {
            this.A00.A0E().A9m(str);
            return false;
        }
        if (packageManager.resolveContentProvider(str, 0) == null) {
            this.A00.A0E().A9l(str);
            return false;
        }
        Uri parse = Uri.parse(A00(35, 10, 60) + str + A00(0, 1, 27) + str2);
        ContentValues values = new ContentValues();
        values.put(A00(17, 18, 22), (Integer) 1);
        values.put(A00(61, 5, 44), Boolean.valueOf(z10));
        values.put(A00(45, 16, 32), str3);
        values.put(A00(66, 12, 32), str4);
        values.put(A00(1, 16, 52), Long.valueOf(j3));
        try {
            contentResolver.insert(parse, values);
            this.A00.A0E().A9r(str);
            return true;
        } catch (UnsupportedOperationException unused) {
            this.A00.A0E().A9o(str);
            return false;
        } catch (Exception unused2) {
            this.A00.A0E().A9n(str);
            return false;
        }
    }

    public final void A04(boolean z10, String str, String str2, String str3, long j3, boolean z11) {
        this.A00.A0E().A9q();
        ExecutorC0742Lt.A06.execute(new VM(this, z10, str, str2, str3, j3, z11));
    }
}
