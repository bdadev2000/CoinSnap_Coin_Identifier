package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g0 implements Iterator {
    public int b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4563c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f4564d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0 f4565f;

    public g0(c0 c0Var) {
        this.f4565f = c0Var;
    }

    public final Iterator a() {
        if (this.f4564d == null) {
            this.f4564d = this.f4565f.f4551d.entrySet().iterator();
        }
        return this.f4564d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i9 = this.b + 1;
        c0 c0Var = this.f4565f;
        if (i9 < c0Var.f4550c.size()) {
            return true;
        }
        if (!c0Var.f4551d.isEmpty() && a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f4563c = true;
        int i9 = this.b + 1;
        this.b = i9;
        c0 c0Var = this.f4565f;
        if (i9 < c0Var.f4550c.size()) {
            return (Map.Entry) c0Var.f4550c.get(this.b);
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f4563c) {
            this.f4563c = false;
            int i9 = c0.f4549i;
            c0 c0Var = this.f4565f;
            c0Var.b();
            if (this.b < c0Var.f4550c.size()) {
                int i10 = this.b;
                this.b = i10 - 1;
                c0Var.g(i10);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
