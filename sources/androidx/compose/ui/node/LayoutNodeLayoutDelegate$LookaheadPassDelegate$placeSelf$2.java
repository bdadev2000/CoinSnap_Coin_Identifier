package androidx.compose.ui.node;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeSelf$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LayoutNodeLayoutDelegate f16022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Owner f16023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f16024c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeSelf$2(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, Owner owner, long j2) {
        super(0);
        this.f16022a = layoutNodeLayoutDelegate;
        this.f16023b = owner;
        this.f16024c = j2;
    }

    @Override // q0.a
    public final Object invoke() {
        LookaheadDelegate h12;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f16022a;
        Placeable.PlacementScope placementScope = null;
        if (LayoutNodeLayoutDelegateKt.a(layoutNodeLayoutDelegate.f15980a)) {
            NodeCoordinator nodeCoordinator = layoutNodeLayoutDelegate.a().f16104q;
            if (nodeCoordinator != null) {
                placementScope = nodeCoordinator.f16056j;
            }
        } else {
            NodeCoordinator nodeCoordinator2 = layoutNodeLayoutDelegate.a().f16104q;
            if (nodeCoordinator2 != null && (h12 = nodeCoordinator2.h1()) != null) {
                placementScope = h12.f16056j;
            }
        }
        if (placementScope == null) {
            placementScope = this.f16023b.getPlacementScope();
        }
        LookaheadDelegate h13 = layoutNodeLayoutDelegate.a().h1();
        p0.a.p(h13);
        Placeable.PlacementScope.g(placementScope, h13, this.f16024c);
        return b0.f30125a;
    }
}
