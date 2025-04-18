package qd;

import ze.f;

/* loaded from: classes4.dex */
public final class b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final float f23893b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23894c;

    public /* synthetic */ b(float f10, float f11) {
        this.f23893b = f10;
        this.f23894c = f11;
    }

    @Override // ze.f
    public final boolean b(ze.b bVar) {
        float c10 = ze.a.a(bVar.f28749b, bVar.f28750c).c();
        float f10 = this.f23893b;
        float f11 = this.f23894c;
        if (c10 >= f10 - f11 && c10 <= f10 + f11) {
            return true;
        }
        return false;
    }
}
