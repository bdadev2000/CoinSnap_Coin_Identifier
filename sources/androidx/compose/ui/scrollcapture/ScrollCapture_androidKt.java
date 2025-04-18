package androidx.compose.ui.scrollcapture;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import java.util.LinkedHashMap;
import java.util.List;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
public final class ScrollCapture_androidKt {
    public static final void a(SemanticsNode semanticsNode, int i2, l lVar) {
        MutableVector mutableVector = new MutableVector(new SemanticsNode[16]);
        List g2 = semanticsNode.g(false, false, false);
        while (true) {
            mutableVector.d(mutableVector.f14144c, g2);
            while (mutableVector.m()) {
                SemanticsNode semanticsNode2 = (SemanticsNode) mutableVector.o(mutableVector.f14144c - 1);
                NodeCoordinator c2 = semanticsNode2.c();
                if (c2 == null || !c2.v1()) {
                    SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16843n;
                    SemanticsConfiguration semanticsConfiguration = semanticsNode2.d;
                    if (semanticsConfiguration.f16815a.containsKey(semanticsPropertyKey)) {
                        continue;
                    } else {
                        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.f16839j;
                        LinkedHashMap linkedHashMap = semanticsConfiguration.f16815a;
                        if (linkedHashMap.containsKey(semanticsPropertyKey2)) {
                            continue;
                        } else {
                            NodeCoordinator c3 = semanticsNode2.c();
                            if (c3 == null) {
                                InlineClassHelperKt.c("Expected semantics node to have a coordinator.");
                                throw null;
                            }
                            IntRect b2 = IntRectKt.b(LayoutCoordinatesKt.b(c3));
                            if (b2.f17490a < b2.f17492c && b2.f17491b < b2.d) {
                                p pVar = (p) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsActions.e);
                                Object obj = linkedHashMap.get(SemanticsProperties.f16846q);
                                ScrollAxisRange scrollAxisRange = (ScrollAxisRange) (obj != null ? obj : null);
                                if (pVar == null || scrollAxisRange == null || ((Number) scrollAxisRange.f16791b.invoke()).floatValue() <= 0.0f) {
                                    g2 = semanticsNode2.g(false, false, false);
                                } else {
                                    int i3 = i2 + 1;
                                    ((ScrollCapture$onScrollCaptureSearch$1) lVar).invoke(new ScrollCaptureCandidate(semanticsNode2, i3, b2, c3));
                                    a(semanticsNode2, i3, lVar);
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
    }
}
