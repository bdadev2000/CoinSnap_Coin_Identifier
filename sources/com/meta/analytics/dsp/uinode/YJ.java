package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class YJ implements InterfaceC09888i {
    public final /* synthetic */ String[] A00;

    public YJ(String[] strArr) {
        this.A00 = strArr;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC09888i
    public final boolean A2a(String str) {
        for (String str2 : this.A00) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }
}
