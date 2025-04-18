package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollIntoView__ScrollIntoViewRequesterKt$scrollIntoView$2 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rect f5353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutCoordinates f5354b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollIntoView__ScrollIntoViewRequesterKt$scrollIntoView$2(Rect rect, NodeCoordinator nodeCoordinator) {
        super(0);
        this.f5353a = rect;
        this.f5354b = nodeCoordinator;
    }

    @Override // q0.a
    public final Object invoke() {
        Rect rect = this.f5353a;
        if (rect != null) {
            return rect;
        }
        LayoutCoordinates layoutCoordinates = this.f5354b;
        if (!layoutCoordinates.B()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates != null) {
            return RectKt.a(0L, IntSizeKt.c(layoutCoordinates.a()));
        }
        return null;
    }
}
