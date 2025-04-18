package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.xq;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class iu implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5382b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f5383c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5384d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5385f;

    public /* synthetic */ iu(long j3, Context context, String str) {
        this.f5382b = 3;
        this.f5383c = j3;
        this.f5384d = str;
        this.f5385f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Long l10;
        int i10;
        c6.l lVar;
        switch (this.f5382b) {
            case 0:
                ((ob) this.f5384d).a((Context) this.f5385f, this.f5383c);
                return;
            case 1:
                ((xl) this.f5384d).a((Thread) this.f5385f, this.f5383c);
                return;
            case 2:
                ((xq.a) this.f5384d).a(this.f5385f, this.f5383c);
                return;
            case 3:
                long j3 = this.f5383c;
                String activityName = (String) this.f5384d;
                Context appContext = (Context) this.f5385f;
                String str = c6.b.a;
                Intrinsics.checkNotNullParameter(activityName, "$activityName");
                c6.l lVar2 = c6.b.f2621f;
                if (lVar2 == null) {
                    l10 = null;
                } else {
                    l10 = lVar2.f2659b;
                }
                if (c6.b.f2621f == null) {
                    c6.b.f2621f = new c6.l(Long.valueOf(j3), null);
                    c6.m mVar = c6.m.f2664b;
                    String str2 = c6.b.f2623h;
                    Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
                    c6.m.h(activityName, str2, appContext);
                } else if (l10 != null) {
                    long longValue = j3 - l10.longValue();
                    com.facebook.internal.z zVar = com.facebook.internal.z.a;
                    com.facebook.internal.x b3 = com.facebook.internal.z.b(com.facebook.x.b());
                    if (b3 == null) {
                        i10 = 60;
                    } else {
                        i10 = b3.f11121b;
                    }
                    if (longValue > i10 * 1000) {
                        c6.m mVar2 = c6.m.f2664b;
                        c6.m.i(activityName, c6.b.f2621f, c6.b.f2623h);
                        String str3 = c6.b.f2623h;
                        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
                        c6.m.h(activityName, str3, appContext);
                        c6.b.f2621f = new c6.l(Long.valueOf(j3), null);
                    } else if (longValue > 1000 && (lVar = c6.b.f2621f) != null) {
                        lVar.f2661d++;
                    }
                }
                c6.l lVar3 = c6.b.f2621f;
                if (lVar3 != null) {
                    lVar3.f2659b = Long.valueOf(j3);
                }
                c6.l lVar4 = c6.b.f2621f;
                if (lVar4 != null) {
                    lVar4.a();
                    return;
                }
                return;
            default:
                o9.y yVar = (o9.y) ((o9.h) this.f5384d).f23203b;
                int i11 = n9.h0.a;
                s7.i0 i0Var = ((s7.f0) yVar).f24350b;
                t7.p pVar = (t7.p) i0Var.f24417r;
                t7.b P = pVar.P();
                long j10 = this.f5383c;
                Object obj = this.f5385f;
                pVar.Q(P, 26, new cv(P, j10, obj));
                if (i0Var.O == obj) {
                    i0Var.f24411l.k(26, new com.facebook.appevents.m(20));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ iu(Object obj, Object obj2, long j3, int i10) {
        this.f5382b = i10;
        this.f5384d = obj;
        this.f5385f = obj2;
        this.f5383c = j3;
    }
}
