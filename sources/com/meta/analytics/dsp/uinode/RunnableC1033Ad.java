package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ad, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1033Ad implements Runnable {
    public static String[] A04 = {"FXI4YPweIufH3Pt2An4AzMiMJMICZW4T", "uwvDtUMtk5NfKP9ISDY7iI5dkoZYElca", "3X9Yz5oufkrzgSJKyyhGKrZukSdK4yin", "Yyt42t4P0aykOIe72Ke5sVEmhn6MxEuH", "iz4LAshm3lVaCmxiMFM9N835TW", "enfPo4zUqzsZuoLany8d1dcV5BB2cq5H", "laUDRm8UQKJHJcnNtldnOXq4xoZsd", "Oq3t3KRhK9K1doVwJCKt6wwkK0YNCaoI"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C1038Ai A02;
    public final /* synthetic */ String A03;

    public RunnableC1033Ad(C1038Ai c1038Ai, String str, long j7, long j9) {
        this.A02 = c1038Ai;
        this.A03 = str;
        this.A01 = j7;
        this.A00 = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1039Aj interfaceC1039Aj;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC1039Aj = this.A02.A01;
            interfaceC1039Aj.AAo(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
            String[] strArr = A04;
            if (strArr[4].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A04[2] = "joW0YYt26OTJgtzaB2B3ZwKbOgOTkTMY";
        }
    }
}
