package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.MutableLongSet;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.jvm.internal.n;
import org.objectweb.asm.Opcodes;
import q0.a;
import q0.l;
import q0.p;

@StabilityInferred
/* loaded from: classes2.dex */
public final class FocusOwnerImpl implements FocusOwner {

    /* renamed from: a, reason: collision with root package name */
    public final p f14841a;

    /* renamed from: b, reason: collision with root package name */
    public final l f14842b;

    /* renamed from: c, reason: collision with root package name */
    public final a f14843c;
    public final a d;
    public final a e;

    /* renamed from: g, reason: collision with root package name */
    public final FocusInvalidationManager f14845g;

    /* renamed from: j, reason: collision with root package name */
    public MutableLongSet f14848j;

    /* renamed from: f, reason: collision with root package name */
    public final FocusTargetNode f14844f = new Modifier.Node();

    /* renamed from: h, reason: collision with root package name */
    public final FocusTransactionManager f14846h = new FocusTransactionManager();

    /* renamed from: i, reason: collision with root package name */
    public final Modifier f14847i = new FocusPropertiesElement(new FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0()).T0(new ModifierNodeElement<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final Modifier.Node a() {
            return FocusOwnerImpl.this.f14844f;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final /* bridge */ /* synthetic */ void b(Modifier.Node node) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return FocusOwnerImpl.this.f14844f.hashCode();
        }
    });

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [q0.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.focus.FocusTargetNode, androidx.compose.ui.Modifier$Node] */
    public FocusOwnerImpl(l lVar, p pVar, l lVar2, a aVar, a aVar2, a aVar3) {
        this.f14841a = pVar;
        this.f14842b = lVar2;
        this.f14843c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f14845g = new FocusInvalidationManager(new n(0, this, FocusOwnerImpl.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0), lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public final Boolean a(int i2, Rect rect, l lVar) {
        FocusTargetNode focusTargetNode;
        boolean a2;
        FocusTargetNode focusTargetNode2;
        NodeChain nodeChain;
        FocusRequester focusRequester;
        FocusRequester focusRequester2;
        FocusTargetNode focusTargetNode3 = this.f14844f;
        FocusTargetNode a3 = FocusTraversalKt.a(focusTargetNode3);
        int i3 = 4;
        a aVar = this.e;
        if (a3 != null) {
            LayoutDirection layoutDirection = (LayoutDirection) aVar.invoke();
            FocusPropertiesImpl e2 = a3.e2();
            if (FocusDirection.a(i2, 1)) {
                focusRequester = e2.f14860b;
            } else if (FocusDirection.a(i2, 2)) {
                focusRequester = e2.f14861c;
            } else if (FocusDirection.a(i2, 5)) {
                focusRequester = e2.d;
            } else if (FocusDirection.a(i2, 6)) {
                focusRequester = e2.e;
            } else if (FocusDirection.a(i2, 3)) {
                int ordinal = layoutDirection.ordinal();
                if (ordinal == 0) {
                    focusRequester2 = e2.f14864h;
                } else {
                    if (ordinal != 1) {
                        throw new RuntimeException();
                    }
                    focusRequester2 = e2.f14865i;
                }
                if (focusRequester2 == FocusRequester.f14872b) {
                    focusRequester2 = null;
                }
                if (focusRequester2 == null) {
                    focusRequester = e2.f14862f;
                }
                focusRequester = focusRequester2;
            } else if (FocusDirection.a(i2, 4)) {
                int ordinal2 = layoutDirection.ordinal();
                if (ordinal2 == 0) {
                    focusRequester2 = e2.f14865i;
                } else {
                    if (ordinal2 != 1) {
                        throw new RuntimeException();
                    }
                    focusRequester2 = e2.f14864h;
                }
                if (focusRequester2 == FocusRequester.f14872b) {
                    focusRequester2 = null;
                }
                if (focusRequester2 == null) {
                    focusRequester = e2.f14863g;
                }
                focusRequester = focusRequester2;
            } else if (FocusDirection.a(i2, 7)) {
                focusRequester = (FocusRequester) e2.f14866j.invoke(new FocusDirection(i2));
            } else {
                if (!FocusDirection.a(i2, 8)) {
                    throw new IllegalStateException("invalid FocusDirection".toString());
                }
                focusRequester = (FocusRequester) e2.f14867k.invoke(new FocusDirection(i2));
            }
            if (p0.a.g(focusRequester, FocusRequester.f14873c)) {
                return null;
            }
            focusTargetNode = null;
            if (!p0.a.g(focusRequester, FocusRequester.f14872b)) {
                return Boolean.valueOf(focusRequester.a(lVar));
            }
        } else {
            focusTargetNode = null;
            a3 = null;
        }
        LayoutDirection layoutDirection2 = (LayoutDirection) aVar.invoke();
        FocusOwnerImpl$focusSearch$1 focusOwnerImpl$focusSearch$1 = new FocusOwnerImpl$focusSearch$1(a3, this, lVar);
        if (FocusDirection.a(i2, 1) || FocusDirection.a(i2, 2)) {
            if (FocusDirection.a(i2, 1)) {
                a2 = OneDimensionalFocusSearchKt.b(focusTargetNode3, focusOwnerImpl$focusSearch$1);
            } else {
                if (!FocusDirection.a(i2, 2)) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
                }
                a2 = OneDimensionalFocusSearchKt.a(focusTargetNode3, focusOwnerImpl$focusSearch$1);
            }
            return Boolean.valueOf(a2);
        }
        if (FocusDirection.a(i2, 3) || FocusDirection.a(i2, 4) || FocusDirection.a(i2, 5) || FocusDirection.a(i2, 6)) {
            return TwoDimensionalFocusSearchKt.j(i2, focusTargetNode3, rect, focusOwnerImpl$focusSearch$1);
        }
        if (FocusDirection.a(i2, 7)) {
            int ordinal3 = layoutDirection2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    throw new RuntimeException();
                }
                i3 = 3;
            }
            FocusTargetNode a4 = FocusTraversalKt.a(focusTargetNode3);
            return a4 != null ? TwoDimensionalFocusSearchKt.j(i3, a4, rect, focusOwnerImpl$focusSearch$1) : focusTargetNode;
        }
        if (!FocusDirection.a(i2, 8)) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) FocusDirection.b(i2))).toString());
        }
        FocusTargetNode a5 = FocusTraversalKt.a(focusTargetNode3);
        boolean z2 = false;
        if (a5 != null) {
            Modifier.Node node = a5.f14688a;
            if (!node.f14699n) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node node2 = node.f14691f;
            LayoutNode f2 = DelegatableNodeKt.f(a5);
            loop0: while (f2 != null) {
                if ((f2.B.e.d & 1024) != 0) {
                    while (node2 != null) {
                        if ((node2.f14690c & 1024) != 0) {
                            Modifier.Node node3 = node2;
                            ?? r6 = focusTargetNode;
                            while (node3 != null) {
                                if (node3 instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode4 = (FocusTargetNode) node3;
                                    if (focusTargetNode4.e2().f14859a) {
                                        focusTargetNode2 = focusTargetNode4;
                                        break loop0;
                                    }
                                } else if ((node3.f14690c & 1024) != 0 && (node3 instanceof DelegatingNode)) {
                                    Modifier.Node node4 = ((DelegatingNode) node3).f15909p;
                                    int i4 = 0;
                                    r6 = r6;
                                    while (node4 != null) {
                                        if ((node4.f14690c & 1024) != 0) {
                                            i4++;
                                            r6 = r6;
                                            if (i4 == 1) {
                                                node3 = node4;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new MutableVector(new Modifier.Node[16]);
                                                }
                                                if (node3 != null) {
                                                    r6.b(node3);
                                                    node3 = focusTargetNode;
                                                }
                                                r6.b(node4);
                                            }
                                        }
                                        node4 = node4.f14692g;
                                        r6 = r6;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                node3 = DelegatableNodeKt.b(r6);
                            }
                        }
                        node2 = node2.f14691f;
                    }
                }
                f2 = f2.B();
                node2 = (f2 == null || (nodeChain = f2.B) == null) ? focusTargetNode : nodeChain.d;
            }
        }
        focusTargetNode2 = focusTargetNode;
        if (focusTargetNode2 != null && !p0.a.g(focusTargetNode2, focusTargetNode3)) {
            z2 = ((Boolean) focusOwnerImpl$focusSearch$1.invoke(focusTargetNode2)).booleanValue();
        }
        return Boolean.valueOf(z2);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void b(FocusEventModifierNode focusEventModifierNode) {
        FocusInvalidationManager focusInvalidationManager = this.f14845g;
        focusInvalidationManager.b(focusInvalidationManager.d, focusEventModifierNode);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final FocusTransactionManager c() {
        return this.f14846h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    @Override // androidx.compose.ui.focus.FocusManager
    public final boolean d(int i2) {
        Boolean a2;
        ?? obj = new Object();
        obj.f30930a = Boolean.FALSE;
        Boolean a3 = a(i2, (Rect) this.d.invoke(), new FocusOwnerImpl$moveFocus$focusSearchSuccess$1(i2, obj));
        if (a3 == null || obj.f30930a == null) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        if (p0.a.g(a3, bool) && p0.a.g(obj.f30930a, bool)) {
            return true;
        }
        return (FocusDirection.a(i2, 1) || FocusDirection.a(i2, 2)) ? o(i2, false, false) && (a2 = a(i2, null, new FocusOwnerImpl$takeFocus$1(i2))) != null && a2.booleanValue() : ((Boolean) this.f14842b.invoke(new FocusDirection(i2))).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public final boolean e(KeyEvent keyEvent) {
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode;
        int size;
        NodeChain nodeChain;
        DelegatingNode delegatingNode;
        NodeChain nodeChain2;
        if (!(!this.f14845g.a())) {
            throw new IllegalStateException("Dispatching intercepted soft keyboard event while focus system is invalidated.".toString());
        }
        FocusTargetNode a2 = FocusTraversalKt.a(this.f14844f);
        if (a2 != null) {
            Modifier.Node node = a2.f14688a;
            if (!node.f14699n) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            LayoutNode f2 = DelegatableNodeKt.f(a2);
            loop0: while (true) {
                if (f2 == null) {
                    delegatingNode = 0;
                    break;
                }
                if ((f2.B.e.d & Opcodes.ACC_DEPRECATED) != 0) {
                    while (node != null) {
                        if ((node.f14690c & Opcodes.ACC_DEPRECATED) != 0) {
                            ?? r9 = 0;
                            delegatingNode = node;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof SoftKeyboardInterceptionModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNode.f14690c & Opcodes.ACC_DEPRECATED) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node node2 = delegatingNode.f15909p;
                                    int i2 = 0;
                                    delegatingNode = delegatingNode;
                                    r9 = r9;
                                    while (node2 != null) {
                                        if ((node2.f14690c & Opcodes.ACC_DEPRECATED) != 0) {
                                            i2++;
                                            r9 = r9;
                                            if (i2 == 1) {
                                                delegatingNode = node2;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new MutableVector(new Modifier.Node[16]);
                                                }
                                                if (delegatingNode != 0) {
                                                    r9.b(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                r9.b(node2);
                                            }
                                        }
                                        node2 = node2.f14692g;
                                        delegatingNode = delegatingNode;
                                        r9 = r9;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.b(r9);
                            }
                        }
                        node = node.f14691f;
                    }
                }
                f2 = f2.B();
                node = (f2 == null || (nodeChain2 = f2.B) == null) ? null : nodeChain2.d;
            }
            softKeyboardInterceptionModifierNode = (SoftKeyboardInterceptionModifierNode) delegatingNode;
        } else {
            softKeyboardInterceptionModifierNode = null;
        }
        if (softKeyboardInterceptionModifierNode != null) {
            if (!softKeyboardInterceptionModifierNode.z0().f14699n) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node node3 = softKeyboardInterceptionModifierNode.z0().f14691f;
            LayoutNode f3 = DelegatableNodeKt.f(softKeyboardInterceptionModifierNode);
            ArrayList arrayList = null;
            while (f3 != null) {
                if ((f3.B.e.d & Opcodes.ACC_DEPRECATED) != 0) {
                    while (node3 != null) {
                        if ((node3.f14690c & Opcodes.ACC_DEPRECATED) != 0) {
                            Modifier.Node node4 = node3;
                            MutableVector mutableVector = null;
                            while (node4 != null) {
                                if (node4 instanceof SoftKeyboardInterceptionModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(node4);
                                } else if ((node4.f14690c & Opcodes.ACC_DEPRECATED) != 0 && (node4 instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node node5 = ((DelegatingNode) node4).f15909p; node5 != null; node5 = node5.f14692g) {
                                        if ((node5.f14690c & Opcodes.ACC_DEPRECATED) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                node4 = node5;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16]);
                                                }
                                                if (node4 != null) {
                                                    mutableVector.b(node4);
                                                    node4 = null;
                                                }
                                                mutableVector.b(node5);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                node4 = DelegatableNodeKt.b(mutableVector);
                            }
                        }
                        node3 = node3.f14691f;
                    }
                }
                f3 = f3.B();
                node3 = (f3 == null || (nodeChain = f3.B) == null) ? null : nodeChain.d;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i4 = size - 1;
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(size)).R(keyEvent)) {
                        return true;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    size = i4;
                }
            }
            DelegatingNode z02 = softKeyboardInterceptionModifierNode.z0();
            ?? r2 = 0;
            while (z02 != 0) {
                if (z02 instanceof SoftKeyboardInterceptionModifierNode) {
                    if (((SoftKeyboardInterceptionModifierNode) z02).R(keyEvent)) {
                        return true;
                    }
                } else if ((z02.f14690c & Opcodes.ACC_DEPRECATED) != 0 && (z02 instanceof DelegatingNode)) {
                    Modifier.Node node6 = z02.f15909p;
                    int i5 = 0;
                    z02 = z02;
                    r2 = r2;
                    while (node6 != null) {
                        if ((node6.f14690c & Opcodes.ACC_DEPRECATED) != 0) {
                            i5++;
                            r2 = r2;
                            if (i5 == 1) {
                                z02 = node6;
                            } else {
                                if (r2 == 0) {
                                    r2 = new MutableVector(new Modifier.Node[16]);
                                }
                                if (z02 != 0) {
                                    r2.b(z02);
                                    z02 = 0;
                                }
                                r2.b(node6);
                            }
                        }
                        node6 = node6.f14692g;
                        z02 = z02;
                        r2 = r2;
                    }
                    if (i5 == 1) {
                    }
                }
                z02 = DelegatableNodeKt.b(r2);
            }
            DelegatingNode z03 = softKeyboardInterceptionModifierNode.z0();
            ?? r22 = 0;
            while (z03 != 0) {
                if (z03 instanceof SoftKeyboardInterceptionModifierNode) {
                    if (((SoftKeyboardInterceptionModifierNode) z03).u0(keyEvent)) {
                        return true;
                    }
                } else if ((z03.f14690c & Opcodes.ACC_DEPRECATED) != 0 && (z03 instanceof DelegatingNode)) {
                    Modifier.Node node7 = z03.f15909p;
                    int i6 = 0;
                    z03 = z03;
                    r22 = r22;
                    while (node7 != null) {
                        if ((node7.f14690c & Opcodes.ACC_DEPRECATED) != 0) {
                            i6++;
                            r22 = r22;
                            if (i6 == 1) {
                                z03 = node7;
                            } else {
                                if (r22 == 0) {
                                    r22 = new MutableVector(new Modifier.Node[16]);
                                }
                                if (z03 != 0) {
                                    r22.b(z03);
                                    z03 = 0;
                                }
                                r22.b(node7);
                            }
                        }
                        node7 = node7.f14692g;
                        z03 = z03;
                        r22 = r22;
                    }
                    if (i6 == 1) {
                    }
                }
                z03 = DelegatableNodeKt.b(r22);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(i7)).u0(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0390, code lost:
    
        if (r7 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x00a4, code lost:
    
        if (((((~r10) << 6) & r10) & (-9187201950435737472L)) == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x00a6, code lost:
    
        r2 = r6.b(r7);
        r4 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x00ae, code lost:
    
        if (r6.e != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x00c1, code lost:
    
        if (((r6.f1462a[r2 >> 3] >> ((r2 & 7) << r8)) & 255) != 254) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x00c7, code lost:
    
        r2 = r6.f1464c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x00cb, code lost:
    
        if (r2 <= 8) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x00db, code lost:
    
        if (java.lang.Long.compareUnsigned(r6.d * 32, r2 * 25) > 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x00dd, code lost:
    
        r2 = r6.f1462a;
        r3 = r6.f1464c;
        r9 = r6.f1463b;
        androidx.collection.ScatterMapKt.a(r2, r3);
        r10 = 0;
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x00e8, code lost:
    
        if (r10 == r3) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x00ea, code lost:
    
        r15 = r10 >> 3;
        r20 = (r10 & 7) << 3;
        r16 = (r2[r15] >> r20) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x00fa, code lost:
    
        if (r16 != r4) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0108, code lost:
    
        if (r16 == 254) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x010d, code lost:
    
        r14 = java.lang.Long.hashCode(r9[r10]) * (-862048943);
        r14 = (r14 ^ (r14 << 16)) >>> 7;
        r17 = r6.b(r14);
        r14 = r14 & r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0134, code lost:
    
        if ((((r17 - r14) & r3) / 8) != (((r10 - r14) & r3) / 8)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0136, code lost:
    
        r2[r15] = ((r16 & 127) << r20) | (r2[r15] & (~(255 << r20)));
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r10 = r10 + 1;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0159, code lost:
    
        r4 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x015d, code lost:
    
        r35 = r9;
        r4 = r17 >> 3;
        r8 = r2[r4];
        r5 = (r17 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0173, code lost:
    
        if (((r8 >> r5) & 255) != 128) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0175, code lost:
    
        r2[r4] = ((~(255 << r5)) & r8) | ((r16 & 127) << r5);
        r2[r15] = (r2[r15] & (~(255 << r20))) | (128 << r20);
        r35[r17] = r35[r10];
        r35[r10] = 0;
        r11 = r10;
        r36 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x01c0, code lost:
    
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r10 = r10 + 1;
        r9 = r35;
        r12 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x019a, code lost:
    
        r36 = r12;
        r2[r4] = ((r16 & 127) << r5) | (r8 & (~(255 << r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x01aa, code lost:
    
        if (r11 != (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x01ac, code lost:
    
        r11 = androidx.collection.ScatterMapKt.b(r2, r10 + 1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x01b2, code lost:
    
        r35[r11] = r35[r17];
        r35[r17] = r35[r10];
        r35[r10] = r35[r11];
        r10 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x010a, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x00fc, code lost:
    
        r11 = r10;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x01d6, code lost:
    
        r36 = r12;
        r6.e = androidx.collection.ScatterMapKt.c(r6.f1464c) - r6.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0257, code lost:
    
        r5 = r6.b(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x025e, code lost:
    
        r6.d++;
        r0 = r6.e;
        r1 = r6.f1462a;
        r2 = r5 >> 3;
        r3 = r1[r2];
        r7 = (r5 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0279, code lost:
    
        if (((r3 >> r7) & 255) != 128) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x027b, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x027e, code lost:
    
        r6.e = r0 - r8;
        r0 = r6.f1464c;
        r3 = (r3 & (~(255 << r7))) | (r36 << r7);
        r1[r2] = r3;
        r1[(((r5 - 7) & r0) + (r0 & 7)) >> 3] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x027d, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x01e5, code lost:
    
        r36 = r12;
        r0 = androidx.collection.ScatterMapKt.e(r6.f1464c);
        r1 = r6.f1462a;
        r2 = r6.f1463b;
        r3 = r6.f1464c;
        r6.c(r0);
        r0 = r6.f1462a;
        r4 = r6.f1463b;
        r5 = r6.f1464c;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x01fd, code lost:
    
        if (r8 >= r3) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x020f, code lost:
    
        if (((r1[r8 >> 3] >> ((r8 & 7) << 3)) & 255) >= 128) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0211, code lost:
    
        r9 = r2[r8];
        r11 = java.lang.Long.hashCode(r9) * (-862048943);
        r11 = r11 ^ (r11 << 16);
        r12 = r6.b(r11 >>> 7);
        r14 = r11 & 127;
        r11 = r12 >> 3;
        r13 = (r12 & 7) << 3;
        r20 = r1;
        r21 = r2;
        r1 = (r0[r11] & (~(255 << r13))) | (r14 << r13);
        r0[r11] = r1;
        r0[(((r12 - 7) & r5) + (r5 & 7)) >> 3] = r1;
        r4[r12] = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0250, code lost:
    
        r8 = r8 + 1;
        r1 = r20;
        r2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x024c, code lost:
    
        r20 = r1;
        r21 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x00c3, code lost:
    
        r36 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x025d, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0321, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0323, code lost:
    
        r12 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0633 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x04b9  */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v21, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v42, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v48, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v92 */
    /* JADX WARN: Type inference failed for: r8v93 */
    /* JADX WARN: Type inference failed for: r8v94 */
    @Override // androidx.compose.ui.focus.FocusOwner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(android.view.KeyEvent r40, q0.a r41) {
        /*
            Method dump skipped, instructions count: 1623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.f(android.view.KeyEvent, q0.a):boolean");
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final boolean g() {
        return ((Boolean) this.f14841a.invoke(null, null)).booleanValue();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void h(FocusTargetNode focusTargetNode) {
        FocusInvalidationManager focusInvalidationManager = this.f14845g;
        focusInvalidationManager.b(focusInvalidationManager.f14838c, focusTargetNode);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final Modifier i() {
        return this.f14847i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public final boolean j(RotaryScrollEvent rotaryScrollEvent) {
        RotaryInputModifierNode rotaryInputModifierNode;
        int size;
        NodeChain nodeChain;
        DelegatingNode delegatingNode;
        NodeChain nodeChain2;
        if (!(!this.f14845g.a())) {
            throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.".toString());
        }
        FocusTargetNode a2 = FocusTraversalKt.a(this.f14844f);
        if (a2 != null) {
            Modifier.Node node = a2.f14688a;
            if (!node.f14699n) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            LayoutNode f2 = DelegatableNodeKt.f(a2);
            loop0: while (true) {
                if (f2 == null) {
                    delegatingNode = 0;
                    break;
                }
                if ((f2.B.e.d & 16384) != 0) {
                    while (node != null) {
                        if ((node.f14690c & 16384) != 0) {
                            ?? r8 = 0;
                            delegatingNode = node;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof RotaryInputModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNode.f14690c & 16384) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node node2 = delegatingNode.f15909p;
                                    int i2 = 0;
                                    delegatingNode = delegatingNode;
                                    r8 = r8;
                                    while (node2 != null) {
                                        if ((node2.f14690c & 16384) != 0) {
                                            i2++;
                                            r8 = r8;
                                            if (i2 == 1) {
                                                delegatingNode = node2;
                                            } else {
                                                if (r8 == 0) {
                                                    r8 = new MutableVector(new Modifier.Node[16]);
                                                }
                                                if (delegatingNode != 0) {
                                                    r8.b(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                r8.b(node2);
                                            }
                                        }
                                        node2 = node2.f14692g;
                                        delegatingNode = delegatingNode;
                                        r8 = r8;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                delegatingNode = DelegatableNodeKt.b(r8);
                            }
                        }
                        node = node.f14691f;
                    }
                }
                f2 = f2.B();
                node = (f2 == null || (nodeChain2 = f2.B) == null) ? null : nodeChain2.d;
            }
            rotaryInputModifierNode = (RotaryInputModifierNode) delegatingNode;
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            if (!rotaryInputModifierNode.z0().f14699n) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node node3 = rotaryInputModifierNode.z0().f14691f;
            LayoutNode f3 = DelegatableNodeKt.f(rotaryInputModifierNode);
            ArrayList arrayList = null;
            while (f3 != null) {
                if ((f3.B.e.d & 16384) != 0) {
                    while (node3 != null) {
                        if ((node3.f14690c & 16384) != 0) {
                            Modifier.Node node4 = node3;
                            MutableVector mutableVector = null;
                            while (node4 != null) {
                                if (node4 instanceof RotaryInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(node4);
                                } else if ((node4.f14690c & 16384) != 0 && (node4 instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node node5 = ((DelegatingNode) node4).f15909p; node5 != null; node5 = node5.f14692g) {
                                        if ((node5.f14690c & 16384) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                node4 = node5;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16]);
                                                }
                                                if (node4 != null) {
                                                    mutableVector.b(node4);
                                                    node4 = null;
                                                }
                                                mutableVector.b(node5);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                node4 = DelegatableNodeKt.b(mutableVector);
                            }
                        }
                        node3 = node3.f14691f;
                    }
                }
                f3 = f3.B();
                node3 = (f3 == null || (nodeChain = f3.B) == null) ? null : nodeChain.d;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i4 = size - 1;
                    if (((RotaryInputModifierNode) arrayList.get(size)).d0(rotaryScrollEvent)) {
                        return true;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    size = i4;
                }
            }
            DelegatingNode z02 = rotaryInputModifierNode.z0();
            ?? r2 = 0;
            while (z02 != 0) {
                if (z02 instanceof RotaryInputModifierNode) {
                    if (((RotaryInputModifierNode) z02).d0(rotaryScrollEvent)) {
                        return true;
                    }
                } else if ((z02.f14690c & 16384) != 0 && (z02 instanceof DelegatingNode)) {
                    Modifier.Node node6 = z02.f15909p;
                    int i5 = 0;
                    z02 = z02;
                    r2 = r2;
                    while (node6 != null) {
                        if ((node6.f14690c & 16384) != 0) {
                            i5++;
                            r2 = r2;
                            if (i5 == 1) {
                                z02 = node6;
                            } else {
                                if (r2 == 0) {
                                    r2 = new MutableVector(new Modifier.Node[16]);
                                }
                                if (z02 != 0) {
                                    r2.b(z02);
                                    z02 = 0;
                                }
                                r2.b(node6);
                            }
                        }
                        node6 = node6.f14692g;
                        z02 = z02;
                        r2 = r2;
                    }
                    if (i5 == 1) {
                    }
                }
                z02 = DelegatableNodeKt.b(r2);
            }
            DelegatingNode z03 = rotaryInputModifierNode.z0();
            ?? r22 = 0;
            while (z03 != 0) {
                if (z03 instanceof RotaryInputModifierNode) {
                    if (((RotaryInputModifierNode) z03).k1(rotaryScrollEvent)) {
                        return true;
                    }
                } else if ((z03.f14690c & 16384) != 0 && (z03 instanceof DelegatingNode)) {
                    Modifier.Node node7 = z03.f15909p;
                    int i6 = 0;
                    z03 = z03;
                    r22 = r22;
                    while (node7 != null) {
                        if ((node7.f14690c & 16384) != 0) {
                            i6++;
                            r22 = r22;
                            if (i6 == 1) {
                                z03 = node7;
                            } else {
                                if (r22 == 0) {
                                    r22 = new MutableVector(new Modifier.Node[16]);
                                }
                                if (z03 != 0) {
                                    r22.b(z03);
                                    z03 = 0;
                                }
                                r22.b(node7);
                            }
                        }
                        node7 = node7.f14692g;
                        z03 = z03;
                        r22 = r22;
                    }
                    if (i6 == 1) {
                    }
                }
                z03 = DelegatableNodeKt.b(r22);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    if (((RotaryInputModifierNode) arrayList.get(i7)).k1(rotaryScrollEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final FocusStateImpl l() {
        return this.f14844f.f2();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void m(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        FocusInvalidationManager focusInvalidationManager = this.f14845g;
        focusInvalidationManager.b(focusInvalidationManager.e, focusPropertiesModifierNode);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final Rect n() {
        FocusTargetNode a2 = FocusTraversalKt.a(this.f14844f);
        if (a2 != null) {
            return FocusTraversalKt.b(a2);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final boolean o(int i2, boolean z2, boolean z3) {
        boolean a2;
        int ordinal;
        FocusTransactionManager focusTransactionManager = this.f14846h;
        FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 = FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1.f14849a;
        try {
            if (focusTransactionManager.f14898c) {
                FocusTransactionManager.a(focusTransactionManager);
            }
            focusTransactionManager.f14898c = true;
            focusTransactionManager.f14897b.b(focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1);
            FocusTargetNode focusTargetNode = this.f14844f;
            if (!z2 && ((ordinal = FocusTransactionsKt.c(focusTargetNode, i2).ordinal()) == 1 || ordinal == 2 || ordinal == 3)) {
                a2 = false;
                if (a2 && z3) {
                    this.f14843c.invoke();
                }
                return a2;
            }
            a2 = FocusTransactionsKt.a(focusTargetNode, z2, true);
            if (a2) {
                this.f14843c.invoke();
            }
            return a2;
        } finally {
            FocusTransactionManager.b(focusTransactionManager);
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void p() {
        FocusTransactionManager focusTransactionManager = this.f14846h;
        boolean z2 = focusTransactionManager.f14898c;
        FocusTargetNode focusTargetNode = this.f14844f;
        if (z2) {
            FocusTransactionsKt.a(focusTargetNode, true, true);
            return;
        }
        try {
            focusTransactionManager.f14898c = true;
            FocusTransactionsKt.a(focusTargetNode, true, true);
        } finally {
            FocusTransactionManager.b(focusTransactionManager);
        }
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public final void q(boolean z2) {
        o(8, z2, true);
    }
}
