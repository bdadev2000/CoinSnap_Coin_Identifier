package com.applovin.impl;

import com.applovin.impl.p1;
import com.applovin.impl.xq;

/* loaded from: classes.dex */
public final /* synthetic */ class su implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8091c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f8092d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f8093f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8094g;

    public /* synthetic */ su(Object obj, String str, long j3, long j10, int i10) {
        this.f8090b = i10;
        this.f8094g = obj;
        this.f8091c = str;
        this.f8092d = j3;
        this.f8093f = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8090b;
        Object obj = this.f8094g;
        switch (i10) {
            case 0:
                ((p1.a) obj).b(this.f8091c, this.f8092d, this.f8093f);
                return;
            case 1:
                ((xq.a) obj).b(this.f8091c, this.f8092d, this.f8093f);
                return;
            case 2:
                final String str = this.f8091c;
                final long j3 = this.f8092d;
                final long j10 = this.f8093f;
                s7.f0 f0Var = (s7.f0) ((r4.c) obj).f24000d;
                int i11 = n9.h0.a;
                t7.p pVar = (t7.p) f0Var.f24350b.f24417r;
                final t7.b P = pVar.P();
                final int i12 = 1;
                pVar.Q(P, 1008, new n9.l(P, str, j10, j3, i12) { // from class: t7.j

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f25307b;

                    {
                        this.f25307b = i12;
                    }

                    @Override // n9.l
                    public final void invoke(Object obj2) {
                        switch (this.f25307b) {
                            case 0:
                                ((c) obj2).getClass();
                                return;
                            default:
                                ((c) obj2).getClass();
                                return;
                        }
                    }
                });
                return;
            default:
                final String str2 = this.f8091c;
                final long j11 = this.f8092d;
                final long j12 = this.f8093f;
                o9.y yVar = (o9.y) ((o9.h) obj).f23203b;
                int i13 = n9.h0.a;
                t7.p pVar2 = (t7.p) ((s7.f0) yVar).f24350b.f24417r;
                final t7.b P2 = pVar2.P();
                final int i14 = 0;
                pVar2.Q(P2, 1016, new n9.l(P2, str2, j12, j11, i14) { // from class: t7.j

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f25307b;

                    {
                        this.f25307b = i14;
                    }

                    @Override // n9.l
                    public final void invoke(Object obj2) {
                        switch (this.f25307b) {
                            case 0:
                                ((c) obj2).getClass();
                                return;
                            default:
                                ((c) obj2).getClass();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
