package com.instagram.common.viewpoint.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.15, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass15 extends BroadcastReceiver {
    public static byte[] A04;
    public static String[] A05 = {"Y8Z1", "Gib9", "71bezSKIJxKufdL13ppDGQvN3l", "amgHka60jBO0VGEiDWjvaQpooGEX1vUM", "ttT0jofZ4zWB5Dwx3mPNIXc", "eyh0I6c0vYFaGMFwnoeMEbyGHh2pIYmK", "GRZnv0m", "VfIH6aQ48NmkLcOtEQWPZe5uGeHooIii"};
    public C1204cU A00;
    public AnonymousClass14 A01;
    public C1045Zs A02;
    public String A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-12, -58, -46, -48, -111, -55, -60, -58, -56, -59, -46, -46, -50, -111, -60, -57, -42, -111, -47, -60, -41, -52, -39, -56, -111, -60, -57, -62, -58, -49, -52, -58, -50};
    }

    static {
        A01();
    }

    public AnonymousClass15(C1045Zs c1045Zs, String str, C1204cU c1204cU, AnonymousClass14 anonymousClass14) {
        this.A02 = c1045Zs;
        this.A03 = str;
        this.A01 = anonymousClass14;
        this.A00 = c1204cU;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(1, 32, 35) + A00(0, 1, 122) + this.A03);
        C02292o.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        C02292o.A00(this.A02).A05(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        String intentAction = A00(0, 1, 122);
        String[] split = action.split(intentAction);
        if (split.length >= 1 && (str = split[0]) != null) {
            String[] strArr = A05;
            String str2 = strArr[0];
            String intentAction2 = strArr[1];
            if (str2.length() != intentAction2.length()) {
                throw new RuntimeException();
            }
            A05[7] = "UAhxU8HTiJONxaKo3zNJYg3uL8StvHDr";
            String intentAction3 = A00(1, 32, 35);
            if (intentAction3.equals(str)) {
                AnonymousClass14 anonymousClass14 = this.A01;
                C1204cU c1204cU = this.A00;
                String[] strArr2 = A05;
                String str3 = strArr2[0];
                String intentAction4 = strArr2[1];
                if (str3.length() != intentAction4.length()) {
                    throw new RuntimeException();
                }
                A05[6] = "";
                anonymousClass14.ACn(c1204cU);
            }
        }
    }
}
