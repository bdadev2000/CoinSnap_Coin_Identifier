package com.applovin.impl;

import com.applovin.impl.q1;
import com.applovin.impl.wq;

/* loaded from: classes2.dex */
public final /* synthetic */ class su implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26984b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26985c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f26986f;

    public /* synthetic */ su(Object obj, String str, long j2, long j3, int i2) {
        this.f26983a = i2;
        this.f26986f = obj;
        this.f26984b = str;
        this.f26985c = j2;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f26983a;
        Object obj = this.f26986f;
        switch (i2) {
            case 0:
                ((q1.a) obj).b(this.f26984b, this.f26985c, this.d);
                return;
            default:
                ((wq.a) obj).b(this.f26984b, this.f26985c, this.d);
                return;
        }
    }
}
