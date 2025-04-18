package com.applovin.impl;

import java.nio.ByteBuffer;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public abstract class bk extends yj implements ll {

    /* renamed from: n */
    private final String f3908n;

    public bk(String str) {
        super(new ol[2], new pl[2]);
        this.f3908n = str;
        a(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
    }

    public static /* synthetic */ void n(bk bkVar, wg wgVar) {
        bkVar.a(wgVar);
    }

    public abstract kl a(byte[] bArr, int i10, boolean z10);

    @Override // com.applovin.impl.ll
    public void a(long j3) {
    }

    @Override // com.applovin.impl.yj
    /* renamed from: b */
    public final ml a(Throwable th2) {
        return new ml("Unexpected decode error", th2);
    }

    @Override // com.applovin.impl.yj
    /* renamed from: o */
    public final pl g() {
        return new ck(new js(this, 6));
    }

    @Override // com.applovin.impl.yj
    /* renamed from: n */
    public final ol f() {
        return new ol();
    }

    @Override // com.applovin.impl.yj
    public final ml a(ol olVar, pl plVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) a1.a(olVar.f6351c);
            plVar.a(olVar.f6353f, a(byteBuffer.array(), byteBuffer.limit(), z10), olVar.f6832j);
            plVar.c(Integer.MIN_VALUE);
            return null;
        } catch (ml e2) {
            return e2;
        }
    }
}
