package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class TM extends AbstractC0832Rj {
    public final /* synthetic */ J7 A00;
    public final /* synthetic */ C0688Lv A01;
    public final /* synthetic */ QK A02;
    public final /* synthetic */ TK A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public TM(TK tk, String str, QK qk, J7 j7, Map map, C0688Lv c0688Lv) {
        this.A03 = tk;
        this.A04 = str;
        this.A02 = qk;
        this.A00 = j7;
        this.A05 = map;
        this.A01 = c0688Lv;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0832Rj
    public final void A03() {
        C0833Rk c0833Rk;
        SparseBooleanArray sparseBooleanArray;
        C0833Rk c0833Rk2;
        C1T c1t;
        C1045Zs c1045Zs;
        SparseBooleanArray sparseBooleanArray2;
        c0833Rk = this.A03.A02;
        if (!c0833Rk.A0Z() && !TextUtils.isEmpty(this.A04)) {
            sparseBooleanArray = this.A03.A08;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                J7 j7 = this.A00;
                String str = this.A04;
                O8 o8 = new O8(this.A05);
                c0833Rk2 = this.A03.A03;
                j7.AA6(str, o8.A03(c0833Rk2).A02(this.A01).A05());
                c1t = this.A03.A00;
                c1045Zs = this.A03.A09;
                C1T.A07(c1t, c1045Zs);
                sparseBooleanArray2 = this.A03.A08;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}
