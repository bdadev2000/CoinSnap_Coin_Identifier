package com.meta.analytics.dsp.uinode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C08090y extends BroadcastReceiver {
    public static byte[] A04;
    public InterfaceC08080x A00;
    public C1757bN A01;
    public C1636Yn A02;
    public String A03;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{103, 80, 92, 94, Ascii.GS, 85, 82, 80, 86, 81, 92, 92, 88, Ascii.GS, 82, 87, 64, Ascii.GS, 81, 82, 93, 93, 86, 65, Ascii.GS, 80, 95, 90, 80, 88, 86, 87};
    }

    public C08090y(C1636Yn c1636Yn, String str, C1757bN c1757bN, InterfaceC08080x interfaceC08080x) {
        this.A02 = c1636Yn;
        this.A03 = str;
        this.A00 = interfaceC08080x;
        this.A01 = c1757bN;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(1, 31, 80) + A00(0, 1, 62) + this.A03);
        C08512o.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        C08512o.A00(this.A02).A05(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        String intentAction = A00(0, 1, 62);
        String[] parts = action.split(intentAction);
        String str = parts[0];
        if (str == null) {
            return;
        }
        String intentAction2 = A00(1, 31, 80);
        if (intentAction2.equals(str)) {
            this.A00.AAx(this.A01);
        }
    }
}
