package com.facebook.ads.redexgen.uinode;

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
    public final AbstractC0814On A07 = new AbstractC0814On() { // from class: com.facebook.ads.redexgen.X.8p
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.uinode.AbstractC04328s
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(AnonymousClass98 anonymousClass98) {
            Handler handler;
            boolean A0D;
            handler = LX.this.A05;
            handler.removeCallbacksAndMessages(null);
            A0D = LX.this.A0D(EnumC0861Qi.A05);
            if (A0D) {
                LX.this.A03();
                LX.this.A06(true, false);
            }
            LX.this.A03 = true;
        }
    };
    public final AbstractC0847Pu A06 = new AbstractC0847Pu() { // from class: com.facebook.ads.redexgen.X.8R
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.uinode.AbstractC04328s
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
        @Override // com.facebook.ads.redexgen.uinode.AbstractC04328s
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(AnonymousClass93 anonymousClass93) {
            boolean z10;
            boolean A0D;
            z10 = LX.this.A02;
            if (z10) {
                return;
            }
            A0D = LX.this.A0D(EnumC0861Qi.A05);
            if (!A0D) {
                return;
            }
            LX.this.A03();
            LX.this.A06(true, false);
        }
    };
    public final MX A0A = new C8N(this);
    public final Handler A05 = new Handler();
    public final List<InterfaceC0862Qj> A0B = new ArrayList();
    public int A00 = 2000;

    public LX(boolean z10) {
        this.A02 = z10;
    }

    public static /* synthetic */ int A00(LX lx) {
        return lx.A00;
    }

    public static /* synthetic */ Handler A01(LX lx) {
        return lx.A05;
    }

    public void A03() {
        this.A05.removeCallbacksAndMessages(null);
        Iterator<InterfaceC0862Qj> it = this.A0B.iterator();
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

    public static /* synthetic */ void A05(LX lx, boolean z10, boolean z11) {
        lx.A06(z10, z11);
    }

    public void A06(boolean z10, boolean z11) {
        for (InterfaceC0862Qj interfaceC0862Qj : this.A0B) {
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "qWrr7wKcnD6M25Nm7U3j0NNRElcnIA4d";
            interfaceC0862Qj.A3Y(z10, z11);
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

    public static /* synthetic */ boolean A0A(LX lx, EnumC0861Qi enumC0861Qi) {
        return lx.A0D(enumC0861Qi);
    }

    public static /* synthetic */ boolean A0B(LX lx, boolean z10) {
        lx.A03 = z10;
        return z10;
    }

    public static /* synthetic */ boolean A0C(LX lx, boolean z10) {
        lx.A04 = z10;
        return z10;
    }

    public boolean A0D(EnumC0861Qi enumC0861Qi) {
        Iterator<InterfaceC0862Qj> it = this.A0B.iterator();
        while (it.hasNext()) {
            if (it.next().A82() != enumC0861Qi) {
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

    public final void A0H(int i10) {
        this.A00 = i10;
    }

    public final void A0I(InterfaceC0862Qj interfaceC0862Qj) {
        this.A0B.add(interfaceC0862Qj);
    }

    public final boolean A0J() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.QN
    public final void A9R(SA sa2) {
        this.A01 = sa2;
        sa2.getEventBus().A03(this.A07, this.A0A, this.A08, this.A09, this.A06);
    }

    @Override // com.facebook.ads.redexgen.uinode.QN
    public final void AGl(SA sa2) {
        A03();
        sa2.getEventBus().A04(this.A06, this.A0A, this.A08, this.A09, this.A07);
        this.A01 = null;
    }
}
