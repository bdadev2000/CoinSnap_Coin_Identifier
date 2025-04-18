package t7;

import s7.r0;
import s7.x2;
import v8.z;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements n9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f25297c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v8.u f25298d;

    public /* synthetic */ d(b bVar, v8.u uVar, int i10) {
        this.f25296b = i10;
        this.f25297c = bVar;
        this.f25298d = uVar;
    }

    @Override // n9.l
    public final void invoke(Object obj) {
        String str;
        switch (this.f25296b) {
            case 0:
                u uVar = (u) ((c) obj);
                uVar.getClass();
                b bVar = this.f25297c;
                if (bVar.f25289d != null) {
                    v8.u uVar2 = this.f25298d;
                    r0 r0Var = uVar2.f26291c;
                    r0Var.getClass();
                    r rVar = uVar.f25336b;
                    z zVar = bVar.f25289d;
                    zVar.getClass();
                    x2 x2Var = bVar.f25287b;
                    synchronized (rVar) {
                        str = rVar.a(x2Var.g(zVar.a, rVar.f25331b).f24787d, zVar).a;
                    }
                    f0.c cVar = new f0.c(r0Var, uVar2.f26292d, str);
                    int i10 = uVar2.f26290b;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    uVar.f25351q = cVar;
                                    return;
                                }
                                return;
                            }
                        } else {
                            uVar.f25350p = cVar;
                            return;
                        }
                    }
                    uVar.f25349o = cVar;
                    return;
                }
                return;
            default:
                ((c) obj).getClass();
                return;
        }
    }
}
