package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.wq;
import com.facebook.appevents.internal.ActivityLifecycleTracker;

/* loaded from: classes3.dex */
public final /* synthetic */ class aw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22966b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22967c;
    public final /* synthetic */ Object d;

    public /* synthetic */ aw(long j2, String str, Context context) {
        this.f22965a = 3;
        this.f22966b = j2;
        this.f22967c = str;
        this.d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f22965a;
        long j2 = this.f22966b;
        Object obj = this.d;
        Object obj2 = this.f22967c;
        switch (i2) {
            case 0:
                tb.e((tb) obj2, (Context) obj, j2);
                return;
            case 1:
                wq.a.c((wq.a) obj2, obj, j2);
                return;
            case 2:
                yl.a((yl) obj2, (Thread) obj, j2);
                return;
            default:
                ActivityLifecycleTracker.b(j2, (String) obj2, (Context) obj);
                return;
        }
    }

    public /* synthetic */ aw(Object obj, Object obj2, long j2, int i2) {
        this.f22965a = i2;
        this.f22967c = obj;
        this.d = obj2;
        this.f22966b = j2;
    }
}
