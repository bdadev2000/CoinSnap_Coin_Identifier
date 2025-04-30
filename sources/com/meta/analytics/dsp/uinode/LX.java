package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class LX implements QN {
    public static String[] A0C = {"ua4Z1F3Vn1tdURaP0tTj5Z", "VlqKJtfjGqtNso0qX2A6lmnvOZsZ2xTE", "1pb0xsuTqC4ySw1JjiCpjHk6a0KK", "HW9a8amQa56v9usqS4J3KzzxMBRp7oUY", "lzg290ZQq0ECc78zj7A2Pt", "9JBQniCNh78hbF6UnJo6", "DIRAqcjzgSQz4x9q8OrEXdtc6Zce0V5V", "FPN1H6gS7aT4O5CCkRk249I"};
    public SA A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AbstractC1380On A07 = new AbstractC1380On() { // from class: com.facebook.ads.redexgen.X.8p
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(AnonymousClass98 anonymousClass98) {
            Handler handler;
            boolean A0D;
            handler = LX.this.A05;
            handler.removeCallbacksAndMessages(null);
            A0D = LX.this.A0D(EnumC1427Qi.A05);
            if (A0D) {
                LX.this.A03();
                LX.this.A06(true, false);
            }
            LX.this.A03 = true;
        }
    };
    public final AbstractC1413Pu A06 = new AbstractC1413Pu() { // from class: com.facebook.ads.redexgen.X.8R
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C9H c9h) {
            LX.this.A03();
            LX.this.A06(false, false);
            LX.this.A03 = true;
        }
    };
    public final O7 A08 = new C8P(this);
    public final NQ A09 = new NQ() { // from class: com.facebook.ads.redexgen.X.8O
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(AnonymousClass93 anonymousClass93) {
            boolean z8;
            boolean A0D;
            z8 = LX.this.A02;
            if (z8) {
                return;
            }
            A0D = LX.this.A0D(EnumC1427Qi.A05);
            if (!A0D) {
                return;
            }
            LX.this.A03();
            LX.this.A06(true, false);
        }
    };
    public final MX A0A = new C8N(this);
    public final Handler A05 = new Handler();
    public final List<InterfaceC1428Qj> A0B = new ArrayList();
    public int A00 = 2000;

    public LX(boolean z8) {
        this.A02 = z8;
    }

    public static /* synthetic */ int A00(LX lx) {
        return lx.A00;
    }

    public static /* synthetic */ Handler A01(LX lx) {
        return lx.A05;
    }

    public void A03() {
        this.A05.removeCallbacksAndMessages(null);
        Iterator<InterfaceC1428Qj> it = this.A0B.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "SzC94btdcN1119JNHgRanzsWdfoutew0";
            if (hasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    public static /* synthetic */ void A04(LX lx) {
        lx.A03();
    }

    public static /* synthetic */ void A05(LX lx, boolean z8, boolean z9) {
        lx.A06(z8, z9);
    }

    public void A06(boolean z8, boolean z9) {
        for (InterfaceC1428Qj interfaceC1428Qj : this.A0B) {
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "qWrr7wKcnD6M25Nm7U3j0NNRElcnIA4d";
            interfaceC1428Qj.A3Y(z8, z9);
        }
    }

    public static /* synthetic */ boolean A07(LX lx) {
        return lx.A03;
    }

    public static /* synthetic */ boolean A08(LX lx) {
        return lx.A02;
    }

    public static /* synthetic */ boolean A09(LX lx) {
        return lx.A04;
    }

    public static /* synthetic */ boolean A0A(LX lx, EnumC1427Qi enumC1427Qi) {
        return lx.A0D(enumC1427Qi);
    }

    public static /* synthetic */ boolean A0B(LX lx, boolean z8) {
        lx.A03 = z8;
        return z8;
    }

    public static /* synthetic */ boolean A0C(LX lx, boolean z8) {
        lx.A04 = z8;
        return z8;
    }

    public boolean A0D(EnumC1427Qi enumC1427Qi) {
        Iterator<InterfaceC1428Qj> it = this.A0B.iterator();
        while (it.hasNext()) {
            if (it.next().A82() != enumC1427Qi) {
                return false;
            }
        }
        return true;
    }

    public final void A0E() {
        this.A0B.clear();
    }

    public final void A0F() {
        if (this.A02) {
            this.A05.removeCallbacksAndMessages(null);
            this.A02 = false;
        }
    }

    public final void A0G() {
        this.A04 = true;
        this.A03 = true;
        A06(false, false);
    }

    public final void A0H(int i9) {
        this.A00 = i9;
    }

    public final void A0I(InterfaceC1428Qj interfaceC1428Qj) {
        this.A0B.add(interfaceC1428Qj);
    }

    public final boolean A0J() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.QN
    public final void A9R(SA sa) {
        this.A01 = sa;
        sa.getEventBus().A03(this.A07, this.A0A, this.A08, this.A09, this.A06);
    }

    @Override // com.meta.analytics.dsp.uinode.QN
    public final void AGl(SA sa) {
        A03();
        sa.getEventBus().A04(this.A06, this.A0A, this.A08, this.A09, this.A07);
        this.A01 = null;
    }
}
