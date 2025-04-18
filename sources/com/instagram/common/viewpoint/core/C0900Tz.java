package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Tz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0900Tz implements InterfaceC0737Ns {
    public static byte[] A01;
    public static String[] A02 = {"BeK4HZWWIRhrC207wWuIOn", "ZxUaKMHZMCvHIxTDkc1UvZSYXikI2iYM", "xy0Ab8m7NOX4ZRxTfyGPwRY1TRrgVPC4", "ij8auLNb9rfA8yI55JUjNirWgnYpCp0M", "e9T4yeifuMgQg3dKDn6E2LsVBs4fgiHR", "ibrxpSG6qut0wBAmR6wSiB8exNotCqiu", "LMYPYXdb4SaVI93FsN1uYFih9", "8N3vGs6nddgUWUG"};
    public final /* synthetic */ A6 A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A02[2] = "F3dYTVgRpzEGoEWMN2T8FFCtbrhRHRBi";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 99);
            i5++;
        }
    }

    public static void A01() {
        A01 = new byte[]{21, 19, 5, 18, Utf8.REPLACEMENT_BYTE, 14, 1, 22, 9, 7, 1, 20, 9, 15, 14, Utf8.REPLACEMENT_BYTE, 9, 1, 2};
    }

    static {
        A01();
    }

    public C0900Tz(A6 a6) {
        this.A00 = a6;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0737Ns
    public final void ACw(String str) {
        C0729Nk c0729Nk;
        C0729Nk c0729Nk2;
        this.A00.A0Q = false;
        c0729Nk = this.A00.A0F;
        c0729Nk.setProgress(100);
        c0729Nk2 = this.A00.A0F;
        M3.A0N(c0729Nk2, 8);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0737Ns
    public final void ACy(String str) {
        C0729Nk c0729Nk;
        C0728Nj c0728Nj;
        boolean z2;
        int i2;
        this.A00.A0Q = true;
        c0729Nk = this.A00.A0F;
        M3.A0N(c0729Nk, 0);
        c0728Nj = this.A00.A0E;
        c0728Nj.setUrl(str);
        z2 = this.A00.A0P;
        if (!z2) {
            A6 a6 = this.A00;
            if (A02[5].charAt(30) != 'i') {
                throw new RuntimeException();
            }
            A02[7] = "LFtEVX0D7i5Pos5vlgnVVb1H7Q5y";
            i2 = a6.A02;
            if (i2 > 1) {
                this.A00.A0P = true;
                this.A00.A0g(A00(0, 19, 3));
            }
        }
        A6.A05(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0737Ns
    public final void ADG(int i2) {
        boolean z2;
        C0729Nk c0729Nk;
        z2 = this.A00.A0Q;
        if (z2) {
            c0729Nk = this.A00.A0F;
            c0729Nk.setProgress(i2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0737Ns
    public final void ADJ(String str) {
        C0728Nj c0728Nj;
        c0728Nj = this.A00.A0E;
        c0728Nj.setTitle(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0737Ns
    public final void ADL() {
        ((U6) this.A00).A0A.ABR(14);
    }
}
