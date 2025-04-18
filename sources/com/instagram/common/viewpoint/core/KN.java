package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public final class KN implements SQ {
    @Override // com.instagram.common.viewpoint.core.SQ
    public final long A5L() {
        return System.nanoTime();
    }

    @Override // com.instagram.common.viewpoint.core.SQ
    public final void AGr(Object obj, long j2) throws InterruptedException {
        obj.wait(j2);
    }
}
