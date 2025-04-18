package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0996Vo implements InterfaceC0621Gu {
    public static byte[] A07;
    public static String[] A08 = {"CpiOlZ", "ukFexlYSIMwQqH0UvFPWGqG0YthdqpHq", "2yw2Gs2GC2jxZI0Hgcr1UjVZgWf7BNvx", "7SwPVGS0jIrCQlvIcpAA6U9bhm4jPR5r", "7pQ8HXcSNS6Xqd33VYljkiTEbCcLAkDq", "kKrkJSZnynA87WgMdnYScFfJH7qszUrQ", "lo5", "kH5jcAc5XMYXCXQVRoC"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;
    public final HG<? super C0996Vo> A06;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 71);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-9, 10, Ascii.CAN, Ascii.DC4, Ascii.SUB, Ascii.ETB, 8, 10, -59, Ascii.SO, 9, 10, 19, Ascii.EM, Ascii.SO, Ascii.VT, Ascii.SO, 10, Ascii.ETB, -59, Ascii.DC2, Ascii.SUB, Ascii.CAN, Ascii.EM, -59, 7, 10, -59, 6, 19, -59, Ascii.SO, 19, Ascii.EM, 10, Ascii.FF, 10, Ascii.ETB, -45, 5, 2, -7, -48, Ascii.GS, 37, 35, 36, -48, 37, 35, Ascii.NAK, -48, 35, 19, Ascii.CAN, Ascii.NAK, Ascii.GS, Ascii.NAK, -48, 34, 17, 39, 34, Ascii.NAK, 35, Ascii.US, 37, 34, 19, Ascii.NAK, 36, 19, 41, 36, Ascii.ETB, 37, 33, 39, 36, Ascii.NAK, Ascii.ETB};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0621Gu
    public final long ADl(C0625Gy c0625Gy) throws HF {
        try {
            Uri uri = c0625Gy.A04;
            this.A02 = uri;
            if (!TextUtils.equals(A00(70, 11, 107), uri.getScheme())) {
                throw new HF(A00(39, 31, 105));
            }
            try {
                this.A01 = this.A05.openRawResourceFd(Integer.parseInt(this.A02.getLastPathSegment()));
                FileInputStream fileInputStream = new FileInputStream(this.A01.getFileDescriptor());
                this.A03 = fileInputStream;
                fileInputStream.skip(this.A01.getStartOffset());
                if (this.A03.skip(c0625Gy.A03) < c0625Gy.A03) {
                    throw new EOFException();
                }
                if (c0625Gy.A02 != -1) {
                    this.A00 = c0625Gy.A02;
                } else {
                    long length = this.A01.getLength();
                    this.A00 = length != -1 ? length - c0625Gy.A03 : -1L;
                }
                this.A04 = true;
                HG<? super C0996Vo> hg2 = this.A06;
                if (hg2 != null) {
                    hg2.ADP(this, c0625Gy);
                }
                return this.A00;
            } catch (NumberFormatException unused) {
                throw new HF(A00(0, 39, 94));
            }
        } catch (IOException e2) {
            throw new HF(e2);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.RawResourceDataSource> */
    public C0996Vo(Context context, HG<? super C0996Vo> hg2) {
        this.A05 = context.getResources();
        this.A06 = hg2;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0621Gu
    public final Uri A8E() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0621Gu
    public final void close() throws HF {
        this.A02 = null;
        try {
            try {
                InputStream inputStream = this.A03;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.A03 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.A01;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e2) {
                        throw new HF(e2);
                    }
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        HG<? super C0996Vo> hg2 = this.A06;
                        if (hg2 != null) {
                            hg2.ADO(this);
                        }
                    }
                }
            } catch (IOException e10) {
                throw new HF(e10);
            }
        } catch (Throwable th2) {
            this.A03 = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.A01;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        HG<? super C0996Vo> hg3 = this.A06;
                        if (hg3 != null) {
                            hg3.ADO(this);
                        }
                    }
                    throw th2;
                } catch (IOException e11) {
                    throw new HF(e11);
                }
            } finally {
                this.A01 = null;
                if (this.A04) {
                    this.A04 = false;
                    HG<? super C0996Vo> hg4 = this.A06;
                    if (hg4 != null) {
                        hg4.ADO(this);
                    }
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0621Gu
    public final int read(byte[] bArr, int i10, int i11) throws HF {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.A00;
        if (A08[3].charAt(24) == 'w') {
            throw new RuntimeException();
        }
        A08[0] = "oumASG";
        if (j3 == 0) {
            return -1;
        }
        if (j3 != -1) {
            try {
                i11 = (int) Math.min(j3, i11);
            } catch (IOException e2) {
                throw new HF(e2);
            }
        }
        int read = this.A03.read(bArr, i10, i11);
        if (read == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new HF(new EOFException());
        }
        long j10 = this.A00;
        if (j10 != -1) {
            this.A00 = j10 - read;
        }
        HG<? super C0996Vo> hg2 = this.A06;
        if (hg2 != null) {
            hg2.AB1(this, read);
        }
        return read;
    }
}
