package com.vungle.ads.internal.network;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import wh.g0;
import wh.s0;

/* loaded from: classes4.dex */
public final class q extends s0 {
    final /* synthetic */ ki.i $output;
    final /* synthetic */ s0 $requestBody;

    public q(s0 s0Var, ki.i iVar) {
        this.$requestBody = s0Var;
        this.$output = iVar;
    }

    @Override // wh.s0
    public long contentLength() {
        return this.$output.f20994c;
    }

    @Override // wh.s0
    public g0 contentType() {
        return this.$requestBody.contentType();
    }

    @Override // wh.s0
    public void writeTo(ki.j sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.E(this.$output.r());
    }
}
