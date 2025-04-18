package com.applovin.impl.mediation;

import com.applovin.impl.mediation.g;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25560b;

    public /* synthetic */ r(Object obj, int i2) {
        this.f25559a = i2;
        this.f25560b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f25559a;
        Object obj = this.f25560b;
        switch (i2) {
            case 0:
                ((g.d) obj).a();
                return;
            default:
                g.l((g) obj);
                return;
        }
    }
}
