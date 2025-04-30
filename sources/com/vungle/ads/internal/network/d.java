package com.vungle.ads.internal.network;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class d extends w8.k {
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, w8.h hVar) {
        super(hVar);
        this.this$0 = eVar;
    }

    @Override // w8.k, w8.y
    public long read(w8.f fVar, long j7) throws IOException {
        G7.j.e(fVar, "sink");
        try {
            return super.read(fVar, j7);
        } catch (IOException e4) {
            this.this$0.setThrownException(e4);
            throw e4;
        }
    }
}
