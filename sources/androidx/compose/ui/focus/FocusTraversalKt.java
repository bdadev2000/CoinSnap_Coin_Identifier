package androidx.compose.ui.focus;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes2.dex */
public final class FocusTraversalKt {

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0035, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusTargetNode a(androidx.compose.ui.focus.FocusTargetNode r8) {
        /*
            androidx.compose.ui.focus.FocusStateImpl r0 = r8.f2()
            int r0 = r0.ordinal()
            if (r0 == 0) goto Lb1
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L1b
            r1 = 2
            if (r0 == r1) goto Lb1
            r8 = 3
            if (r0 != r8) goto L15
            return r2
        L15:
            d0.e r8 = new d0.e
            r8.<init>()
            throw r8
        L1b:
            androidx.compose.ui.Modifier$Node r8 = r8.f14688a
            boolean r0 = r8.f14699n
            if (r0 == 0) goto La5
            androidx.compose.runtime.collection.MutableVector r0 = new androidx.compose.runtime.collection.MutableVector
            r3 = 16
            androidx.compose.ui.Modifier$Node[] r4 = new androidx.compose.ui.Modifier.Node[r3]
            r0.<init>(r4)
            androidx.compose.ui.Modifier$Node r4 = r8.f14692g
            if (r4 != 0) goto L32
            androidx.compose.ui.node.DelegatableNodeKt.a(r0, r8)
            goto L35
        L32:
            r0.b(r4)
        L35:
            boolean r8 = r0.m()
            if (r8 == 0) goto La4
            int r8 = r0.f14144c
            int r8 = r8 - r1
            java.lang.Object r8 = r0.o(r8)
            androidx.compose.ui.Modifier$Node r8 = (androidx.compose.ui.Modifier.Node) r8
            int r4 = r8.d
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L4e
            androidx.compose.ui.node.DelegatableNodeKt.a(r0, r8)
            goto L35
        L4e:
            if (r8 == 0) goto L35
            int r4 = r8.f14690c
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La1
            r4 = r2
        L57:
            if (r8 == 0) goto L35
            boolean r5 = r8 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r5 == 0) goto L66
            androidx.compose.ui.focus.FocusTargetNode r8 = (androidx.compose.ui.focus.FocusTargetNode) r8
            androidx.compose.ui.focus.FocusTargetNode r8 = a(r8)
            if (r8 == 0) goto L9c
            return r8
        L66:
            int r5 = r8.f14690c
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L9c
            boolean r5 = r8 instanceof androidx.compose.ui.node.DelegatingNode
            if (r5 == 0) goto L9c
            r5 = r8
            androidx.compose.ui.node.DelegatingNode r5 = (androidx.compose.ui.node.DelegatingNode) r5
            androidx.compose.ui.Modifier$Node r5 = r5.f15909p
            r6 = 0
        L76:
            if (r5 == 0) goto L99
            int r7 = r5.f14690c
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L96
            int r6 = r6 + 1
            if (r6 != r1) goto L84
            r8 = r5
            goto L96
        L84:
            if (r4 != 0) goto L8d
            androidx.compose.runtime.collection.MutableVector r4 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r7 = new androidx.compose.ui.Modifier.Node[r3]
            r4.<init>(r7)
        L8d:
            if (r8 == 0) goto L93
            r4.b(r8)
            r8 = r2
        L93:
            r4.b(r5)
        L96:
            androidx.compose.ui.Modifier$Node r5 = r5.f14692g
            goto L76
        L99:
            if (r6 != r1) goto L9c
            goto L57
        L9c:
            androidx.compose.ui.Modifier$Node r8 = androidx.compose.ui.node.DelegatableNodeKt.b(r4)
            goto L57
        La1:
            androidx.compose.ui.Modifier$Node r8 = r8.f14692g
            goto L4e
        La4:
            return r2
        La5:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        Lb1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.a(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final Rect b(FocusTargetNode focusTargetNode) {
        Rect Q;
        NodeCoordinator nodeCoordinator = focusTargetNode.f14694i;
        return (nodeCoordinator == null || (Q = LayoutCoordinatesKt.c(nodeCoordinator).Q(nodeCoordinator, false)) == null) ? Rect.e : Q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x001e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.focus.FocusTargetNode c(androidx.compose.ui.focus.FocusTargetNode r8) {
        /*
            androidx.compose.ui.Modifier$Node r8 = r8.f14688a
            boolean r0 = r8.f14699n
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            if (r0 == 0) goto L9f
            androidx.compose.runtime.collection.MutableVector r0 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r2]
            r0.<init>(r3)
            androidx.compose.ui.Modifier$Node r3 = r8.f14692g
            if (r3 != 0) goto L1b
            androidx.compose.ui.node.DelegatableNodeKt.a(r0, r8)
            goto L1e
        L1b:
            r0.b(r3)
        L1e:
            boolean r8 = r0.m()
            if (r8 == 0) goto L9e
            int r8 = r0.f14144c
            r3 = 1
            int r8 = r8 - r3
            java.lang.Object r8 = r0.o(r8)
            androidx.compose.ui.Modifier$Node r8 = (androidx.compose.ui.Modifier.Node) r8
            int r4 = r8.d
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L38
            androidx.compose.ui.node.DelegatableNodeKt.a(r0, r8)
            goto L1e
        L38:
            if (r8 == 0) goto L1e
            int r4 = r8.f14690c
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L9b
            r4 = r1
        L41:
            if (r8 == 0) goto L1e
            boolean r5 = r8 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r5 == 0) goto L60
            androidx.compose.ui.focus.FocusTargetNode r8 = (androidx.compose.ui.focus.FocusTargetNode) r8
            androidx.compose.ui.Modifier$Node r5 = r8.f14688a
            boolean r5 = r5.f14699n
            if (r5 == 0) goto L96
            androidx.compose.ui.focus.FocusStateImpl r5 = r8.f2()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L5f
            if (r5 == r3) goto L5f
            r6 = 2
            if (r5 == r6) goto L5f
            goto L96
        L5f:
            return r8
        L60:
            int r5 = r8.f14690c
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L96
            boolean r5 = r8 instanceof androidx.compose.ui.node.DelegatingNode
            if (r5 == 0) goto L96
            r5 = r8
            androidx.compose.ui.node.DelegatingNode r5 = (androidx.compose.ui.node.DelegatingNode) r5
            androidx.compose.ui.Modifier$Node r5 = r5.f15909p
            r6 = 0
        L70:
            if (r5 == 0) goto L93
            int r7 = r5.f14690c
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L90
            int r6 = r6 + 1
            if (r6 != r3) goto L7e
            r8 = r5
            goto L90
        L7e:
            if (r4 != 0) goto L87
            androidx.compose.runtime.collection.MutableVector r4 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r7 = new androidx.compose.ui.Modifier.Node[r2]
            r4.<init>(r7)
        L87:
            if (r8 == 0) goto L8d
            r4.b(r8)
            r8 = r1
        L8d:
            r4.b(r5)
        L90:
            androidx.compose.ui.Modifier$Node r5 = r5.f14692g
            goto L70
        L93:
            if (r6 != r3) goto L96
            goto L41
        L96:
            androidx.compose.ui.Modifier$Node r8 = androidx.compose.ui.node.DelegatableNodeKt.b(r4)
            goto L41
        L9b:
            androidx.compose.ui.Modifier$Node r8 = r8.f14692g
            goto L38
        L9e:
            return r1
        L9f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.c(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean d(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        NodeCoordinator nodeCoordinator;
        LayoutNode layoutNode2;
        NodeCoordinator nodeCoordinator2 = focusTargetNode.f14694i;
        return (nodeCoordinator2 == null || (layoutNode = nodeCoordinator2.f16100m) == null || !layoutNode.N() || (nodeCoordinator = focusTargetNode.f14694i) == null || (layoutNode2 = nodeCoordinator.f16100m) == null || !layoutNode2.M()) ? false : true;
    }
}
