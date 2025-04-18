package com.instagram.common.viewpoint.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.18, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass18 extends BroadcastReceiver {
    public static String[] A03 = {"dggRIwntGnoxWZ7BDQUg45Sl6NQgoMuN", "38c9H60yn2P1pt17", "STlEyQPStERy8tSXGvH8F24LWNUxdBhq", "hCwe", "bKRxwQpiW0PmVHVfGUn2RavmyNEFkRji", "VPPe2MO9HED0sxCZzVAB8cvkabJHsXeP", "uH31h0PRXTyVkIOgrCb5PcgaQIfZ1AyX", "pPlbIWWtmQkYN3MHTwcOdVUNUzBLXTby"};
    public AbstractC1191cH A00;
    public AnonymousClass17 A01;
    public String A02;

    public AnonymousClass18(String str, AbstractC1191cH abstractC1191cH, AnonymousClass17 anonymousClass17) {
        this.A00 = abstractC1191cH;
        this.A01 = anonymousClass17;
        this.A02 = str;
    }

    public final IntentFilter A00() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(EnumC0818Qv.A06.A04(this.A02));
        intentFilter.addAction(EnumC0818Qv.A09.A04(this.A02));
        intentFilter.addAction(EnumC0818Qv.A04.A04(this.A02));
        intentFilter.addAction(EnumC0818Qv.A0A.A04(this.A02));
        intentFilter.addAction(EnumC0818Qv.A05.A04(this.A02));
        intentFilter.addAction(EnumC0818Qv.A0C.A04(this.A02));
        intentFilter.addAction(EnumC0818Qv.A0B.A04(this.A02));
        intentFilter.addAction(EnumC0818Qv.A03.A04(this.A02));
        return intentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        EnumC0818Qv enumC0818Qv = EnumC0818Qv.A06;
        String action2 = this.A02;
        if (enumC0818Qv.A04(action2).equals(action)) {
            this.A01.ADT(this.A00);
            return;
        }
        EnumC0818Qv enumC0818Qv2 = EnumC0818Qv.A09;
        String action3 = this.A02;
        if (enumC0818Qv2.A04(action3).equals(action)) {
            if (C0608Im.A1o(context)) {
                this.A01.ADU(this.A00, AdError.AD_PRESENTATION_ERROR);
                return;
            } else {
                this.A01.ADU(this.A00, AdError.INTERNAL_ERROR);
                return;
            }
        }
        EnumC0818Qv enumC0818Qv3 = EnumC0818Qv.A04;
        String action4 = this.A02;
        if (enumC0818Qv3.A04(action4).equals(action)) {
            this.A01.ADQ(this.A00);
            return;
        }
        EnumC0818Qv enumC0818Qv4 = EnumC0818Qv.A0A;
        String action5 = this.A02;
        if (enumC0818Qv4.A04(action5).equals(action)) {
            this.A01.ADS(this.A00);
            return;
        }
        EnumC0818Qv enumC0818Qv5 = EnumC0818Qv.A05;
        String action6 = this.A02;
        boolean equals = enumC0818Qv5.A04(action6).equals(action);
        if (A03[6].charAt(8) != 'X') {
            throw new RuntimeException();
        }
        A03[6] = "gVjZHTAPXXqW3paCpGTUxeCgOEd4dSxo";
        if (equals) {
            this.A01.onRewardedVideoClosed();
            return;
        }
        EnumC0818Qv enumC0818Qv6 = EnumC0818Qv.A0B;
        String action7 = this.A02;
        if (enumC0818Qv6.A04(action7).equals(action)) {
            AnonymousClass17 anonymousClass17 = this.A01;
            AbstractC1191cH abstractC1191cH = this.A00;
            String[] strArr = A03;
            if (strArr[2].charAt(25) != strArr[4].charAt(25)) {
                throw new RuntimeException();
            }
            A03[6] = "QgP7tKiwXm5h6JnagwUE7gN68w8IQRlz";
            anonymousClass17.ADO(abstractC1191cH);
            return;
        }
        EnumC0818Qv enumC0818Qv7 = EnumC0818Qv.A0C;
        String action8 = this.A02;
        if (enumC0818Qv7.A04(action8).equals(action)) {
            this.A01.ADP(this.A00);
            return;
        }
        EnumC0818Qv enumC0818Qv8 = EnumC0818Qv.A03;
        String str = this.A02;
        if (A03[0].charAt(19) != 'F') {
            A03[1] = "4VvB4uonEo2HdG2J";
            String action9 = enumC0818Qv8.A04(str);
            if (!action9.equals(action)) {
                return;
            }
        } else {
            String action10 = enumC0818Qv8.A04(str);
            if (!action10.equals(action)) {
                return;
            }
        }
        this.A01.onRewardedVideoActivityDestroyed();
    }
}
