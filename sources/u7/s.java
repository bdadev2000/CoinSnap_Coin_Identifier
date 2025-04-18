package u7;

import java.util.HashMap;
import s7.x2;
import v8.z;

/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25639b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25640c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f25641d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f25642f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f25643g;

    public /* synthetic */ s(Object obj, int i10, long j3, long j10, int i11) {
        this.f25639b = i11;
        this.f25643g = obj;
        this.f25640c = i10;
        this.f25641d = j3;
        this.f25642f = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v8.z zVar;
        int i10 = this.f25639b;
        Object obj = this.f25643g;
        switch (i10) {
            case 0:
                final int i11 = this.f25640c;
                final long j3 = this.f25641d;
                final long j10 = this.f25642f;
                s7.f0 f0Var = (s7.f0) ((r4.c) obj).f24000d;
                int i12 = n9.h0.a;
                t7.p pVar = (t7.p) f0Var.f24350b.f24417r;
                final t7.b P = pVar.P();
                final int i13 = 0;
                pVar.Q(P, 1011, new n9.l(P, i11, j3, j10, i13) { // from class: t7.f

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f25300b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ b f25301c;

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ int f25302d;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ long f25303f;

                    {
                        this.f25300b = i13;
                    }

                    @Override // n9.l
                    public final void invoke(Object obj2) {
                        String str;
                        long longValue;
                        switch (this.f25300b) {
                            case 0:
                                ((c) obj2).getClass();
                                return;
                            default:
                                u uVar = (u) ((c) obj2);
                                uVar.getClass();
                                b bVar = this.f25301c;
                                z zVar2 = bVar.f25289d;
                                if (zVar2 != null) {
                                    r rVar = uVar.f25336b;
                                    x2 x2Var = bVar.f25287b;
                                    synchronized (rVar) {
                                        str = rVar.a(x2Var.g(zVar2.a, rVar.f25331b).f24787d, zVar2).a;
                                    }
                                    HashMap hashMap = uVar.f25342h;
                                    Long l10 = (Long) hashMap.get(str);
                                    HashMap hashMap2 = uVar.f25341g;
                                    Long l11 = (Long) hashMap2.get(str);
                                    long j11 = 0;
                                    if (l10 == null) {
                                        longValue = 0;
                                    } else {
                                        longValue = l10.longValue();
                                    }
                                    hashMap.put(str, Long.valueOf(longValue + this.f25303f));
                                    if (l11 != null) {
                                        j11 = l11.longValue();
                                    }
                                    hashMap2.put(str, Long.valueOf(j11 + this.f25302d));
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final int i14 = this.f25640c;
                final long j11 = this.f25641d;
                final long j12 = this.f25642f;
                t7.p pVar2 = (t7.p) ((m9.d) obj).f21652b;
                androidx.appcompat.widget.v vVar = pVar2.f25318f;
                if (((com.google.common.collect.r0) vVar.f1057b).isEmpty()) {
                    zVar = null;
                } else {
                    zVar = (v8.z) c6.k.p((com.google.common.collect.r0) vVar.f1057b);
                }
                final t7.b N = pVar2.N(zVar);
                final int i15 = 1;
                pVar2.Q(N, 1006, new n9.l(N, i14, j11, j12, i15) { // from class: t7.f

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f25300b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ b f25301c;

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ int f25302d;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ long f25303f;

                    {
                        this.f25300b = i15;
                    }

                    @Override // n9.l
                    public final void invoke(Object obj2) {
                        String str;
                        long longValue;
                        switch (this.f25300b) {
                            case 0:
                                ((c) obj2).getClass();
                                return;
                            default:
                                u uVar = (u) ((c) obj2);
                                uVar.getClass();
                                b bVar = this.f25301c;
                                z zVar2 = bVar.f25289d;
                                if (zVar2 != null) {
                                    r rVar = uVar.f25336b;
                                    x2 x2Var = bVar.f25287b;
                                    synchronized (rVar) {
                                        str = rVar.a(x2Var.g(zVar2.a, rVar.f25331b).f24787d, zVar2).a;
                                    }
                                    HashMap hashMap = uVar.f25342h;
                                    Long l10 = (Long) hashMap.get(str);
                                    HashMap hashMap2 = uVar.f25341g;
                                    Long l11 = (Long) hashMap2.get(str);
                                    long j112 = 0;
                                    if (l10 == null) {
                                        longValue = 0;
                                    } else {
                                        longValue = l10.longValue();
                                    }
                                    hashMap.put(str, Long.valueOf(longValue + this.f25303f));
                                    if (l11 != null) {
                                        j112 = l11.longValue();
                                    }
                                    hashMap2.put(str, Long.valueOf(j112 + this.f25302d));
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
