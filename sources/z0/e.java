package z0;

import e0.u;
import java.util.Iterator;
import java.util.regex.Matcher;

/* loaded from: classes3.dex */
public final class e extends e0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f31471a;

    public e(f fVar) {
        this.f31471a = fVar;
    }

    public final d b(int i2) {
        f fVar = this.f31471a;
        Matcher matcher = fVar.f31472a;
        w0.g F0 = p0.a.F0(matcher.start(i2), matcher.end(i2));
        if (Integer.valueOf(F0.f31406a).intValue() < 0) {
            return null;
        }
        String group = fVar.f31472a.group(i2);
        p0.a.r(group, "group(...)");
        return new d(group, F0);
    }

    @Override // e0.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof d)) {
            return super.contains((d) obj);
        }
        return false;
    }

    @Override // e0.a
    public final int getSize() {
        return this.f31471a.f31472a.groupCount() + 1;
    }

    @Override // e0.a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return y0.m.P(u.z0(new w0.e(0, size() - 1, 1)), new i.i(this, 3)).iterator();
    }
}
