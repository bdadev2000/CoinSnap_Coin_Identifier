package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class VX extends AbstractC02854t {
    public static String[] A01 = {"LeWmJ2AEMrGR8tgfwsG9m8UwM76zwmUz", "6Bm", "ck2sw", "Oj1Ntvfg6dck0NxJmQASjzaKZXVqT4Sf", "CtYf7ZmPdO", "plI1JnuA", "RZR4g54lk6KTwqItkRA6ECctcTUw", "cGd5igXf7vOVCpmuGQi5cRxrBgQCM2pW"};
    public final /* synthetic */ C02583r A00;

    public VX(C02583r c02583r) {
        this.A00 = c02583r;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02854t
    public final void A0L(FL fl, int i2) {
        int A23;
        MY my;
        super.A0L(fl, i2);
        C1107at linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager != null && (A23 = linearLayoutManager.A23()) >= 0) {
            C02583r c02583r = this.A00;
            int scrollPosition = A01[3].charAt(13);
            if (scrollPosition == 48) {
                throw new RuntimeException();
            }
            A01[5] = "JmqJ93Os7fwoNBdh";
            if (c02583r.getAdapter() == null || A23 >= this.A00.getAdapter().A0E() || (my = (MY) fl.A1F(A23)) == null) {
                return;
            }
            my.AGH();
        }
    }
}
