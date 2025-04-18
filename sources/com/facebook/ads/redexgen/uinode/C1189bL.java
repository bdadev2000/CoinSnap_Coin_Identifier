package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1189bL extends KT {
    public final /* synthetic */ C1188bK A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C1189bL(C1188bK c1188bK, Map map, Map map2) {
        this.A00 = c1188bK;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        AnonymousClass14 anonymousClass14;
        C1070Yn c1070Yn;
        AnonymousClass14 anonymousClass142;
        anonymousClass14 = this.A00.A01;
        if (!TextUtils.isEmpty(anonymousClass14.A0Y())) {
            HashMap hashMap = new HashMap();
            Map<String, String> extraData = this.A02;
            hashMap.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            hashMap.putAll(extraData2);
            c1070Yn = this.A00.A0A;
            J2 A09 = c1070Yn.A09();
            anonymousClass142 = this.A00.A01;
            A09.AA4(anonymousClass142.A0Y(), hashMap);
        }
    }
}
