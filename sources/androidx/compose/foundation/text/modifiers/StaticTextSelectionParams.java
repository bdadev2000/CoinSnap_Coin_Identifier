package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.text.TextLayoutResult;

@StabilityInferred
/* loaded from: classes2.dex */
public class StaticTextSelectionParams {

    /* renamed from: c, reason: collision with root package name */
    public static final StaticTextSelectionParams f6954c = new StaticTextSelectionParams(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final LayoutCoordinates f6955a;

    /* renamed from: b, reason: collision with root package name */
    public final TextLayoutResult f6956b;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public StaticTextSelectionParams(LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult) {
        this.f6955a = layoutCoordinates;
        this.f6956b = textLayoutResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.layout.LayoutCoordinates] */
    public static StaticTextSelectionParams a(StaticTextSelectionParams staticTextSelectionParams, NodeCoordinator nodeCoordinator, TextLayoutResult textLayoutResult, int i2) {
        NodeCoordinator nodeCoordinator2 = nodeCoordinator;
        if ((i2 & 1) != 0) {
            nodeCoordinator2 = staticTextSelectionParams.f6955a;
        }
        if ((i2 & 2) != 0) {
            textLayoutResult = staticTextSelectionParams.f6956b;
        }
        staticTextSelectionParams.getClass();
        return new StaticTextSelectionParams(nodeCoordinator2, textLayoutResult);
    }
}
