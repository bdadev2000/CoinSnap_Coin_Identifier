package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class VI extends AbstractC0832Rj {
    public static String[] A01 = {"M3Te92XvVv4q3bfKEkaCq6oPQP87x4vv", "LzmiiHhJsyKuUkJv7K1Ir2o", "KopJ75", "b4r1pmUHtrvrrbICXjY", "ceBgm8EiRhrot5ffXZtZ35omPt2ZFFf0", "0EayevzsZQe4lRY4RLfa4MEWre", "N9h8Vj", "K1Ob6mZ8MwS9WZtXZ80XEzEALvtTcRJ2"};
    public final /* synthetic */ C0705Mm A00;

    public VI(C0705Mm c0705Mm) {
        this.A00 = c0705Mm;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0832Rj
    public final void A03() {
        AbstractC0699Mg abstractC0699Mg;
        C0833Rk c0833Rk;
        C0688Lv c0688Lv;
        WeakReference weakReference;
        C0833Rk c0833Rk2;
        C0688Lv c0688Lv2;
        AbstractC0699Mg abstractC0699Mg2;
        C0833Rk c0833Rk3;
        abstractC0699Mg = this.A00.A07;
        if (abstractC0699Mg != null) {
            abstractC0699Mg2 = this.A00.A07;
            if (!abstractC0699Mg2.A0D()) {
                c0833Rk3 = this.A00.A09;
                c0833Rk3.A0T();
                return;
            }
        }
        c0833Rk = this.A00.A09;
        c0833Rk.A0V();
        c0688Lv = this.A00.A05;
        if (!c0688Lv.A07()) {
            c0688Lv2 = this.A00.A05;
            c0688Lv2.A05();
        }
        weakReference = this.A00.A0B;
        InterfaceC0704Ml listener = (InterfaceC0704Ml) weakReference.get();
        if (listener != null) {
            listener.ACA();
        }
        C0705Mm c0705Mm = this.A00;
        String[] strArr = A01;
        if (strArr[1].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "2rS8p9kEkH8XxeBlGl7RSlB";
        strArr2[3] = "nqXy6qNf0NylKakjBUJ";
        c0833Rk2 = c0705Mm.A09;
        c0833Rk2.A0V();
    }
}
