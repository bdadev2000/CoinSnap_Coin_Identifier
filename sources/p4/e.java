package p4;

import k.C2426o;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f22232c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f22233d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2426o f22234f;

    public /* synthetic */ e(f fVar, Runnable runnable, C2426o c2426o, int i9) {
        this.b = i9;
        this.f22232c = fVar;
        this.f22233d = runnable;
        this.f22234f = c2426o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                f fVar = this.f22232c;
                fVar.getClass();
                final Runnable runnable = this.f22233d;
                final C2426o c2426o = this.f22234f;
                final int i9 = 0;
                fVar.b.execute(new Runnable() { // from class: p4.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e4) {
                                    ((h) c2426o.f21320c).i(e4);
                                    throw e4;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e9) {
                                    ((h) c2426o.f21320c).i(e9);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                C2426o c2426o2 = c2426o;
                                try {
                                    runnable2.run();
                                    ((h) c2426o2.f21320c).h(null);
                                    return;
                                } catch (Exception e10) {
                                    ((h) c2426o2.f21320c).i(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                f fVar2 = this.f22232c;
                fVar2.getClass();
                final Runnable runnable2 = this.f22233d;
                final C2426o c2426o2 = this.f22234f;
                final int i10 = 2;
                fVar2.b.execute(new Runnable() { // from class: p4.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e4) {
                                    ((h) c2426o2.f21320c).i(e4);
                                    throw e4;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e9) {
                                    ((h) c2426o2.f21320c).i(e9);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                C2426o c2426o22 = c2426o2;
                                try {
                                    runnable22.run();
                                    ((h) c2426o22.f21320c).h(null);
                                    return;
                                } catch (Exception e10) {
                                    ((h) c2426o22.f21320c).i(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                f fVar3 = this.f22232c;
                fVar3.getClass();
                final Runnable runnable3 = this.f22233d;
                final C2426o c2426o3 = this.f22234f;
                final int i11 = 1;
                fVar3.b.execute(new Runnable() { // from class: p4.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e4) {
                                    ((h) c2426o3.f21320c).i(e4);
                                    throw e4;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e9) {
                                    ((h) c2426o3.f21320c).i(e9);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                C2426o c2426o22 = c2426o3;
                                try {
                                    runnable22.run();
                                    ((h) c2426o22.f21320c).h(null);
                                    return;
                                } catch (Exception e10) {
                                    ((h) c2426o22.f21320c).i(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
