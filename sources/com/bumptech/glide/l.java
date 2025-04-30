package com.bumptech.glide;

import c2.InterfaceC0590a;
import c2.p;

/* loaded from: classes.dex */
public final class l implements InterfaceC0590a {

    /* renamed from: a, reason: collision with root package name */
    public final p f12846a;
    public final /* synthetic */ m b;

    public l(m mVar, p pVar) {
        this.b = mVar;
        this.f12846a = pVar;
    }

    @Override // c2.InterfaceC0590a
    public final void a(boolean z8) {
        if (z8) {
            synchronized (this.b) {
                this.f12846a.d();
            }
        }
    }
}
