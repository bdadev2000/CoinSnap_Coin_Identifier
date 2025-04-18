package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class XY implements HD {
    public static String[] A0C = {"UHBxdqqmUd0cBUfteuxO11fv3nMetCkr", "bpIfqspTf2B8hIKXxN8UsfP", "nQLLlj7yvR51GKiSLDNkBhCd9wKHTmtF", "g1T6MLNH1r6BMEQeXhAGdqkubnn7KLBM", "2gOIWdRNZvq1Kh3BpRyp9hP618T8MmgQ", "QpJVxxzC0ZK3g", "rEgoyo7biwWjWc5JH9k81Kz3GFe4jtfN", "VeB4zDZa"};
    public long A00;
    public long A02;
    public H3 A03;
    public final Uri A05;
    public final C0518Ep A07;
    public final InterfaceC0570Gz A08;
    public final C0582Hl A09;
    public volatile boolean A0A;
    public final /* synthetic */ C0489Dg A0B;
    public final C4 A06 = new C4();
    public boolean A04 = true;
    public long A01 = -1;

    public XY(C0489Dg c0489Dg, Uri uri, InterfaceC0570Gz interfaceC0570Gz, C0518Ep c0518Ep, C0582Hl c0582Hl) {
        this.A0B = c0489Dg;
        this.A05 = (Uri) AbstractC0576Hf.A01(uri);
        this.A08 = (InterfaceC0570Gz) AbstractC0576Hf.A01(interfaceC0570Gz);
        this.A07 = (C0518Ep) AbstractC0576Hf.A01(c0518Ep);
        this.A09 = c0582Hl;
    }

    public final void A04(long j2, long j3) {
        this.A06.A00 = j2;
        this.A02 = j3;
        this.A04 = true;
    }

    @Override // com.instagram.common.viewpoint.core.HD
    public final void A4W() {
        this.A0A = true;
    }

    @Override // com.instagram.common.viewpoint.core.HD
    public final void A9o() throws IOException, InterruptedException {
        int result = 0;
        while (result == 0) {
            boolean z2 = this.A0A;
            if (A0C[4].charAt(0) == 'C') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[6] = "tFp1bRZRusaEJJa7j65nePC0dyA6HXa4";
            strArr[2] = "yrMehS8ZHN9WesRJaME1jcDTy2vBV8ag";
            if (!z2) {
                InterfaceC0456By interfaceC0456By = null;
                try {
                    long j2 = this.A06.A00;
                    this.A03 = new H3(this.A05, j2, -1L, C0489Dg.A08(this.A0B));
                    this.A01 = this.A08.AEE(this.A03);
                    if (this.A01 != -1) {
                        this.A01 += j2;
                    }
                    C1019Ys c1019Ys = new C1019Ys(this.A08, j2, this.A01);
                    InterfaceC0455Bx extractor = this.A07.A02(c1019Ys, this.A08.A8c());
                    if (this.A04) {
                        extractor.AG7(j2, this.A02);
                        this.A04 = false;
                    }
                    while (result == 0 && !this.A0A) {
                        this.A09.A00();
                        result = extractor.AEk(c1019Ys, this.A06);
                        if (c1019Ys.A86() > C0489Dg.A03(this.A0B) + j2) {
                            j2 = c1019Ys.A86();
                            this.A09.A01();
                            C0489Dg.A04(this.A0B).post(C0489Dg.A06(this.A0B));
                        }
                    }
                    if (result == 1) {
                        result = 0;
                    } else {
                        this.A06.A00 = c1019Ys.A86();
                        C4 c4 = this.A06;
                        if (A0C[4].charAt(0) == 'C') {
                            throw new RuntimeException();
                        }
                        A0C[4] = "PQr9p7FkEdqUiF3RXdEEuViBVQM7OAy8";
                        this.A00 = c4.A00 - this.A03.A01;
                    }
                    IK.A0W(this.A08);
                } catch (Throwable th) {
                    if (result != 1 && 0 != 0) {
                        this.A06.A00 = interfaceC0456By.A86();
                        this.A00 = this.A06.A00 - this.A03.A01;
                    }
                    IK.A0W(this.A08);
                    throw th;
                }
            } else {
                return;
            }
        }
    }
}
