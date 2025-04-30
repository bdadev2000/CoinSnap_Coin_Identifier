package d4;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class I extends AbstractC2186n {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f19835d;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f19836f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f19837g;

    public I(Object[] objArr, int i9, int i10) {
        this.f19835d = objArr;
        this.f19836f = i9;
        this.f19837g = i10;
    }

    @Override // d4.AbstractC2180h
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        C2.m.g(i9, this.f19837g);
        Object obj = this.f19835d[(i9 * 2) + this.f19836f];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19837g;
    }
}
