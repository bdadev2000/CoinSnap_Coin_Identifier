package com.facebook.ads.redexgen.uinode;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Tz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0956Tz extends AbstractC03244c<SV> {
    public int A00;
    public int A01;
    public int A02;
    public MC A03;
    public RE A04;
    public String A05;
    public List<C0842Pp> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC1173b5 A08;
    public final C03756c A09;
    public final C1070Yn A0A;
    public final J2 A0B;
    public final V2 A0C;
    public final C0729Lg A0D;
    public final BQ A0E;
    public final KP A0F;

    public C0956Tz(C1070Yn c1070Yn, List<C0842Pp> list, AbstractC1173b5 abstractC1173b5, J2 j22, V2 v22, MC mc2, String str, BQ bq, KP kp) {
        this.A0A = c1070Yn;
        this.A0B = j22;
        this.A0C = v22;
        this.A09 = v22.A10();
        this.A04 = v22.A1A();
        this.A0D = v22.A19();
        this.A03 = mc2;
        this.A08 = abstractC1173b5;
        this.A06 = list;
        this.A05 = str;
        this.A0E = bq;
        this.A0F = kp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC03244c
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final SV A0C(ViewGroup viewGroup, int i10) {
        return new SV(AbstractC0793Ns.A00(new OO(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0I(this.A0F).A0G(this.A0C).A0K(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A0y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC03244c
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0D(SV sv, int i10) {
        C0842Pp c0842Pp = this.A06.get(i10);
        sv.A0k(this.A04);
        sv.A0j(c0842Pp, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC03244c
    public final int A0E() {
        return this.A06.size();
    }

    public final void A0F(int i10, int i11, int i12) {
        boolean needsUpdate = i10 != this.A00;
        this.A00 = i10;
        this.A02 = i11;
        this.A01 = i12;
        if (needsUpdate) {
            A06();
        }
    }

    public final void A0G(RE re2) {
        this.A04 = re2;
    }
}
