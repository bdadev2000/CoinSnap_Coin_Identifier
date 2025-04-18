package androidx.collection;

import java.util.Iterator;
import kotlin.jvm.internal.e;
import r0.a;
import y0.k;

/* loaded from: classes3.dex */
public final class MutableScatterSet$MutableSetWrapper$iterator$1 implements Iterator<Object>, a {

    /* renamed from: a, reason: collision with root package name */
    public int f1528a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final k f1529b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableScatterSet f1530c;

    public MutableScatterSet$MutableSetWrapper$iterator$1(MutableScatterSet mutableScatterSet) {
        this.f1530c = mutableScatterSet;
        this.f1529b = e.u(new MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(mutableScatterSet, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1529b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f1529b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i2 = this.f1528a;
        if (i2 != -1) {
            this.f1530c.l(i2);
            this.f1528a = -1;
        }
    }
}
