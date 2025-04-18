package com.applovin.impl;

import android.util.Pair;
import com.applovin.impl.xd;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class fw implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4815b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IOException f4816c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f4817d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4818f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4819g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4820h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4821i;

    public /* synthetic */ fw(Object obj, Object obj2, Object obj3, Object obj4, IOException iOException, boolean z10, int i10) {
        this.f4815b = i10;
        this.f4818f = obj;
        this.f4819g = obj2;
        this.f4820h = obj3;
        this.f4821i = obj4;
        this.f4816c = iOException;
        this.f4817d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f4815b;
        Object obj = this.f4821i;
        Object obj2 = this.f4820h;
        Object obj3 = this.f4819g;
        Object obj4 = this.f4818f;
        switch (i10) {
            case 0:
                ((xd.a) obj4).a((xd) obj3, (ic) obj2, (pd) obj, this.f4816c, this.f4817d);
                return;
            case 1:
                Pair pair = (Pair) obj3;
                IOException iOException = this.f4816c;
                boolean z10 = this.f4817d;
                t7.a aVar = ((s7.w1) ((r4.c) obj4).f24000d).f24828h;
                int intValue = ((Integer) pair.first).intValue();
                v8.z zVar = (v8.z) pair.second;
                t7.p pVar = (t7.p) aVar;
                pVar.m(intValue, zVar, (v8.p) obj2, (v8.u) obj, iOException, z10);
                return;
            default:
                f0.c cVar = (f0.c) obj4;
                IOException iOException2 = this.f4816c;
                boolean z11 = this.f4817d;
                ((v8.d0) obj3).m(cVar.f17515b, (v8.z) cVar.f17516c, (v8.p) obj2, (v8.u) obj, iOException2, z11);
                return;
        }
    }
}
