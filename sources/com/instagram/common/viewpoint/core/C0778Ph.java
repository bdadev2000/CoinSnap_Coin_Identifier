package com.instagram.common.viewpoint.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ph, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0778Ph extends InputStream {
    public static byte[] A04;
    public MessageDigest A00;
    public final C1044Zr A01;
    public final InterfaceC0777Pg A02;
    public final FileInputStream A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 43);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-52, -61, -76, -23, -8, -15};
    }

    public C0778Ph(C1044Zr c1044Zr, FileInputStream fileInputStream, InterfaceC0777Pg interfaceC0777Pg) {
        this.A03 = fileInputStream;
        this.A02 = interfaceC0777Pg;
        this.A01 = c1044Zr;
        try {
            this.A00 = MessageDigest.getInstance(A00(0, 3, 84));
        } catch (NoSuchAlgorithmException unused) {
            this.A00 = null;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.A03.available();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b2 = new byte[1];
        return read(b2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int read = this.A03.read(bArr, i2, i3);
        if (this.A00 != null) {
            try {
                if (read > 0) {
                    this.A00.update(bArr, i2, read);
                } else if (read == -1) {
                    this.A02.A92(LS.A05(this.A00.digest()));
                    this.A00 = null;
                }
            } catch (Exception e) {
                this.A00 = null;
                this.A01.A07().AAS(A00(3, 3, 90), C8E.A13, new C8F(e));
            }
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j2) throws IOException {
        int actuallyRead = (int) j2;
        byte[] bArr = new byte[1024];
        long j3 = 0;
        while (actuallyRead > 0) {
            int bytesToRead = read(bArr, 0, Math.min(actuallyRead, 1024));
            if (bytesToRead <= 0) {
                break;
            }
            actuallyRead -= bytesToRead;
            j3 += bytesToRead;
        }
        return j3;
    }
}
