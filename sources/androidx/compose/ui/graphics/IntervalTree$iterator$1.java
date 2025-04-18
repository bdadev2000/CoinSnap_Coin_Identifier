package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.IntervalTree;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class IntervalTree$iterator$1 implements Iterator<Interval<Object>>, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public IntervalTree.Node f14995a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public final Interval<Object> next() {
        IntervalTree.Node node;
        IntervalTree.Node node2 = this.f14995a;
        IntervalTree.Node node3 = node2.e;
        IntervalTree intervalTree = IntervalTree.this;
        if (node3 != intervalTree.f14990a) {
            node3.getClass();
            node = node3;
            while (true) {
                IntervalTree.Node node4 = node.d;
                if (node4 == IntervalTree.this.f14990a) {
                    break;
                }
                node = node4;
            }
        } else {
            IntervalTree.Node node5 = node2.f14991f;
            IntervalTree.Node node6 = node2;
            while (node5 != intervalTree.f14990a && node6 == node5.e) {
                node6 = node5;
                node5 = node5.f14991f;
            }
            node = node5;
        }
        this.f14995a = node;
        return node2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
