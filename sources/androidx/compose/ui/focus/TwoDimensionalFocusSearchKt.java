package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import p0.a;
import q0.l;

/* loaded from: classes3.dex */
public final class TwoDimensionalFocusSearchKt {

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if (androidx.compose.ui.focus.FocusDirection.a(r19, 3) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (androidx.compose.ui.focus.FocusDirection.a(r19, 4) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (androidx.compose.ui.focus.FocusDirection.a(r19, 3) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        r1 = r0 - r17.f14916c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        r1 = java.lang.Math.max(0.0f, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if (androidx.compose.ui.focus.FocusDirection.a(r19, 3) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        r0 = r0 - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
    
        if (r1 >= java.lang.Math.max(1.0f, r0)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (androidx.compose.ui.focus.FocusDirection.a(r19, 4) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        r0 = r2 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (androidx.compose.ui.focus.FocusDirection.a(r19, 5) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        r0 = r5 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        if (androidx.compose.ui.focus.FocusDirection.a(r19, 6) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        r0 = r13 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (androidx.compose.ui.focus.FocusDirection.a(r19, 4) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        r1 = r17.f14914a - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (androidx.compose.ui.focus.FocusDirection.a(r19, 5) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        r1 = r5 - r17.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        if (androidx.compose.ui.focus.FocusDirection.a(r19, 6) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        r1 = r17.f14915b - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x003f, code lost:
    
        if (r7 <= r14) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004a, code lost:
    
        if (r5 >= r13) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0055, code lost:
    
        if (r15 <= r12) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r0 >= r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00be, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(androidx.compose.ui.geometry.Rect r16, androidx.compose.ui.geometry.Rect r17, androidx.compose.ui.geometry.Rect r18, int r19) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.a(androidx.compose.ui.geometry.Rect, androidx.compose.ui.geometry.Rect, androidx.compose.ui.geometry.Rect, int):boolean");
    }

    public static final boolean b(int i2, Rect rect, Rect rect2) {
        if (FocusDirection.a(i2, 3) || FocusDirection.a(i2, 4)) {
            if (rect.d <= rect2.f14915b || rect.f14915b >= rect2.d) {
                return false;
            }
        } else {
            if (!FocusDirection.a(i2, 5) && !FocusDirection.a(i2, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (rect.f14916c <= rect2.f14914a || rect.f14914a >= rect2.f14916c) {
                return false;
            }
        }
        return true;
    }

    public static final void c(DelegatableNode delegatableNode, MutableVector mutableVector) {
        if (!delegatableNode.z0().f14699n) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16]);
        Modifier.Node node = delegatableNode.z0().f14692g;
        if (node == null) {
            DelegatableNodeKt.a(mutableVector2, delegatableNode.z0());
        } else {
            mutableVector2.b(node);
        }
        while (mutableVector2.m()) {
            Modifier.Node node2 = (Modifier.Node) mutableVector2.o(mutableVector2.f14144c - 1);
            if ((node2.d & 1024) == 0) {
                DelegatableNodeKt.a(mutableVector2, node2);
            } else {
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.f14690c & 1024) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node2 != null) {
                            if (node2 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode = (FocusTargetNode) node2;
                                if (focusTargetNode.f14699n && !DelegatableNodeKt.f(focusTargetNode).L) {
                                    if (focusTargetNode.e2().f14859a) {
                                        mutableVector.b(focusTargetNode);
                                    } else {
                                        c(focusTargetNode, mutableVector);
                                    }
                                }
                            } else if ((node2.f14690c & 1024) != 0 && (node2 instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node node3 = ((DelegatingNode) node2).f15909p; node3 != null; node3 = node3.f14692g) {
                                    if ((node3.f14690c & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node2 = node3;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16]);
                                            }
                                            if (node2 != null) {
                                                mutableVector3.b(node2);
                                                node2 = null;
                                            }
                                            mutableVector3.b(node3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node2 = DelegatableNodeKt.b(mutableVector3);
                        }
                    } else {
                        node2 = node2.f14692g;
                    }
                }
            }
        }
    }

    public static final FocusTargetNode d(MutableVector mutableVector, Rect rect, int i2) {
        Rect l2;
        if (FocusDirection.a(i2, 3)) {
            l2 = rect.l(rect.h() + 1, 0.0f);
        } else if (FocusDirection.a(i2, 4)) {
            l2 = rect.l(-(rect.h() + 1), 0.0f);
        } else if (FocusDirection.a(i2, 5)) {
            l2 = rect.l(0.0f, rect.e() + 1);
        } else {
            if (!FocusDirection.a(i2, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            l2 = rect.l(0.0f, -(rect.e() + 1));
        }
        int i3 = mutableVector.f14144c;
        FocusTargetNode focusTargetNode = null;
        if (i3 > 0) {
            Object[] objArr = mutableVector.f14142a;
            int i4 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i4];
                if (FocusTraversalKt.d(focusTargetNode2)) {
                    Rect b2 = FocusTraversalKt.b(focusTargetNode2);
                    if (g(i2, b2, rect) && (!g(i2, l2, rect) || a(rect, b2, l2, i2) || (!a(rect, l2, b2, i2) && h(i2, rect, b2) < h(i2, rect, l2)))) {
                        focusTargetNode = focusTargetNode2;
                        l2 = b2;
                    }
                }
                i4++;
            } while (i4 < i3);
        }
        return focusTargetNode;
    }

    public static final boolean e(FocusTargetNode focusTargetNode, int i2, l lVar) {
        Rect rect;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16]);
        c(focusTargetNode, mutableVector);
        if (mutableVector.f14144c <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (mutableVector.l() ? null : mutableVector.f14142a[0]);
            if (focusTargetNode2 != null) {
                return ((Boolean) lVar.invoke(focusTargetNode2)).booleanValue();
            }
            return false;
        }
        if (FocusDirection.a(i2, 7)) {
            i2 = 4;
        }
        if (FocusDirection.a(i2, 4) || FocusDirection.a(i2, 6)) {
            Rect b2 = FocusTraversalKt.b(focusTargetNode);
            float f2 = b2.f14915b;
            float f3 = b2.f14914a;
            rect = new Rect(f3, f2, f3, f2);
        } else {
            if (!FocusDirection.a(i2, 3) && !FocusDirection.a(i2, 5)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            Rect b3 = FocusTraversalKt.b(focusTargetNode);
            float f4 = b3.d;
            float f5 = b3.f14916c;
            rect = new Rect(f5, f4, f5, f4);
        }
        FocusTargetNode d = d(mutableVector, rect, i2);
        if (d != null) {
            return ((Boolean) lVar.invoke(d)).booleanValue();
        }
        return false;
    }

    public static final boolean f(int i2, FocusTargetNode focusTargetNode, Rect rect, l lVar) {
        if (i(i2, focusTargetNode, rect, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.a(focusTargetNode, i2, new TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(i2, focusTargetNode, rect, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean g(int i2, Rect rect, Rect rect2) {
        boolean a2 = FocusDirection.a(i2, 3);
        float f2 = rect.f14914a;
        float f3 = rect.f14916c;
        if (a2) {
            float f4 = rect2.f14916c;
            float f5 = rect2.f14914a;
            if ((f4 <= f3 && f5 < f3) || f5 <= f2) {
                return false;
            }
        } else if (FocusDirection.a(i2, 4)) {
            float f6 = rect2.f14914a;
            float f7 = rect2.f14916c;
            if ((f6 >= f2 && f7 > f2) || f7 >= f3) {
                return false;
            }
        } else {
            boolean a3 = FocusDirection.a(i2, 5);
            float f8 = rect.f14915b;
            float f9 = rect.d;
            if (a3) {
                float f10 = rect2.d;
                float f11 = rect2.f14915b;
                if ((f10 <= f9 && f11 < f9) || f11 <= f8) {
                    return false;
                }
            } else {
                if (!FocusDirection.a(i2, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                float f12 = rect2.f14915b;
                float f13 = rect2.d;
                if ((f12 >= f8 && f13 > f8) || f13 >= f9) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final long h(int i2, Rect rect, Rect rect2) {
        float f2;
        float f3;
        float f4;
        float e;
        float e2;
        boolean a2 = FocusDirection.a(i2, 3);
        float f5 = rect2.f14915b;
        float f6 = rect2.f14914a;
        if (!a2) {
            if (FocusDirection.a(i2, 4)) {
                f2 = f6 - rect.f14916c;
            } else if (FocusDirection.a(i2, 5)) {
                f3 = rect.f14915b;
                f4 = rect2.d;
            } else {
                if (!FocusDirection.a(i2, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                f2 = f5 - rect.d;
            }
            long abs = Math.abs(Math.max(0.0f, f2));
            if (FocusDirection.a(i2, 3) || FocusDirection.a(i2, 4)) {
                float f7 = 2;
                e = (rect.e() / f7) + rect.f14915b;
                e2 = (rect2.e() / f7) + f5;
            } else {
                if (!FocusDirection.a(i2, 5) && !FocusDirection.a(i2, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                float f8 = 2;
                e = (rect.h() / f8) + rect.f14914a;
                e2 = (rect2.h() / f8) + f6;
            }
            long abs2 = Math.abs(e - e2);
            return (abs2 * abs2) + (13 * abs * abs);
        }
        f3 = rect.f14914a;
        f4 = rect2.f14916c;
        f2 = f3 - f4;
        long abs3 = Math.abs(Math.max(0.0f, f2));
        if (FocusDirection.a(i2, 3)) {
            if (!FocusDirection.a(i2, 5)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            float f82 = 2;
            e = (rect.h() / f82) + rect.f14914a;
            e2 = (rect2.h() / f82) + f6;
            long abs22 = Math.abs(e - e2);
            return (abs22 * abs22) + (13 * abs3 * abs3);
        }
        float f72 = 2;
        e = (rect.e() / f72) + rect.f14915b;
        e2 = (rect2.e() / f72) + f5;
        long abs222 = Math.abs(e - e2);
        return (abs222 * abs222) + (13 * abs3 * abs3);
    }

    public static final boolean i(int i2, FocusTargetNode focusTargetNode, Rect rect, l lVar) {
        FocusTargetNode d;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16]);
        Modifier.Node node = focusTargetNode.f14688a;
        if (!node.f14699n) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16]);
        Modifier.Node node2 = node.f14692g;
        if (node2 == null) {
            DelegatableNodeKt.a(mutableVector2, node);
        } else {
            mutableVector2.b(node2);
        }
        while (mutableVector2.m()) {
            Modifier.Node node3 = (Modifier.Node) mutableVector2.o(mutableVector2.f14144c - 1);
            if ((node3.d & 1024) == 0) {
                DelegatableNodeKt.a(mutableVector2, node3);
            } else {
                while (true) {
                    if (node3 == null) {
                        break;
                    }
                    if ((node3.f14690c & 1024) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node3 != null) {
                            if (node3 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node3;
                                if (focusTargetNode2.f14699n) {
                                    mutableVector.b(focusTargetNode2);
                                }
                            } else if ((node3.f14690c & 1024) != 0 && (node3 instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node node4 = ((DelegatingNode) node3).f15909p; node4 != null; node4 = node4.f14692g) {
                                    if ((node4.f14690c & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            node3 = node4;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16]);
                                            }
                                            if (node3 != null) {
                                                mutableVector3.b(node3);
                                                node3 = null;
                                            }
                                            mutableVector3.b(node4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            node3 = DelegatableNodeKt.b(mutableVector3);
                        }
                    } else {
                        node3 = node3.f14692g;
                    }
                }
            }
        }
        while (mutableVector.m() && (d = d(mutableVector, rect, i2)) != null) {
            if (d.e2().f14859a) {
                return ((Boolean) lVar.invoke(d)).booleanValue();
            }
            if (f(i2, d, rect, lVar)) {
                return true;
            }
            mutableVector.n(d);
        }
        return false;
    }

    public static final Boolean j(int i2, FocusTargetNode focusTargetNode, Rect rect, l lVar) {
        int ordinal = focusTargetNode.f2().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                FocusTargetNode c2 = FocusTraversalKt.c(focusTargetNode);
                if (c2 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
                int ordinal2 = c2.f2().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean j2 = j(i2, c2, rect, lVar);
                        if (!a.g(j2, Boolean.FALSE)) {
                            return j2;
                        }
                        if (rect == null) {
                            if (c2.f2() != FocusStateImpl.f14887b) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy".toString());
                            }
                            FocusTargetNode a2 = FocusTraversalKt.a(c2);
                            if (a2 == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                            }
                            rect = FocusTraversalKt.b(a2);
                        }
                        return Boolean.valueOf(f(i2, focusTargetNode, rect, lVar));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            throw new RuntimeException();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                    }
                }
                if (rect == null) {
                    rect = FocusTraversalKt.b(c2);
                }
                return Boolean.valueOf(f(i2, focusTargetNode, rect, lVar));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return focusTargetNode.e2().f14859a ? (Boolean) ((FocusOwnerImpl$focusSearch$1) lVar).invoke(focusTargetNode) : rect == null ? Boolean.valueOf(e(focusTargetNode, i2, lVar)) : Boolean.valueOf(i(i2, focusTargetNode, rect, lVar));
                }
                throw new RuntimeException();
            }
        }
        return Boolean.valueOf(e(focusTargetNode, i2, lVar));
    }
}
