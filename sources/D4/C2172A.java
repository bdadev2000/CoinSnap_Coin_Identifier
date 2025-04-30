package d4;

import java.util.NoSuchElementException;

/* renamed from: d4.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2172A extends O {
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19824c;

    public C2172A(Object obj) {
        this.f19824c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b) {
            this.b = true;
            return this.f19824c;
        }
        throw new NoSuchElementException();
    }
}
