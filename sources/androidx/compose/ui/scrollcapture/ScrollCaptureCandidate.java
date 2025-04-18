package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.unit.IntRect;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ScrollCaptureCandidate {

    /* renamed from: a, reason: collision with root package name */
    public final SemanticsNode f16768a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16769b;

    /* renamed from: c, reason: collision with root package name */
    public final IntRect f16770c;
    public final LayoutCoordinates d;

    public ScrollCaptureCandidate(SemanticsNode semanticsNode, int i2, IntRect intRect, NodeCoordinator nodeCoordinator) {
        this.f16768a = semanticsNode;
        this.f16769b = i2;
        this.f16770c = intRect;
        this.d = nodeCoordinator;
    }

    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.f16768a + ", depth=" + this.f16769b + ", viewportBoundsInWindow=" + this.f16770c + ", coordinates=" + this.d + ')';
    }
}
