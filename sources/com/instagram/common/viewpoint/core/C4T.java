package com.instagram.common.viewpoint.core;

import android.view.View;
import com.google.android.gms.common.api.Api;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4T, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4T {
    public static String[] A0C = {"zYBO", "VrDNMGAmElYb4SYFj9Lpkrq1UWScNn1g", "4mNmwJxO6cgQvBVSRxGC", "9gqvUwqHV9nyPc72vXSv6mEX866dBdM", "nltTkdARyojUYdv3T0NiqQmXwvESfaB", "A7Q8ygVI07x7oKl7LsiAf8", "TfmPmCKdg", "Y"};
    public int A00;
    public int A01;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public boolean A09;
    public boolean A0B = true;
    public int A02 = 0;
    public boolean A0A = false;
    public List<AnonymousClass56> A08 = null;

    private View A00() {
        int size = this.A08.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.A08.get(i2).A0H;
            C02814p c02814p = (C02814p) view.getLayoutParams();
            if (!c02814p.A02()) {
                int i3 = this.A01;
                int size2 = c02814p.A00();
                if (i3 == size2) {
                    A02(view);
                    return view;
                }
            }
        }
        String[] strArr = A0C;
        String str = strArr[3];
        String str2 = strArr[4];
        int length = str.length();
        int size3 = str2.length();
        if (length != size3) {
            throw new RuntimeException();
        }
        A0C[0] = "XAMH";
        return null;
    }

    private final View A01(View view) {
        int size = this.A08.size();
        View view2 = null;
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i3 = 0; i3 < size; i3++) {
            View view3 = this.A08.get(i3).A0H;
            C02814p c02814p = (C02814p) view3.getLayoutParams();
            if (view3 != view) {
                boolean A02 = c02814p.A02();
                if (A0C[1].charAt(18) != 'L') {
                    throw new RuntimeException();
                }
                A0C[2] = "5fjKcvOJD7";
                if (!A02) {
                    int A00 = c02814p.A00();
                    int size2 = this.A01;
                    int i4 = A00 - size2;
                    int size3 = this.A03;
                    int i5 = i4 * size3;
                    if (i5 >= 0 && i5 < i2) {
                        view2 = view3;
                        i2 = i5;
                        if (i5 == 0) {
                            break;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return view2;
    }

    private final void A02(View view) {
        View closest = A01(view);
        if (closest == null) {
            this.A01 = -1;
        } else {
            this.A01 = ((C02814p) closest.getLayoutParams()).A00();
        }
    }

    public final View A03(C02874w c02874w) {
        if (this.A08 != null) {
            return A00();
        }
        View A0G = c02874w.A0G(this.A01);
        this.A01 += this.A03;
        return A0G;
    }

    public final void A04() {
        A02(null);
    }

    public final boolean A05(AnonymousClass53 anonymousClass53) {
        return this.A01 >= 0 && this.A01 < anonymousClass53.A03();
    }
}
