package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.ax, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1165ax implements AnonymousClass61 {
    public static String[] A05 = {"SGxBKOT0PnlxeQ2jGccieZy3bFeI", "1PQaT", "uVEahNbfwTxCxKVGO7p", "rVPhbhRBlKfAg8fviAhE", "2ov", "KrP87Bn8e271VzBAE5Wi", "4No2VIB7eIWgh7ub8hExBeYUcY", "mEjh"};
    public final /* synthetic */ AbstractC1173b5 A00;
    public final /* synthetic */ InterfaceC02521h A01;
    public final /* synthetic */ C02531i A02;
    public final /* synthetic */ C1070Yn A03;
    public final /* synthetic */ boolean A04;

    public C1165ax(C02531i c02531i, C1070Yn c1070Yn, boolean z10, AbstractC1173b5 abstractC1173b5, InterfaceC02521h interfaceC02521h) {
        this.A02 = c02531i;
        this.A03 = c1070Yn;
        this.A04 = z10;
        this.A00 = abstractC1173b5;
        this.A01 = interfaceC02521h;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass61
    public final void AAl() {
        ArrayList arrayList;
        if (C0659Ih.A1O(this.A03) && this.A04) {
            arrayList = this.A02.A02;
            arrayList.add(PC.A01(this.A03, this.A00, 1, new C1166ay(this)));
            return;
        }
        InterfaceC02521h interfaceC02521h = this.A01;
        if (A05[2].length() != 19) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[5] = "X6BBoGIR5wPjpoFUlFYz";
        strArr[3] = "SlUPa0nBeexeGnx3tyWk";
        interfaceC02521h.AAf();
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass61
    public final void AAm() {
        this.A01.AAe(AdError.CACHE_ERROR);
    }
}
