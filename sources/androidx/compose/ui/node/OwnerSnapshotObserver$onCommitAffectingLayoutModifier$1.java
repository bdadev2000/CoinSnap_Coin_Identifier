package androidx.compose.ui.node;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1 f16163a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        LayoutNode layoutNode = (LayoutNode) obj;
        if (layoutNode.M()) {
            layoutNode.a0(false);
        }
        return b0.f30125a;
    }
}
