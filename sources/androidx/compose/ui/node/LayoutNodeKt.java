package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;

/* loaded from: classes2.dex */
public final class LayoutNodeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Density f15979a = DensityKt.b();

    public static final Owner a(LayoutNode layoutNode) {
        Owner owner = layoutNode.f15950l;
        if (owner != null) {
            return owner;
        }
        InlineClassHelperKt.c("LayoutNode should be attached to an owner");
        throw null;
    }
}
