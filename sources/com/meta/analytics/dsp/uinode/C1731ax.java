package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.ax, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1731ax implements AnonymousClass61 {
    public static String[] A05 = {"SGxBKOT0PnlxeQ2jGccieZy3bFeI", "1PQaT", "uVEahNbfwTxCxKVGO7p", "rVPhbhRBlKfAg8fviAhE", "2ov", "KrP87Bn8e271VzBAE5Wi", "4No2VIB7eIWgh7ub8hExBeYUcY", "mEjh"};
    public final /* synthetic */ AbstractC1739b5 A00;
    public final /* synthetic */ InterfaceC08181h A01;
    public final /* synthetic */ C08191i A02;
    public final /* synthetic */ C1636Yn A03;
    public final /* synthetic */ boolean A04;

    public C1731ax(C08191i c08191i, C1636Yn c1636Yn, boolean z8, AbstractC1739b5 abstractC1739b5, InterfaceC08181h interfaceC08181h) {
        this.A02 = c08191i;
        this.A03 = c1636Yn;
        this.A04 = z8;
        this.A00 = abstractC1739b5;
        this.A01 = interfaceC08181h;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAl() {
        ArrayList arrayList;
        if (C1225Ih.A1O(this.A03) && this.A04) {
            arrayList = this.A02.A02;
            arrayList.add(PC.A01(this.A03, this.A00, 1, new C1732ay(this)));
            return;
        }
        InterfaceC08181h interfaceC08181h = this.A01;
        if (A05[2].length() != 19) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[5] = "X6BBoGIR5wPjpoFUlFYz";
        strArr[3] = "SlUPa0nBeexeGnx3tyWk";
        interfaceC08181h.AAf();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAm() {
        this.A01.AAe(AdError.CACHE_ERROR);
    }
}
