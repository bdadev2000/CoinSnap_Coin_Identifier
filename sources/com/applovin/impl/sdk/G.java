package com.applovin.impl.sdk;

/* loaded from: classes.dex */
public final /* synthetic */ class G implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f10714c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10715d;

    public /* synthetic */ G(k kVar, String str, int i9) {
        this.b = i9;
        this.f10714c = kVar;
        this.f10715d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.f10714c.b(this.f10715d);
                return;
            default:
                this.f10714c.c(this.f10715d);
                return;
        }
    }
}
