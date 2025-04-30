package com.meta.analytics.dsp.uinode;

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
public final class C1562Vo implements InterfaceC1187Gu {
    public static byte[] A07;
    public static String[] A08 = {"CpiOlZ", "ukFexlYSIMwQqH0UvFPWGqG0YthdqpHq", "2yw2Gs2GC2jxZI0Hgcr1UjVZgWf7BNvx", "7SwPVGS0jIrCQlvIcpAA6U9bhm4jPR5r", "7pQ8HXcSNS6Xqd33VYljkiTEbCcLAkDq", "kKrkJSZnynA87WgMdnYScFfJH7qszUrQ", "lo5", "kH5jcAc5XMYXCXQVRoC"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;
    public final HG<? super C1562Vo> A06;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 71);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-9, 10, Ascii.CAN, Ascii.DC4, Ascii.SUB, Ascii.ETB, 8, 10, -59, Ascii.SO, 9, 10, 19, Ascii.EM, Ascii.SO, Ascii.VT, Ascii.SO, 10, Ascii.ETB, -59, Ascii.DC2, Ascii.SUB, Ascii.CAN, Ascii.EM, -59, 7, 10, -59, 6, 19, -59, Ascii.SO, 19, Ascii.EM, 10, Ascii.FF, 10, Ascii.ETB, -45, 5, 2, -7, -48, Ascii.GS, 37, 35, 36, -48, 37, 35, Ascii.NAK, -48, 35, 19, Ascii.CAN, Ascii.NAK, Ascii.GS, Ascii.NAK, -48, 34, 17, 39, 34, Ascii.NAK, 35, Ascii.US, 37, 34, 19, Ascii.NAK, 36, 19, 41, 36, Ascii.ETB, 37, 33, 39, 36, Ascii.NAK, Ascii.ETB};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final long ADl(C1191Gy c1191Gy) throws HF {
        try {
            Uri uri = c1191Gy.A04;
            this.A02 = uri;
            if (!TextUtils.equals(A00(70, 11, 107), uri.getScheme())) {
                throw new HF(A00(39, 31, 105));
            }
            try {
                this.A01 = this.A05.openRawResourceFd(Integer.parseInt(this.A02.getLastPathSegment()));
                FileInputStream fileInputStream = new FileInputStream(this.A01.getFileDescriptor());
                this.A03 = fileInputStream;
                fileInputStream.skip(this.A01.getStartOffset());
                if (this.A03.skip(c1191Gy.A03) < c1191Gy.A03) {
                    throw new EOFException();
                }
                if (c1191Gy.A02 != -1) {
                    this.A00 = c1191Gy.A02;
                } else {
                    long length = this.A01.getLength();
                    this.A00 = length != -1 ? length - c1191Gy.A03 : -1L;
                }
                this.A04 = true;
                HG<? super C1562Vo> hg = this.A06;
                if (hg != null) {
                    hg.ADP(this, c1191Gy);
                }
                return this.A00;
            } catch (NumberFormatException unused) {
                throw new HF(A00(0, 39, 94));
            }
        } catch (IOException e4) {
            throw new HF(e4);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.RawResourceDataSource> */
    public C1562Vo(Context context, HG<? super C1562Vo> hg) {
        this.A05 = context.getResources();
        this.A06 = hg;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final Uri A8E() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
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
                    } catch (IOException e4) {
                        throw new HF(e4);
                    }
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        HG<? super C1562Vo> hg = this.A06;
                        if (hg != null) {
                            hg.ADO(this);
                        }
                    }
                }
            } catch (IOException e9) {
                throw new HF(e9);
            }
        } catch (Throwable th) {
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
                        HG<? super C1562Vo> hg2 = this.A06;
                        if (hg2 != null) {
                            hg2.ADO(this);
                        }
                    }
                    throw th;
                } catch (IOException e10) {
                    throw new HF(e10);
                }
            } finally {
                this.A01 = null;
                if (this.A04) {
                    this.A04 = false;
                    HG<? super C1562Vo> hg3 = this.A06;
                    if (hg3 != null) {
                        hg3.ADO(this);
                    }
                }
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final int read(byte[] bArr, int i9, int i10) throws HF {
        if (i10 == 0) {
            return 0;
        }
        long j7 = this.A00;
        if (A08[3].charAt(24) == 'w') {
            throw new RuntimeException();
        }
        A08[0] = "oumASG";
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i10 = (int) Math.min(j7, i10);
            } catch (IOException e4) {
                throw new HF(e4);
            }
        }
        int read = this.A03.read(bArr, i9, i10);
        if (read == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new HF(new EOFException());
        }
        long j9 = this.A00;
        if (j9 != -1) {
            this.A00 = j9 - read;
        }
        HG<? super C1562Vo> hg = this.A06;
        if (hg != null) {
            hg.AB1(this, read);
        }
        return read;
    }
}
