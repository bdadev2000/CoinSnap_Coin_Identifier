package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class VQ implements J2 {
    public static J2 A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final C1635Ym A00;
    public final C8w A01;
    public final J1 A02;

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 79);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{-90, -21, -4, -21, -12, -6, -76, -88, -37, -37, -52, -44, -41, -37, -48, -43, -50, -121, -37, -42, -121, -45, -42, -50, -121, -56, -43, -121, -48, -43, -35, -56, -45, -48, -53, -121, -43, -13, -30, -28, -26, -24, -26, -17, -26, -13, -22, -28, 46, 51, 42, Ascii.US};
    }

    static {
        A03();
        A05 = VQ.class.getSimpleName();
        A06 = false;
    }

    public VQ(C1635Ym c1635Ym) {
        J0 dispatchCallback;
        this.A00 = c1635Ym;
        if (Ij.A0T(c1635Ym)) {
            C8w A00 = AbstractC10008u.A00(c1635Ym);
            this.A01 = A00;
            dispatchCallback = J7.A00(c1635Ym, A00);
        } else {
            EN A01 = AbstractC10008u.A01(c1635Ym);
            dispatchCallback = J7.A01(c1635Ym, A01);
            this.A01 = A01;
        }
        this.A02 = new VT(c1635Ym, dispatchCallback);
        ExecutorC1308Lt.A08.execute(new VS(this));
        A04(c1635Ym);
    }

    public static synchronized J2 A01(C1635Ym c1635Ym) {
        J2 j22;
        synchronized (VQ.class) {
            if (A03 == null) {
                A03 = new VQ(c1635Ym);
            }
            j22 = A03;
        }
        return j22;
    }

    public static synchronized void A04(C1635Ym c1635Ym) {
        synchronized (VQ.class) {
            if (A06) {
                return;
            }
            c1635Ym.A03().AAd();
            A06 = true;
        }
    }

    private void A05(C1241Iz c1241Iz) {
        if (!c1241Iz.A0A()) {
            Log.e(A05, A02(7, 29, 24) + c1241Iz.A06() + A02(0, 7, 55));
        } else {
            A06(c1241Iz);
            this.A01.AHE(c1241Iz, new VR(this, c1241Iz));
        }
    }

    private void A06(C1241Iz c1241Iz) {
        switch (J3.A00[c1241Iz.A06().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C8B c8b = new C8B(new Exception(A02(36, 5, 50)));
                c8b.A05(1);
                try {
                    c8b.A07(new JSONObject().put(A02(48, 4, 107), c1241Iz.A06().toString()));
                } catch (JSONException unused) {
                }
                this.A00.A07().A9b(A02(41, 7, 50), C8A.A1H, c8b);
                return;
            default:
                return;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void A9T(String str, Map<String, String> data) {
        A05(new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J4.A04).A02(J5.A04).A07(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void A9V(String str, Map<String, String> data) {
        A05(new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J4.A04).A02(J5.A06).A07(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void A9W(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J4.A04).A02(J5.A07).A06(JC.A0A(str, J9.A0I)).A07(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void A9X(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J4.A04).A02(J5.A08).A06(JC.A0A(str, J9.A06)).A07(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void A9Z(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J4.A04).A02(J5.A0B).A07(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void A9d(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J4.A04).A02(J5.A0C).A07(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void A9g(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J4.A05).A02(J5.A0D).A06(JC.A0A(str, J9.A0T)).A07(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void A9h(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J4.A05).A02(J5.A0E).A07(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void A9i(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J4.A05).A02(J5.A0F).A06(JC.A0A(str, J9.A0V)).A07(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void A9j(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J4.A05).A02(J5.A0K).A06(JC.A0A(str, J9.A0W)).A07(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void A9s(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J4.A05).A02(J5.A0H).A06(JC.A0A(str, J9.A0X)).A07(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void A9u(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J4.A04).A02(J5.A0J).A06(JC.A0A(str, J9.A0Y)).A07(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void A9v(String str, Map<String, String> data, String str2, J4 j42) {
        A05(new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(j42).A02(J5.A00(str2)).A07(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void A9w(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1241Iz adEvent = new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J4.A04).A02(J5.A0L).A07(this.A00);
        A05(adEvent);
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void AA0(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J4.A05).A02(J5.A0N).A06(JC.A0A(str, J9.A0a)).A07(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void AA1(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J4.A05).A02(J5.A0O).A06(JC.A0A(str, J9.A0b)).A07(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void AA3(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A01(J4.A04).A02(J5.A0P).A06(JC.A0A(str, J9.A0c)).A07(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void AA4(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J4.A04).A02(J5.A0G).A07(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void AA8(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J4.A05).A02(J5.A0Q).A06(JC.A0A(str, J9.A0g)).A07(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void AA9(String str, Map<String, String> data) {
        A05(new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J4.A05).A02(J5.A0V).A07(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void AAB(String str, Map<String, String> data) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C1240Iy().A04(str).A00(this.A00.A08().A01()).A03(this.A00.A08().A02()).A05(data).A01(J4.A05).A02(J5.A0W).A07(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.J2
    public final void AE1(String str) {
        new AsyncTaskC1449Re(this.A00).execute(str);
    }
}
