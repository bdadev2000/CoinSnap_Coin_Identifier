package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import b1.f0;
import d0.h;
import d0.i;
import java.util.Comparator;
import java.util.Map;

@StabilityInferred
/* loaded from: classes4.dex */
public final class DepthSortedSet {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15910a = false;

    /* renamed from: b, reason: collision with root package name */
    public final h f15911b = f0.s(i.f30133c, DepthSortedSet$mapOfOriginalDepth$2.f15913a);

    /* renamed from: c, reason: collision with root package name */
    public final TreeSet f15912c = new java.util.TreeSet((Comparator) new Object());

    public final void a(LayoutNode layoutNode) {
        if (!layoutNode.M()) {
            InlineClassHelperKt.b("DepthSortedSet.add called on an unattached node");
            throw null;
        }
        if (this.f15910a) {
            h hVar = this.f15911b;
            Integer num = (Integer) ((Map) hVar.getValue()).get(layoutNode);
            if (num == null) {
                ((Map) hVar.getValue()).put(layoutNode, Integer.valueOf(layoutNode.f15952n));
            } else {
                if (num.intValue() != layoutNode.f15952n) {
                    InlineClassHelperKt.b("invalid node depth");
                    throw null;
                }
            }
        }
        this.f15912c.add(layoutNode);
    }

    public final boolean b(LayoutNode layoutNode) {
        boolean contains = this.f15912c.contains(layoutNode);
        if (!this.f15910a || contains == ((Map) this.f15911b.getValue()).containsKey(layoutNode)) {
            return contains;
        }
        InlineClassHelperKt.b("inconsistency in TreeSet");
        throw null;
    }

    public final boolean c(LayoutNode layoutNode) {
        if (!layoutNode.M()) {
            InlineClassHelperKt.b("DepthSortedSet.remove called on an unattached node");
            throw null;
        }
        boolean remove = this.f15912c.remove(layoutNode);
        if (this.f15910a) {
            if (!p0.a.g((Integer) ((Map) this.f15911b.getValue()).remove(layoutNode), remove ? Integer.valueOf(layoutNode.f15952n) : null)) {
                InlineClassHelperKt.b("invalid node depth");
                throw null;
            }
        }
        return remove;
    }

    public final String toString() {
        return this.f15912c.toString();
    }
}
