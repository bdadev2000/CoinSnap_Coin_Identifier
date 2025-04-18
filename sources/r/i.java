package r;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i implements Iterator, Map.Entry {

    /* renamed from: b, reason: collision with root package name */
    public int f23944b;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k.d f23947f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23946d = false;

    /* renamed from: c, reason: collision with root package name */
    public int f23945c = -1;

    public i(k.d dVar) {
        this.f23947f = dVar;
        this.f23944b = dVar.f() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this.f23946d) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i10 = this.f23945c;
            k.d dVar = this.f23947f;
            Object d10 = dVar.d(i10, 0);
            if (key != d10 && (key == null || !key.equals(d10))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return false;
            }
            Object value = entry.getValue();
            Object d11 = dVar.d(this.f23945c, 1);
            if (value != d11 && (value == null || !value.equals(d11))) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f23946d) {
            return this.f23947f.d(this.f23945c, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f23946d) {
            return this.f23947f.d(this.f23945c, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23945c < this.f23944b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.f23946d) {
            int i10 = this.f23945c;
            k.d dVar = this.f23947f;
            int i11 = 0;
            Object d10 = dVar.d(i10, 0);
            Object d11 = dVar.d(this.f23945c, 1);
            if (d10 == null) {
                hashCode = 0;
            } else {
                hashCode = d10.hashCode();
            }
            if (d11 != null) {
                i11 = d11.hashCode();
            }
            return hashCode ^ i11;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f23945c++;
            this.f23946d = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f23946d) {
            this.f23947f.j(this.f23945c);
            this.f23945c--;
            this.f23944b--;
            this.f23946d = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f23946d) {
            return this.f23947f.k(this.f23945c, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
