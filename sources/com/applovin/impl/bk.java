package com.applovin.impl;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class bk extends yj implements ll {

    /* renamed from: n */
    private final String f6888n;

    public bk(String str) {
        super(new ol[2], new pl[2]);
        this.f6888n = str;
        a(1024);
    }

    public static /* synthetic */ void n(bk bkVar, wg wgVar) {
        bkVar.a(wgVar);
    }

    public abstract kl a(byte[] bArr, int i9, boolean z8);

    @Override // com.applovin.impl.ll
    public void a(long j7) {
    }

    @Override // com.applovin.impl.yj
    /* renamed from: b */
    public final ml a(Throwable th) {
        return new ml("Unexpected decode error", th);
    }

    @Override // com.applovin.impl.yj
    /* renamed from: o */
    public final pl g() {
        return new ck(new C(this, 6));
    }

    @Override // com.applovin.impl.yj
    /* renamed from: n */
    public final ol f() {
        return new ol();
    }

    @Override // com.applovin.impl.yj
    public final ml a(ol olVar, pl plVar, boolean z8) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC0669a1.a(olVar.f9273c);
            plVar.a(olVar.f9275f, a(byteBuffer.array(), byteBuffer.limit(), z8), olVar.f9922j);
            plVar.c(Integer.MIN_VALUE);
            return null;
        } catch (ml e4) {
            return e4;
        }
    }
}
