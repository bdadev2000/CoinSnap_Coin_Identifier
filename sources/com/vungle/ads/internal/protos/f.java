package com.vungle.ads.internal.protos;

import com.google.protobuf.X2;

/* loaded from: classes3.dex */
public final class f implements X2 {
    static final X2 INSTANCE = new f();

    private f() {
    }

    @Override // com.google.protobuf.X2
    public boolean isInRange(int i9) {
        if (g.forNumber(i9) != null) {
            return true;
        }
        return false;
    }
}
