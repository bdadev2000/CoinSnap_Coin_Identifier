package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ws, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0970Ws implements InterfaceC0570Gz {
    public long A00;
    public boolean A01;
    public final InterfaceC0568Gx A02;
    public final InterfaceC0570Gz A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final long AEE(H3 h3) throws IOException {
        this.A00 = this.A03.AEE(h3);
        if (this.A00 == 0) {
            return 0L;
        }
        if (h3.A02 == -1 && this.A00 != -1) {
            h3 = new H3(h3.A04, h3.A01, h3.A03, this.A00, h3.A05, h3.A00);
        }
        this.A01 = true;
        this.A02.AEG(h3);
        return this.A00;
    }

    public C0970Ws(InterfaceC0570Gz interfaceC0570Gz, InterfaceC0568Gx interfaceC0568Gx) {
        this.A03 = (InterfaceC0570Gz) AbstractC0576Hf.A01(interfaceC0570Gz);
        this.A02 = (InterfaceC0568Gx) AbstractC0576Hf.A01(interfaceC0568Gx);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final Uri A8c() {
        return this.A03.A8c();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final void close() throws IOException {
        try {
            this.A03.close();
        } finally {
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.A03.read(bArr, i2, i3);
        if (read > 0) {
            this.A02.write(bArr, i2, read);
            if (this.A00 != -1) {
                this.A00 -= read;
            }
        }
        return read;
    }
}
