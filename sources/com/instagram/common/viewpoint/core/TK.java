package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public final class TK extends AnonymousClass56 implements MY {
    public C1T A00;
    public AbstractC0832Rj A01;
    public C0833Rk A02;
    public C0833Rk A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final SparseBooleanArray A08;
    public final C1045Zs A09;
    public final BP A0A;

    public TK(BP bp, SparseBooleanArray sparseBooleanArray, C0833Rk c0833Rk, int i2, int i3, int i4, int i5, C1045Zs c1045Zs, C1T c1t) {
        super(bp);
        this.A09 = c1045Zs;
        this.A0A = bp;
        this.A08 = sparseBooleanArray;
        this.A02 = c0833Rk;
        this.A04 = i2;
        this.A05 = i3;
        this.A06 = i4;
        this.A07 = i5;
        this.A00 = c1t;
    }

    private void A0A(J7 j7, C0688Lv c0688Lv, String str, QK qk) {
        if (this.A08.get(qk.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        this.A01 = new TM(this, str, qk, j7, qk.A04(), c0688Lv);
        this.A03 = new C0833Rk(this.A0A, 10, new WeakReference(this.A01), this.A09);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A0A.setOnAssetsLoadedListener(new TL(this, qk));
    }

    public final void A0j(QK qk, J7 j7, C03226f c03226f, C0688Lv c0688Lv, String str) {
        int A02 = qk.A02();
        this.A0A.setTag(-1593835536, Integer.valueOf(A02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A04, -2);
        int rightMargin = A02 == 0 ? this.A05 : this.A06;
        int position = this.A07;
        marginLayoutParams.setMargins(rightMargin, 0, A02 >= position + (-1) ? this.A05 : this.A06, 0);
        String imageUrl = qk.A03().A0E().A07();
        String A08 = qk.A03().A0E().A08();
        this.A0A.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A0A.A18()) {
            this.A0A.setVideoPlaceholderUrl(imageUrl);
            this.A0A.setVideoUrl(c03226f.A0S(A08));
        } else {
            this.A0A.setImageUrl(imageUrl);
        }
        this.A0A.setLayoutParams(marginLayoutParams);
        this.A0A.setAdTitleAndDescription(qk.A03().A0F().A08(), qk.A03().A0F().A02());
        this.A0A.setCTAInfo(qk.A03().A0G(), qk.A04());
        this.A0A.A1B(qk.A04());
        A0A(j7, c0688Lv, str, qk);
    }

    @Override // com.instagram.common.viewpoint.core.MY
    public final void AGH() {
        this.A0A.A13();
    }
}
