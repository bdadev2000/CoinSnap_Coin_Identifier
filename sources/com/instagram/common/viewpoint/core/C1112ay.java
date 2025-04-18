package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ay, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1112ay implements InterfaceC02653z {
    public final /* synthetic */ FV A00;
    public final /* synthetic */ C02613u A01;

    public C1112ay(FV fv, C02613u c02613u) {
        this.A00 = fv;
        this.A01 = c02613u;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02653z
    public final Object A4s(int i2) {
        C02593s compatInfo = this.A01.A00(i2);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02653z
    public final List<Object> A63(String str, int i2) {
        List<C02593s> A03 = this.A01.A03(str, i2);
        if (A03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = A03.size();
        for (int i3 = 0; i3 < infoCount; i3++) {
            arrayList.add(A03.get(i3).A0M());
        }
        return arrayList;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02653z
    public final Object A64(int i2) {
        C02593s compatInfo = this.A01.A01(i2);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC02653z
    public final boolean AEQ(int i2, int i3, Bundle bundle) {
        return this.A01.A04(i2, i3, bundle);
    }
}
