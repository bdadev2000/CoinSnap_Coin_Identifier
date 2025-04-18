package n0;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class i2 {
    public final r2 a;

    /* renamed from: b, reason: collision with root package name */
    public g0.f[] f22291b;

    public i2() {
        this(new r2());
    }

    public final void a() {
        g0.f[] fVarArr = this.f22291b;
        if (fVarArr != null) {
            g0.f fVar = fVarArr[com.bumptech.glide.c.G(1)];
            g0.f fVar2 = this.f22291b[com.bumptech.glide.c.G(2)];
            r2 r2Var = this.a;
            if (fVar2 == null) {
                fVar2 = r2Var.a(2);
            }
            if (fVar == null) {
                fVar = r2Var.a(1);
            }
            g(g0.f.a(fVar, fVar2));
            g0.f fVar3 = this.f22291b[com.bumptech.glide.c.G(16)];
            if (fVar3 != null) {
                f(fVar3);
            }
            g0.f fVar4 = this.f22291b[com.bumptech.glide.c.G(32)];
            if (fVar4 != null) {
                d(fVar4);
            }
            g0.f fVar5 = this.f22291b[com.bumptech.glide.c.G(64)];
            if (fVar5 != null) {
                h(fVar5);
            }
        }
    }

    @NonNull
    public abstract r2 b();

    public void c(int i10, @NonNull g0.f fVar) {
        if (this.f22291b == null) {
            this.f22291b = new g0.f[9];
        }
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f22291b[com.bumptech.glide.c.G(i11)] = fVar;
            }
        }
    }

    public void d(@NonNull g0.f fVar) {
    }

    public abstract void e(@NonNull g0.f fVar);

    public void f(@NonNull g0.f fVar) {
    }

    public abstract void g(@NonNull g0.f fVar);

    public void h(@NonNull g0.f fVar) {
    }

    public i2(@NonNull r2 r2Var) {
        this.a = r2Var;
    }
}
