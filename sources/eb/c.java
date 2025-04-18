package eb;

import y7.q;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f17267c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f17268d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f17269f;

    public /* synthetic */ c(e eVar, Runnable runnable, q qVar, int i10) {
        this.f17266b = i10;
        this.f17267c = eVar;
        this.f17268d = runnable;
        this.f17269f = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f17266b;
        final q qVar = this.f17269f;
        final Runnable runnable = this.f17268d;
        e eVar = this.f17267c;
        switch (i10) {
            case 0:
                eVar.getClass();
                final int i11 = 0;
                eVar.f17273b.execute(new Runnable() { // from class: eb.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i12 = i11;
                        q qVar2 = qVar;
                        Runnable runnable2 = runnable;
                        switch (i12) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    g gVar = (g) qVar2.f27991b;
                                    int i13 = g.f17275k;
                                    gVar.i(e2);
                                    throw e2;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    g gVar2 = (g) qVar2.f27991b;
                                    int i14 = g.f17275k;
                                    gVar2.h(null);
                                    return;
                                } catch (Exception e10) {
                                    g gVar3 = (g) qVar2.f27991b;
                                    int i15 = g.f17275k;
                                    gVar3.i(e10);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    g gVar4 = (g) qVar2.f27991b;
                                    int i16 = g.f17275k;
                                    gVar4.i(e11);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                eVar.getClass();
                final int i12 = 2;
                eVar.f17273b.execute(new Runnable() { // from class: eb.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i122 = i12;
                        q qVar2 = qVar;
                        Runnable runnable2 = runnable;
                        switch (i122) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    g gVar = (g) qVar2.f27991b;
                                    int i13 = g.f17275k;
                                    gVar.i(e2);
                                    throw e2;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    g gVar2 = (g) qVar2.f27991b;
                                    int i14 = g.f17275k;
                                    gVar2.h(null);
                                    return;
                                } catch (Exception e10) {
                                    g gVar3 = (g) qVar2.f27991b;
                                    int i15 = g.f17275k;
                                    gVar3.i(e10);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    g gVar4 = (g) qVar2.f27991b;
                                    int i16 = g.f17275k;
                                    gVar4.i(e11);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                eVar.getClass();
                final int i13 = 1;
                eVar.f17273b.execute(new Runnable() { // from class: eb.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i122 = i13;
                        q qVar2 = qVar;
                        Runnable runnable2 = runnable;
                        switch (i122) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    g gVar = (g) qVar2.f27991b;
                                    int i132 = g.f17275k;
                                    gVar.i(e2);
                                    throw e2;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    g gVar2 = (g) qVar2.f27991b;
                                    int i14 = g.f17275k;
                                    gVar2.h(null);
                                    return;
                                } catch (Exception e10) {
                                    g gVar3 = (g) qVar2.f27991b;
                                    int i15 = g.f17275k;
                                    gVar3.i(e10);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    g gVar4 = (g) qVar2.f27991b;
                                    int i16 = g.f17275k;
                                    gVar4.i(e11);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
