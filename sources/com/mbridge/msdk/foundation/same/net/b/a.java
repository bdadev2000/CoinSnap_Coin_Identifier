package com.mbridge.msdk.foundation.same.net.b;

import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.d;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public abstract class a extends c<String> {
    private static final String a = "a";

    public abstract void a(String str);

    public abstract void b(String str);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.a.a aVar) {
        ad.b(a, "errorCode = " + aVar.a);
        a(com.mbridge.msdk.foundation.same.net.e.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(d<String> dVar) {
        if (dVar != null) {
            b(dVar.f13367c);
        }
    }
}
