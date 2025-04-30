package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.tracker.network.u;

/* loaded from: classes3.dex */
public final class e implements com.mbridge.msdk.tracker.network.c {
    @Override // com.mbridge.msdk.tracker.network.c
    public final String a(u<?> uVar) {
        String k6 = uVar.k();
        int i9 = uVar.i();
        if (i9 == 0) {
            return k6;
        }
        return Integer.toString(i9) + '-' + k6;
    }
}
