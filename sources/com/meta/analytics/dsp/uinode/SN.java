package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public final class SN extends AnonymousClass56 implements MJ {
    public static String[] A0B = {"av2tITPhYKbVn20ukUfJR25ELbcgjHbj", "MLeLe181lhP7dC21QqjxU1VDKV9lNkzJ", "XUmY4VBJ2tlJWKlPJ7YkBdCsKtcC", "bK6oHsXedskfaWsjnVeS6YyvP0sRA20b", "BhCeFQN4dHt9z3MLE3p7bnIzhrf86Cw8", "mLW9T0fP2Q5Hob07hRXsv0QUH1fN4", "pNzPXZ5fcby2PvmlRsfUzns43oHDF5Mi", "3YktW7BrcDIc4Xw2f2zdWv5xFETbHIAE"};
    public C1U A00;
    public RD A01;
    public RE A02;
    public RE A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final SparseBooleanArray A08;
    public final C1636Yn A09;
    public final B4 A0A;

    public SN(B4 b42, SparseBooleanArray sparseBooleanArray, RE re, int i9, int i10, int i11, int i12, C1636Yn c1636Yn, C1U c1u) {
        super(b42);
        this.A09 = c1636Yn;
        this.A0A = b42;
        this.A08 = sparseBooleanArray;
        this.A02 = re;
        this.A04 = i9;
        this.A05 = i10;
        this.A06 = i11;
        this.A07 = i12;
        this.A00 = c1u;
    }

    private void A0A(J2 j22, C1295Lg c1295Lg, String str, C1408Pp c1408Pp) {
        if (this.A08.get(c1408Pp.A02())) {
            return;
        }
        RE re = this.A03;
        if (re != null) {
            re.A0V();
            if (A0B[4].charAt(16) != 'E') {
                throw new RuntimeException();
            }
            A0B[4] = "iteeE4SnfkkyQnEAEqI0za4snrHpWaXy";
            this.A03 = null;
        }
        this.A01 = new SP(this, str, c1408Pp, j22, c1408Pp.A04(), c1295Lg);
        RE re2 = new RE(this.A0A, 10, new WeakReference(this.A01), this.A09);
        this.A03 = re2;
        re2.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A0A.setOnAssetsLoadedListener(new SO(this, c1408Pp));
    }

    public final void A0j(C1408Pp c1408Pp, J2 j22, C09416c c09416c, C1295Lg c1295Lg, String str) {
        int A02 = c1408Pp.A02();
        this.A0A.setTag(-1593835536, Integer.valueOf(A02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A04, -2);
        int rightMargin = A02 == 0 ? this.A05 : this.A06;
        int position = this.A07;
        marginLayoutParams.setMargins(rightMargin, 0, A02 >= position + (-1) ? this.A05 : this.A06, 0);
        String imageUrl = c1408Pp.A03().A0D().A07();
        String A08 = c1408Pp.A03().A0D().A08();
        this.A0A.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A0A.A18()) {
            this.A0A.setVideoPlaceholderUrl(imageUrl);
            this.A0A.setVideoUrl(c09416c.A0S(A08));
        } else {
            this.A0A.setImageUrl(imageUrl);
        }
        this.A0A.setLayoutParams(marginLayoutParams);
        this.A0A.setAdTitleAndDescription(c1408Pp.A03().A0E().A06(), c1408Pp.A03().A0E().A01());
        this.A0A.setCTAInfo(c1408Pp.A03().A0F(), c1408Pp.A04());
        this.A0A.A1A(c1408Pp.A04());
        A0A(j22, c1295Lg, str, c1408Pp);
    }

    @Override // com.meta.analytics.dsp.uinode.MJ
    public final void AFr() {
        this.A0A.A13();
    }
}
