package com.applovin.impl;

import java.util.List;

/* loaded from: classes.dex */
public final class h7 extends bk {

    /* renamed from: o, reason: collision with root package name */
    private final i7 f8074o;

    public h7(List list) {
        super("DvbDecoder");
        yg ygVar = new yg((byte[]) list.get(0));
        this.f8074o = new i7(ygVar.C(), ygVar.C());
    }

    @Override // com.applovin.impl.bk
    public kl a(byte[] bArr, int i9, boolean z8) {
        if (z8) {
            this.f8074o.d();
        }
        return new j7(this.f8074o.a(bArr, i9));
    }
}
