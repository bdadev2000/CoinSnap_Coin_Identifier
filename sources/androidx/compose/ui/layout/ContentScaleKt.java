package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: ContentScale.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a\"\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a\"\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"computeFillHeight", "", "srcSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "computeFillHeight-iLBOSCw", "(JJ)F", "computeFillMaxDimension", "computeFillMaxDimension-iLBOSCw", "computeFillMinDimension", "computeFillMinDimension-iLBOSCw", "computeFillWidth", "computeFillWidth-iLBOSCw", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class ContentScaleKt {
    /* renamed from: access$computeFillHeight-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m5843access$computeFillHeightiLBOSCw(long j, long j2) {
        return m5847computeFillHeightiLBOSCw(j, j2);
    }

    /* renamed from: access$computeFillMaxDimension-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m5844access$computeFillMaxDimensioniLBOSCw(long j, long j2) {
        return m5848computeFillMaxDimensioniLBOSCw(j, j2);
    }

    /* renamed from: access$computeFillMinDimension-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m5845access$computeFillMinDimensioniLBOSCw(long j, long j2) {
        return m5849computeFillMinDimensioniLBOSCw(j, j2);
    }

    /* renamed from: access$computeFillWidth-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m5846access$computeFillWidthiLBOSCw(long j, long j2) {
        return m5850computeFillWidthiLBOSCw(j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMaxDimension-iLBOSCw, reason: not valid java name */
    public static final float m5848computeFillMaxDimensioniLBOSCw(long j, long j2) {
        return Math.max(m5850computeFillWidthiLBOSCw(j, j2), m5847computeFillHeightiLBOSCw(j, j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMinDimension-iLBOSCw, reason: not valid java name */
    public static final float m5849computeFillMinDimensioniLBOSCw(long j, long j2) {
        return Math.min(m5850computeFillWidthiLBOSCw(j, j2), m5847computeFillHeightiLBOSCw(j, j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillWidth-iLBOSCw, reason: not valid java name */
    public static final float m5850computeFillWidthiLBOSCw(long j, long j2) {
        return Size.m4343getWidthimpl(j2) / Size.m4343getWidthimpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillHeight-iLBOSCw, reason: not valid java name */
    public static final float m5847computeFillHeightiLBOSCw(long j, long j2) {
        return Size.m4340getHeightimpl(j2) / Size.m4340getHeightimpl(j);
    }
}
