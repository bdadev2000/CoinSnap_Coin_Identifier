package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class e extends b {
    private final s b;

    public e(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
        this.b = new s(a(), b(), this);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final int h() {
        return 3;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final String j() {
        if (a() == null || TextUtils.isEmpty(a().z())) {
            return "";
        }
        return a().z();
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final q k() {
        return this.b;
    }
}
