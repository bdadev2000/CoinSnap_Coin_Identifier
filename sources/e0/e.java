package e0;

import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class e extends f implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final f f30197a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30198b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30199c;

    public e(f fVar, int i2, int i3) {
        p0.a.s(fVar, "list");
        this.f30197a = fVar;
        this.f30198b = i2;
        b bVar = f.Companion;
        int size = fVar.size();
        bVar.getClass();
        b.c(i2, i3, size);
        this.f30199c = i3 - i2;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        b bVar = f.Companion;
        int i3 = this.f30199c;
        bVar.getClass();
        b.a(i2, i3);
        return this.f30197a.get(this.f30198b + i2);
    }

    @Override // e0.a
    public final int getSize() {
        return this.f30199c;
    }
}
