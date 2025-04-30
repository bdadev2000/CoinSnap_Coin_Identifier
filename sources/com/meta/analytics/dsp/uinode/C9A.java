package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.9A, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9A {
    public static int A03;
    public static byte[] A04;
    public AnonymousClass99 A00;
    public boolean A01;
    public final File A02;

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 93);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{Ascii.ESC, 54, 62, 65, 58, 57, -11, 73, 68, -11, 57, 58, 65, 58, 73, 58, -11, 59, 62, 65, 58, -11, -4, -6, 72, -63, -28, -25, -32, -101, -94, -96, -18, -94, -101, -28, -18, -101, -23, -22, -17, -101, -36, -101, -19, -32, -36, -33, -36, -35, -25, -32, -101, -31, -28, -25, -32, Ascii.CAN, 61, 69, 48, 59, 56, 51, -17, 53, 52, 67, 50, 55, -17, 66, 67, 48, 65, 67, -17, 56, 61, 51, 52, 71, 9, -17, -12, 51, -66, -47, -49, -37, -34, -48, -116, -46, -43, -40, -47, -116, -51, -40, -34, -47, -51, -48, -27, -116, -48, -43, -33, -36, -37, -33, -47, -48};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized int A05() throws IOException {
        return A00().A00;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized AnonymousClass91 A06(int i9, byte[] bArr, int i10, int[] iArr, int i11) throws IOException {
        AnonymousClass99 A00 = A00();
        int i12 = 1;
        if (i9 < 0) {
            throw new IOException(String.format(Locale.US, A01(57, 29, 114), Integer.valueOf(i9)));
        }
        int i13 = i9;
        int i14 = 0;
        long j7 = -1;
        boolean z8 = false;
        while (true) {
            if (i13 >= A00.A00) {
                break;
            }
            if ((i13 - i9) + i11 >= iArr.length) {
                z8 = true;
                break;
            }
            long j9 = A00.A03[i13];
            long j10 = (i13 == A00.A00 - i12 ? A00.A01 : A00.A03[i13 + 1]) - j9;
            if (j7 == -1) {
                j7 = j9;
            }
            if (((int) j10) + i14 + i10 > bArr.length) {
                z8 = true;
                break;
            }
            i14 += (int) j10;
            iArr[(i13 - i9) + i11] = (int) j10;
            i13++;
            i12 = 1;
        }
        if (i13 <= i9) {
            return new AnonymousClass91(z8 ? AnonymousClass90.A03 : AnonymousClass90.A04, i9, i9, 0);
        }
        A00.A02.seek(j7);
        A00.A02.read(bArr, i10, i14);
        return new AnonymousClass91(AnonymousClass90.A02, i9, i13, i14);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized boolean A09(byte[] bArr) throws IOException {
        AnonymousClass99 A00 = A00();
        if (A05() == A03) {
            return false;
        }
        A03(A00.A00, A00.A01);
        A04(A00.A01, bArr);
        A00.A02.getFD().sync();
        A00.A00++;
        A00.A01 += bArr.length;
        return true;
    }

    static {
        A02();
        A03 = 1000;
    }

    public C9A(File file) throws IOException {
        this.A02 = file;
        if (!file.exists()) {
            this.A00 = AnonymousClass99.A03(file);
        } else if (!file.isFile()) {
            throw new IOException(String.format(Locale.US, A01(25, 32, 30), file.getCanonicalPath()));
        }
    }

    private AnonymousClass99 A00() throws IOException {
        if (!this.A01) {
            if (this.A00 == null) {
                this.A00 = AnonymousClass99.A04(this.A02);
            }
            return this.A00;
        }
        throw new IOException(A01(86, 28, 15));
    }

    private void A03(int i9, long j7) throws IOException {
        this.A00.A03[i9] = j7;
        this.A00.A02.seek(AnonymousClass99.A02(i9));
        this.A00.A02.writeLong(j7);
    }

    private void A04(long j7, byte[] bArr) throws IOException {
        this.A00.A02.seek(j7);
        this.A00.A02.write(bArr);
    }

    public final synchronized void A07() throws IOException {
        this.A01 = true;
        AnonymousClass99 anonymousClass99 = this.A00;
        if (anonymousClass99 == null) {
            return;
        }
        RandomAccessFile randomAccessFile = anonymousClass99.A02;
        this.A00 = null;
        randomAccessFile.close();
    }

    public final synchronized void A08() throws IOException {
        if (!this.A01) {
            A07();
            if (!this.A02.delete()) {
                throw new IOException(String.format(Locale.US, A01(0, 25, 120), this.A02.getCanonicalPath()));
            }
        } else {
            throw new IOException(A01(86, 28, 15));
        }
    }
}
