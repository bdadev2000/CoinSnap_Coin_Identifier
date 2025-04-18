package com.facebook.ads.redexgen.uinode;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class UC implements MD {
    public static byte[] A02;
    public static String[] A03 = {"aBntnUcGkPsHn32", "P4RcL0jDchydoovBiSoLIuxgLfrPrb6w", "mkuNE8OtHtyShCJf5aoxKrL8UBpqEuyM", "UhCp0DvERhIRIFEAVdlvvAHyWhzVDXme", "Bn", "", "xG", ""};
    public final C5V A00;
    public final C1070Yn A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 59);
            String[] strArr = A03;
            if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
                throw new RuntimeException();
            }
            A03[0] = "eCFHYnXZJROSM8T";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{106, 109, 119, 124, 113, 117, 124, 98, 115, 115, 124, 108, 113, 106, 102, 109, 119, 98, 119, 106, 108, 109, 124, 104, 102, 122, 73, 78, 72, 69, 91, 94, 69, 83, 94, 69, 81, 95, 67, 104, 100, 102, 37, 109, 106, 104, 110, 105, 100, 100, 96, 37, 106, 111, 120, 37, 98, 101, Byte.MAX_VALUE, 110, 121, 101, 106, 103, 37, 98, 123, 104, 37, 74, 126, 111, 98, 110, 101, 104, 110, 69, 110, Byte.MAX_VALUE, 124, 100, 121, 96, 78, 115, 123, 100, 121, Byte.MAX_VALUE, 110, 111, 74, 104, Byte.MAX_VALUE, 98, 125, 98, Byte.MAX_VALUE, 114};
    }

    static {
        A01();
    }

    public UC(C1070Yn c1070Yn, C5V c5v) {
        this.A01 = c1070Yn;
        this.A00 = c5v;
    }

    private final void A02() {
        Object A0G = this.A01.A0G();
        if (A0G instanceof C2F) {
            C2F c2f = (C2F) A0G;
            if (A03[3].charAt(1) != 'h') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[1] = "Y2WnI7kTNoyl8yrnl5OB1Dl5fHFssRe6";
            strArr[2] = "w1APvk8HFOytJ5hAXEfuvXVYTJSuGWRL";
            Ad A00 = c2f.A00();
            if (A00 != null && c2f.A01() != null) {
                c2f.A01().onError(A00, AdError.AD_PRESENTATION_ERROR);
            }
        }
        this.A00.A0J().finish();
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void A9Q(Intent intent, Bundle bundle, C5V c5v) {
        ComponentName component = new ComponentName(AbstractC0661Ik.A04(AbstractC0661Ik.A01.get()), A00(39, 61, 48));
        Intent intent2 = new Intent();
        intent2.setComponent(component);
        String A00 = A00(26, 13, 33);
        intent2.putExtra(A00, intent.getStringExtra(A00));
        String A002 = A00(0, 26, 24);
        intent2.putExtra(A002, intent.getIntExtra(A002, -1));
        try {
            this.A01.A0E().AF1();
            C0708Kj.A08(c5v.A0J(), intent2);
        } catch (C0706Kh unused) {
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void ACW(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void ACu(boolean z10) {
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void AFT(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final String getCurrentClientToken() {
        return A00(0, 0, 108);
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        this.A01.A0E().AEe();
        if (i11 != -1) {
            C1070Yn c1070Yn = this.A01;
            String[] strArr = A03;
            if (strArr[1].charAt(10) != strArr[2].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[6] = "Lp";
            strArr2[4] = "Ys";
            c1070Yn.A0E().AEd(i11);
            A02();
            return false;
        }
        this.A00.A0J().finish();
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.MD
    public final void onDestroy() {
    }
}
