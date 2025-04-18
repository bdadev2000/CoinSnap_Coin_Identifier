package com.applovin.impl;

import com.applovin.impl.bf;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class tk extends dk {

    /* renamed from: a, reason: collision with root package name */
    private final bh f27169a = new bh();

    /* renamed from: b, reason: collision with root package name */
    private final ah f27170b = new ah();

    /* renamed from: c, reason: collision with root package name */
    private ho f27171c;

    @Override // com.applovin.impl.dk
    public bf a(ef efVar, ByteBuffer byteBuffer) {
        ho hoVar = this.f27171c;
        if (hoVar == null || efVar.f23684j != hoVar.c()) {
            ho hoVar2 = new ho(efVar.f25964f);
            this.f27171c = hoVar2;
            hoVar2.a(efVar.f25964f - efVar.f23684j);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f27169a.a(array, limit);
        this.f27170b.a(array, limit);
        this.f27170b.d(39);
        long a2 = (this.f27170b.a(1) << 32) | this.f27170b.a(32);
        this.f27170b.d(20);
        int a3 = this.f27170b.a(12);
        int a4 = this.f27170b.a(8);
        this.f27169a.g(14);
        bf.b a5 = a4 != 0 ? a4 != 255 ? a4 != 4 ? a4 != 5 ? a4 != 6 ? null : Cdo.a(this.f27169a, a2, this.f27171c) : uk.a(this.f27169a, a2, this.f27171c) : wk.a(this.f27169a) : yh.a(this.f27169a, a3, a2) : new vk();
        return a5 == null ? new bf(new bf.b[0]) : new bf(a5);
    }
}
