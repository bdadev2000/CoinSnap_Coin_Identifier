package androidx.compose.ui.platform;

import android.graphics.Region;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class SemanticsUtils_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Rect f16598a = new Rect(0.0f, 0.0f, 10.0f, 10.0f);

    public static final MutableIntObjectMap a(SemanticsOwner semanticsOwner) {
        SemanticsNode a2 = semanticsOwner.a();
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.f1442a;
        MutableIntObjectMap mutableIntObjectMap2 = new MutableIntObjectMap();
        LayoutNode layoutNode = a2.f16821c;
        if (layoutNode.N() && layoutNode.M()) {
            Rect e = a2.e();
            b(new Region(Math.round(e.f14914a), Math.round(e.f14915b), Math.round(e.f14916c), Math.round(e.d)), a2, mutableIntObjectMap2, a2, new Region());
        }
        return mutableIntObjectMap2;
    }

    /* JADX WARN: Type inference failed for: r9v11, types: [androidx.compose.ui.geometry.MutableRect, java.lang.Object] */
    public static final void b(Region region, SemanticsNode semanticsNode, MutableIntObjectMap mutableIntObjectMap, SemanticsNode semanticsNode2, Region region2) {
        LayoutNode layoutNode;
        DelegatableNode c2;
        boolean N = semanticsNode2.f16821c.N();
        LayoutNode layoutNode2 = semanticsNode2.f16821c;
        boolean z2 = (N && layoutNode2.M()) ? false : true;
        boolean isEmpty = region.isEmpty();
        int i2 = semanticsNode.f16823g;
        int i3 = semanticsNode2.f16823g;
        if (!isEmpty || i3 == i2) {
            if (!z2 || semanticsNode2.e) {
                SemanticsConfiguration semanticsConfiguration = semanticsNode2.d;
                boolean z3 = semanticsConfiguration.f16816b;
                DelegatableNode delegatableNode = semanticsNode2.f16819a;
                if (z3 && (c2 = SemanticsNodeKt.c(layoutNode2)) != null) {
                    delegatableNode = c2;
                }
                Modifier.Node z02 = delegatableNode.z0();
                Object obj = semanticsConfiguration.f16815a.get(SemanticsActions.f16794b);
                if (obj == null) {
                    obj = null;
                }
                boolean z4 = obj != null;
                boolean z5 = z02.f14688a.f14699n;
                Rect rect = Rect.e;
                if (z5) {
                    if (z4) {
                        NodeCoordinator d = DelegatableNodeKt.d(z02, 8);
                        if (d.k1().f14699n) {
                            LayoutCoordinates c3 = LayoutCoordinatesKt.c(d);
                            MutableRect mutableRect = d.B;
                            MutableRect mutableRect2 = mutableRect;
                            if (mutableRect == null) {
                                ?? obj2 = new Object();
                                obj2.f14910a = 0.0f;
                                obj2.f14911b = 0.0f;
                                obj2.f14912c = 0.0f;
                                obj2.d = 0.0f;
                                d.B = obj2;
                                mutableRect2 = obj2;
                            }
                            long P0 = d.P0(d.i1());
                            mutableRect2.f14910a = -Size.d(P0);
                            mutableRect2.f14911b = -Size.b(P0);
                            mutableRect2.f14912c = Size.d(P0) + d.h0();
                            mutableRect2.d = Size.b(P0) + d.g0();
                            NodeCoordinator nodeCoordinator = d;
                            while (true) {
                                if (nodeCoordinator == c3) {
                                    rect = new Rect(mutableRect2.f14910a, mutableRect2.f14911b, mutableRect2.f14912c, mutableRect2.d);
                                    break;
                                }
                                nodeCoordinator.O1(mutableRect2, false, true);
                                if (mutableRect2.b()) {
                                    break;
                                }
                                NodeCoordinator nodeCoordinator2 = nodeCoordinator.f16104q;
                                p0.a.p(nodeCoordinator2);
                                nodeCoordinator = nodeCoordinator2;
                            }
                        }
                    } else {
                        NodeCoordinator d2 = DelegatableNodeKt.d(z02, 8);
                        rect = LayoutCoordinatesKt.c(d2).Q(d2, true);
                    }
                }
                int round = Math.round(rect.f14914a);
                int round2 = Math.round(rect.f14915b);
                int round3 = Math.round(rect.f14916c);
                int round4 = Math.round(rect.d);
                region2.set(round, round2, round3, round4);
                if (i3 == i2) {
                    i3 = -1;
                }
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (semanticsNode2.e) {
                        SemanticsNode j2 = semanticsNode2.j();
                        Rect e = (j2 == null || (layoutNode = j2.f16821c) == null || !layoutNode.N()) ? f16598a : j2.e();
                        mutableIntObjectMap.i(i3, new SemanticsNodeWithAdjustedBounds(semanticsNode2, new android.graphics.Rect(Math.round(e.f14914a), Math.round(e.f14915b), Math.round(e.f14916c), Math.round(e.d))));
                        return;
                    } else {
                        if (i3 == -1) {
                            mutableIntObjectMap.i(i3, new SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                mutableIntObjectMap.i(i3, new SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
                List h2 = SemanticsNode.h(semanticsNode2, true, 4);
                for (int size = h2.size() - 1; -1 < size; size--) {
                    b(region, semanticsNode, mutableIntObjectMap, (SemanticsNode) h2.get(size), region2);
                }
                if (d(semanticsNode2)) {
                    region.op(round, round2, round3, round4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final TextLayoutResult c(SemanticsConfiguration semanticsConfiguration) {
        q0.l lVar;
        ArrayList arrayList = new ArrayList();
        SemanticsPropertyKey semanticsPropertyKey = SemanticsActions.f16793a;
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsActions.f16793a);
        if (accessibilityAction == null || (lVar = (q0.l) accessibilityAction.f16773b) == null || !((Boolean) lVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (TextLayoutResult) arrayList.get(0);
    }

    public static final boolean d(SemanticsNode semanticsNode) {
        SemanticsConfiguration semanticsConfiguration = semanticsNode.d;
        if (!semanticsConfiguration.f16816b) {
            Set keySet = semanticsConfiguration.f16815a.keySet();
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    if (((SemanticsPropertyKey) it.next()).f16870c) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final AndroidViewHolder e(AndroidViewsHandler androidViewsHandler, int i2) {
        Object obj;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((LayoutNode) ((Map.Entry) obj).getKey()).f15942b == i2) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    public static final String f(int i2) {
        if (Role.a(i2, 0)) {
            return "android.widget.Button";
        }
        if (Role.a(i2, 1)) {
            return "android.widget.CheckBox";
        }
        if (Role.a(i2, 3)) {
            return "android.widget.RadioButton";
        }
        if (Role.a(i2, 5)) {
            return "android.widget.ImageView";
        }
        if (Role.a(i2, 6)) {
            return "android.widget.Spinner";
        }
        return null;
    }
}
