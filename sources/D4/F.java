package d4;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class F extends AbstractC2186n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G f19828d;

    public F(G g9) {
        this.f19828d = g9;
    }

    @Override // d4.AbstractC2180h
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        G g9 = this.f19828d;
        C2.m.g(i9, g9.f19832i);
        int i10 = i9 * 2;
        int i11 = g9.f19831h;
        Object[] objArr = g9.f19830g;
        Object obj = objArr[i10 + i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + (i11 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19828d.f19832i;
    }
}
