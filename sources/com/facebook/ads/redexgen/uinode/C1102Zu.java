package com.facebook.ads.redexgen.uinode;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Zu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1102Zu implements InterfaceC03193w {
    public final /* synthetic */ C0558Eg A00;
    public final /* synthetic */ C03173u A01;

    public C1102Zu(C0558Eg c0558Eg, C03173u c03173u) {
        this.A00 = c0558Eg;
        this.A01 = c03173u;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03193w
    public final Object A4W(int i10) {
        C03153s compatInfo = this.A01.A00(i10);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03193w
    public final List<Object> A5h(String str, int i10) {
        List<C03153s> A03 = this.A01.A03(str, i10);
        if (A03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = A03.size();
        for (int i11 = 0; i11 < infoCount; i11++) {
            arrayList.add(A03.get(i11).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC03193w
    public final boolean ADx(int i10, int i11, Bundle bundle) {
        return this.A01.A04(i10, i11, bundle);
    }
}
