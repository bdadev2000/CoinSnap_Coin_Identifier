package androidx.compose.ui.viewinterop;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionManager;
import androidx.compose.ui.focus.FocusTransactionsKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.Owner;
import kotlin.jvm.internal.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class FocusGroupPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode, ViewTreeObserver.OnGlobalFocusChangeListener, View.OnAttachStateChangeListener {

    /* renamed from: o, reason: collision with root package name */
    public View f17585o;

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        FocusGroupNode_androidKt.c(this).addOnAttachStateChangeListener(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        FocusGroupNode_androidKt.c(this).removeOnAttachStateChangeListener(this);
        this.f17585o = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.n, q0.l] */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.n, q0.l] */
    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void e1(FocusProperties focusProperties) {
        focusProperties.b(false);
        focusProperties.a(new n(1, this, FocusGroupPropertiesNode.class, "onEnter", "onEnter-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0));
        focusProperties.d(new n(1, this, FocusGroupPropertiesNode.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0));
    }

    public final FocusTargetNode e2() {
        Modifier.Node node = this.f14688a;
        if (!node.f14699n) {
            InlineClassHelperKt.b("visitLocalDescendants called on an unattached node");
            throw null;
        }
        if ((node.d & 1024) != 0) {
            boolean z2 = false;
            for (Modifier.Node node2 = node.f14692g; node2 != null; node2 = node2.f14692g) {
                if ((node2.f14690c & 1024) != 0) {
                    Modifier.Node node3 = node2;
                    MutableVector mutableVector = null;
                    while (node3 != null) {
                        if (node3 instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) node3;
                            if (z2) {
                                return focusTargetNode;
                            }
                            z2 = true;
                        } else if ((node3.f14690c & 1024) != 0 && (node3 instanceof DelegatingNode)) {
                            int i2 = 0;
                            for (Modifier.Node node4 = ((DelegatingNode) node3).f15909p; node4 != null; node4 = node4.f14692g) {
                                if ((node4.f14690c & 1024) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        node3 = node4;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16]);
                                        }
                                        if (node3 != null) {
                                            mutableVector.b(node3);
                                            node3 = null;
                                        }
                                        mutableVector.b(node4);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        node3 = DelegatableNodeKt.b(mutableVector);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper".toString());
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (DelegatableNodeKt.f(this).f15950l == null) {
            return;
        }
        View c2 = FocusGroupNode_androidKt.c(this);
        FocusOwner focusOwner = DelegatableNodeKt.g(this).getFocusOwner();
        Owner g2 = DelegatableNodeKt.g(this);
        boolean z2 = (view == null || p0.a.g(view, g2) || !FocusGroupNode_androidKt.a(c2, view)) ? false : true;
        boolean z3 = (view2 == null || p0.a.g(view2, g2) || !FocusGroupNode_androidKt.a(c2, view2)) ? false : true;
        if (z2 && z3) {
            this.f17585o = view2;
            return;
        }
        if (!z3) {
            if (!z2) {
                this.f17585o = null;
                return;
            }
            this.f17585o = null;
            if (e2().f2().a()) {
                focusOwner.o(8, false, false);
                return;
            }
            return;
        }
        this.f17585o = view2;
        FocusTargetNode e2 = e2();
        if (e2.f2().b()) {
            return;
        }
        FocusTransactionManager c3 = focusOwner.c();
        try {
            if (c3.f14898c) {
                FocusTransactionManager.a(c3);
            }
            c3.f14898c = true;
            FocusTransactionsKt.f(e2);
            FocusTransactionManager.b(c3);
        } catch (Throwable th) {
            FocusTransactionManager.b(c3);
            throw th;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}
