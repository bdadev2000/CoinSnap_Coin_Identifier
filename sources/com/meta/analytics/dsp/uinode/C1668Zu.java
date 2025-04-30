package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Zu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1668Zu implements InterfaceC08853w {
    public final /* synthetic */ C1124Eg A00;
    public final /* synthetic */ C08833u A01;

    public C1668Zu(C1124Eg c1124Eg, C08833u c08833u) {
        this.A00 = c1124Eg;
        this.A01 = c08833u;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08853w
    public final Object A4W(int i9) {
        C08813s compatInfo = this.A01.A00(i9);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08853w
    public final List<Object> A5h(String str, int i9) {
        List<C08813s> A03 = this.A01.A03(str, i9);
        if (A03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = A03.size();
        for (int i10 = 0; i10 < infoCount; i10++) {
            arrayList.add(A03.get(i10).A0M());
        }
        return arrayList;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08853w
    public final boolean ADx(int i9, int i10, Bundle bundle) {
        return this.A01.A04(i9, i10, bundle);
    }
}
