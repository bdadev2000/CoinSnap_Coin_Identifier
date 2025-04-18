package com.facebook.ads.redexgen.uinode;

import android.graphics.Bitmap;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: com.facebook.ads.redexgen.X.bq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1220bq implements AnonymousClass03<Bitmap> {
    public static byte[] A06;
    public static String[] A07 = {"O8BWLXPdzHA", "6sEzkrKiC7tSlAyzako7Jr1QeLTjq7r7", "buIAODYM5Oo034kKCIV4I7ZzRqvLqiIh", "ENOGp8Grp5cb6hByXNSQMpF2JyONyocp", "tnh", "2Zn0DxkDz4CuR43sN", "3j1ga9q4MlHQ2cRzMN", "NuleDR7CXAFlpWhCDunnHJWIhrQ2pSEs"};
    public final int A00;
    public final int A01;
    public final String A02 = C1220bq.class.getSimpleName();
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b3 = (byte) ((copyOfRange[i13] ^ i12) ^ 8);
            if (A07[7].charAt(0) == 'p') {
                throw new RuntimeException();
            }
            A07[6] = "rTtdlTA5qc3UePbll3p";
            copyOfRange[i13] = b3;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        if (A07[4].length() != 3) {
            throw new RuntimeException();
        }
        A07[6] = "j2OKbozXXbIBudrsn6AX9zPsXXh";
        A06 = new byte[]{1, 91, 66, 95, 7, 44, 49, 40, 36, 53, 101, 44, 54, 101, 43, 48, 41, 41, 124, 65, 90, 92, 73, 77, 80, 86, 87, Ascii.EM, 93, 76, 75, 80, 87, 94, Ascii.EM, 95, 80, 85, 92, Ascii.EM, 90, 86, 84, 73, 75, 92, 74, 74, 80, 86, 87};
    }

    static {
        A02();
    }

    public C1220bq(int i10, int i11, boolean z10, boolean z11, boolean z12) {
        this.A01 = i10;
        this.A00 = i11;
        this.A05 = z10;
        this.A03 = z11;
        this.A04 = z12;
    }

    public static AnonymousClass02<Bitmap> A00(Throwable th2) {
        return new AnonymousClass02<>(false, null, th2);
    }

    private void A03(File file, Bitmap bitmap) throws IOException {
        if (bitmap == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            ByteArrayOutputStream compressedBitmapOS = new ByteArrayOutputStream();
            byteArrayOutputStream = compressedBitmapOS;
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            if (byteArrayOutputStream.size() >= 3145728) {
                return;
            }
            String str = file.getCanonicalPath() + A01(0, 4, 39);
            File file2 = new File(str);
            file2.createNewFile();
            fileOutputStream = new FileOutputStream(str);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.flush();
            fileInputStream = new FileInputStream(str);
            fileOutputStream2 = new FileOutputStream(file);
            byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream2.write(bArr, 0, read);
                } else {
                    file2.delete();
                    return;
                }
            }
        } finally {
            C0M.A07(byteArrayOutputStream);
            C0M.A07(fileOutputStream);
            C0M.A07(fileInputStream);
            C0M.A07(fileOutputStream2);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass03
    public final AnonymousClass02<Bitmap> A3M(File file, C0L c0l) {
        if (!this.A04) {
            return new AnonymousClass02<>(true, null);
        }
        try {
            Bitmap A03 = C0M.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
            if (A03 != null) {
                return new AnonymousClass02<>(true, A03);
            }
            c0l.A9U(new C1214bk(A01(4, 14, 77)));
            return A00(null);
        } catch (Throwable t5) {
            file.delete();
            c0l.A9U(t5);
            return A00(t5);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass03
    public final void A4U(File file, C0L c0l) throws C1214bk {
        if (this.A03) {
            try {
                Bitmap bitmap = C0M.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
                if (bitmap != null) {
                    A03(file, bitmap);
                } else {
                    file.delete();
                    throw new C1214bk(A01(4, 14, 77));
                }
            } catch (C1214bk e2) {
                c0l.A9f(e2);
                throw e2;
            } catch (Throwable th2) {
                c0l.A9f(th2);
                Throwable t5 = new C1214bk(A01(18, 33, 49), th2);
                throw t5;
            }
        }
    }
}
