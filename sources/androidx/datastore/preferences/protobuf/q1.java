package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class q1 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f1455b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1456c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f1457d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m1 f1458f;

    public q1(m1 m1Var) {
        this.f1458f = m1Var;
    }

    public final Iterator a() {
        if (this.f1457d == null) {
            this.f1457d = this.f1458f.f1437d.entrySet().iterator();
        }
        return this.f1457d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f1455b + 1;
        m1 m1Var = this.f1458f;
        if (i10 < m1Var.f1436c.size()) {
            return true;
        }
        if (!m1Var.f1437d.isEmpty() && a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f1456c = true;
        int i10 = this.f1455b + 1;
        this.f1455b = i10;
        m1 m1Var = this.f1458f;
        if (i10 < m1Var.f1436c.size()) {
            return (Map.Entry) m1Var.f1436c.get(this.f1455b);
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f1456c) {
            this.f1456c = false;
            int i10 = m1.f1434i;
            m1 m1Var = this.f1458f;
            m1Var.b();
            if (this.f1455b < m1Var.f1436c.size()) {
                int i11 = this.f1455b;
                this.f1455b = i11 - 1;
                m1Var.p(i11);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
