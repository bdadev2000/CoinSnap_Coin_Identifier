package androidx.compose.ui.semantics;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import e0.u;
import e0.w;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Http2Connection;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes2.dex */
public final class SemanticsNode {

    /* renamed from: a */
    public final Modifier.Node f16819a;

    /* renamed from: b */
    public final boolean f16820b;

    /* renamed from: c */
    public final LayoutNode f16821c;
    public final SemanticsConfiguration d;
    public boolean e;

    /* renamed from: f */
    public SemanticsNode f16822f;

    /* renamed from: g */
    public final int f16823g;

    public SemanticsNode(Modifier.Node node, boolean z2, LayoutNode layoutNode, SemanticsConfiguration semanticsConfiguration) {
        this.f16819a = node;
        this.f16820b = z2;
        this.f16821c = layoutNode;
        this.d = semanticsConfiguration;
        this.f16823g = layoutNode.f15942b;
    }

    public static /* synthetic */ List h(SemanticsNode semanticsNode, boolean z2, int i2) {
        boolean z3 = (i2 & 1) != 0 ? !semanticsNode.f16820b : false;
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return semanticsNode.g(z3, z2, false);
    }

    public final SemanticsNode a(Role role, l lVar) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.f16816b = false;
        semanticsConfiguration.f16817c = false;
        lVar.invoke(semanticsConfiguration);
        SemanticsNode semanticsNode = new SemanticsNode(new SemanticsNode$fakeSemanticsNode$fakeNode$1(lVar), false, new LayoutNode(true, this.f16823g + (role != null ? Http2Connection.DEGRADED_PONG_TIMEOUT_NS : 2000000000)), semanticsConfiguration);
        semanticsNode.e = true;
        semanticsNode.f16822f = this;
        return semanticsNode;
    }

    public final void b(LayoutNode layoutNode, ArrayList arrayList, boolean z2) {
        MutableVector D = layoutNode.D();
        int i2 = D.f14144c;
        if (i2 > 0) {
            Object[] objArr = D.f14142a;
            int i3 = 0;
            do {
                LayoutNode layoutNode2 = (LayoutNode) objArr[i3];
                if (layoutNode2.M() && (z2 || !layoutNode2.L)) {
                    if (layoutNode2.B.d(8)) {
                        arrayList.add(SemanticsNodeKt.a(layoutNode2, this.f16820b));
                    } else {
                        b(layoutNode2, arrayList, z2);
                    }
                }
                i3++;
            } while (i3 < i2);
        }
    }

    public final NodeCoordinator c() {
        if (this.e) {
            SemanticsNode j2 = j();
            if (j2 != null) {
                return j2.c();
            }
            return null;
        }
        DelegatableNode c2 = SemanticsNodeKt.c(this.f16821c);
        if (c2 == null) {
            c2 = this.f16819a;
        }
        return DelegatableNodeKt.d(c2, 8);
    }

    public final void d(List list) {
        List o2 = o(false, false);
        int size = o2.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode = (SemanticsNode) o2.get(i2);
            if (semanticsNode.l()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.d.f16817c) {
                semanticsNode.d(list);
            }
        }
    }

    public final Rect e() {
        Rect Q;
        NodeCoordinator c2 = c();
        if (c2 != null) {
            if (!c2.k1().f14699n) {
                c2 = null;
            }
            if (c2 != null && (Q = LayoutCoordinatesKt.c(c2).Q(c2, true)) != null) {
                return Q;
            }
        }
        return Rect.e;
    }

    public final Rect f() {
        NodeCoordinator c2 = c();
        if (c2 != null) {
            if (!c2.k1().f14699n) {
                c2 = null;
            }
            if (c2 != null) {
                return LayoutCoordinatesKt.b(c2);
            }
        }
        return Rect.e;
    }

    public final List g(boolean z2, boolean z3, boolean z4) {
        if (!z2 && this.d.f16817c) {
            return w.f30218a;
        }
        if (!l()) {
            return o(z3, z4);
        }
        ArrayList arrayList = new ArrayList();
        d(arrayList);
        return arrayList;
    }

    public final SemanticsConfiguration i() {
        boolean l2 = l();
        SemanticsConfiguration semanticsConfiguration = this.d;
        if (!l2) {
            return semanticsConfiguration;
        }
        semanticsConfiguration.getClass();
        SemanticsConfiguration semanticsConfiguration2 = new SemanticsConfiguration();
        semanticsConfiguration2.f16816b = semanticsConfiguration.f16816b;
        semanticsConfiguration2.f16817c = semanticsConfiguration.f16817c;
        semanticsConfiguration2.f16815a.putAll(semanticsConfiguration.f16815a);
        n(semanticsConfiguration2);
        return semanticsConfiguration2;
    }

    public final SemanticsNode j() {
        SemanticsNode semanticsNode = this.f16822f;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        LayoutNode layoutNode = this.f16821c;
        boolean z2 = this.f16820b;
        LayoutNode b2 = z2 ? SemanticsNodeKt.b(layoutNode, SemanticsNode$parent$1.f16828a) : null;
        if (b2 == null) {
            b2 = SemanticsNodeKt.b(layoutNode, SemanticsNode$parent$2.f16829a);
        }
        if (b2 == null) {
            return null;
        }
        return SemanticsNodeKt.a(b2, z2);
    }

    public final List k() {
        return h(this, true, 4);
    }

    public final boolean l() {
        return this.f16820b && this.d.f16816b;
    }

    public final boolean m() {
        if (!this.e && k().isEmpty()) {
            if (SemanticsNodeKt.b(this.f16821c, SemanticsNode$isUnmergedLeafNode$1.f16827a) == null) {
                return true;
            }
        }
        return false;
    }

    public final void n(SemanticsConfiguration semanticsConfiguration) {
        if (this.d.f16817c) {
            return;
        }
        List o2 = o(false, false);
        int size = o2.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode = (SemanticsNode) o2.get(i2);
            if (!semanticsNode.l()) {
                for (Map.Entry entry : semanticsNode.d.f16815a.entrySet()) {
                    SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) entry.getKey();
                    Object value = entry.getValue();
                    LinkedHashMap linkedHashMap = semanticsConfiguration.f16815a;
                    Object obj = linkedHashMap.get(semanticsPropertyKey);
                    a.q(semanticsPropertyKey, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                    Object invoke = semanticsPropertyKey.f16869b.invoke(obj, value);
                    if (invoke != null) {
                        linkedHashMap.put(semanticsPropertyKey, invoke);
                    }
                }
                semanticsNode.n(semanticsConfiguration);
            }
        }
    }

    public final List o(boolean z2, boolean z3) {
        if (this.e) {
            return w.f30218a;
        }
        ArrayList arrayList = new ArrayList();
        b(this.f16821c, arrayList, z3);
        if (z2) {
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16849t;
            SemanticsConfiguration semanticsConfiguration = this.d;
            Role role = (Role) SemanticsConfigurationKt.a(semanticsConfiguration, semanticsPropertyKey);
            if (role != null && semanticsConfiguration.f16816b && (!arrayList.isEmpty())) {
                arrayList.add(a(role, new SemanticsNode$emitFakeNodes$fakeNode$1(role)));
            }
            SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.f16833b;
            LinkedHashMap linkedHashMap = semanticsConfiguration.f16815a;
            if (linkedHashMap.containsKey(semanticsPropertyKey2) && (!arrayList.isEmpty()) && semanticsConfiguration.f16816b) {
                Object obj = linkedHashMap.get(semanticsPropertyKey2);
                if (obj == null) {
                    obj = null;
                }
                List list = (List) obj;
                String str = list != null ? (String) u.F0(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new SemanticsNode$emitFakeNodes$fakeNode$2(str)));
                }
            }
        }
        return arrayList;
    }
}
