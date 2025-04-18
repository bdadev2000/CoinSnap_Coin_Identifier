package pe;

import com.google.android.gms.tasks.Task;
import he.o;
import he.w;

/* loaded from: classes4.dex */
public final class j extends e {

    /* renamed from: f, reason: collision with root package name */
    public f f23631f;

    /* renamed from: g, reason: collision with root package name */
    public f f23632g;

    /* renamed from: h, reason: collision with root package name */
    public int f23633h;

    public j(hb.d dVar) {
        super(dVar);
        f fVar = f.OFF;
        this.f23631f = fVar;
        this.f23632g = fVar;
        this.f23633h = 0;
    }

    public final Task d(f fVar, f fVar2, boolean z10, w wVar) {
        boolean z11;
        String str;
        int i10 = this.f23633h + 1;
        this.f23633h = i10;
        this.f23632g = fVar2;
        if (fVar2.f23619b >= fVar.f23619b) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z12 = !z11;
        if (z12) {
            str = fVar.name() + " << " + fVar2.name();
        } else {
            str = fVar.name() + " >> " + fVar2.name();
        }
        return b(0L, str, new h(this, fVar, str, fVar2, wVar, z12), z10).addOnCompleteListener(new g(this, i10));
    }

    public final void e(String str, f fVar, Runnable runnable) {
        b(0L, str, new o(1, this, new i(this, fVar, runnable, 0)), true);
    }
}
