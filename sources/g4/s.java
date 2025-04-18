package g4;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18152b;

    /* renamed from: c, reason: collision with root package name */
    public final s4.g f18153c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f18154d;

    public /* synthetic */ s(v vVar, s4.g gVar, int i10) {
        this.f18152b = i10;
        this.f18154d = vVar;
        this.f18153c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar;
        switch (this.f18152b) {
            case 0:
                s4.h hVar = (s4.h) this.f18153c;
                hVar.f24212b.a();
                synchronized (hVar.f24213c) {
                    synchronized (this.f18154d) {
                        u uVar = this.f18154d.f18157b;
                        s4.g gVar = this.f18153c;
                        uVar.getClass();
                        if (uVar.f18156b.contains(new t(gVar, d6.g.f16895l))) {
                            v vVar = this.f18154d;
                            s4.g gVar2 = this.f18153c;
                            vVar.getClass();
                            try {
                                ((s4.h) gVar2).k(vVar.f18175v, 5);
                            } finally {
                            }
                        }
                        this.f18154d.d();
                    }
                }
                return;
            default:
                s4.h hVar2 = (s4.h) this.f18153c;
                hVar2.f24212b.a();
                synchronized (hVar2.f24213c) {
                    synchronized (this.f18154d) {
                        u uVar2 = this.f18154d.f18157b;
                        s4.g gVar3 = this.f18153c;
                        uVar2.getClass();
                        if (uVar2.f18156b.contains(new t(gVar3, d6.g.f16895l))) {
                            this.f18154d.f18177x.b();
                            v vVar2 = this.f18154d;
                            s4.g gVar4 = this.f18153c;
                            vVar2.getClass();
                            try {
                                ((s4.h) gVar4).l(vVar2.f18177x, vVar2.f18174t, vVar2.A);
                                this.f18154d.h(this.f18153c);
                            } finally {
                            }
                        }
                        this.f18154d.d();
                    }
                }
                return;
        }
    }
}
