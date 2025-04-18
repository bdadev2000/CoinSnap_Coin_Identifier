package com.applovin.impl.sdk;

import com.applovin.impl.u9;
import com.applovin.impl.v9;

/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26588c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c0(Object obj, boolean z2, long j2, int i2) {
        this.f26586a = i2;
        this.d = obj;
        this.f26587b = z2;
        this.f26588c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f26586a;
        long j2 = this.f26588c;
        boolean z2 = this.f26587b;
        Object obj = this.d;
        switch (i2) {
            case 0:
                q.b((q) obj, z2, j2);
                return;
            case 1:
                ((u9) obj).b(z2, j2);
                return;
            default:
                ((v9) obj).b(z2, j2);
                return;
        }
    }
}
