package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.98, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass98 extends AbstractC0820Qx {
    public static String[] A01 = {"A0hxmHyocA20uKbzLNrX1cuoBFAzY21E", "I9xoCKjiIf8OmMJxcwGdtcNw1YuiDvi3", "dl", "8cu3hn6v04Mabo0DRb3BoKxPmV6m17RH", "M3PfsQ0uQOYBe23ut3RBur7M821ZKE4o", "dBLXd4nh7JPFvxg4r1eMmoTDEY", "dzagYupPsp4H2uhompZ2DySoLx14PfZd", "Z1qzuvaE1jq9Ec95ZFgzh3McR3fZkyWy"};
    public final /* synthetic */ QG A00;

    public AnonymousClass98(QG qg) {
        this.A00 = qg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC03808x
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0821Qy c0821Qy) {
        T7 t7;
        boolean z2;
        Handler handler;
        boolean A0D;
        boolean z3;
        Handler handler2;
        int i2;
        t7 = this.A00.A01;
        if (t7 == null) {
            return;
        }
        z2 = this.A00.A03;
        if (!z2 && c0821Qy.A00().getAction() == 0) {
            QG qg = this.A00;
            String[] strArr = A01;
            if (strArr[5].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A01[4] = "8qKCS4QoQxaUoDKBRazWJt0HJmuP0GoR";
            handler = qg.A05;
            handler.removeCallbacksAndMessages(null);
            A0D = this.A00.A0D(RE.A04);
            if (A0D) {
                this.A00.A03();
                QG qg2 = this.A00;
                if (A01[3].charAt(1) != 'x') {
                    A01[3] = "krfS0sgwBFPIM38aK2Y5K2a50FO4BQxK";
                    qg2.A06(true, false);
                } else {
                    qg2.A06(true, false);
                }
            }
            z3 = this.A00.A02;
            if (!z3) {
                return;
            }
            handler2 = this.A00.A05;
            QN qn = new QN(this);
            i2 = this.A00.A00;
            handler2.postDelayed(qn, i2);
        }
    }
}
