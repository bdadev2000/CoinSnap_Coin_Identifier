package com.vungle.ads.internal.network;

import i8.G;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class q extends G {
    final /* synthetic */ w8.f $output;
    final /* synthetic */ G $requestBody;

    public q(G g9, w8.f fVar) {
        this.$requestBody = g9;
        this.$output = fVar;
    }

    @Override // i8.G
    public long contentLength() {
        return this.$output.f24014c;
    }

    @Override // i8.G
    public i8.x contentType() {
        return this.$requestBody.contentType();
    }

    @Override // i8.G
    public void writeTo(w8.g gVar) throws IOException {
        G7.j.e(gVar, "sink");
        gVar.A(this.$output.i());
    }
}
