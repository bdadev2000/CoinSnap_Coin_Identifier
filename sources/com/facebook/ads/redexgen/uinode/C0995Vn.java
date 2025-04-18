package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Vn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0995Vn implements InterfaceC0621Gu {
    public static String[] A04 = {"X6WlBdbGeBIUy9RcgyD1kPyvMH5gl65h", "mWixtdhRvEEOtO49Z6LrUITCnd", "19dVuEeyHaOsnSLi", "Fh0FDziHvuuc46M8RjDn", "TMNOdV", "BntQd7XboiQ5Pp5LCDj1cbVKSXS32D1x", "NrlP0Z8V9f9J6rKzzcCufZh8yiDjfbRh", "BOidXQkRBMfwkg7VYmAkrOpgeHcKVKv0"};
    public long A00;
    public boolean A01;
    public final InterfaceC0619Gs A02;
    public final InterfaceC0621Gu A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0621Gu
    public final long ADl(C0625Gy c0625Gy) throws IOException {
        long ADl = this.A03.ADl(c0625Gy);
        this.A00 = ADl;
        if (ADl == 0) {
            return 0L;
        }
        if (c0625Gy.A02 == -1 && this.A00 != -1) {
            c0625Gy = new C0625Gy(c0625Gy.A04, c0625Gy.A01, c0625Gy.A03, this.A00, c0625Gy.A05, c0625Gy.A00);
        }
        this.A01 = true;
        this.A02.ADn(c0625Gy);
        return this.A00;
    }

    public C0995Vn(InterfaceC0621Gu interfaceC0621Gu, InterfaceC0619Gs interfaceC0619Gs) {
        this.A03 = (InterfaceC0621Gu) AbstractC0626Ha.A01(interfaceC0621Gu);
        this.A02 = (InterfaceC0619Gs) AbstractC0626Ha.A01(interfaceC0619Gs);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0621Gu
    public final Uri A8E() {
        return this.A03.A8E();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0621Gu
    public final void close() throws IOException {
        try {
            this.A03.close();
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        } catch (Throwable th2) {
            boolean z10 = this.A01;
            if (A04[5].charAt(29) != 'a') {
                A04[1] = "CXpRjqYaQVmivrsYVOmY1oz";
                if (z10) {
                    this.A01 = false;
                    InterfaceC0619Gs interfaceC0619Gs = this.A02;
                    if (A04[1].length() != 2) {
                        A04[5] = "FmRI3fMemMJaQGBcEYhbAky7hUfnuUR1";
                        interfaceC0619Gs.close();
                    }
                }
                throw th2;
            }
            throw new RuntimeException();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0621Gu
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.A03.read(bArr, i10, i11);
        if (read > 0) {
            this.A02.write(bArr, i10, read);
            long j3 = this.A00;
            if (j3 != -1) {
                this.A00 = j3 - read;
            }
        }
        return read;
    }
}
