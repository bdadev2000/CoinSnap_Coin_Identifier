package com.applovin.impl;

import java.util.List;

/* loaded from: classes.dex */
public final class j7 extends ek {

    /* renamed from: o, reason: collision with root package name */
    private final k7 f24613o;

    public j7(List list) {
        super("DvbDecoder");
        bh bhVar = new bh((byte[]) list.get(0));
        this.f24613o = new k7(bhVar.C(), bhVar.C());
    }

    @Override // com.applovin.impl.ek
    public nl a(byte[] bArr, int i2, boolean z2) {
        if (z2) {
            this.f24613o.d();
        }
        return new l7(this.f24613o.a(bArr, i2));
    }
}
