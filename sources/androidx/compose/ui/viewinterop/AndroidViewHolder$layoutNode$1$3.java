package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import d0.b0;
import java.util.HashMap;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidViewHolder$layoutNode$1$3 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f17532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutNode f17533b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$3(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        super(1);
        this.f17532a = androidViewHolder;
        this.f17533b = layoutNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Owner owner = (Owner) obj;
        final AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
        AndroidViewHolder androidViewHolder = this.f17532a;
        if (androidComposeView != null) {
            HashMap<AndroidViewHolder, LayoutNode> holderToLayoutNode = androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
            final LayoutNode layoutNode = this.f17533b;
            holderToLayoutNode.put(androidViewHolder, layoutNode);
            androidComposeView.getAndroidViewsHandler$ui_release().addView(androidViewHolder);
            androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, androidViewHolder);
            androidViewHolder.setImportantForAccessibility(1);
            ViewCompat.A(androidViewHolder, new AccessibilityDelegateCompat() { // from class: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1
                /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
                
                    if (r0.intValue() == r7.getSemanticsOwner().a().f16823g) goto L13;
                 */
                @Override // androidx.core.view.AccessibilityDelegateCompat
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onInitializeAccessibilityNodeInfo(android.view.View r7, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r8) {
                    /*
                        r6 = this;
                        super.onInitializeAccessibilityNodeInfo(r7, r8)
                        androidx.compose.ui.platform.AndroidComposeView r7 = androidx.compose.ui.platform.AndroidComposeView.this
                        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = r7.f16220p
                        boolean r0 = r0.p()
                        if (r0 == 0) goto L13
                        android.view.accessibility.AccessibilityNodeInfo r0 = r8.f18826a
                        r1 = 0
                        r0.setVisibleToUser(r1)
                    L13:
                        androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1 r0 = androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1.f16245a
                        androidx.compose.ui.node.LayoutNode r1 = r2
                        androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.semantics.SemanticsNodeKt.b(r1, r0)
                        if (r0 == 0) goto L24
                        int r0 = r0.f15942b
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        goto L25
                    L24:
                        r0 = 0
                    L25:
                        r2 = -1
                        if (r0 == 0) goto L38
                        androidx.compose.ui.semantics.SemanticsOwner r3 = r7.getSemanticsOwner()
                        androidx.compose.ui.semantics.SemanticsNode r3 = r3.a()
                        int r4 = r0.intValue()
                        int r3 = r3.f16823g
                        if (r4 != r3) goto L3c
                    L38:
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                    L3c:
                        int r0 = r0.intValue()
                        r8.f18827b = r0
                        android.view.accessibility.AccessibilityNodeInfo r8 = r8.f18826a
                        androidx.compose.ui.platform.AndroidComposeView r3 = r3
                        r8.setParent(r3, r0)
                        int r0 = r1.f15942b
                        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r1 = r7.f16220p
                        androidx.collection.MutableIntIntMap r4 = r1.f16288z
                        int r4 = r4.c(r0)
                        if (r4 == r2) goto L6b
                        androidx.compose.ui.platform.AndroidViewsHandler r5 = r7.getAndroidViewsHandler$ui_release()
                        androidx.compose.ui.viewinterop.AndroidViewHolder r5 = androidx.compose.ui.platform.SemanticsUtils_androidKt.e(r5, r4)
                        if (r5 == 0) goto L63
                        r8.setTraversalBefore(r5)
                        goto L66
                    L63:
                        r8.setTraversalBefore(r3, r4)
                    L66:
                        java.lang.String r4 = r1.B
                        androidx.compose.ui.platform.AndroidComposeView.w(r7, r0, r8, r4)
                    L6b:
                        androidx.collection.MutableIntIntMap r4 = r1.A
                        int r4 = r4.c(r0)
                        if (r4 == r2) goto L89
                        androidx.compose.ui.platform.AndroidViewsHandler r2 = r7.getAndroidViewsHandler$ui_release()
                        androidx.compose.ui.viewinterop.AndroidViewHolder r2 = androidx.compose.ui.platform.SemanticsUtils_androidKt.e(r2, r4)
                        if (r2 == 0) goto L81
                        r8.setTraversalAfter(r2)
                        goto L84
                    L81:
                        r8.setTraversalAfter(r3, r4)
                    L84:
                        java.lang.String r1 = r1.C
                        androidx.compose.ui.platform.AndroidComposeView.w(r7, r0, r8, r1)
                    L89:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1.onInitializeAccessibilityNodeInfo(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
                }
            });
        }
        if (androidViewHolder.getView().getParent() != androidViewHolder) {
            androidViewHolder.addView(androidViewHolder.getView());
        }
        return b0.f30125a;
    }
}
