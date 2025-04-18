package com.instagram.common.viewpoint.core;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class X9 implements InterfaceC0570Gz {
    public static byte[] A07;
    public static String[] A08 = {"Qq", "sLav", "xXJIeuat1Un3oETUCUBgWYVlLTYdvUXR", "pXicUG6N1XHbCG5QhjJ94uJ", "HKhocTo1", "Z1k35KQ5uMLjnmzbQjJ", "rJGKNzEqvOEIyk4kxb4", "sIOIMXdckNxf1vD7TuVkHKtZXYRsYSsj"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public FileInputStream A03;
    public boolean A04;
    public final ContentResolver A05;
    public final HL<? super X9> A06;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{105, 69, 95, 70, 78, 10, 68, 69, 94, 10, 69, 90, 79, 68, 10, 76, 67, 70, 79, 10, 78, 79, 89, 73, 88, 67, 90, 94, 69, 88, 10, 76, 69, 88, 16, 10, 50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final long AEE(H3 h3) throws C0566Gv {
        try {
            this.A02 = h3.A04;
            this.A01 = this.A05.openAssetFileDescriptor(this.A02, A00(36, 1, 106));
            if (this.A01 == null) {
                throw new FileNotFoundException(A00(0, 36, 0) + this.A02);
            }
            this.A03 = new FileInputStream(this.A01.getFileDescriptor());
            long startOffset = this.A01.getStartOffset();
            long skip = this.A03.skip(h3.A03 + startOffset) - startOffset;
            if (skip != h3.A03) {
                throw new EOFException();
            }
            if (h3.A02 != -1) {
                this.A00 = h3.A02;
            } else {
                long length = this.A01.getLength();
                if (length == -1) {
                    FileChannel channel = this.A03.getChannel();
                    long size = channel.size();
                    this.A00 = size != 0 ? size - channel.position() : -1L;
                } else {
                    this.A00 = length - skip;
                }
            }
            this.A04 = true;
            if (this.A06 != null) {
                this.A06.ADs(this, h3);
            }
            return this.A00;
        } catch (IOException e) {
            throw new C0566Gv(e);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.ContentDataSource> */
    public X9(Context context, HL<? super X9> hl) {
        this.A05 = context.getContentResolver();
        this.A06 = hl;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final Uri A8c() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final void close() throws C0566Gv {
        this.A02 = null;
        try {
            try {
                if (this.A03 != null) {
                    this.A03.close();
                }
                this.A03 = null;
                try {
                    try {
                        if (this.A01 != null) {
                            this.A01.close();
                        }
                    } catch (IOException e) {
                        throw new C0566Gv(e);
                    }
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        if (this.A06 != null) {
                            this.A06.ADr(this);
                        }
                    }
                }
            } catch (Throwable th) {
                this.A03 = null;
                try {
                    try {
                        if (this.A01 != null) {
                            this.A01.close();
                        }
                        this.A01 = null;
                        if (this.A04) {
                            this.A04 = false;
                            if (A08[1].length() == 5) {
                                throw new RuntimeException();
                            }
                            A08[3] = "3rXXSzOuZYrIDyr67K";
                            if (this.A06 != null) {
                                this.A06.ADr(this);
                            }
                        }
                        throw th;
                    } catch (IOException e2) {
                        throw new C0566Gv(e2);
                    }
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        if (this.A06 != null) {
                            this.A06.ADr(this);
                        }
                    }
                }
            }
        } catch (IOException e3) {
            throw new C0566Gv(e3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final int read(byte[] bArr, int i2, int i3) throws C0566Gv {
        if (i3 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        try {
            if (this.A00 != -1) {
                i3 = (int) Math.min(this.A00, i3);
            }
            int read = this.A03.read(bArr, i2, i3);
            if (read == -1) {
                if (this.A00 == -1) {
                    return -1;
                }
                throw new C0566Gv(new EOFException());
            }
            if (this.A00 != -1) {
                this.A00 -= read;
            }
            if (this.A06 != null) {
                this.A06.ABS(this, read);
            }
            return read;
        } catch (IOException e) {
            throw new C0566Gv(e);
        }
    }
}
