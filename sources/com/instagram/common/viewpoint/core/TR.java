package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public final class TR extends AnonymousClass56 implements MY {
    public static String[] A08 = {"biNTtjxa0xULALtZEUOcP", "rMVpYr4hwZgX", "y0rebd1hOaNR", "snwXdVXwO66aPvNuuMD2", "jxkMgVVp1g5", "Dcah1JX", "lglxOXHbCZFpcLf1TWQPAMUDis4zLCZx", "n80A5ryznQOlcAJIvKv7FeLq2ck19EHB"};
    public C1T A00;
    public AbstractC0832Rj A01;
    public C0833Rk A02;
    public C0833Rk A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final C1045Zs A06;
    public final BZ A07;

    public TR(BZ bz, SparseBooleanArray sparseBooleanArray, C0833Rk c0833Rk, int i2, C1045Zs c1045Zs, C1T c1t) {
        super(bz);
        this.A06 = c1045Zs;
        this.A07 = bz;
        this.A05 = sparseBooleanArray;
        this.A02 = c0833Rk;
        this.A04 = i2;
        this.A00 = c1t;
    }

    private void A0A(J7 j7, C0688Lv c0688Lv, String str, QK qk) {
        if (this.A05.get(qk.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            String[] strArr = A08;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "sEemyGdXpNnP2WRBMWcD";
            strArr2[0] = "kawPFcVLuq3VyedHvbBIc";
            this.A03 = null;
        }
        this.A01 = new TT(this, str, qk, j7, qk.A04(), c0688Lv);
        this.A03 = new C0833Rk(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new TS(this, qk));
    }

    public final void A0j(QK qk, J7 j7, C03226f c03226f, C0688Lv c0688Lv, String str, int i2, int i3, int i4) {
        int A02 = qk.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(A02));
        this.A07.setupNativeCtaExtension(qk);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i2, -2);
        int rightMargin = A02 == 0 ? i4 : i3;
        if (A02 < this.A04 - 1) {
            i4 = i3;
        }
        String[] strArr = A08;
        if (strArr[1].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[1] = "ng4t5bAKqCWK";
        strArr2[2] = "n9xBZs9SEWUc";
        marginLayoutParams.setMargins(rightMargin, 0, i4, 0);
        String A07 = qk.A03().A0E().A07();
        String A082 = qk.A03().A0E().A08();
        this.A07.setIsVideo(!TextUtils.isEmpty(A082));
        if (this.A07.A18()) {
            this.A07.setVideoPlaceholderUrl(A07);
            this.A07.setVideoUrl(c03226f.A0S(A082));
        } else {
            this.A07.setImageUrl(A07);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(qk.A03().A0G(), qk.A04());
        this.A07.A19(qk.A04());
        A0A(j7, c0688Lv, str, qk);
    }

    public final void A0k(C0833Rk c0833Rk) {
        this.A02 = c0833Rk;
    }

    @Override // com.instagram.common.viewpoint.core.MY
    public final void AGH() {
        this.A07.A13();
    }
}
