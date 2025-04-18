package com.applovin.impl;

import com.applovin.impl.we;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class qk extends ak {
    private final yg a = new yg();

    /* renamed from: b, reason: collision with root package name */
    private final xg f7246b = new xg();

    /* renamed from: c, reason: collision with root package name */
    private io f7247c;

    @Override // com.applovin.impl.ak
    public we a(ze zeVar, ByteBuffer byteBuffer) {
        we.b skVar;
        io ioVar = this.f7247c;
        if (ioVar == null || zeVar.f9370j != ioVar.c()) {
            io ioVar2 = new io(zeVar.f6353f);
            this.f7247c = ioVar2;
            ioVar2.a(zeVar.f6353f - zeVar.f9370j);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.a.a(array, limit);
        this.f7246b.a(array, limit);
        this.f7246b.d(39);
        long a = (this.f7246b.a(1) << 32) | this.f7246b.a(32);
        this.f7246b.d(20);
        int a10 = this.f7246b.a(12);
        int a11 = this.f7246b.a(8);
        this.a.g(14);
        if (a11 != 0) {
            if (a11 != 255) {
                if (a11 != 4) {
                    if (a11 != 5) {
                        if (a11 != 6) {
                            skVar = null;
                        } else {
                            skVar = eo.a(this.a, a, this.f7247c);
                        }
                    } else {
                        skVar = rk.a(this.a, a, this.f7247c);
                    }
                } else {
                    skVar = tk.a(this.a);
                }
            } else {
                skVar = vh.a(this.a, a10, a);
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
