package com.applovin.impl;

import com.applovin.impl.jb;
import com.applovin.impl.o1;

/* loaded from: classes3.dex */
public final /* synthetic */ class du implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23540a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23541b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23542c;

    public /* synthetic */ du(int i2, int i3, Object obj) {
        this.f23540a = i3;
        this.f23542c = obj;
        this.f23541b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f23540a;
        int i3 = this.f23541b;
        Object obj = this.f23542c;
        switch (i2) {
            case 0:
                jb.b.b((jb.b) obj, i3);
                return;
            case 1:
                o1.a.a((o1.a) obj, i3);
                return;
            default:
                ((tb) obj).a(i3);
                return;
        }
    }
}
