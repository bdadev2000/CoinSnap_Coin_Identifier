package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.cmsui.common.CmsUILogEvents;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* compiled from: FlowLayout.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001ag\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001ag\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u001b2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u001d\u001a%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010!\u001a5\u0010\"\u001a\u00020#2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\u0010&\u001a\u0095\u0001\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2#\u0010,\u001a\u001f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0-¢\u0006\u0002\b\u00172#\u0010.\u001a\u001f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0-¢\u0006\u0002\b\u00172\u0006\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020%H\u0002¢\u0006\u0002\u00102\u001a[\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002042\u0006\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020%H\u0002¢\u0006\u0002\u00106\u001aS\u00107\u001a\u00020\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2#\u0010,\u001a\u001f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0-¢\u0006\u0002\b\u00172\u0006\u00108\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0002\u001a\u0090\u0001\u00109\u001a\u00020\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2#\u0010,\u001a\u001f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0-¢\u0006\u0002\b\u00172#\u0010.\u001a\u001f\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0-¢\u0006\u0002\b\u00172\u0006\u00108\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020%H\u0002\u001a%\u0010:\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010;\u001a5\u0010<\u001a\u00020#2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\u0010=\u001a\\\u0010>\u001a\u00020?*\u00020@2\u0006\u0010A\u001a\u00020B2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020J2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020%H\u0000ø\u0001\u0000¢\u0006\u0004\bK\u0010L\u001a\u001c\u0010M\u001a\u00020\u000f*\u00020+2\u0006\u0010N\u001a\u00020O2\u0006\u0010,\u001a\u00020\u000fH\u0000\u001a\u001c\u0010P\u001a\u00020\u000f*\u00020+2\u0006\u0010N\u001a\u00020O2\u0006\u0010.\u001a\u00020\u000fH\u0000\u001a<\u0010Q\u001a\u00020(*\u00020E2\u0006\u0010A\u001a\u00020B2\u0006\u0010I\u001a\u00020R2\u0014\u0010S\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010T\u0012\u0004\u0012\u00020\u00070\u0014H\u0000ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001aT\u0010W\u001a\u00020?*\u00020@2\u0006\u0010I\u001a\u00020J2\u0006\u0010X\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020\u000f2\u0006\u00105\u001a\u0002042\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020?0[2\u0006\u0010\\\u001a\u00020B2\u0006\u0010]\u001a\u000204H\u0000ø\u0001\u0000¢\u0006\u0004\b^\u0010_\u001a\u001e\u0010`\u001a\u0004\u0018\u00010E*\b\u0012\u0004\u0012\u00020E0D2\b\u0010a\u001a\u0004\u0018\u00010bH\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006c"}, d2 = {"CROSS_AXIS_ALIGNMENT_START", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCROSS_AXIS_ALIGNMENT_START", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_TOP", "getCROSS_AXIS_ALIGNMENT_TOP", "FlowColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "maxItemsInEachColumn", "", "maxLines", "overflow", "Landroidx/compose/foundation/layout/FlowColumnOverflow;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IILandroidx/compose/foundation/layout/FlowColumnOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FlowRow", "maxItemsInEachRow", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "Landroidx/compose/foundation/layout/FlowRowScope;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "columnMeasurementHelper", "Landroidx/compose/ui/layout/MeasurePolicy;", "maxItemsInMainAxis", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurementMultiContentHelper", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "overflowState", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "intrinsicCrossAxisSize", "Landroidx/collection/IntIntPair;", "children", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "mainAxisSize", "Lkotlin/Function3;", "crossAxisSize", "mainAxisAvailable", "mainAxisSpacing", "crossAxisSpacing", "(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "mainAxisSizes", "", "crossAxisSizes", "(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "maxIntrinsicMainAxisSize", "crossAxisAvailable", "minIntrinsicMainAxisSize", "rowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "rowMeasurementMultiContentHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "breakDownItems", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurePolicy", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "measurablesIterator", "", "Landroidx/compose/ui/layout/Measurable;", "mainAxisSpacingDp", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacingDp", "constraints", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "breakDownItems-di9J0FM", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Ljava/util/Iterator;FFJIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)Landroidx/compose/ui/layout/MeasureResult;", "crossAxisMin", "isHorizontal", "", "mainAxisMin", "measureAndCache", "Landroidx/compose/ui/unit/Constraints;", "storePlaceable", "Landroidx/compose/ui/layout/Placeable;", "measureAndCache-rqJ1uqs", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function1;)J", "placeHelper", "mainAxisTotalSize", "crossAxisTotalSize", FirebaseAnalytics.Param.ITEMS, "Landroidx/compose/runtime/collection/MutableVector;", "measureHelper", "outPosition", "placeHelper-BmaY500", "(Landroidx/compose/ui/layout/MeasureScope;JII[ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;[I)Landroidx/compose/ui/layout/MeasureResult;", "safeNext", CmsUILogEvents.INFO, "Landroidx/compose/foundation/layout/FlowLineInfo;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class FlowLayoutKt {
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_TOP = CrossAxisAlignment.INSTANCE.vertical$foundation_layout_release(Alignment.INSTANCE.getTop());
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_START = CrossAxisAlignment.INSTANCE.horizontal$foundation_layout_release(Alignment.INSTANCE.getStart());

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b4, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FlowRow(androidx.compose.ui.Modifier r19, androidx.compose.foundation.layout.Arrangement.Horizontal r20, androidx.compose.foundation.layout.Arrangement.Vertical r21, int r22, int r23, androidx.compose.foundation.layout.FlowRowOverflow r24, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowRowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, int, int, androidx.compose.foundation.layout.FlowRowOverflow, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b4, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FlowColumn(androidx.compose.ui.Modifier r19, androidx.compose.foundation.layout.Arrangement.Vertical r20, androidx.compose.foundation.layout.Arrangement.Horizontal r21, int r22, int r23, androidx.compose.foundation.layout.FlowColumnOverflow r24, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, int, int, androidx.compose.foundation.layout.FlowColumnOverflow, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        if (r20.changed(r17) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.layout.MeasurePolicy rowMeasurementHelper(androidx.compose.foundation.layout.Arrangement.Horizontal r17, androidx.compose.foundation.layout.Arrangement.Vertical r18, int r19, androidx.compose.runtime.Composer r20, int r21) {
        /*
            r0 = r20
            r1 = r21
            java.lang.String r2 = "C(rowMeasurementHelper)P(!1,2)380@13086L883:FlowLayout.kt#2w3rfo"
            r3 = 1479255111(0x582ba447, float:7.548882E14)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r0, r3, r2)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L18
            r2 = -1
            java.lang.String r4 = "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:379)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r2, r4)
        L18:
            r2 = -75342195(0xfffffffffb825e8d, float:-1.3538326E36)
            java.lang.String r3 = "CC(remember):FlowLayout.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r0, r2, r3)
            r2 = r1 & 14
            r2 = r2 ^ 6
            r3 = 4
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L32
            r2 = r17
            boolean r6 = r0.changed(r2)
            if (r6 != 0) goto L38
            goto L34
        L32:
            r2 = r17
        L34:
            r6 = r1 & 6
            if (r6 != r3) goto L3a
        L38:
            r3 = r5
            goto L3b
        L3a:
            r3 = r4
        L3b:
            r6 = r1 & 112(0x70, float:1.57E-43)
            r6 = r6 ^ 48
            r7 = 32
            r9 = r18
            if (r6 <= r7) goto L4b
            boolean r6 = r0.changed(r9)
            if (r6 != 0) goto L4f
        L4b:
            r6 = r1 & 48
            if (r6 != r7) goto L51
        L4f:
            r6 = r5
            goto L52
        L51:
            r6 = r4
        L52:
            r3 = r3 | r6
            r6 = r1 & 896(0x380, float:1.256E-42)
            r6 = r6 ^ 384(0x180, float:5.38E-43)
            r7 = 256(0x100, float:3.59E-43)
            r13 = r19
            if (r6 <= r7) goto L63
            boolean r6 = r0.changed(r13)
            if (r6 != 0) goto L67
        L63:
            r1 = r1 & 384(0x180, float:5.38E-43)
            if (r1 != r7) goto L68
        L67:
            r4 = r5
        L68:
            r1 = r3 | r4
            java.lang.Object r3 = r20.rememberedValue()
            if (r1 != 0) goto L78
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.INSTANCE
            java.lang.Object r1 = r1.getEmpty()
            if (r3 != r1) goto Lab
        L78:
            float r10 = r17.getSpacing()
            androidx.compose.foundation.layout.CrossAxisAlignment r11 = androidx.compose.foundation.layout.FlowLayoutKt.CROSS_AXIS_ALIGNMENT_TOP
            float r12 = r18.getSpacing()
            androidx.compose.foundation.layout.FlowRowOverflow$Companion r1 = androidx.compose.foundation.layout.FlowRowOverflow.INSTANCE
            androidx.compose.foundation.layout.FlowRowOverflow r1 = r1.getVisible()
            androidx.compose.foundation.layout.FlowLayoutOverflowState r15 = r1.createOverflowState$foundation_layout_release()
            androidx.compose.foundation.layout.FlowMeasurePolicy r1 = new androidx.compose.foundation.layout.FlowMeasurePolicy
            r14 = 2147483647(0x7fffffff, float:NaN)
            r16 = 0
            r7 = 1
            r6 = r1
            r8 = r17
            r9 = r18
            r13 = r19
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            androidx.compose.ui.layout.MultiContentMeasurePolicy r1 = (androidx.compose.ui.layout.MultiContentMeasurePolicy) r1
            androidx.compose.foundation.layout.FlowLayoutKt$rowMeasurementHelper$1$1 r2 = new androidx.compose.foundation.layout.FlowLayoutKt$rowMeasurementHelper$1$1
            r2.<init>()
            r3 = r2
            androidx.compose.ui.layout.MeasurePolicy r3 = (androidx.compose.ui.layout.MeasurePolicy) r3
            r0.updateRememberedValue(r3)
        Lab:
            androidx.compose.ui.layout.MeasurePolicy r3 = (androidx.compose.ui.layout.MeasurePolicy) r3
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r20)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto Lb9
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Lb9:
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r20)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.rowMeasurementHelper(androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, int, androidx.compose.runtime.Composer, int):androidx.compose.ui.layout.MeasurePolicy");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        if (r22.changed(r17) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.layout.MultiContentMeasurePolicy rowMeasurementMultiContentHelper(androidx.compose.foundation.layout.Arrangement.Horizontal r17, androidx.compose.foundation.layout.Arrangement.Vertical r18, int r19, int r20, androidx.compose.foundation.layout.FlowLayoutOverflowState r21, androidx.compose.runtime.Composer r22, int r23) {
        /*
            r0 = r22
            r1 = r23
            java.lang.String r2 = "C(rowMeasurementMultiContentHelper)P(!1,4)414@14301L649:FlowLayout.kt#2w3rfo"
            r3 = -2134502475(0xffffffff80c613b5, float:-1.8190498E-38)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r0, r3, r2)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L18
            r2 = -1
            java.lang.String r4 = "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:413)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r2, r4)
        L18:
            r2 = 744443043(0x2c5f4ca3, float:3.1732748E-12)
            java.lang.String r3 = "CC(remember):FlowLayout.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r0, r2, r3)
            r2 = r1 & 14
            r2 = r2 ^ 6
            r3 = 4
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L32
            r2 = r17
            boolean r6 = r0.changed(r2)
            if (r6 != 0) goto L38
            goto L34
        L32:
            r2 = r17
        L34:
            r6 = r1 & 6
            if (r6 != r3) goto L3a
        L38:
            r3 = r5
            goto L3b
        L3a:
            r3 = r4
        L3b:
            r6 = r1 & 112(0x70, float:1.57E-43)
            r6 = r6 ^ 48
            r7 = 32
            r9 = r18
            if (r6 <= r7) goto L4b
            boolean r6 = r0.changed(r9)
            if (r6 != 0) goto L4f
        L4b:
            r6 = r1 & 48
            if (r6 != r7) goto L51
        L4f:
            r6 = r5
            goto L52
        L51:
            r6 = r4
        L52:
            r3 = r3 | r6
            r6 = r1 & 896(0x380, float:1.256E-42)
            r6 = r6 ^ 384(0x180, float:5.38E-43)
            r7 = 256(0x100, float:3.59E-43)
            r13 = r19
            if (r6 <= r7) goto L63
            boolean r6 = r0.changed(r13)
            if (r6 != 0) goto L67
        L63:
            r6 = r1 & 384(0x180, float:5.38E-43)
            if (r6 != r7) goto L69
        L67:
            r6 = r5
            goto L6a
        L69:
            r6 = r4
        L6a:
            r3 = r3 | r6
            r6 = r1 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 ^ 3072(0xc00, float:4.305E-42)
            r7 = 2048(0x800, float:2.87E-42)
            r14 = r20
            if (r6 <= r7) goto L7b
            boolean r6 = r0.changed(r14)
            if (r6 != 0) goto L7f
        L7b:
            r1 = r1 & 3072(0xc00, float:4.305E-42)
            if (r1 != r7) goto L80
        L7f:
            r4 = r5
        L80:
            r1 = r3 | r4
            r3 = r21
            boolean r4 = r0.changed(r3)
            r1 = r1 | r4
            java.lang.Object r4 = r22.rememberedValue()
            if (r1 != 0) goto L97
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.INSTANCE
            java.lang.Object r1 = r1.getEmpty()
            if (r4 != r1) goto Lb7
        L97:
            float r10 = r17.getSpacing()
            androidx.compose.foundation.layout.CrossAxisAlignment r11 = androidx.compose.foundation.layout.FlowLayoutKt.CROSS_AXIS_ALIGNMENT_TOP
            float r12 = r18.getSpacing()
            androidx.compose.foundation.layout.FlowMeasurePolicy r4 = new androidx.compose.foundation.layout.FlowMeasurePolicy
            r7 = 1
            r16 = 0
            r6 = r4
            r8 = r17
            r9 = r18
            r13 = r19
            r14 = r20
            r15 = r21
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.updateRememberedValue(r4)
        Lb7:
            androidx.compose.foundation.layout.FlowMeasurePolicy r4 = (androidx.compose.foundation.layout.FlowMeasurePolicy) r4
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r22)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto Lc5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Lc5:
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r22)
            androidx.compose.ui.layout.MultiContentMeasurePolicy r4 = (androidx.compose.ui.layout.MultiContentMeasurePolicy) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.rowMeasurementMultiContentHelper(androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, int, int, androidx.compose.foundation.layout.FlowLayoutOverflowState, androidx.compose.runtime.Composer, int):androidx.compose.ui.layout.MultiContentMeasurePolicy");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        if (r20.changed(r17) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.layout.MeasurePolicy columnMeasurementHelper(androidx.compose.foundation.layout.Arrangement.Vertical r17, androidx.compose.foundation.layout.Arrangement.Horizontal r18, int r19, androidx.compose.runtime.Composer r20, int r21) {
        /*
            r0 = r20
            r1 = r21
            java.lang.String r2 = "C(columnMeasurementHelper)P(2)443@15212L856:FlowLayout.kt#2w3rfo"
            r3 = -2013098357(0xffffffff88028e8b, float:-3.928801E-34)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r0, r3, r2)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L18
            r2 = -1
            java.lang.String r4 = "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:442)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r2, r4)
        L18:
            r2 = 1837869538(0x6d8ba9e2, float:5.402974E27)
            java.lang.String r3 = "CC(remember):FlowLayout.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r0, r2, r3)
            r2 = r1 & 14
            r2 = r2 ^ 6
            r3 = 4
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L32
            r2 = r17
            boolean r6 = r0.changed(r2)
            if (r6 != 0) goto L38
            goto L34
        L32:
            r2 = r17
        L34:
            r6 = r1 & 6
            if (r6 != r3) goto L3a
        L38:
            r3 = r5
            goto L3b
        L3a:
            r3 = r4
        L3b:
            r6 = r1 & 112(0x70, float:1.57E-43)
            r6 = r6 ^ 48
            r7 = 32
            r8 = r18
            if (r6 <= r7) goto L4b
            boolean r6 = r0.changed(r8)
            if (r6 != 0) goto L4f
        L4b:
            r6 = r1 & 48
            if (r6 != r7) goto L51
        L4f:
            r6 = r5
            goto L52
        L51:
            r6 = r4
        L52:
            r3 = r3 | r6
            r6 = r1 & 896(0x380, float:1.256E-42)
            r6 = r6 ^ 384(0x180, float:5.38E-43)
            r7 = 256(0x100, float:3.59E-43)
            r13 = r19
            if (r6 <= r7) goto L63
            boolean r6 = r0.changed(r13)
            if (r6 != 0) goto L67
        L63:
            r1 = r1 & 384(0x180, float:5.38E-43)
            if (r1 != r7) goto L68
        L67:
            r4 = r5
        L68:
            r1 = r3 | r4
            java.lang.Object r3 = r20.rememberedValue()
            if (r1 != 0) goto L78
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.INSTANCE
            java.lang.Object r1 = r1.getEmpty()
            if (r3 != r1) goto La9
        L78:
            float r10 = r17.getSpacing()
            androidx.compose.foundation.layout.CrossAxisAlignment r11 = androidx.compose.foundation.layout.FlowLayoutKt.CROSS_AXIS_ALIGNMENT_START
            float r12 = r18.getSpacing()
            androidx.compose.foundation.layout.FlowRowOverflow$Companion r1 = androidx.compose.foundation.layout.FlowRowOverflow.INSTANCE
            androidx.compose.foundation.layout.FlowRowOverflow r1 = r1.getVisible()
            androidx.compose.foundation.layout.FlowLayoutOverflowState r15 = r1.createOverflowState$foundation_layout_release()
            androidx.compose.foundation.layout.FlowMeasurePolicy r1 = new androidx.compose.foundation.layout.FlowMeasurePolicy
            r14 = 2147483647(0x7fffffff, float:NaN)
            r16 = 0
            r7 = 0
            r6 = r1
            r8 = r18
            r9 = r17
            r13 = r19
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            androidx.compose.foundation.layout.FlowLayoutKt$columnMeasurementHelper$1$1 r2 = new androidx.compose.foundation.layout.FlowLayoutKt$columnMeasurementHelper$1$1
            r2.<init>()
            r3 = r2
            androidx.compose.ui.layout.MeasurePolicy r3 = (androidx.compose.ui.layout.MeasurePolicy) r3
            r0.updateRememberedValue(r3)
        La9:
            androidx.compose.ui.layout.MeasurePolicy r3 = (androidx.compose.ui.layout.MeasurePolicy) r3
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r20)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto Lb7
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Lb7:
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r20)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.columnMeasurementHelper(androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, int, androidx.compose.runtime.Composer, int):androidx.compose.ui.layout.MeasurePolicy");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        if (r22.changed(r17) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.layout.MultiContentMeasurePolicy columnMeasurementMultiContentHelper(androidx.compose.foundation.layout.Arrangement.Vertical r17, androidx.compose.foundation.layout.Arrangement.Horizontal r18, int r19, int r20, androidx.compose.foundation.layout.FlowLayoutOverflowState r21, androidx.compose.runtime.Composer r22, int r23) {
        /*
            r0 = r22
            r1 = r23
            java.lang.String r2 = "C(columnMeasurementMultiContentHelper)P(4)475@16365L652:FlowLayout.kt#2w3rfo"
            r3 = 748776953(0x2ca16df9, float:4.5881046E-12)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r0, r3, r2)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L18
            r2 = -1
            java.lang.String r4 = "androidx.compose.foundation.layout.columnMeasurementMultiContentHelper (FlowLayout.kt:474)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r1, r2, r4)
        L18:
            r2 = 287541334(0x11238856, float:1.2900445E-28)
            java.lang.String r3 = "CC(remember):FlowLayout.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r0, r2, r3)
            r2 = r1 & 14
            r2 = r2 ^ 6
            r3 = 4
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L32
            r2 = r17
            boolean r6 = r0.changed(r2)
            if (r6 != 0) goto L38
            goto L34
        L32:
            r2 = r17
        L34:
            r6 = r1 & 6
            if (r6 != r3) goto L3a
        L38:
            r3 = r5
            goto L3b
        L3a:
            r3 = r4
        L3b:
            r6 = r1 & 112(0x70, float:1.57E-43)
            r6 = r6 ^ 48
            r7 = 32
            r8 = r18
            if (r6 <= r7) goto L4b
            boolean r6 = r0.changed(r8)
            if (r6 != 0) goto L4f
        L4b:
            r6 = r1 & 48
            if (r6 != r7) goto L51
        L4f:
            r6 = r5
            goto L52
        L51:
            r6 = r4
        L52:
            r3 = r3 | r6
            r6 = r1 & 896(0x380, float:1.256E-42)
            r6 = r6 ^ 384(0x180, float:5.38E-43)
            r7 = 256(0x100, float:3.59E-43)
            r13 = r19
            if (r6 <= r7) goto L63
            boolean r6 = r0.changed(r13)
            if (r6 != 0) goto L67
        L63:
            r6 = r1 & 384(0x180, float:5.38E-43)
            if (r6 != r7) goto L69
        L67:
            r6 = r5
            goto L6a
        L69:
            r6 = r4
        L6a:
            r3 = r3 | r6
            r6 = r1 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 ^ 3072(0xc00, float:4.305E-42)
            r7 = 2048(0x800, float:2.87E-42)
            r14 = r20
            if (r6 <= r7) goto L7b
            boolean r6 = r0.changed(r14)
            if (r6 != 0) goto L7f
        L7b:
            r1 = r1 & 3072(0xc00, float:4.305E-42)
            if (r1 != r7) goto L80
        L7f:
            r4 = r5
        L80:
            r1 = r3 | r4
            r3 = r21
            boolean r4 = r0.changed(r3)
            r1 = r1 | r4
            java.lang.Object r4 = r22.rememberedValue()
            if (r1 != 0) goto L97
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.INSTANCE
            java.lang.Object r1 = r1.getEmpty()
            if (r4 != r1) goto Lb7
        L97:
            float r10 = r17.getSpacing()
            androidx.compose.foundation.layout.CrossAxisAlignment r11 = androidx.compose.foundation.layout.FlowLayoutKt.CROSS_AXIS_ALIGNMENT_START
            float r12 = r18.getSpacing()
            androidx.compose.foundation.layout.FlowMeasurePolicy r4 = new androidx.compose.foundation.layout.FlowMeasurePolicy
            r7 = 0
            r16 = 0
            r6 = r4
            r8 = r18
            r9 = r17
            r13 = r19
            r14 = r20
            r15 = r21
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.updateRememberedValue(r4)
        Lb7:
            androidx.compose.foundation.layout.FlowMeasurePolicy r4 = (androidx.compose.foundation.layout.FlowMeasurePolicy) r4
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r22)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto Lc5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Lc5:
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r22)
            androidx.compose.ui.layout.MultiContentMeasurePolicy r4 = (androidx.compose.ui.layout.MultiContentMeasurePolicy) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.columnMeasurementMultiContentHelper(androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, int, int, androidx.compose.foundation.layout.FlowLayoutOverflowState, androidx.compose.runtime.Composer, int):androidx.compose.ui.layout.MultiContentMeasurePolicy");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r5v13, types: [kotlin.collections.IntIterator] */
    public static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int i, int i2, int i3, int i4, int i5, FlowLayoutOverflowState flowLayoutOverflowState) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i6 = 0; i6 < size; i6++) {
            iArr[i6] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i7 = 0; i7 < size2; i7++) {
            iArr2[i7] = 0;
        }
        int size3 = list.size();
        for (int i8 = 0; i8 < size3; i8++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i8);
            int intValue = function3.invoke(intrinsicMeasurable, Integer.valueOf(i8), Integer.valueOf(i)).intValue();
            iArr[i8] = intValue;
            iArr2[i8] = function32.invoke(intrinsicMeasurable, Integer.valueOf(i8), Integer.valueOf(intValue)).intValue();
        }
        int i9 = Integer.MAX_VALUE;
        if (i5 != Integer.MAX_VALUE && i4 != Integer.MAX_VALUE) {
            i9 = i4 * i5;
        }
        int min = Math.min(i9 - (((i9 >= list.size() || !(flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandIndicator || flowLayoutOverflowState.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i9 < list.size() || i5 < flowLayoutOverflowState.getMinLinesToShowCollapse$foundation_layout_release() || flowLayoutOverflowState.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), list.size());
        int sum = ArraysKt.sum(iArr) + ((list.size() - 1) * i2);
        if (size2 != 0) {
            int i10 = iArr2[0];
            ?? it = new IntRange(1, ArraysKt.getLastIndex(iArr2)).iterator();
            while (it.hasNext()) {
                int i11 = iArr2[it.nextInt()];
                if (i10 < i11) {
                    i10 = i11;
                }
            }
            if (size != 0) {
                int i12 = iArr[0];
                ?? it2 = new IntRange(1, ArraysKt.getLastIndex(iArr)).iterator();
                while (it2.hasNext()) {
                    int i13 = iArr[it2.nextInt()];
                    if (i12 < i13) {
                        i12 = i13;
                    }
                }
                int i14 = i12;
                int i15 = sum;
                while (i14 <= i15 && i10 != i) {
                    int i16 = (i14 + i15) / 2;
                    int i17 = i15;
                    int i18 = i14;
                    long intrinsicCrossAxisSize = intrinsicCrossAxisSize(list, iArr, iArr2, i16, i2, i3, i4, i5, flowLayoutOverflowState);
                    i10 = IntIntPair.m332getFirstimpl(intrinsicCrossAxisSize);
                    int m333getSecondimpl = IntIntPair.m333getSecondimpl(intrinsicCrossAxisSize);
                    if (i10 > i || m333getSecondimpl < min) {
                        i14 = i16 + 1;
                        if (i14 > i17) {
                            return i14;
                        }
                        i15 = i17;
                        sum = i16;
                    } else {
                        if (i10 >= i) {
                            return i16;
                        }
                        i15 = i16 - 1;
                        sum = i16;
                        i14 = i18;
                    }
                }
                return sum;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    private static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, final int[] iArr, final int[] iArr2, int i, int i2, int i3, int i4, int i5, FlowLayoutOverflowState flowLayoutOverflowState) {
        return intrinsicCrossAxisSize(list, new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$intrinsicCrossAxisSize$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i6, int i7) {
                return Integer.valueOf(iArr[i6]);
            }
        }, new Function3<IntrinsicMeasurable, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$intrinsicCrossAxisSize$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num, Integer num2) {
                return invoke(intrinsicMeasurable, num.intValue(), num2.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i6, int i7) {
                return Integer.valueOf(iArr2[i6]);
            }
        }, i, i2, i3, i4, i5, flowLayoutOverflowState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int i, int i2, int i3, int i4, int i5, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i6;
        int i7;
        int i8 = 0;
        if (list.isEmpty()) {
            return IntIntPair.m328constructorimpl(0, 0);
        }
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i4, flowLayoutOverflowState, OrientationIndependentConstraints.m952constructorimpl(0, i, 0, Integer.MAX_VALUE), i5, i2, i3, null);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.getOrNull(list, 0);
        int intValue = intrinsicMeasurable != null ? function32.invoke(intrinsicMeasurable, 0, Integer.valueOf(i)).intValue() : 0;
        int intValue2 = intrinsicMeasurable != null ? function3.invoke(intrinsicMeasurable, 0, Integer.valueOf(intValue)).intValue() : 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        if (flowLayoutBuildingBlocks.m908getWrapInfoOpUlnko(list.size() > 1, 0, IntIntPair.m328constructorimpl(i, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : IntIntPair.m325boximpl(IntIntPair.m328constructorimpl(intValue2, intValue)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
            IntIntPair m913ellipsisSizeF35zmw$foundation_layout_release = flowLayoutOverflowState.m913ellipsisSizeF35zmw$foundation_layout_release(intrinsicMeasurable != null, 0, 0);
            return IntIntPair.m328constructorimpl(m913ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m333getSecondimpl(m913ellipsisSizeF35zmw$foundation_layout_release.getPackedValue()) : 0, 0);
        }
        int size = list.size();
        int i12 = i;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i13 >= size) {
                i6 = i14;
                break;
            }
            int i16 = i12 - intValue2;
            i6 = i13 + 1;
            int max = Math.max(i11, intValue);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.getOrNull(list, i6);
            int intValue3 = intrinsicMeasurable2 != null ? function32.invoke(intrinsicMeasurable2, Integer.valueOf(i6), Integer.valueOf(i)).intValue() : i8;
            int intValue4 = intrinsicMeasurable2 != null ? function3.invoke(intrinsicMeasurable2, Integer.valueOf(i6), Integer.valueOf(intValue3)).intValue() + i2 : 0;
            boolean z = i13 + 2 < list.size();
            int i17 = i6 - i15;
            FlowLayoutBuildingBlocks.WrapInfo m908getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m908getWrapInfoOpUlnko(z, i17, IntIntPair.m328constructorimpl(i16, Integer.MAX_VALUE), intrinsicMeasurable2 == null ? null : IntIntPair.m325boximpl(IntIntPair.m328constructorimpl(intValue4, intValue3)), i9, i10, max, false, false);
            if (m908getWrapInfoOpUlnko.getIsLastItemInLine()) {
                i10 += max + i3;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m908getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i9, i10, i16, i17);
                int i18 = intValue4 - i2;
                i9++;
                if (!m908getWrapInfoOpUlnko.getIsLastItemInContainer()) {
                    i7 = i;
                    intValue2 = i18;
                    i15 = i6;
                    i11 = 0;
                } else if (wrapEllipsisInfo != null) {
                    long ellipsisSize = wrapEllipsisInfo.getEllipsisSize();
                    if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                        i10 += IntIntPair.m333getSecondimpl(ellipsisSize) + i3;
                    }
                }
            } else {
                i11 = max;
                i7 = i16;
                intValue2 = intValue4;
            }
            i13 = i6;
            i14 = i13;
            i8 = 0;
            i12 = i7;
            intValue = intValue3;
        }
        return IntIntPair.m328constructorimpl(i10 - i3, i6);
    }

    private static final Measurable safeNext(Iterator<? extends Measurable> it, FlowLineInfo flowLineInfo) {
        Measurable next;
        try {
            if (it instanceof ContextualFlowItemIterator) {
                Intrinsics.checkNotNull(flowLineInfo);
                next = ((ContextualFlowItemIterator) it).getNext$foundation_layout_release(flowLineInfo);
            } else {
                next = it.next();
            }
            return next;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static final int mainAxisMin(IntrinsicMeasurable intrinsicMeasurable, boolean z, int i) {
        if (z) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    public static final int crossAxisMin(IntrinsicMeasurable intrinsicMeasurable, boolean z, int i) {
        if (z) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_TOP() {
        return CROSS_AXIS_ALIGNMENT_TOP;
    }

    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_START() {
        return CROSS_AXIS_ALIGNMENT_START;
    }

    /* renamed from: measureAndCache-rqJ1uqs, reason: not valid java name */
    public static final long m911measureAndCacherqJ1uqs(Measurable measurable, FlowLineMeasurePolicy flowLineMeasurePolicy, long j, Function1<? super Placeable, Unit> function1) {
        FlowLayoutData flowLayoutData;
        Measurable measurable2 = measurable;
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable2)) == 0.0f) {
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(measurable2);
            if (((rowColumnParentData == null || (flowLayoutData = rowColumnParentData.getFlowLayoutData()) == null) ? null : Float.valueOf(flowLayoutData.getFillCrossAxisFraction())) == null) {
                Placeable mo5851measureBRTryo0 = measurable.mo5851measureBRTryo0(j);
                function1.invoke(mo5851measureBRTryo0);
                return IntIntPair.m328constructorimpl(flowLineMeasurePolicy.mainAxisSize(mo5851measureBRTryo0), flowLineMeasurePolicy.crossAxisSize(mo5851measureBRTryo0));
            }
        }
        int mainAxisMin = mainAxisMin(measurable2, flowLineMeasurePolicy.isHorizontal(), Integer.MAX_VALUE);
        return IntIntPair.m328constructorimpl(mainAxisMin, crossAxisMin(measurable2, flowLineMeasurePolicy.isHorizontal(), mainAxisMin));
    }

    /* renamed from: placeHelper-BmaY500, reason: not valid java name */
    public static final MeasureResult m912placeHelperBmaY500(MeasureScope measureScope, long j, int i, int i2, int[] iArr, final MutableVector<MeasureResult> mutableVector, FlowLineMeasurePolicy flowLineMeasurePolicy, int[] iArr2) {
        int i3;
        boolean isHorizontal = flowLineMeasurePolicy.isHorizontal();
        Arrangement.Vertical verticalArrangement = flowLineMeasurePolicy.getVerticalArrangement();
        Arrangement.Horizontal horizontalArrangement = flowLineMeasurePolicy.getHorizontalArrangement();
        if (isHorizontal) {
            if (verticalArrangement == null) {
                throw new IllegalArgumentException("null verticalArrangement".toString());
            }
            i3 = RangesKt.coerceIn((measureScope.mo671roundToPx0680j_4(verticalArrangement.getSpacing()) * (mutableVector.getSize() - 1)) + i2, Constraints.m6951getMinHeightimpl(j), Constraints.m6949getMaxHeightimpl(j));
            verticalArrangement.arrange(measureScope, i3, iArr, iArr2);
        } else {
            if (horizontalArrangement == null) {
                throw new IllegalArgumentException("null horizontalArrangement".toString());
            }
            int coerceIn = RangesKt.coerceIn((measureScope.mo671roundToPx0680j_4(horizontalArrangement.getSpacing()) * (mutableVector.getSize() - 1)) + i2, Constraints.m6951getMinHeightimpl(j), Constraints.m6949getMaxHeightimpl(j));
            horizontalArrangement.arrange(measureScope, coerceIn, iArr, measureScope.getLayoutDirection(), iArr2);
            i3 = coerceIn;
        }
        int coerceIn2 = RangesKt.coerceIn(i, Constraints.m6952getMinWidthimpl(j), Constraints.m6950getMaxWidthimpl(j));
        if (!isHorizontal) {
            int i4 = i3;
            i3 = coerceIn2;
            coerceIn2 = i4;
        }
        return MeasureScope.layout$default(measureScope, coerceIn2, i3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$placeHelper$5
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                MutableVector<MeasureResult> mutableVector2 = mutableVector;
                int size = mutableVector2.getSize();
                if (size > 0) {
                    MeasureResult[] content = mutableVector2.getContent();
                    int i5 = 0;
                    do {
                        content[i5].placeChildren();
                        i5++;
                    } while (i5 < size);
                }
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, int i, int i2, int i3) {
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < size) {
            int intValue = function3.invoke(list.get(i4), Integer.valueOf(i4), Integer.valueOf(i)).intValue() + i2;
            int i8 = i4 + 1;
            if (i8 - i6 == i3 || i8 == list.size()) {
                i5 = Math.max(i5, (i7 + intValue) - i2);
                i7 = 0;
                i6 = i4;
            } else {
                i7 += intValue;
            }
            i4 = i8;
        }
        return i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: breakDownItems-di9J0FM, reason: not valid java name */
    public static final MeasureResult m910breakDownItemsdi9J0FM(MeasureScope measureScope, FlowLineMeasurePolicy flowLineMeasurePolicy, Iterator<? extends Measurable> it, float f, float f2, long j, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState) {
        Measurable measurable;
        Integer num;
        FlowLineInfo flowLineInfo;
        Measurable measurable2;
        Ref.ObjectRef objectRef;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList;
        long j2;
        MutableIntList mutableIntList;
        MutableVector mutableVector;
        MutableIntList mutableIntList2;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo;
        MutableIntObjectMap mutableIntObjectMap;
        ArrayList arrayList2;
        int i6;
        int i7;
        int height;
        int width;
        int i8;
        MutableIntObjectMap mutableIntObjectMap2;
        ArrayList arrayList3;
        int i9;
        int i10;
        long j3;
        IntIntPair intIntPair;
        FlowLineInfo flowLineInfo2;
        IntIntPair m325boximpl;
        MutableIntList mutableIntList3;
        MutableIntList mutableIntList4;
        int i11;
        int i12;
        Integer num2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo2;
        int i18;
        int i19;
        int coerceAtLeast;
        Iterator<? extends Measurable> it2 = it;
        MutableVector mutableVector2 = new MutableVector(new MeasureResult[16], 0);
        int m6950getMaxWidthimpl = Constraints.m6950getMaxWidthimpl(j);
        int m6952getMinWidthimpl = Constraints.m6952getMinWidthimpl(j);
        int m6949getMaxHeightimpl = Constraints.m6949getMaxHeightimpl(j);
        MutableIntObjectMap mutableIntObjectMapOf = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList arrayList4 = new ArrayList();
        int ceil = (int) Math.ceil(measureScope.mo677toPx0680j_4(f));
        int ceil2 = (int) Math.ceil(measureScope.mo677toPx0680j_4(f2));
        long m952constructorimpl = OrientationIndependentConstraints.m952constructorimpl(0, m6950getMaxWidthimpl, 0, m6949getMaxHeightimpl);
        long m967toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m967toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m956copyyUG9Ft0$default(m952constructorimpl, 0, 0, 0, 0, 14, null), flowLineMeasurePolicy.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        int i20 = 0;
        FlowLineInfo flowLineInfo3 = it2 instanceof ContextualFlowItemIterator ? new FlowLineInfo(0, 0, measureScope.mo674toDpu2uoSUM(m6950getMaxWidthimpl), measureScope.mo674toDpu2uoSUM(m6949getMaxHeightimpl), null) : null;
        Measurable safeNext = !it.hasNext() ? null : safeNext(it2, flowLineInfo3);
        IntIntPair m325boximpl2 = safeNext != null ? IntIntPair.m325boximpl(m911measureAndCacherqJ1uqs(safeNext, flowLineMeasurePolicy, m967toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                invoke2(placeable);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable placeable) {
                objectRef2.element = placeable;
            }
        })) : null;
        Integer valueOf = m325boximpl2 != null ? Integer.valueOf(IntIntPair.m332getFirstimpl(m325boximpl2.getPackedValue())) : null;
        if (m325boximpl2 != null) {
            measurable = safeNext;
            num = Integer.valueOf(IntIntPair.m333getSecondimpl(m325boximpl2.getPackedValue()));
        } else {
            measurable = safeNext;
            num = null;
        }
        FlowLineInfo flowLineInfo4 = flowLineInfo3;
        MutableIntList mutableIntList5 = new MutableIntList(0, 1, null);
        MutableIntList mutableIntList6 = new MutableIntList(0, 1, null);
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i, flowLayoutOverflowState, j, i2, ceil, ceil2, null);
        FlowLayoutBuildingBlocks.WrapInfo m908getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m908getWrapInfoOpUlnko(it.hasNext(), 0, IntIntPair.m328constructorimpl(m6950getMaxWidthimpl, m6949getMaxHeightimpl), m325boximpl2, 0, 0, 0, false, false);
        if (m908getWrapInfoOpUlnko.getIsLastItemInContainer()) {
            flowLineInfo = flowLineInfo4;
            objectRef = objectRef2;
            j2 = m967toBoxConstraintsOenEA2s;
            boolean z = m325boximpl2 != null;
            i3 = ceil2;
            i4 = ceil;
            measurable2 = measurable;
            i5 = m6952getMinWidthimpl;
            mutableVector = mutableVector2;
            arrayList = arrayList4;
            mutableIntList = mutableIntList5;
            mutableIntList2 = mutableIntList6;
            wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m908getWrapInfoOpUlnko, z, -1, 0, m6950getMaxWidthimpl, 0);
        } else {
            flowLineInfo = flowLineInfo4;
            measurable2 = measurable;
            objectRef = objectRef2;
            i3 = ceil2;
            i4 = ceil;
            i5 = m6952getMinWidthimpl;
            arrayList = arrayList4;
            j2 = m967toBoxConstraintsOenEA2s;
            mutableIntList = mutableIntList5;
            mutableVector = mutableVector2;
            mutableIntList2 = mutableIntList6;
            wrapEllipsisInfo = null;
        }
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo3 = wrapEllipsisInfo;
        MutableIntList mutableIntList7 = mutableIntList;
        int i21 = m6949getMaxHeightimpl;
        Measurable measurable3 = measurable2;
        int i22 = i5;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = m6950getMaxWidthimpl;
        while (!m908getWrapInfoOpUlnko.getIsLastItemInContainer() && measurable3 != null) {
            Intrinsics.checkNotNull(valueOf);
            int intValue = valueOf.intValue();
            Intrinsics.checkNotNull(num);
            int i29 = m6949getMaxHeightimpl;
            int i30 = i26 + intValue;
            int max = Math.max(i27, num.intValue());
            int i31 = i28 - intValue;
            MutableIntList mutableIntList8 = mutableIntList2;
            int i32 = i25 + 1;
            int i33 = m6950getMaxWidthimpl;
            flowLayoutOverflowState.setItemShown$foundation_layout_release(i32);
            arrayList.add(measurable3);
            final Ref.ObjectRef objectRef3 = objectRef;
            mutableIntObjectMapOf.set(i25, objectRef3.element);
            int i34 = i32 - i23;
            int i35 = i23;
            FlowLineInfo flowLineInfo5 = flowLineInfo;
            boolean z2 = i34 < i;
            if (flowLineInfo5 != null) {
                int i36 = z2 ? i20 : i20 + 1;
                mutableIntObjectMap2 = mutableIntObjectMapOf;
                int i37 = z2 ? i34 : 0;
                if (z2) {
                    arrayList3 = arrayList;
                    i9 = i32;
                    i18 = 0;
                    i19 = RangesKt.coerceAtLeast(i31 - i4, 0);
                } else {
                    arrayList3 = arrayList;
                    i9 = i32;
                    i18 = 0;
                    i19 = i33;
                }
                float f3 = measureScope.mo674toDpu2uoSUM(i19);
                if (z2) {
                    i8 = i22;
                    coerceAtLeast = i21;
                } else {
                    i8 = i22;
                    coerceAtLeast = RangesKt.coerceAtLeast((i21 - max) - i3, i18);
                }
                flowLineInfo5.m921update4j6BHR0$foundation_layout_release(i36, i37, f3, measureScope.mo674toDpu2uoSUM(coerceAtLeast));
            } else {
                i8 = i22;
                mutableIntObjectMap2 = mutableIntObjectMapOf;
                arrayList3 = arrayList;
                i9 = i32;
            }
            Measurable safeNext2 = !it.hasNext() ? null : safeNext(it2, flowLineInfo5);
            objectRef3.element = null;
            if (safeNext2 != null) {
                i10 = i30;
                j3 = j2;
                intIntPair = IntIntPair.m325boximpl(m911measureAndCacherqJ1uqs(safeNext2, flowLineMeasurePolicy, j3, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                        invoke2(placeable);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable placeable) {
                        objectRef3.element = placeable;
                    }
                }));
            } else {
                i10 = i30;
                j3 = j2;
                intIntPair = null;
            }
            Integer valueOf2 = intIntPair != null ? Integer.valueOf(IntIntPair.m332getFirstimpl(intIntPair.getPackedValue()) + i4) : null;
            Integer valueOf3 = intIntPair != null ? Integer.valueOf(IntIntPair.m333getSecondimpl(intIntPair.getPackedValue())) : null;
            boolean hasNext = it.hasNext();
            long m328constructorimpl = IntIntPair.m328constructorimpl(i31, i21);
            if (intIntPair == null) {
                flowLineInfo2 = flowLineInfo5;
                m325boximpl = null;
            } else {
                Intrinsics.checkNotNull(valueOf2);
                int intValue2 = valueOf2.intValue();
                Intrinsics.checkNotNull(valueOf3);
                flowLineInfo2 = flowLineInfo5;
                m325boximpl = IntIntPair.m325boximpl(IntIntPair.m328constructorimpl(intValue2, valueOf3.intValue()));
            }
            FlowLayoutBuildingBlocks.WrapInfo m908getWrapInfoOpUlnko2 = flowLayoutBuildingBlocks.m908getWrapInfoOpUlnko(hasNext, i34, m328constructorimpl, m325boximpl, i20, i24, max, false, false);
            if (m908getWrapInfoOpUlnko2.getIsLastItemInLine()) {
                int min = Math.min(Math.max(i8, i10), i33);
                int i38 = i24 + max;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo4 = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m908getWrapInfoOpUlnko2, intIntPair != null, i20, i38, i31, i34);
                mutableIntList3 = mutableIntList8;
                mutableIntList3.add(max);
                int i39 = (i29 - i38) - i3;
                MutableIntList mutableIntList9 = mutableIntList7;
                i16 = i9;
                mutableIntList9.add(i16);
                i20++;
                i24 = i38 + i3;
                m908getWrapInfoOpUlnko = m908getWrapInfoOpUlnko2;
                i12 = i33;
                mutableIntList4 = mutableIntList9;
                i11 = i16;
                num2 = valueOf2 != null ? Integer.valueOf(valueOf2.intValue() - i4) : null;
                i13 = 0;
                i14 = i39;
                i15 = min;
                i17 = 0;
                wrapEllipsisInfo2 = wrapEllipsisInfo4;
                m6950getMaxWidthimpl = i12;
            } else {
                m908getWrapInfoOpUlnko = m908getWrapInfoOpUlnko2;
                int i40 = i10;
                int i41 = i8;
                mutableIntList3 = mutableIntList8;
                m6950getMaxWidthimpl = i33;
                mutableIntList4 = mutableIntList7;
                i11 = i9;
                i12 = i31;
                num2 = valueOf2;
                i13 = max;
                i14 = i21;
                i15 = i41;
                i16 = i35;
                i17 = i40;
                wrapEllipsisInfo2 = wrapEllipsisInfo3;
            }
            mutableIntList7 = mutableIntList4;
            wrapEllipsisInfo3 = wrapEllipsisInfo2;
            i23 = i16;
            arrayList = arrayList3;
            num = valueOf3;
            it2 = it;
            objectRef = objectRef3;
            measurable3 = safeNext2;
            i25 = i11;
            i28 = i12;
            long j4 = j3;
            i22 = i15;
            i26 = i17;
            i27 = i13;
            i21 = i14;
            m6949getMaxHeightimpl = i29;
            mutableIntList2 = mutableIntList3;
            valueOf = num2;
            mutableIntObjectMapOf = mutableIntObjectMap2;
            flowLineInfo = flowLineInfo2;
            j2 = j4;
        }
        MutableIntObjectMap mutableIntObjectMap3 = mutableIntObjectMapOf;
        ArrayList arrayList5 = arrayList;
        MutableIntList mutableIntList10 = mutableIntList2;
        MutableIntList mutableIntList11 = mutableIntList7;
        int i42 = i22;
        if (wrapEllipsisInfo3 != null) {
            arrayList2 = arrayList5;
            arrayList2.add(wrapEllipsisInfo3.getEllipsis());
            mutableIntObjectMap = mutableIntObjectMap3;
            mutableIntObjectMap.set(arrayList2.size() - 1, wrapEllipsisInfo3.getPlaceable());
            int i43 = mutableIntList11._size - 1;
            if (wrapEllipsisInfo3.getPlaceEllipsisOnLastContentLine()) {
                int size = mutableIntList11.getSize() - 1;
                mutableIntList10.set(i43, Math.max(mutableIntList10.get(i43), IntIntPair.m333getSecondimpl(wrapEllipsisInfo3.getEllipsisSize())));
                mutableIntList11.set(size, mutableIntList11.last() + 1);
            } else {
                mutableIntList10.add(IntIntPair.m333getSecondimpl(wrapEllipsisInfo3.getEllipsisSize()));
                mutableIntList11.add(mutableIntList11.last() + 1);
            }
        } else {
            mutableIntObjectMap = mutableIntObjectMap3;
            arrayList2 = arrayList5;
        }
        int size2 = arrayList2.size();
        Placeable[] placeableArr = new Placeable[size2];
        for (int i44 = 0; i44 < size2; i44++) {
            placeableArr[i44] = mutableIntObjectMap.get(i44);
        }
        int size3 = mutableIntList11.getSize();
        int[] iArr = new int[size3];
        for (int i45 = 0; i45 < size3; i45++) {
            iArr[i45] = 0;
        }
        int i46 = 0;
        int size4 = mutableIntList11.getSize();
        int[] iArr2 = new int[size4];
        for (int i47 = 0; i47 < size4; i47++) {
            iArr2[i47] = 0;
        }
        MutableIntList mutableIntList12 = mutableIntList11;
        int[] iArr3 = mutableIntList12.content;
        int i48 = mutableIntList12._size;
        int i49 = i42;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        Placeable[] placeableArr2 = placeableArr;
        while (i50 < i48) {
            int i53 = iArr3[i50];
            int i54 = i49;
            int i55 = i48;
            int[] iArr4 = iArr3;
            int[] iArr5 = iArr2;
            int[] iArr6 = iArr;
            int i56 = i52;
            Placeable[] placeableArr3 = placeableArr2;
            MutableIntList mutableIntList13 = mutableIntList10;
            int i57 = i46;
            int i58 = i50;
            MeasureResult measure = RowColumnMeasurePolicyKt.measure(flowLineMeasurePolicy, i49, Constraints.m6951getMinHeightimpl(m952constructorimpl), Constraints.m6950getMaxWidthimpl(m952constructorimpl), mutableIntList10.get(i50), i4, measureScope, arrayList2, placeableArr2, i56, i53, iArr6, i50);
            if (flowLineMeasurePolicy.isHorizontal()) {
                height = measure.getWidth();
                width = measure.getHeight();
            } else {
                height = measure.getHeight();
                width = measure.getWidth();
            }
            iArr5[i58] = width;
            i51 += width;
            i49 = Math.max(i54, height);
            mutableVector.add(measure);
            i50 = i58 + 1;
            placeableArr2 = placeableArr3;
            i52 = i53;
            i48 = i55;
            iArr3 = iArr4;
            iArr2 = iArr5;
            iArr = iArr6;
            mutableIntList10 = mutableIntList13;
            i46 = i57;
        }
        int i59 = i49;
        int[] iArr7 = iArr2;
        int[] iArr8 = iArr;
        int i60 = i46;
        MutableVector mutableVector3 = mutableVector;
        if (mutableVector3.isEmpty()) {
            i6 = i60;
            i7 = i6;
        } else {
            i6 = i59;
            i7 = i51;
        }
        return m912placeHelperBmaY500(measureScope, j, i6, i7, iArr7, mutableVector3, flowLineMeasurePolicy, iArr8);
    }
}
