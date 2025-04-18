package com.bumptech.glide;

import com.bumptech.glide.manager.r;

/* loaded from: classes.dex */
public final class n implements com.bumptech.glide.manager.b {
    public final r a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f9750b;

    public n(o oVar, r rVar) {
        this.f9750b = oVar;
        this.a = rVar;
    }

    @Override // com.bumptech.glide.manager.b
    public final void a(boolean z10) {
        if (z10) {
            synchronized (this.f9750b) {
                this.a.j();
            }
        }
    }
}
