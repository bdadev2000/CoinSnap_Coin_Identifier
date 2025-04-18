package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Bg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0496Bg extends C1096Zo {
    public static String[] A08 = {"bHvO3zM", "7z8VpEP", "iw2Y0c", "LME8njBPiXs011hhslbtp", "9K0lNzbR5X2b0vS5", "Pt0EnZUFnGQLsNks8pQcEgn0FivkNzUh", "t6anbflpJj2CGicCnIMdWTRCydsD", "D9TL9YTSSd0lWzGeUvgWfvwaUF0YdAOx"};
    public float A00;
    public int A01;
    public int A02;
    public C0497Bh A03;
    public int[] A04;
    public final C1070Yn A05;
    public final C0835Pi A06;
    public final C0836Pj A07;

    public C0496Bg(C1070Yn c1070Yn, C0836Pj c0836Pj, C0835Pi c0835Pi) {
        super(c1070Yn);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = c1070Yn;
        this.A07 = c0836Pj;
        this.A06 = c0835Pi;
        this.A01 = -1;
        this.A03 = new C0497Bh(this, c1070Yn);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC03364o
    public final void A1J(C03434w c03434w, AnonymousClass53 anonymousClass53, int i10, int widthMode) {
        int[] iArr;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(widthMode);
        if ((mode == 1073741824 && A26() == 1) || (mode2 == 1073741824 && A26() == 0)) {
            super.A1J(c03434w, anonymousClass53, i10, widthMode);
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(widthMode);
        if (this.A06.A01(this.A01)) {
            iArr = this.A06.A02(this.A01);
        } else {
            iArr = new int[]{0, 0};
            if (anonymousClass53.A03() >= 1) {
                int widthSize = A0W() > 0 ? 1 : A0W();
                for (int i11 = 0; i11 < widthSize; i11++) {
                    View A1m = A1m(i11);
                    if (A08[5].length() != 32) {
                        throw new RuntimeException();
                    }
                    A08[4] = "FajaHWp";
                    if (A1m == null) {
                        break;
                    }
                    this.A04 = this.A07.A00(A1m, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    if (A26() == 0) {
                        int heightMode = iArr[0];
                        int[] iArr2 = this.A04;
                        iArr[0] = heightMode + iArr2[0];
                        if (i11 == 0) {
                            int A0g = iArr2[1] + A0g();
                            if (A08[6].length() != 1) {
                                A08[6] = "o1L5u";
                                iArr[1] = A0g + A0d();
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            continue;
                        }
                    } else {
                        int i12 = iArr[1];
                        int[] iArr3 = this.A04;
                        if (A08[6].length() != 1) {
                            A08[5] = "6nCDHSOFLCCkeDdRDThHGlolS6KLs45E";
                            iArr[1] = i12 + iArr3[1];
                            if (i11 != 0) {
                            }
                            iArr[0] = iArr3[0] + A0e() + A0f();
                        } else {
                            A08[3] = "KFvpvLkhCjqU9hzA1pvFB";
                            iArr[1] = i12 + iArr3[1];
                            if (i11 != 0) {
                            }
                            iArr[0] = iArr3[0] + A0e() + A0f();
                        }
                    }
                }
                int widthMode2 = this.A01;
                if (widthMode2 != -1) {
                    this.A06.A00(widthMode2, iArr);
                }
            }
        }
        if (mode == 1073741824) {
            iArr[0] = size;
        }
        if (mode2 == 1073741824) {
            iArr[1] = size2;
        }
        A13(iArr[0], iArr[1]);
    }

    @Override // com.facebook.ads.redexgen.uinode.C1096Zo, com.facebook.ads.redexgen.uinode.AbstractC03364o
    public final void A1p(int i10) {
        A2B(i10, this.A02);
    }

    @Override // com.facebook.ads.redexgen.uinode.C1096Zo, com.facebook.ads.redexgen.uinode.AbstractC03364o
    public final void A1x(C0553Eb c0553Eb, AnonymousClass53 anonymousClass53, int i10) {
        this.A03.A0A(i10);
        A1L(this.A03);
    }

    public final void A2G(double d10) {
        if (d10 <= 0.0d) {
            d10 = 1.0d;
        }
        this.A00 = (float) (50.0d / d10);
        this.A03 = new C0497Bh(this, this.A05);
    }

    public final void A2H(int i10) {
        this.A01 = i10;
    }

    public final void A2I(int i10) {
        this.A02 = i10;
    }
}
