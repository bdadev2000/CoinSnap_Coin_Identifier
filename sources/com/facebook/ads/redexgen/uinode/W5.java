package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class W5 implements InterfaceC0621Gu {
    public static byte[] A06;
    public static String[] A07 = {"LZDHzUEPY8huLib8qPH1v7czaaxlCYVW", "Hfajs1uaSYD8XiY9EEWii1aSJKbCXH1k", "56ilEDtV1sbTjQDLh", "Yd2dmsZ5", "tr3yrs0rtPd5aa0L", "Zl3VJckSqinxve9JbD33GDfHo4YeuNba", "", ""};
    public long A00;
    public Uri A01;
    public InputStream A02;
    public boolean A03;
    public final AssetManager A04;
    public final HG<? super W5> A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A07;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A07[3] = "kcdTjQCUlglhSnU2yukjc";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 41);
            i13++;
        }
    }

    public static void A01() {
        A06 = new byte[]{100, 107, -99, -86, -96, -82, -85, -91, -96, -101, -99, -81, -81, -95, -80, 107};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0621Gu
    public final long ADl(C0625Gy c0625Gy) throws C0614Gn {
        try {
            Uri uri = c0625Gy.A04;
            this.A01 = uri;
            String path = uri.getPath();
            if (path.startsWith(A00(1, 15, 19))) {
                path = path.substring(15);
            } else if (path.startsWith(A00(0, 1, 12))) {
                path = path.substring(1);
            }
            InputStream open = this.A04.open(path, 1);
            this.A02 = open;
            if (open.skip(c0625Gy.A03) < c0625Gy.A03) {
                throw new EOFException();
            }
            if (c0625Gy.A02 != -1) {
                this.A00 = c0625Gy.A02;
            } else {
                long available = this.A02.available();
                this.A00 = available;
                if (available == 2147483647L) {
                    this.A00 = -1L;
                }
            }
            this.A03 = true;
            HG<? super W5> hg2 = this.A05;
            if (hg2 != null) {
                hg2.ADP(this, c0625Gy);
            }
            return this.A00;
        } catch (IOException e2) {
            throw new C0614Gn(e2);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.AssetDataSource> */
    public W5(Context context, HG<? super W5> hg2) {
        this.A04 = context.getAssets();
        this.A05 = hg2;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0621Gu
    public final Uri A8E() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0621Gu
    public final void close() throws C0614Gn {
        this.A01 = null;
        try {
            try {
                InputStream inputStream = this.A02;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e2) {
                throw new C0614Gn(e2);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                HG<? super W5> hg2 = this.A05;
                if (hg2 != null) {
                    hg2.ADO(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0621Gu
    public final int read(byte[] bArr, int i10, int i11) throws C0614Gn {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.A00;
        if (j3 == 0) {
            return -1;
        }
        if (j3 != -1) {
            try {
                i11 = (int) Math.min(j3, i11);
            } catch (IOException e2) {
                throw new C0614Gn(e2);
            }
        }
        int read = this.A02.read(bArr, i10, i11);
        if (read == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new C0614Gn(new EOFException());
        }
        long j10 = this.A00;
        if (j10 != -1) {
            long j11 = read;
            if (A07[3].length() == 13) {
                throw new RuntimeException();
            }
            A07[4] = "Doxe12teItAf98KBLMhQOs4gzgBHzz";
            this.A00 = j10 - j11;
        }
        HG<? super W5> hg2 = this.A05;
        if (hg2 != null) {
            hg2.AB1(this, read);
        }
        return read;
    }
}
