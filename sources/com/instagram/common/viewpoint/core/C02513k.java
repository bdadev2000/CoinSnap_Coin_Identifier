package com.instagram.common.viewpoint.core;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.3k, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02513k {
    public static String[] A01 = {"gvBt6XO", "nDdZtD2RAkyhnTB6dMy", "tszEn2avf0fRCcxBO6xRy", "E0tn4QM", "iaPjqZyyyQaCpNWvaI", "KgsGXwLuVnUqvF5nQn", "yu6fUddk60dZyPwDlNP", "AMQfN"};
    public final Object A00;

    public C02513k(Object obj) {
        this.A00 = obj;
    }

    public static C02513k A00(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C02513k(obj);
    }

    public static Object A01(C02513k c02513k) {
        if (c02513k == null) {
            return null;
        }
        return c02513k.A00;
    }

    public final int A02() {
        if (Build.VERSION.SDK_INT >= 20) {
            Object obj = this.A00;
            String[] strArr = A01;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "XuX3PdHW7G0KVvQYj2l";
            strArr2[1] = "rc8Q8MxCTHV42NNfZos";
            return ((WindowInsets) obj).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public final int A03() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public final int A04() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetRight();
        }
        return 0;
    }

    public final int A05() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetTop();
        }
        return 0;
    }

    public final C02513k A06(int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C02513k(((WindowInsets) this.A00).replaceSystemWindowInsets(i2, i3, i4, i5));
        }
        return null;
    }

    public final boolean A07() {
        if (Build.VERSION.SDK_INT >= 21) {
            Object obj = this.A00;
            if (A01[2].length() == 31) {
                throw new RuntimeException();
            }
            A01[7] = "4PMLj";
            return ((WindowInsets) obj).isConsumed();
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C02513k c02513k = (C02513k) obj;
        return this.A00 == null ? c02513k.A00 == null : this.A00.equals(c02513k.A00);
    }

    public final int hashCode() {
        if (this.A00 == null) {
            return 0;
        }
        return this.A00.hashCode();
    }
}
