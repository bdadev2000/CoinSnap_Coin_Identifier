package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class i extends c {
    public i(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
        b(true);
        a(false);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.c
    public final boolean a_() {
        return true;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final int h() {
        return 3;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final String j() {
        if (b() == null) {
            return "";
        }
        String z10 = a().z();
        if (TextUtils.isEmpty(z10)) {
            return "";
        }
        return z10;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final q k() {
        return new z(a(), b(), this);
    }
}
