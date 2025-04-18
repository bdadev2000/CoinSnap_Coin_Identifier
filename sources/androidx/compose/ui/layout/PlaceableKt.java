package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.ConstraintsKt;

/* loaded from: classes.dex */
public final class PlaceableKt {

    /* renamed from: a, reason: collision with root package name */
    public static final long f15830a = ConstraintsKt.b(0, 0, 15);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15831b = 0;

    public static final Placeable.PlacementScope a(LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        return new LookaheadCapablePlacementScope(lookaheadCapablePlaceable);
    }

    public static final Placeable.PlacementScope b(Owner owner) {
        return new OuterPlacementScope(owner);
    }
}
