package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import e0.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q0.p;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ContextualFlowItemIterator implements Iterator<Measurable>, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f3846a;

    /* renamed from: b, reason: collision with root package name */
    public final p f3847b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3848c = new ArrayList();
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public int f3849f;

    public ContextualFlowItemIterator(p pVar, int i2) {
        this.f3846a = i2;
        this.f3847b = pVar;
    }

    public final Measurable b(FlowLineInfo flowLineInfo) {
        int i2 = this.f3849f;
        ArrayList arrayList = this.f3848c;
        if (i2 < arrayList.size()) {
            Measurable measurable = (Measurable) arrayList.get(this.f3849f);
            this.f3849f++;
            return measurable;
        }
        int i3 = this.d;
        if (i3 >= this.f3846a) {
            throw new IndexOutOfBoundsException("No item returned at index call. Index: " + this.d);
        }
        List list = (List) this.f3847b.invoke(Integer.valueOf(i3), flowLineInfo);
        this.d++;
        if (list.isEmpty()) {
            float f2 = 0;
            return b(new FlowLineInfo(0, 0, f2, f2));
        }
        Measurable measurable2 = (Measurable) u.E0(list);
        arrayList.addAll(list);
        this.f3849f++;
        return measurable2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3849f < this.f3848c.size() || this.d < this.f3846a;
    }

    @Override // java.util.Iterator
    public final Measurable next() {
        float f2 = 0;
        return b(new FlowLineInfo(0, 0, f2, f2));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
