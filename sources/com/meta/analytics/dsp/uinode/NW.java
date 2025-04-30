package com.meta.analytics.dsp.uinode;

import android.widget.RelativeLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class NW extends RelativeLayout {
    public static MC A05;
    public static byte[] A06;
    public static String[] A07 = {"CT308ms2RTF49ixw7iITcI5DvAIGWMXZ", "UVauKq3DlAHpB1vMyeeSD4Us6AaVXCYd", "G3Ivv2DNtSsvdOlvNnw6jHI40eb4uyYL", "qur6nZLrhU9XJET37yOODnXWYcrj37IJ", "OCLfHPrXkMpm02uq88EYR3Uw1JpI2kE3", "KopKmjllEHptdGx3", "mL4xXMXopKoNgp", "1VwEGJcTQNgN7iTbFc9O"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public ZY A00;
    public C1636Yn A01;
    public AnonymousClass38 A02;
    public C1522Tz A03;
    public O2 A04;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[6].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[2] = "hwjeWCnyrgrPOyFOaJyYR4Ki88uO9bQs";
            strArr[0] = "4m7NTkn57B9pIqsgccGzW0RoTzQfESBy";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 119);
            i12++;
        }
    }

    public static void A02() {
        A06 = new byte[]{-25, 5, Ascii.SYN, 19, Ascii.EM, Ascii.ETB, 9, Ascii.DLE, -60, -14, 5, Ascii.CAN, Ascii.CR, Ascii.SUB, 9, -60, Ascii.SUB, Ascii.CR, 9, Ascii.ESC, -60, 5, 8, 9, Ascii.DC4, Ascii.CAN, 9, Ascii.SYN, -60, Ascii.CR, Ascii.ETB, Ascii.DC2, -53, Ascii.CAN, -60, 7, Ascii.SYN, 9, 5, Ascii.CAN, 9, 8, -60, Ascii.DC4, Ascii.SYN, 19, Ascii.DC4, 9, Ascii.SYN, Ascii.DLE, Ascii.GS, -5, -7, 2, -7, 6, -3, -9};
    }

    static {
        A02();
        int i9 = (int) (LD.A02 * 8.0f);
        A09 = i9;
        A08 = i9 * 10;
        A0A = (int) (LD.A02 * 15.0f);
        A05 = new C1521Ty();
    }

    public NW(C1636Yn c1636Yn) {
        super(c1636Yn);
        this.A01 = c1636Yn;
        AnonymousClass38 anonymousClass38 = new AnonymousClass38(c1636Yn);
        this.A02 = anonymousClass38;
        AbstractC1303Lo.A0K(anonymousClass38);
        C1120Ec c1120Ec = new C1120Ec();
        this.A00 = c1120Ec;
        c1120Ec.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<C1408Pp> A01(AbstractC1739b5 abstractC1739b5) {
        if (abstractC1739b5 == null) {
            return new ArrayList<>();
        }
        List<C1G> A14 = abstractC1739b5.A14();
        ArrayList<C1408Pp> arrayList = new ArrayList<>(A14.size());
        for (int i9 = 0; i9 < A14.size(); i9++) {
            arrayList.add(new C1408Pp(i9, A14.size(), A14.get(i9)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(V2 v22, int i9) {
        ArrayList<C1408Pp> A01 = A01(v22.A0z());
        this.A02.setCardsInfo(A01);
        C1522Tz c1522Tz = new C1522Tz(this.A01, A01, v22.A0z(), this.A01.A01().A09(), v22, A05, v22.A0z().A12(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A03 = c1522Tz;
        this.A02.setAdapter(c1522Tz);
        this.A03.A0F(i9 - A08, 16, 0);
        this.A03.A06();
        setupDotsLayout(v22, A01);
    }

    public final void A06(RE re) {
        C1522Tz c1522Tz = this.A03;
        if (c1522Tz != null) {
            c1522Tz.A0G(re);
        } else {
            this.A01.A07().A9a(A00(51, 7, 29), C8A.A1v, new C8B(A00(0, 51, 45)));
        }
        this.A02.A1y(re);
    }

    public static MC getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        C1522Tz c1522Tz;
        if (z8 && (c1522Tz = this.A03) != null) {
            c1522Tz.A0F((i11 - i9) - A08, 16, 0);
        }
        super.onLayout(z8, i9, i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i9) {
        O2 o22 = this.A04;
        if (o22 != null) {
            o22.A00(i9);
        }
    }

    private void setupDotsLayout(V2 v22, ArrayList<C1408Pp> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new C1520Tx(this));
        O2 o22 = new O2(this.A01, v22.A0z().A0w().A01(), arrayList.size());
        this.A04 = o22;
        AbstractC1303Lo.A0K(o22);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A0A, 0, 0);
        addView(this.A04, layoutParams);
    }
}
