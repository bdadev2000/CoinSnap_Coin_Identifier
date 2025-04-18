package androidx.compose.ui.node;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
public final class NodeCoordinator$Companion$onCommitAffectingLayer$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final NodeCoordinator$Companion$onCommitAffectingLayer$1 f16112a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        OwnedLayer ownedLayer = ((NodeCoordinator) obj).G;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
        return b0.f30125a;
    }
}
