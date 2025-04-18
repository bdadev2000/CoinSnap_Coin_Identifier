package com.instagram.common.viewpoint.core;

import com.facebook.appevents.AppEventsConstants;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5E, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5E {
    public static byte[] A02;
    public static String[] A03 = {"TTkBeT", "dgqPpyxawDBTokVKz6usds7DGGljbLlG", "Om", AppEventsConstants.EVENT_PARAM_VALUE_YES, "lOfLhIubd0jJyTpTkNltmpZf14oHCLV9", "yX0qRkYxaN2cv8t3SuJSwpxSeia", "n9D4XHOOTGgVdLWa6Wuko3wZCERnKgc", "NKR9b6EIrIhl49GaATLNKeLdYiLud"};
    public final C1122bA<AnonymousClass56, C5C> A00 = new C1122bA<>();
    public final C02332s<AnonymousClass56> A01 = new C02332s<>();

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 13);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {78, 118, 112, 119, 35, 115, 113, 108, 117, 106, 103, 102, 35, 101, 111, 98, 100, 35, 83, 81, 70, 35, 108, 113, 35, 83, 76, 80, 87};
        if (A03[1].charAt(27) != 'j') {
            throw new RuntimeException();
        }
        A03[0] = "DMTuNl";
        A02 = bArr;
    }

    static {
        A02();
    }

    private C02754j A00(AnonymousClass56 anonymousClass56, int i2) {
        C5C A0B;
        C02754j info;
        int A08 = this.A00.A08(anonymousClass56);
        if (A08 >= 0 && (A0B = this.A00.A0B(A08)) != null) {
            int i3 = A0B.A00;
            if (A03[2].length() != 2) {
                throw new RuntimeException();
            }
            A03[2] = "6x";
            if ((i3 & i2) != 0) {
                int index = i2 ^ (-1);
                A0B.A00 &= index;
                if (i2 == 4) {
                    info = A0B.A02;
                } else if (i2 == 8) {
                    info = A0B.A01;
                } else {
                    throw new IllegalArgumentException(A01(0, 29, 14));
                }
                int index2 = A0B.A00;
                if ((index2 & 12) == 0) {
                    this.A00.A0A(A08);
                    C5C.A02(A0B);
                }
                return info;
            }
        }
        return null;
    }

    public final C02754j A03(AnonymousClass56 anonymousClass56) {
        return A00(anonymousClass56, 8);
    }

    public final C02754j A04(AnonymousClass56 anonymousClass56) {
        return A00(anonymousClass56, 4);
    }

    public final AnonymousClass56 A05(long j2) {
        return this.A01.A08(j2);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        C5C.A01();
    }

    public final void A08(long j2, AnonymousClass56 anonymousClass56) {
        this.A01.A0B(j2, anonymousClass56);
    }

    public final void A09(AnonymousClass56 anonymousClass56) {
        C5C c5c = this.A00.get(anonymousClass56);
        if (c5c == null) {
            c5c = C5C.A00();
            this.A00.put(anonymousClass56, c5c);
        }
        c5c.A00 |= 1;
    }

    public final void A0A(AnonymousClass56 anonymousClass56) {
        C5C c5c = this.A00.get(anonymousClass56);
        if (c5c == null) {
            return;
        }
        c5c.A00 &= -2;
    }

    public final void A0B(AnonymousClass56 anonymousClass56) {
        int A06 = this.A01.A06() - 1;
        while (true) {
            if (A06 < 0) {
                break;
            }
            if (anonymousClass56 == this.A01.A07(A06)) {
                this.A01.A0A(A06);
                break;
            }
            A06--;
        }
        C5C info = this.A00.remove(anonymousClass56);
        if (info != null) {
            C5C.A02(info);
        }
    }

    public final void A0C(AnonymousClass56 anonymousClass56) {
        A0A(anonymousClass56);
    }

    public final void A0D(AnonymousClass56 anonymousClass56, C02754j c02754j) {
        C5C c5c = this.A00.get(anonymousClass56);
        if (c5c == null) {
            c5c = C5C.A00();
            this.A00.put(anonymousClass56, c5c);
        }
        c5c.A00 |= 2;
        c5c.A02 = c02754j;
    }

    public final void A0E(AnonymousClass56 anonymousClass56, C02754j c02754j) {
        C5C c5c = this.A00.get(anonymousClass56);
        if (c5c == null) {
            c5c = C5C.A00();
            this.A00.put(anonymousClass56, c5c);
        }
        c5c.A01 = c02754j;
        c5c.A00 |= 8;
    }

    public final void A0F(AnonymousClass56 anonymousClass56, C02754j c02754j) {
        C5C c5c = this.A00.get(anonymousClass56);
        if (c5c == null) {
            c5c = C5C.A00();
            this.A00.put(anonymousClass56, c5c);
        }
        c5c.A02 = c02754j;
        c5c.A00 |= 4;
    }

    public final void A0G(C5D c5d) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            AnonymousClass56 A09 = this.A00.A09(size);
            C5C A0A = this.A00.A0A(size);
            if ((A0A.A00 & 3) == 3) {
                c5d.AHG(A09);
            } else {
                int index = A0A.A00;
                if ((index & 1) != 0) {
                    if (A0A.A02 == null) {
                        c5d.AHG(A09);
                    } else {
                        c5d.AEe(A09, A0A.A02, A0A.A01);
                    }
                } else if ((A0A.A00 & 14) == 14) {
                    c5d.AEc(A09, A0A.A02, A0A.A01);
                } else if ((A0A.A00 & 12) == 12) {
                    c5d.AEg(A09, A0A.A02, A0A.A01);
                } else {
                    int index2 = A0A.A00;
                    if ((index2 & 4) != 0) {
                        c5d.AEe(A09, A0A.A02, null);
                    } else {
                        int index3 = A0A.A00;
                        if ((index3 & 8) != 0) {
                            C02754j c02754j = A0A.A02;
                            if (A03[4].charAt(6) == 'y') {
                                throw new RuntimeException();
                            }
                            A03[7] = "pRTOxDzzIVV0VuKMKqyuKOShfW9n8";
                            c5d.AEc(A09, c02754j, A0A.A01);
                        } else {
                            continue;
                        }
                    }
                }
            }
            C5C.A02(A0A);
        }
    }

    public final boolean A0H(AnonymousClass56 anonymousClass56) {
        C5C record = this.A00.get(anonymousClass56);
        return (record == null || (record.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(AnonymousClass56 anonymousClass56) {
        C5C record = this.A00.get(anonymousClass56);
        return (record == null || (record.A00 & 4) == 0) ? false : true;
    }
}
