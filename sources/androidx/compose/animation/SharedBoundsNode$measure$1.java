package androidx.compose.animation;

import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class SharedBoundsNode$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Placeable f1904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SharedBoundsNode f1905b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedBoundsNode$measure$1(Placeable placeable, SharedBoundsNode sharedBoundsNode, long j2) {
        super(1);
        this.f1904a = placeable;
        this.f1905b = sharedBoundsNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        if (placementScope.b() == null) {
            placementScope.e(this.f1904a, 0, 0, 0.0f);
            return b0.f30125a;
        }
        this.f1905b.f1900o.d().getClass();
        throw null;
    }
}
