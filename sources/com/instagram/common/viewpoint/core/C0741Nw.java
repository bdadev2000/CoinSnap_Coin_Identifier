package com.instagram.common.viewpoint.core;

import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Nw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0741Nw extends RelativeLayout {
    public static MR A05;
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public AbstractC1092ad A00;
    public C1045Zs A01;
    public AnonymousClass38 A02;
    public C0923Uw A03;
    public OT A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 60);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{2, 32, 51, 46, 52, 50, 36, 45, 97, 15, 32, 53, 40, 55, 36, 97, 55, 40, 36, 54, 97, 32, 37, 36, 49, 53, 36, 51, 97, 40, 50, 47, 102, 53, 97, 34, 51, 36, 32, 53, 36, 37, 97, 49, 51, 46, 49, 36, 51, 45, 56, 67, 65, 74, 65, 86, 77, 71};
    }

    static {
        A02();
        A08 = (int) (LP.A02 * 8.0f);
        A07 = A08 * 10;
        A09 = (int) (LP.A02 * 15.0f);
        A05 = new C0922Uv();
    }

    public C0741Nw(C1045Zs c1045Zs) {
        super(c1045Zs);
        this.A01 = c1045Zs;
        this.A02 = new AnonymousClass38(c1045Zs);
        M3.A0K(this.A02);
        this.A00 = new FM();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<QK> A01(AbstractC1187cD abstractC1187cD) {
        if (abstractC1187cD == null) {
            return new ArrayList<>();
        }
        List<C1F> A1W = abstractC1187cD.A1W();
        ArrayList<QK> arrayList = new ArrayList<>(A1W.size());
        for (int i2 = 0; i2 < A1W.size(); i2++) {
            arrayList.add(new QK(i2, A1W.size(), A1W.get(i2)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(W7 w7, int i2) {
        ArrayList<QK> A01 = A01(w7.A0z());
        this.A02.setCardsInfo(A01);
        this.A03 = new C0923Uw(this.A01, A01, w7.A0z(), this.A01.A01().A09(), w7, A05, w7.A0z().A1U(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        if (i2 == 0) {
            i2 = LP.A03.widthPixels;
        }
        this.A03.A0F(i2 - A07, 16, 0);
        this.A03.A06();
        setupDotsLayout(w7, A01);
    }

    public final void A06(C0833Rk c0833Rk) {
        if (this.A03 != null) {
            this.A03.A0G(c0833Rk);
        } else {
            this.A01.A07().AA0(A00(51, 7, 24), C8E.A1v, new C8F(A00(0, 51, Opcodes.LUSHR)));
        }
        this.A02.A1y(c0833Rk);
    }

    public static MR getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (z2 && this.A03 != null) {
            this.A03.A0F((i4 - i2) - A07, 16, 0);
        }
        super.onLayout(z2, i2, i3, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i2) {
        if (this.A04 != null) {
            this.A04.A00(i2);
        }
    }

    private void setupDotsLayout(W7 w7, ArrayList<QK> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new C0921Uu(this));
        this.A04 = new OT(this.A01, w7.A0z().A1O().A01(), arrayList.size());
        M3.A0K(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A09, 0, 0);
        addView(this.A04, layoutParams);
    }
}
