package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.cV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1205cV extends KY {
    public final /* synthetic */ C1204cU A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C1205cV(C1204cU c1204cU, Map map, Map map2) {
        this.A00 = c1204cU;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        C1192cI c1192cI;
        C1045Zs c1045Zs;
        C1192cI c1192cI2;
        c1192cI = this.A00.A01;
        if (!TextUtils.isEmpty(c1192cI.A6r())) {
            HashMap hashMap = new HashMap();
            Map<String, String> extraData = this.A02;
            hashMap.putAll(extraData);
            Map<String, String> extraData2 = this.A01;
            hashMap.putAll(extraData2);
            c1045Zs = this.A00.A0A;
            J7 A09 = c1045Zs.A09();
            c1192cI2 = this.A00.A01;
            A09.AAU(c1192cI2.A6r(), hashMap);
        }
    }
}
