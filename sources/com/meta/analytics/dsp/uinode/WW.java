package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: assets/audience_network.dex */
public abstract class WW implements InterfaceC1134Eq {
    public static String[] A05 = {MBridgeConstans.API_REUQEST_CATEGORY_APP, "A1R5XmGNdue", "Xf2fF", "2MZr802CwBgh98iwI2LX9r8AFH0stAP", "PWtCslqWMOhLlWMecFeGOSMcL", "Nab9jbcw8W2RSLeSFi8qaY40Uhnm56i", "UlYKNWRAV2IAyBS", "QHLbHyQnMMy3J3Z"};
    public Y6 A00;
    public AH A01;
    public Object A02;
    public final ArrayList<InterfaceC1133Ep> A04 = new ArrayList<>(1);
    public final F1 A03 = new F1();

    public abstract void A02();

    public abstract void A03(Y6 y6, boolean z8);

    public final F1 A00(C1132Eo c1132Eo) {
        return this.A03.A02(0, c1132Eo, 0L);
    }

    public final void A01(AH ah, Object obj) {
        this.A01 = ah;
        this.A02 = obj;
        Iterator<InterfaceC1133Ep> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().ADA(this, ah, obj);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1134Eq
    public final void A3O(Handler handler, F4 f42) {
        this.A03.A07(handler, f42);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1134Eq
    public final void AE7(Y6 y6, boolean z8, InterfaceC1133Ep interfaceC1133Ep) {
        Y6 y62 = this.A00;
        AbstractC1192Ha.A03(y62 == null || y62 == y6);
        this.A04.add(interfaceC1133Ep);
        if (this.A00 == null) {
            this.A00 = y6;
            A03(y6, z8);
        } else {
            AH ah = this.A01;
            if (ah == null) {
                return;
            }
            interfaceC1133Ep.ADA(this, ah, this.A02);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1134Eq
    public final void AEb(InterfaceC1133Ep interfaceC1133Ep) {
        this.A04.remove(interfaceC1133Ep);
        if (this.A04.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            if (A05[2].length() == 23) {
                throw new RuntimeException();
            }
            A05[2] = "TEgrTEJPhaeJK53iaQZF";
            this.A02 = null;
            A02();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1134Eq
    public final void AF7(F4 f42) {
        this.A03.A0D(f42);
    }
}
