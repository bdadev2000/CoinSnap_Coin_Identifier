package com.instagram.common.viewpoint.core;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class TC implements InterfaceC0808Ql {
    public final C1045Zs A00;
    public final J7 A01;
    public final C0805Qi A02;
    public final T7 A03;
    public final String A06;
    public final AbstractC0852Sd A05 = new AbstractC0852Sd() { // from class: com.facebook.ads.redexgen.X.9W
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC03808x
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C9P c9p) {
            C1045Zs c1045Zs;
            c1045Zs = TC.this.A00;
            c1045Zs.A0E().AG3();
            TC.this.A06();
        }
    };
    public final AbstractC0858Sj A04 = new AbstractC0858Sj() { // from class: com.facebook.ads.redexgen.X.9V
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.AbstractC03808x
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C9R c9r) {
            C1045Zs c1045Zs;
            c1045Zs = TC.this.A00;
            c1045Zs.A0E().AG1();
            TC.this.A06();
        }
    };

    public TC(C1045Zs c1045Zs, J7 j7, T7 t7, String str, C0863So c0863So, Map<String, String> extraParams) {
        this.A00 = c1045Zs;
        this.A01 = j7;
        this.A06 = str;
        this.A03 = t7;
        this.A02 = new C0805Qi(t7, str, extraParams);
        if (C0608Im.A21(this.A00)) {
            this.A00.A0E().AFy();
            c0863So.A0l(this);
        } else {
            this.A00.A0E().AFz();
            this.A03.getEventBus().A03(this.A05, this.A04);
        }
    }

    public final void A05() {
        TD td = new TD(this);
        if (this.A03.A0m()) {
            ExecutorC0690Lx.A00(td);
        } else {
            this.A03.getStateHandler().post(td);
        }
    }

    public final synchronized void A06() {
        this.A01.AAR(this.A06, this.A02.A05());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0808Ql
    public final void ACZ() {
        this.A00.A0E().AG2();
        A06();
    }
}
