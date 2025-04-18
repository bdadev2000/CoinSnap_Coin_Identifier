package l1;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class i implements Iterable, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31042a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f31043b;

    public /* synthetic */ i(f fVar, int i2) {
        this.f31042a = i2;
        this.f31043b = fVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i2 = this.f31042a;
        f fVar = this.f31043b;
        switch (i2) {
            case 0:
                return new h(fVar, 0);
            default:
                return new h(fVar, 1);
        }
    }
}
