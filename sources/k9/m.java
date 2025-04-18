package k9;

import s7.r0;
import v8.i1;

/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: b, reason: collision with root package name */
    public final int f20443b;

    /* renamed from: c, reason: collision with root package name */
    public final i1 f20444c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20445d;

    /* renamed from: f, reason: collision with root package name */
    public final r0 f20446f;

    public m(int i10, int i11, i1 i1Var) {
        this.f20443b = i10;
        this.f20444c = i1Var;
        this.f20445d = i11;
        this.f20446f = i1Var.f26166f[i11];
    }

    public abstract int a();

    public abstract boolean b(m mVar);
}
