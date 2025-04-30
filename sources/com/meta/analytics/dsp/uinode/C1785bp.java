package com.meta.analytics.dsp.uinode;

import java.io.File;

/* renamed from: com.facebook.ads.redexgen.X.bp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1785bp implements AnonymousClass03<File> {
    @Override // com.meta.analytics.dsp.uinode.AnonymousClass03
    public final AnonymousClass02<File> A3M(File file, C0L c0l) {
        if (file.exists()) {
            return new AnonymousClass02<>(true, file);
        }
        return new AnonymousClass02<>(false, null);
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass03
    public final void A4U(File file, C0L c0l) {
    }
}
