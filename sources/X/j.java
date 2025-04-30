package x;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class j implements Iterator, Map.Entry {
    public int b;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2913a f24080f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24079d = false;

    /* renamed from: c, reason: collision with root package name */
    public int f24078c = -1;

    public j(C2913a c2913a) {
        this.f24080f = c2913a;
        this.b = c2913a.d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.f24079d) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i9 = this.f24078c;
            C2913a c2913a = this.f24080f;
            Object b = c2913a.b(i9, 0);
            if (key != b && (key == null || !key.equals(b))) {
                return false;
            }
            Object value = entry.getValue();
            Object b8 = c2913a.b(this.f24078c, 1);
            if (value != b8 && (value == null || !value.equals(b8))) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f24079d) {
            return this.f24080f.b(this.f24078c, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f24079d) {
            return this.f24080f.b(this.f24078c, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f24078c < this.b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.f24079d) {
            int i9 = this.f24078c;
            C2913a c2913a = this.f24080f;
            int i10 = 0;
            Object b = c2913a.b(i9, 0);
            Object b8 = c2913a.b(this.f24078c, 1);
            if (b == null) {
                hashCode = 0;
            } else {
                hashCode = b.hashCode();
            }
            if (b8 != null) {
                i10 = b8.hashCode();
            }
            return hashCode ^ i10;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f24078c++;
            this.f24079d = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f24079d) {
            this.f24080f.h(this.f24078c);
            this.f24078c--;
            this.b--;
            this.f24079d = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f24079d) {
            return this.f24080f.i(this.f24078c, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
