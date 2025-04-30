package com.applovin.impl.sdk;

import com.applovin.impl.sdk.i;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f10704c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f10705d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i.a f10706f;

    public /* synthetic */ B(i iVar, k kVar, i.a aVar, int i9) {
        this.b = i9;
        this.f10704c = iVar;
        this.f10705d = kVar;
        this.f10706f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                i.c(this.f10706f, this.f10704c, this.f10705d);
                return;
            default:
                i.d(this.f10706f, this.f10704c, this.f10705d);
                return;
        }
    }
}
