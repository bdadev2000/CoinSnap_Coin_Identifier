package com.vungle.ads;

/* loaded from: classes3.dex */
public final class E0 extends h1 {
    private boolean alreadyLogged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(com.vungle.ads.internal.protos.n nVar) {
        super(nVar);
        G7.j.e(nVar, "metricType");
    }

    public final boolean alreadyMetered$vungle_ads_release() {
        if (getValueFirst() != null && getValueSecond() != null) {
            return true;
        }
        return false;
    }

    public final boolean isLogged() {
        return this.alreadyLogged;
    }

    @Override // com.vungle.ads.h1
    public void markEnd() {
        if (getValueSecond() == null) {
            super.markEnd();
        }
    }

    public final void markLogged() {
        this.alreadyLogged = true;
    }

    @Override // com.vungle.ads.h1
    public void markStart() {
        if (getValueFirst() == null) {
            super.markStart();
        }
    }
}
