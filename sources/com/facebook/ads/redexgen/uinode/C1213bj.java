package com.facebook.ads.redexgen.uinode;

import androidx.core.app.NotificationCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.bj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1213bj {
    public static byte[] A03;
    public File A00;
    public RandomAccessFile A01;
    public final C0B A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-99, -34, -16, -99, -31, -26, -16, -32, -99, -32, -34, -32, -27, -30, 101, -85, -76, -73, 101, -88, -76, -78, -75, -79, -86, -71, -82, -76, -77, 102, -65, 8, Ascii.DC2, -65, 2, Ascii.SO, Ascii.FF, Ascii.SI, Ascii.VT, 4, 19, 4, 3, -64, -59, Ascii.EM, Ascii.DC4, -59, 102, -100, -89, -81, -90, -92, -89, -103, -100, 114, -112, -99, 86, -93, 79, -110, -101, -108, -112, -99, 79, -107, -104, -101, -108, -94, -49, -49, -52, -49, 125, -66, -51, -51, -62, -53, -63, 125, -64, -66, -64, -59, -62, -105, 125, -64, -66, -64, -59, -62, 125, -61, -58, -55, -62, 125, -47, -2, -2, -5, -2, -84, -17, -8, -5, -1, -11, -6, -13, -84, -14, -11, -8, -15, -84, -22, Ascii.ETB, Ascii.ETB, Ascii.DC4, Ascii.ETB, -59, Ascii.DC4, Ascii.NAK, 10, 19, Ascii.SO, 19, Ascii.FF, -59, -65, -20, -20, -23, -20, -102, -20, -33, -37, -34, -29, -24, -31, -102, -26, -33, -24, -31, -18, -30, -102, -23, -32, -102, -32, -29, -26, -33, -102, -106, -61, -61, -64, -61, 113, -61, -74, -65, -78, -66, -70, -65, -72, 113, -73, -70, -67, -74, 113, -20, Ascii.EM, Ascii.EM, Ascii.SYN, Ascii.EM, -57, Ascii.FS, Ascii.SUB, Ascii.DLE, Ascii.NAK, Ascii.SO, -57, Ascii.CR, Ascii.DLE, 19, Ascii.FF, -57, -41, 4, 4, 1, 4, -78, 9, 4, -5, 6, -5, 0, -7, -78, -73, -10, -78, -12, Ascii.VT, 6, -9, 5, -78, 6, 1, -78, -73, 5, -78, -8, 4, 1, -1, -78, -12, 7, -8, -8, -9, 4, -78, 9, -5, 6, -6, -78, 5, -5, Ascii.FF, -9, -78, -73, -10, -34, Ascii.DC2, Ascii.ETB};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized void A07() throws C1211bh {
        if (A09()) {
            return;
        }
        A06();
        File file = new File(this.A00.getParentFile(), this.A00.getName().substring(0, this.A00.getName().length() - A00(48, 9, 15).length()));
        if (!this.A00.renameTo(file)) {
            throw new C1211bh(A00(166, 20, 40) + this.A00 + A00(44, 4, 124) + file + A00(14, 16, 28));
        }
        this.A00 = file;
        try {
            this.A01 = new RandomAccessFile(this.A00, A00(NotificationCompat.FLAG_LOCAL_ONLY, 1, 67));
        } catch (IOException e2) {
            throw new C1211bh(A00(123, 14, 124) + this.A00 + A00(0, 14, 84), e2);
        }
    }

    public C1213bj(File file, C0B c0b) throws C1211bh {
        try {
            if (c0b != null) {
                this.A02 = c0b;
                File directory = file.getParentFile();
                C0E.A06(directory);
                boolean exists = file.exists();
                this.A00 = exists ? file : new File(file.getParentFile(), file.getName() + A00(48, 9, 15));
                this.A01 = new RandomAccessFile(this.A00, exists ? A00(NotificationCompat.FLAG_LOCAL_ONLY, 1, 67) : A00(257, 2, 119));
                return;
            }
            throw new NullPointerException();
        } catch (IOException e2) {
            throw new C1211bh(A00(186, 17, 126) + file + A00(0, 14, 84), e2);
        }
    }

    private boolean A02(File file) {
        return file.getName().endsWith(A00(48, 9, 15));
    }

    public final synchronized int A03() throws C1211bh {
        try {
        } catch (IOException e2) {
            throw new C1211bh(A00(137, 29, 81) + this.A00, e2);
        }
        return (int) this.A01.length();
    }

    public final File A04() {
        return this.A00;
    }

    public final synchronized void A05() throws C1211bh {
        try {
            this.A01.setLength(0L);
        } catch (IOException e2) {
            throw new C1211bh(A00(57, 16, 6), e2);
        }
    }

    public final synchronized void A06() throws C1211bh {
        try {
            this.A01.close();
            this.A02.AGh(this.A00);
        } catch (IOException e2) {
            throw new C1211bh(A00(104, 19, 99) + this.A00, e2);
        }
    }

    public final synchronized void A08(byte[] bArr, int i10) throws C1211bh {
        try {
            if (!A09()) {
                this.A01.seek(A03());
                this.A01.write(bArr, 0, i10);
            } else {
                throw new C1211bh(A00(73, 31, 52) + this.A00 + A00(30, 14, 118));
            }
        } catch (IOException e2) {
            throw new C1211bh(String.format(Locale.US, A00(203, 53, 105), Integer.valueOf(i10), this.A01, Integer.valueOf(bArr.length)), e2);
        }
    }

    public final synchronized boolean A09() {
        return !A02(this.A00);
    }
}
