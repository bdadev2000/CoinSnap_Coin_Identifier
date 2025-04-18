package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;

@StabilityInferred
/* loaded from: classes4.dex */
public final class VectorApplier extends AbstractApplier<VNode> {
    public static GroupComponent j(VNode vNode) {
        if (vNode instanceof GroupComponent) {
            return (GroupComponent) vNode;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    @Override // androidx.compose.runtime.Applier
    public final void a(int i2, int i3, int i4) {
        GroupComponent j2 = j((VNode) this.f13671c);
        ArrayList arrayList = j2.f15287c;
        int i5 = 0;
        if (i2 > i3) {
            while (i5 < i4) {
                VNode vNode = (VNode) arrayList.get(i2);
                arrayList.remove(i2);
                arrayList.add(i3, vNode);
                i3++;
                i5++;
            }
        } else {
            while (i5 < i4) {
                VNode vNode2 = (VNode) arrayList.get(i2);
                arrayList.remove(i2);
                arrayList.add(i3 - 1, vNode2);
                i5++;
            }
        }
        j2.c();
    }

    @Override // androidx.compose.runtime.Applier
    public final void b(int i2, int i3) {
        j((VNode) this.f13671c).h(i2, i3);
    }

    @Override // androidx.compose.runtime.Applier
    public final /* bridge */ /* synthetic */ void c(int i2, Object obj) {
    }

    @Override // androidx.compose.runtime.Applier
    public final void f(int i2, Object obj) {
        j((VNode) this.f13671c).e(i2, (VNode) obj);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    public final void i() {
        GroupComponent j2 = j((VNode) this.f13669a);
        j2.h(0, j2.f15287c.size());
    }
}
