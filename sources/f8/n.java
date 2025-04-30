package f8;

import java.util.List;
import t7.AbstractC2712a;
import t7.C2724m;
import u7.C2824o;

/* loaded from: classes3.dex */
public final class n implements c8.g {

    /* renamed from: a, reason: collision with root package name */
    public final C2724m f20404a;

    public n(F7.a aVar) {
        this.f20404a = AbstractC2712a.d(aVar);
    }

    @Override // c8.g
    public final String a() {
        return b().a();
    }

    public final c8.g b() {
        return (c8.g) this.f20404a.getValue();
    }

    @Override // c8.g
    public final boolean c() {
        return false;
    }

    @Override // c8.g
    public final int d(String str) {
        G7.j.e(str, "name");
        return b().d(str);
    }

    @Override // c8.g
    public final List e() {
        return C2824o.b;
    }

    @Override // c8.g
    public final int f() {
        return b().f();
    }

    @Override // c8.g
    public final String g(int i9) {
        return b().g(i9);
    }

    @Override // c8.g
    public final com.bumptech.glide.c getKind() {
        return b().getKind();
    }

    @Override // c8.g
    public final boolean h() {
        return false;
    }

    @Override // c8.g
    public final List i(int i9) {
        return b().i(i9);
    }

    @Override // c8.g
    public final c8.g j(int i9) {
        return b().j(i9);
    }

    @Override // c8.g
    public final boolean k(int i9) {
        return b().k(i9);
    }
}
