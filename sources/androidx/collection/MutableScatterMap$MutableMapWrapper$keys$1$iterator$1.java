package androidx.collection;

import java.util.Iterator;
import kotlin.jvm.internal.e;
import r0.a;
import y0.k;

/* loaded from: classes3.dex */
public final class MutableScatterMap$MutableMapWrapper$keys$1$iterator$1 implements Iterator<Object>, a {

    /* renamed from: a, reason: collision with root package name */
    public final k f1504a;

    /* renamed from: b, reason: collision with root package name */
    public int f1505b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableScatterMap f1506c;

    public MutableScatterMap$MutableMapWrapper$keys$1$iterator$1(MutableScatterMap mutableScatterMap) {
        this.f1506c = mutableScatterMap;
        this.f1504a = e.u(new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(mutableScatterMap, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1504a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int intValue = ((Number) this.f1504a.next()).intValue();
        this.f1505b = intValue;
        return this.f1506c.f1558b[intValue];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i2 = this.f1505b;
        if (i2 >= 0) {
            this.f1506c.j(i2);
            this.f1505b = -1;
        }
    }
}
