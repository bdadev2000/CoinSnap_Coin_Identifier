package androidx.compose.ui.node;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1 f16166a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        LayoutNode layoutNode = (LayoutNode) obj;
        if (layoutNode.M()) {
            LayoutNode.Z(layoutNode, false, 7);
        }
        return b0.f30125a;
    }
}
