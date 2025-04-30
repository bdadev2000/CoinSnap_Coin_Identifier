package com.applovin.impl;

import com.applovin.impl.we;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class qk extends ak {

    /* renamed from: a, reason: collision with root package name */
    private final yg f10390a = new yg();
    private final xg b = new xg();

    /* renamed from: c, reason: collision with root package name */
    private io f10391c;

    @Override // com.applovin.impl.ak
    public we a(ze zeVar, ByteBuffer byteBuffer) {
        we.b skVar;
        io ioVar = this.f10391c;
        if (ioVar == null || zeVar.f12553j != ioVar.c()) {
            io ioVar2 = new io(zeVar.f9275f);
            this.f10391c = ioVar2;
            ioVar2.a(zeVar.f9275f - zeVar.f12553j);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f10390a.a(array, limit);
        this.b.a(array, limit);
        this.b.d(39);
        long a6 = (this.b.a(1) << 32) | this.b.a(32);
        this.b.d(20);
        int a9 = this.b.a(12);
        int a10 = this.b.a(8);
        this.f10390a.g(14);
        if (a10 != 0) {
            if (a10 != 255) {
                if (a10 != 4) {
                    if (a10 != 5) {
                        if (a10 != 6) {
                            skVar = null;
                        } else {
                            skVar = eo.a(this.f10390a, a6, this.f10391c);
                        }
                    } else {
                        skVar = rk.a(this.f10390a, a6, this.f10391c);
                    }
                } else {
                    skVar = tk.a(this.f10390a);
                }
            } else {
                skVar = vh.a(this.f10390a, a9, a6);
            }
        } else {
            skVar = new sk();
        }
        if (skVar == null) {
            return new we(new we.b[0]);
        }
        return new we(skVar);
    }
}
