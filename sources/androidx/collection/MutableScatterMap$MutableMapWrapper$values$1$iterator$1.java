package androidx.collection;

import java.util.Iterator;
import kotlin.jvm.internal.e;
import r0.a;
import y0.k;

/* loaded from: classes2.dex */
public final class MutableScatterMap$MutableMapWrapper$values$1$iterator$1 implements Iterator<Object>, a {

    /* renamed from: a, reason: collision with root package name */
    public final k f1516a;

    /* renamed from: b, reason: collision with root package name */
    public int f1517b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableScatterMap f1518c;

    public MutableScatterMap$MutableMapWrapper$values$1$iterator$1(MutableScatterMap mutableScatterMap) {
        this.f1518c = mutableScatterMap;
        this.f1516a = e.u(new MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1(mutableScatterMap, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1516a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int intValue = ((Number) this.f1516a.next()).intValue();
        this.f1517b = intValue;
        return this.f1518c.f1559c[intValue];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i2 = this.f1517b;
        if (i2 >= 0) {
            this.f1518c.j(i2);
            this.f1517b = -1;
        }
    }
}
