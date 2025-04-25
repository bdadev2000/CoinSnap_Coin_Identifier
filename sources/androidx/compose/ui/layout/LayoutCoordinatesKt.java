package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: LayoutCoordinates.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0002\u001a\u000f\u0010\u0006\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\u000b\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b¨\u0006\f"}, d2 = {"boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsInRoot", "boundsInWindow", "findRootCoordinates", "positionInParent", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInRoot", "positionInWindow", "positionOnScreen", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class LayoutCoordinatesKt {
    public static final long positionInRoot(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo5862localToRootMKHz9U(Offset.INSTANCE.m4290getZeroF1C5BW0());
    }

    public static final long positionInWindow(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo5864localToWindowMKHz9U(Offset.INSTANCE.m4290getZeroF1C5BW0());
    }

    public static final long positionOnScreen(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo5863localToScreenMKHz9U(Offset.INSTANCE.m4290getZeroF1C5BW0());
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates) {
        return LayoutCoordinates.localBoundingBoxOf$default(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates findRootCoordinates = findRootCoordinates(layoutCoordinates);
        float m7167getWidthimpl = IntSize.m7167getWidthimpl(findRootCoordinates.mo5859getSizeYbymL2g());
        float m7166getHeightimpl = IntSize.m7166getHeightimpl(findRootCoordinates.mo5859getSizeYbymL2g());
        Rect boundsInRoot = boundsInRoot(layoutCoordinates);
        float left = boundsInRoot.getLeft();
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > m7167getWidthimpl) {
            left = m7167getWidthimpl;
        }
        float top = boundsInRoot.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > m7166getHeightimpl) {
            top = m7166getHeightimpl;
        }
        float right = boundsInRoot.getRight();
        if (right < 0.0f) {
            right = 0.0f;
        }
        if (right <= m7167getWidthimpl) {
            m7167getWidthimpl = right;
        }
        float bottom = boundsInRoot.getBottom();
        float f = bottom >= 0.0f ? bottom : 0.0f;
        if (f <= m7166getHeightimpl) {
            m7166getHeightimpl = f;
        }
        if (left == m7167getWidthimpl || top == m7166getHeightimpl) {
            return Rect.INSTANCE.getZero();
        }
        long mo5864localToWindowMKHz9U = findRootCoordinates.mo5864localToWindowMKHz9U(OffsetKt.Offset(left, top));
        long mo5864localToWindowMKHz9U2 = findRootCoordinates.mo5864localToWindowMKHz9U(OffsetKt.Offset(m7167getWidthimpl, top));
        long mo5864localToWindowMKHz9U3 = findRootCoordinates.mo5864localToWindowMKHz9U(OffsetKt.Offset(m7167getWidthimpl, m7166getHeightimpl));
        long mo5864localToWindowMKHz9U4 = findRootCoordinates.mo5864localToWindowMKHz9U(OffsetKt.Offset(left, m7166getHeightimpl));
        float m4274getXimpl = Offset.m4274getXimpl(mo5864localToWindowMKHz9U);
        float m4274getXimpl2 = Offset.m4274getXimpl(mo5864localToWindowMKHz9U2);
        float m4274getXimpl3 = Offset.m4274getXimpl(mo5864localToWindowMKHz9U4);
        float m4274getXimpl4 = Offset.m4274getXimpl(mo5864localToWindowMKHz9U3);
        float min = Math.min(m4274getXimpl, Math.min(m4274getXimpl2, Math.min(m4274getXimpl3, m4274getXimpl4)));
        float max = Math.max(m4274getXimpl, Math.max(m4274getXimpl2, Math.max(m4274getXimpl3, m4274getXimpl4)));
        float m4275getYimpl = Offset.m4275getYimpl(mo5864localToWindowMKHz9U);
        float m4275getYimpl2 = Offset.m4275getYimpl(mo5864localToWindowMKHz9U2);
        float m4275getYimpl3 = Offset.m4275getYimpl(mo5864localToWindowMKHz9U4);
        float m4275getYimpl4 = Offset.m4275getYimpl(mo5864localToWindowMKHz9U3);
        return new Rect(min, Math.min(m4275getYimpl, Math.min(m4275getYimpl2, Math.min(m4275getYimpl3, m4275getYimpl4))), max, Math.max(m4275getYimpl, Math.max(m4275getYimpl2, Math.max(m4275getYimpl3, m4275getYimpl4))));
    }

    public static final long positionInParent(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo5860localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m4290getZeroF1C5BW0()) : Offset.INSTANCE.m4290getZeroF1C5BW0();
    }

    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates) {
        Rect localBoundingBoxOf$default;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (localBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(0.0f, 0.0f, IntSize.m7167getWidthimpl(layoutCoordinates.mo5859getSizeYbymL2g()), IntSize.m7166getHeightimpl(layoutCoordinates.mo5859getSizeYbymL2g())) : localBoundingBoxOf$default;
    }

    public static final LayoutCoordinates findRootCoordinates(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates2 instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates2 : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy = nodeCoordinator.getWrappedBy();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator != null) {
                wrappedBy = nodeCoordinator.getWrappedBy();
            } else {
                return nodeCoordinator3;
            }
        }
    }
}
