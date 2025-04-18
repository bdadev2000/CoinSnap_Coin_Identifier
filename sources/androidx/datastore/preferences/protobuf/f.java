package androidx.datastore.preferences.protobuf;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: b, reason: collision with root package name */
    public int f1366b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f1367c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f1368d;

    public f(k kVar) {
        this.f1368d = kVar;
        this.f1367c = kVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1366b < this.f1367c;
    }

    @Override // androidx.datastore.preferences.protobuf.g
    public final byte nextByte() {
        int i10 = this.f1366b;
        if (i10 < this.f1367c) {
            this.f1366b = i10 + 1;
            return this.f1368d.e(i10);
        }
        throw new NoSuchElementException();
    }
}
