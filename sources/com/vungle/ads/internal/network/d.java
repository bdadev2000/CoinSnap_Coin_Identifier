package com.vungle.ads.internal.network;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends ki.q {
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ki.k kVar) {
        super(kVar);
        this.this$0 = eVar;
    }

    @Override // ki.q, ki.k0
    public long read(ki.i sink, long j3) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            return super.read(sink, j3);
        } catch (IOException e2) {
            this.this$0.setThrownException(e2);
            throw e2;
        }
    }
}
