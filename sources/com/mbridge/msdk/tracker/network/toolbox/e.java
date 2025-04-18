package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.tracker.network.u;

/* loaded from: classes4.dex */
public final class e implements com.mbridge.msdk.tracker.network.c {
    @Override // com.mbridge.msdk.tracker.network.c
    public final String a(u<?> uVar) {
        String k10 = uVar.k();
        int i10 = uVar.i();
        if (i10 == 0) {
            return k10;
        }
        return Integer.toString(i10) + '-' + k10;
    }
}
