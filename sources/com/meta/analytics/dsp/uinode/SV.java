package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public final class SV extends AnonymousClass56 implements MJ {
    public C1U A00;
    public RD A01;
    public RE A02;
    public RE A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final C1636Yn A06;
    public final BK A07;

    public SV(BK bk, SparseBooleanArray sparseBooleanArray, RE re, int i9, C1636Yn c1636Yn, C1U c1u) {
        super(bk);
        this.A06 = c1636Yn;
        this.A07 = bk;
        this.A05 = sparseBooleanArray;
        this.A02 = re;
        this.A04 = i9;
        this.A00 = c1u;
    }

    private void A0A(J2 j22, C1295Lg c1295Lg, String str, C1408Pp c1408Pp) {
        if (this.A05.get(c1408Pp.A02())) {
            return;
        }
        RE re = this.A03;
        if (re != null) {
            re.A0V();
            this.A03 = null;
        }
        this.A01 = new SX(this, str, c1408Pp, j22, c1408Pp.A04(), c1295Lg);
        RE re2 = new RE(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03 = re2;
        re2.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new SW(this, c1408Pp));
    }

    public final void A0j(C1408Pp c1408Pp, J2 j22, C09416c c09416c, C1295Lg c1295Lg, String str, int i9, int i10, int i11) {
        int leftMargin = c1408Pp.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(leftMargin));
        this.A07.setupNativeCtaExtension(c1408Pp);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i9, -2);
        int i12 = leftMargin == 0 ? i11 : i10;
        if (leftMargin < this.A04 - 1) {
            i11 = i10;
        }
        marginLayoutParams.setMargins(i12, 0, i11, 0);
        String A07 = c1408Pp.A03().A0D().A07();
        String A08 = c1408Pp.A03().A0D().A08();
        this.A07.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A07.A18()) {
            this.A07.setVideoPlaceholderUrl(A07);
            this.A07.setVideoUrl(c09416c.A0S(A08));
        } else {
            this.A07.setImageUrl(A07);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(c1408Pp.A03().A0F(), c1408Pp.A04());
        this.A07.A19(c1408Pp.A04());
        A0A(j22, c1295Lg, str, c1408Pp);
    }

    public final void A0k(RE re) {
        this.A02 = re;
    }

    @Override // com.meta.analytics.dsp.uinode.MJ
    public final void AFr() {
        this.A07.A13();
    }
}
