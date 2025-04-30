package com.mbridge.msdk.foundation.same.net.b;

import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.d;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes3.dex */
public abstract class a extends c<String> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15775a = "a";

    public abstract void a(String str);

    public abstract void b(String str);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.a.a aVar) {
        ad.b(f15775a, "errorCode = " + aVar.f15773a);
        a(com.mbridge.msdk.foundation.same.net.e.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(d<String> dVar) {
        if (dVar != null) {
            b(dVar.f15778c);
        }
    }
}
