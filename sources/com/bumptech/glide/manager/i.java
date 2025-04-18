package com.bumptech.glide.manager;

import java.util.Map;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.p f9719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f9720c;

    public i(j jVar, androidx.lifecycle.p pVar) {
        this.f9720c = jVar;
        this.f9719b = pVar;
    }

    @Override // com.bumptech.glide.manager.h
    public final void onDestroy() {
        ((Map) this.f9720c.f9721b).remove(this.f9719b);
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStop() {
    }
}
