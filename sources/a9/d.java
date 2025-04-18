package a9;

import java.util.ArrayDeque;
import v8.u0;

/* loaded from: classes3.dex */
public final class d extends m {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f384h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f385i;

    public /* synthetic */ d(i iVar, int i10) {
        this.f384h = i10;
        this.f385i = iVar;
    }

    @Override // w7.j
    public final void e() {
        boolean z10;
        boolean z11 = true;
        switch (this.f384h) {
            case 0:
                ArrayDeque arrayDeque = ((f) this.f385i).f389c;
                if (arrayDeque.size() < 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u0.m(z10);
                u0.d(true ^ arrayDeque.contains(this));
                this.f26867c = 0;
                this.f404f = null;
                arrayDeque.addFirst(this);
                return;
            default:
                g gVar = (g) this.f385i;
                synchronized (gVar.f392b) {
                    this.f26867c = 0;
                    this.f404f = null;
                    int i10 = gVar.f398h;
                    gVar.f398h = i10 + 1;
                    gVar.f396f[i10] = this;
                    if (gVar.f393c.isEmpty() || gVar.f398h <= 0) {
                        z11 = false;
                    }
                    if (z11) {
                        gVar.f392b.notify();
                    }
                }
                return;
        }
    }
}
