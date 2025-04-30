package com.mbridge.msdk.dycreator.b;

import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f14971a;
    private String b;

    public a(b bVar) {
        if (bVar != null) {
            this.f14971a = bVar.a();
            this.b = bVar.b();
        }
    }

    public final String toString() {
        return o.l(new StringBuilder("DyError{errorCode="), this.f14971a, '}');
    }

    public a(int i9, String str) {
        this.f14971a = i9;
        this.b = str;
    }
}
