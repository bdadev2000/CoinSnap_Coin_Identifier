package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Tj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0884Tj extends KY {
    public static String[] A01 = {"M2F6Kmdpn8vR7EEN0gGYLZs2yNDQD6jF", "WcwB5s3ZH8XUWWhYRsGPhRGAgRS7F", "1wzHcE8JrY1qQrLIUCacg6", "aO9bUKC9mwcMg2oxYIu04NXSdGwnlABS", "LSvrrVaEaUYZBIls3QQGViVr8YYMo4D4", "5u9inp355EzrKn8AcN", "FOTtox4pqjzhBM", "oEWmB2dr0o0vjQMmlNYMXQ5ONfeuqOC2"};
    public final /* synthetic */ A4 A00;

    public C0884Tj(A4 a4) {
        this.A00 = a4;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        AbstractC0753Oi abstractC0753Oi;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        AbstractC0753Oi abstractC0753Oi2;
        abstractC0753Oi = this.A00.A00;
        if (abstractC0753Oi != null) {
            abstractC0753Oi2 = this.A00.A00;
            String[] strArr = A01;
            if (strArr[7].charAt(6) != strArr[0].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "bfueFeeK4pCyDd";
            strArr2[1] = "8ekS6HwfggRtR8RWj86xgWcHB7DcW";
            abstractC0753Oi2.A0y();
        }
        MQ mq = this.A00.A07;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        mq.setToolbarActionMode(closeButtonStyle);
        this.A00.A07.A06();
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(true);
    }
}
