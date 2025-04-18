package com.applovin.impl.sdk;

import com.applovin.impl.sdk.i;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f7629c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f7630d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i.a f7631f;

    public /* synthetic */ b0(i iVar, k kVar, i.a aVar, int i10) {
        this.f7628b = i10;
        this.f7629c = iVar;
        this.f7630d = kVar;
        this.f7631f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7628b;
        i iVar = this.f7629c;
        i.a aVar = this.f7631f;
        k kVar = this.f7630d;
        switch (i10) {
            case 0:
                i.c(aVar, iVar, kVar);
                return;
            default:
                i.a(aVar, iVar, kVar);
                return;
        }
    }
}
