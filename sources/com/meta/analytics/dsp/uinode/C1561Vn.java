package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Vn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1561Vn implements InterfaceC1187Gu {
    public static String[] A04 = {"X6WlBdbGeBIUy9RcgyD1kPyvMH5gl65h", "mWixtdhRvEEOtO49Z6LrUITCnd", "19dVuEeyHaOsnSLi", "Fh0FDziHvuuc46M8RjDn", "TMNOdV", "BntQd7XboiQ5Pp5LCDj1cbVKSXS32D1x", "NrlP0Z8V9f9J6rKzzcCufZh8yiDjfbRh", "BOidXQkRBMfwkg7VYmAkrOpgeHcKVKv0"};
    public long A00;
    public boolean A01;
    public final InterfaceC1185Gs A02;
    public final InterfaceC1187Gu A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final long ADl(C1191Gy c1191Gy) throws IOException {
        long ADl = this.A03.ADl(c1191Gy);
        this.A00 = ADl;
        if (ADl == 0) {
            return 0L;
        }
        if (c1191Gy.A02 == -1 && this.A00 != -1) {
            c1191Gy = new C1191Gy(c1191Gy.A04, c1191Gy.A01, c1191Gy.A03, this.A00, c1191Gy.A05, c1191Gy.A00);
        }
        this.A01 = true;
        this.A02.ADn(c1191Gy);
        return this.A00;
    }

    public C1561Vn(InterfaceC1187Gu interfaceC1187Gu, InterfaceC1185Gs interfaceC1185Gs) {
        this.A03 = (InterfaceC1187Gu) AbstractC1192Ha.A01(interfaceC1187Gu);
        this.A02 = (InterfaceC1185Gs) AbstractC1192Ha.A01(interfaceC1185Gs);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final Uri A8E() {
        return this.A03.A8E();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final void close() throws IOException {
        try {
            this.A03.close();
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        } catch (Throwable th) {
            boolean z8 = this.A01;
            if (A04[5].charAt(29) != 'a') {
                A04[1] = "CXpRjqYaQVmivrsYVOmY1oz";
                if (z8) {
                    this.A01 = false;
                    InterfaceC1185Gs interfaceC1185Gs = this.A02;
                    if (A04[1].length() != 2) {
                        A04[5] = "FmRI3fMemMJaQGBcEYhbAky7hUfnuUR1";
                        interfaceC1185Gs.close();
                    }
                }
                throw th;
            }
            throw new RuntimeException();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final int read(byte[] bArr, int i9, int i10) throws IOException {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.A03.read(bArr, i9, i10);
        if (read > 0) {
            this.A02.write(bArr, i9, read);
            long j7 = this.A00;
            if (j7 != -1) {
                this.A00 = j7 - read;
            }
        }
        return read;
    }
}
