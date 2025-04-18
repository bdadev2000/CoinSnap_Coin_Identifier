package com.applovin.impl;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class ek extends bk implements ol {

    /* renamed from: n */
    private final String f23730n;

    public ek(String str) {
        super(new rl[2], new sl[2]);
        this.f23730n = str;
        a(1024);
    }

    public static /* synthetic */ void n(ek ekVar, zg zgVar) {
        ekVar.a(zgVar);
    }

    public abstract nl a(byte[] bArr, int i2, boolean z2);

    @Override // com.applovin.impl.ol
    public void a(long j2) {
    }

    @Override // com.applovin.impl.bk
    /* renamed from: b */
    public final pl a(Throwable th) {
        return new pl("Unexpected decode error", th);
    }

    @Override // com.applovin.impl.bk
    /* renamed from: o */
    public final sl g() {
        return new fk(new is(this, 7));
    }

    @Override // com.applovin.impl.bk
    /* renamed from: n */
    public final rl f() {
        return new rl();
    }

    @Override // com.applovin.impl.bk
    public final pl a(rl rlVar, sl slVar, boolean z2) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) b1.a(rlVar.f25963c);
            slVar.a(rlVar.f25964f, a(byteBuffer.array(), byteBuffer.limit(), z2), rlVar.f26344j);
            slVar.c(Integer.MIN_VALUE);
            return null;
        } catch (pl e) {
            return e;
        }
    }
}
