package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyLayoutItemAnimator.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0003IJKB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010(\u001a\u0004\u0018\u00010\u00072\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u000bJ1\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u000b2\u0012\b\u0002\u0010.\u001a\f0\u0010R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0002\u0010/J\u0082\u0001\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\f\u001a\u00020\r2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000062\u0006\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@J\u0010\u0010A\u001a\u00020,2\u0006\u0010)\u001a\u00020\u0003H\u0002J\u0006\u0010B\u001a\u00020,J\u001f\u0010C\u001a\u00020,2\u0006\u0010-\u001a\u00028\u00002\b\b\u0002\u0010D\u001a\u00020#H\u0002¢\u0006\u0002\u0010EJ\u0019\u0010F\u001a\u00020\u000b*\u00020G2\u0006\u0010-\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010HR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f0\u0010R\b\u0012\u0004\u0012\u00028\u00000\u00000\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\u00020\u00128Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001f\u001a\u00020\u000b*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0018\u0010\"\u001a\u00020#*\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0018\u0010&\u001a\u00020\u000b*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "()V", "disappearingItems", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "displayingNode", "Landroidx/compose/ui/node/DrawModifierNode;", "firstVisibleIndex", "", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyToItemInfoMap", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;", "minSizeToFitDisappearingItems", "Landroidx/compose/ui/unit/IntSize;", "getMinSizeToFitDisappearingItems-YbymL2g", "()J", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "movingAwayKeys", "Landroidx/collection/MutableScatterSet;", "movingAwayToEndBound", "movingAwayToStartBound", "movingInFromEndBound", "movingInFromStartBound", "crossAxisOffset", "getCrossAxisOffset", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "hasAnimations", "", "getHasAnimations", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)Z", "mainAxisOffset", "getMainAxisOffset", "getAnimation", "key", "placeableIndex", "initializeAnimation", "", "item", "itemInfo", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;)V", "onMeasured", "consumedScroll", "layoutWidth", "layoutHeight", "positionedItems", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;", "isVertical", "isLookingAhead", "laneCount", "hasLookaheadOccurred", "layoutMinOffset", "layoutMaxOffset", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "removeInfoForKey", "reset", "startPlacementAnimationsIfNeeded", "isMovingAway", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Z)V", "updateAndReturnOffsetFor", "", "([ILandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "DisplayingDisappearingItemsElement", "DisplayingDisappearingItemsNode", "ItemInfo", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimator<T extends LazyLayoutMeasuredItem> {
    public static final int $stable = 8;
    private DrawModifierNode displayingNode;
    private int firstVisibleIndex;
    private LazyLayoutKeyIndexMap keyIndexMap;
    private final MutableScatterMap<Object, LazyLayoutItemAnimator<T>.ItemInfo> keyToItemInfoMap = ScatterMapKt.mutableScatterMapOf();
    private final MutableScatterSet<Object> movingAwayKeys = ScatterSetKt.mutableScatterSetOf();
    private final List<T> movingInFromStartBound = new ArrayList();
    private final List<T> movingInFromEndBound = new ArrayList();
    private final List<T> movingAwayToStartBound = new ArrayList();
    private final List<T> movingAwayToEndBound = new ArrayList();
    private final List<LazyLayoutItemAnimation> disappearingItems = new ArrayList();
    private final Modifier modifier = new DisplayingDisappearingItemsElement(this);

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ed, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f0, code lost:
    
        startPlacementAnimationsIfNeeded$default(r33, r5, false, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0106, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00ff, code lost:
    
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01fc, code lost:
    
        r25 = r0;
        r26 = r12;
        removeInfoForKey(r5.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        r33.firstVisibleIndex = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0215, code lost:
    
        r7 = r11;
        r26 = r12;
        r14 = new int[r7];
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x021b, code lost:
    
        if (r0 >= r7) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x021d, code lost:
    
        r14[r0] = 0;
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0223, code lost:
    
        if (r43 == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0225, code lost:
    
        if (r26 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0231, code lost:
    
        if ((!r33.movingInFromStartBound.isEmpty()) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0233, code lost:
    
        r0 = r33.movingInFromStartBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r40 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0239, code lost:
    
        if (r0.size() <= 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x023b, code lost:
    
        r15 = r26;
        kotlin.collections.CollectionsKt.sortWith(r0, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$1(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x024a, code lost:
    
        r8 = r33.movingInFromStartBound;
        r9 = r8.size();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0251, code lost:
    
        if (r10 >= r9) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0253, code lost:
    
        r11 = r8.get(r10);
        initializeAnimation$default(r33, r11, r44 - updateAndReturnOffsetFor(r14, r11), null, 4, null);
        startPlacementAnimationsIfNeeded$default(r33, r11, false, 2, null);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0272, code lost:
    
        kotlin.collections.ArraysKt.fill$default(r14, 0, 0, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0288, code lost:
    
        if ((!r33.movingInFromEndBound.isEmpty()) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x028a, code lost:
    
        r0 = r33.movingInFromEndBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        r2 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(0, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0290, code lost:
    
        if (r0.size() <= 1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0292, code lost:
    
        kotlin.collections.CollectionsKt.sortWith(r0, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$1(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x029c, code lost:
    
        r8 = r33.movingInFromEndBound;
        r9 = r8.size();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02a3, code lost:
    
        if (r10 >= r9) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02a5, code lost:
    
        r11 = r8.get(r10);
        initializeAnimation$default(r33, r11, (r45 + updateAndReturnOffsetFor(r14, r11)) - r11.getMainAxisSizeWithSpacings(), null, 4, null);
        startPlacementAnimationsIfNeeded$default(r33, r11, false, 2, null);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ca, code lost:
    
        kotlin.collections.ArraysKt.fill$default(r14, 0, 0, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02d6, code lost:
    
        r0 = r33.movingAwayKeys;
        r1 = r0.elements;
        r0 = r0.metadata;
        r2 = r0.length - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e1, code lost:
    
        if (r2 < 0) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e3, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r41 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02e4, code lost:
    
        r4 = r0[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02ee, code lost:
    
        if (((((~r4) << 7) & r4) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02f0, code lost:
    
        r8 = 8 - ((~(r3 - r2)) >>> 31);
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02fa, code lost:
    
        if (r9 >= r8) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0300, code lost:
    
        if ((r4 & 255) >= 128) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0302, code lost:
    
        r10 = r1[(r3 << 3) + r9];
        r11 = r33.keyToItemInfoMap.get(r10);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r11);
        r11 = r11;
        r12 = r38.getIndex(r10);
        r40 = r0;
        r11.setSpan(java.lang.Math.min(r7, r11.getSpan()));
        r32 = r1;
        r11.setLane(java.lang.Math.min(r7 - r11.getSpan(), r11.getLane()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0339, code lost:
    
        if (r12 != (-1)) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x033b, code lost:
    
        r1 = r11.getAnimations();
        r12 = r1.length;
        r0 = 0;
        r23 = false;
        r25 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0345, code lost:
    
        if (r0 >= r12) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r43 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0347, code lost:
    
        r7 = r1[r0];
        r26 = r25 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x034b, code lost:
    
        if (r7 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0351, code lost:
    
        if (r7.isDisappearanceAnimationInProgress() == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0353, code lost:
    
        r27 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0355, code lost:
    
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03a9, code lost:
    
        r0 = r0 + 1;
        r25 = r26;
        r1 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x035d, code lost:
    
        if (r7.isDisappearanceAnimationFinished() == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x035f, code lost:
    
        r7.release();
        r11.getAnimations()[r25] = null;
        r27 = r1;
        r33.disappearingItems.remove(r7);
        r1 = r33.displayingNode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0373, code lost:
    
        if (r1 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0375, code lost:
    
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(r1);
        r1 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x037b, code lost:
    
        r27 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0381, code lost:
    
        if (r7.getLayer() == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0383, code lost:
    
        r7.animateDisappearance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x038a, code lost:
    
        if (r7.isDisappearanceAnimationInProgress() == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        r0 = r33.keyToItemInfoMap;
        r4 = r0.keys;
        r0 = r0.metadata;
        r5 = r0.length - 2;
        r43 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x038c, code lost:
    
        r33.disappearingItems.add(r7);
        r1 = r33.displayingNode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0393, code lost:
    
        if (r1 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0395, code lost:
    
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(r1);
        r1 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x039b, code lost:
    
        r7.release();
        r11.getAnimations()[r25] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03a6, code lost:
    
        r27 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03b3, code lost:
    
        if (r23 != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03b5, code lost:
    
        removeInfoForKey(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (r5 < 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0432, code lost:
    
        r23 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0434, code lost:
    
        r4 = r4 >> 8;
        r9 = r9 + 1;
        r0 = r40;
        r7 = r42;
        r14 = r23;
        r1 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03ba, code lost:
    
        r0 = r11.getConstraints();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
        r0 = r39.mo1099getAndMeasurehBUhpc(r12, r11.getLane(), r11.getSpan(), r0.getValue());
        r0.setNonScrollableItem(true);
        r7 = r11.getAnimations();
        r1 = r7.length;
        r23 = r14;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03e2, code lost:
    
        if (r14 >= r1) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03e4, code lost:
    
        r25 = r7[r14];
        r26 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03e8, code lost:
    
        if (r25 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03ea, code lost:
    
        r1 = r25.isPlacementAnimationInProgress();
        r25 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03f1, code lost:
    
        if (r1 != true) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        r14 = r0[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0409, code lost:
    
        r11.updateAnimation(r0, r46, r47, r44, r45, r11.getCrossAxisOffset());
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x041e, code lost:
    
        if (r12 >= r33.firstVisibleIndex) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0420, code lost:
    
        r33.movingAwayToStartBound.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0426, code lost:
    
        r33.movingAwayToEndBound.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03f6, code lost:
    
        r14 = r14 + 1;
        r7 = r25;
        r1 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03f4, code lost:
    
        r25 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        if (((((~r14) << 7) & r14) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03fd, code lost:
    
        if (r15 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0403, code lost:
    
        if (r12 != r15.getIndex(r10)) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0405, code lost:
    
        removeInfoForKey(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x042c, code lost:
    
        r40 = r0;
        r32 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0443, code lost:
    
        r13 = r38;
        r40 = r0;
        r32 = r1;
        r23 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x044d, code lost:
    
        if (r8 != 8) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        r7 = 8 - ((~(r13 - r5)) >>> 31);
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x045a, code lost:
    
        if (r3 == r2) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x045c, code lost:
    
        r3 = r3 + 1;
        r0 = r40;
        r7 = r42;
        r14 = r23;
        r1 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0476, code lost:
    
        if ((!r33.movingAwayToStartBound.isEmpty()) == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0478, code lost:
    
        r0 = r33.movingAwayToStartBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x047e, code lost:
    
        if (r0.size() <= 1) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0480, code lost:
    
        kotlin.collections.CollectionsKt.sortWith(r0, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$2(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x048a, code lost:
    
        r0 = r33.movingAwayToStartBound;
        r1 = r0.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0491, code lost:
    
        if (r7 >= r1) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        if (r8 >= r7) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0493, code lost:
    
        r2 = r0.get(r7);
        r3 = r33.keyToItemInfoMap.get(r2.getKey());
        kotlin.jvm.internal.Intrinsics.checkNotNull(r3);
        r3 = r3;
        r4 = r23;
        r5 = updateAndReturnOffsetFor(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x04ae, code lost:
    
        if (r41 == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x04b0, code lost:
    
        r8 = getMainAxisOffset((androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) kotlin.collections.CollectionsKt.first((java.util.List) r37));
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x04bf, code lost:
    
        r2.position(r8 - r5, r3.getCrossAxisOffset(), r35, r36);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x04cb, code lost:
    
        if (r43 == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x04cd, code lost:
    
        startPlacementAnimationsIfNeeded(r2, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x04d1, code lost:
    
        r7 = r7 + 1;
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04bb, code lost:
    
        r8 = r3.getLayoutMinOffset();
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04d6, code lost:
    
        r5 = r35;
        r14 = r36;
        r4 = r23;
        kotlin.collections.ArraysKt.fill$default(r4, 0, 0, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04f6, code lost:
    
        if ((!r33.movingAwayToEndBound.isEmpty()) == false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x04f8, code lost:
    
        r0 = r33.movingAwayToEndBound;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x04fe, code lost:
    
        if (r0.size() <= 1) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0500, code lost:
    
        kotlin.collections.CollectionsKt.sortWith(r0, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x050a, code lost:
    
        r0 = r33.movingAwayToEndBound;
        r1 = r0.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0511, code lost:
    
        if (r7 >= r1) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0513, code lost:
    
        r2 = r0.get(r7);
        r3 = r33.keyToItemInfoMap.get(r2.getKey());
        kotlin.jvm.internal.Intrinsics.checkNotNull(r3);
        r3 = r3;
        r8 = updateAndReturnOffsetFor(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        if ((r14 & 255) >= 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x052c, code lost:
    
        if (r41 == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x052e, code lost:
    
        r9 = getMainAxisOffset((androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) kotlin.collections.CollectionsKt.last((java.util.List) r37));
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0542, code lost:
    
        r2.position(r9 + r8, r3.getCrossAxisOffset(), r5, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x054b, code lost:
    
        if (r43 == false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x054d, code lost:
    
        startPlacementAnimationsIfNeeded(r2, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0550, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0539, code lost:
    
        r9 = r3.getLayoutMaxOffset() - r2.getMainAxisSizeWithSpacings();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
    
        r24 = r0;
        r23 = r4;
        r33.movingAwayKeys.add(r4[(r13 << 3) + r8]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0553, code lost:
    
        r0 = r33.movingAwayToStartBound;
        kotlin.collections.CollectionsKt.reverse(r0);
        r1 = kotlin.Unit.INSTANCE;
        r37.addAll(0, r0);
        r37.addAll(r33.movingAwayToEndBound);
        r33.movingInFromStartBound.clear();
        r33.movingInFromEndBound.clear();
        r33.movingAwayToStartBound.clear();
        r33.movingAwayToEndBound.clear();
        r33.movingAwayKeys.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0582, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x04e6, code lost:
    
        r5 = r35;
        r14 = r36;
        r4 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0450, code lost:
    
        r13 = r38;
        r40 = r0;
        r32 = r1;
        r23 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0468, code lost:
    
        r13 = r38;
        r23 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0248, code lost:
    
        r15 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x027c, code lost:
    
        r15 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x02d4, code lost:
    
        r15 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x005a, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x004f, code lost:
    
        r2 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(r34, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0045, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        r14 = r14 >> 8;
        r8 = r8 + 1;
        r4 = r23;
        r0 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
    
        r24 = r0;
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
    
        r24 = r0;
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b7, code lost:
    
        if (r7 != 8) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        if (r13 == r5) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
    
        r13 = r13 + 1;
        r4 = r23;
        r0 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
    
        r24 = r0;
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cb, code lost:
    
        r0 = r37.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d1, code lost:
    
        if (r4 >= r0) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d3, code lost:
    
        r5 = r9.get(r4);
        r33.movingAwayKeys.remove(r5.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e6, code lost:
    
        if (getHasAnimations(r5) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
    
        r13 = r33.keyToItemInfoMap.get(r5.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f4, code lost:
    
        if (r12 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f6, code lost:
    
        r14 = r12.getIndex(r5.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0100, code lost:
    
        if (r14 != (-1)) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0102, code lost:
    
        if (r12 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0104, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0107, code lost:
    
        if (r13 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0109, code lost:
    
        r8 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo(r33);
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo.updateAnimation$default(r8, r5, r46, r47, r44, r45, 0, 32, null);
        r33.keyToItemInfoMap.set(r5.getKey(), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0130, code lost:
    
        if (r5.getIndex() == r14) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0133, code lost:
    
        if (r14 == (-1)) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0135, code lost:
    
        if (r14 >= r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0137, code lost:
    
        r33.movingInFromStartBound.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01f7, code lost:
    
        r25 = r0;
        r26 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0207, code lost:
    
        r4 = r4 + 1;
        r9 = r37;
        r11 = r42;
        r0 = r25;
        r12 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013e, code lost:
    
        r33.movingInFromEndBound.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0145, code lost:
    
        r13 = r5.mo1097getOffsetBjo55l4(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014e, code lost:
    
        if (r5.getIsVertical() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0150, code lost:
    
        r7 = androidx.compose.ui.unit.IntOffset.m7126getYimpl(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0159, code lost:
    
        initializeAnimation(r5, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015c, code lost:
    
        if (r15 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015e, code lost:
    
        r5 = r8.getAnimations();
        r7 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0164, code lost:
    
        if (r8 >= r7) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0166, code lost:
    
        r13 = r5[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0168, code lost:
    
        if (r13 == null) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        r13.animateAppearance();
        r13 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016f, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0155, code lost:
    
        r7 = androidx.compose.ui.unit.IntOffset.m7125getXimpl(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0172, code lost:
    
        if (r43 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0174, code lost:
    
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo.updateAnimation$default(r13, r5, r46, r47, r44, r45, 0, 32, null);
        r7 = r13.getAnimations();
        r14 = r7.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018f, code lost:
    
        if (r8 >= r14) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0191, code lost:
    
        r25 = r0;
        r0 = r7[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0195, code lost:
    
        if (r0 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0197, code lost:
    
        r26 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        r1 = r33.firstVisibleIndex;
        r2 = (androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) r37);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a7, code lost:
    
        if (androidx.compose.ui.unit.IntOffset.m7124equalsimpl0(r0.getRawOffset(), androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.INSTANCE.m1149getNotInitializednOccac()) != false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a9, code lost:
    
        r0.m1148setRawOffsetgyyYBs(androidx.compose.ui.unit.IntOffset.m7129plusqkQi6aY(r0.getRawOffset(), r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b7, code lost:
    
        r8 = r8 + 1;
        r0 = r25;
        r12 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b5, code lost:
    
        r26 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c4, code lost:
    
        r25 = r0;
        r26 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c8, code lost:
    
        if (r15 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r2 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ca, code lost:
    
        r0 = r13.getAnimations();
        r7 = r0.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d0, code lost:
    
        if (r8 >= r7) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d2, code lost:
    
        r9 = r0[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d4, code lost:
    
        if (r9 == null) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01da, code lost:
    
        if (r9.isDisappearanceAnimationInProgress() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01dc, code lost:
    
        r33.disappearingItems.remove(r9);
        r10 = r33.displayingNode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e3, code lost:
    
        if (r10 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e5, code lost:
    
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(r10);
        r10 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ea, code lost:
    
        r9.animateAppearance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        r2 = r2.getIndex();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasured(int r34, int r35, int r36, java.util.List<T> r37, androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap r38, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider<T> r39, boolean r40, boolean r41, int r42, boolean r43, int r44, int r45, kotlinx.coroutines.CoroutineScope r46, androidx.compose.ui.graphics.GraphicsContext r47) {
        /*
            Method dump skipped, instructions count: 1411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.onMeasured(int, int, int, java.util.List, androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider, boolean, boolean, int, boolean, int, int, kotlinx.coroutines.CoroutineScope, androidx.compose.ui.graphics.GraphicsContext):void");
    }

    private final void removeInfoForKey(Object key) {
        LazyLayoutItemAnimation[] animations;
        LazyLayoutItemAnimator<T>.ItemInfo remove = this.keyToItemInfoMap.remove(key);
        if (remove == null || (animations = remove.getAnimations()) == null) {
            return;
        }
        for (LazyLayoutItemAnimation lazyLayoutItemAnimation : animations) {
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.release();
            }
        }
    }

    public final void reset() {
        if (this.keyToItemInfoMap.isNotEmpty()) {
            MutableScatterMap<Object, LazyLayoutItemAnimator<T>.ItemInfo> mutableScatterMap = this.keyToItemInfoMap;
            Object[] objArr = mutableScatterMap.values;
            long[] jArr = mutableScatterMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                for (LazyLayoutItemAnimation lazyLayoutItemAnimation : ((ItemInfo) objArr[(i << 3) + i3]).getAnimations()) {
                                    if (lazyLayoutItemAnimation != null) {
                                        lazyLayoutItemAnimation.release();
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this.keyToItemInfoMap.clear();
        }
        this.keyIndexMap = LazyLayoutKeyIndexMap.INSTANCE;
        this.firstVisibleIndex = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void initializeAnimation$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, int i, ItemInfo itemInfo, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            LazyLayoutItemAnimator<T>.ItemInfo itemInfo2 = lazyLayoutItemAnimator.keyToItemInfoMap.get(lazyLayoutMeasuredItem.getKey());
            Intrinsics.checkNotNull(itemInfo2);
            itemInfo = itemInfo2;
        }
        lazyLayoutItemAnimator.initializeAnimation(lazyLayoutMeasuredItem, i, itemInfo);
    }

    private final void initializeAnimation(T item, int mainAxisOffset, LazyLayoutItemAnimator<T>.ItemInfo itemInfo) {
        long m7121copyiSbpLlY$default;
        int i = 0;
        long mo1097getOffsetBjo55l4 = item.mo1097getOffsetBjo55l4(0);
        if (item.getIsVertical()) {
            m7121copyiSbpLlY$default = IntOffset.m7121copyiSbpLlY$default(mo1097getOffsetBjo55l4, 0, mainAxisOffset, 1, null);
        } else {
            m7121copyiSbpLlY$default = IntOffset.m7121copyiSbpLlY$default(mo1097getOffsetBjo55l4, mainAxisOffset, 0, 2, null);
        }
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i2 = 0;
        while (i < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i];
            int i3 = i2 + 1;
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.m1148setRawOffsetgyyYBs(IntOffset.m7129plusqkQi6aY(m7121copyiSbpLlY$default, IntOffset.m7128minusqkQi6aY(item.mo1097getOffsetBjo55l4(i2), mo1097getOffsetBjo55l4)));
            }
            i++;
            i2 = i3;
        }
    }

    static /* synthetic */ void startPlacementAnimationsIfNeeded$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        lazyLayoutItemAnimator.startPlacementAnimationsIfNeeded(lazyLayoutMeasuredItem, z);
    }

    private final void startPlacementAnimationsIfNeeded(T item, boolean isMovingAway) {
        LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(item.getKey());
        Intrinsics.checkNotNull(itemInfo);
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i];
            int i3 = i2 + 1;
            if (lazyLayoutItemAnimation != null) {
                long mo1097getOffsetBjo55l4 = item.mo1097getOffsetBjo55l4(i2);
                long rawOffset = lazyLayoutItemAnimation.getRawOffset();
                if (!IntOffset.m7124equalsimpl0(rawOffset, LazyLayoutItemAnimation.INSTANCE.m1149getNotInitializednOccac()) && !IntOffset.m7124equalsimpl0(rawOffset, mo1097getOffsetBjo55l4)) {
                    lazyLayoutItemAnimation.m1141animatePlacementDeltaar5cAso(IntOffset.m7128minusqkQi6aY(mo1097getOffsetBjo55l4, rawOffset), isMovingAway);
                }
                lazyLayoutItemAnimation.m1148setRawOffsetgyyYBs(mo1097getOffsetBjo55l4);
            }
            i++;
            i2 = i3;
        }
    }

    public final LazyLayoutItemAnimation getAnimation(Object key, int placeableIndex) {
        LazyLayoutItemAnimation[] animations;
        LazyLayoutItemAnimator<T>.ItemInfo itemInfo = this.keyToItemInfoMap.get(key);
        if (itemInfo == null || (animations = itemInfo.getAnimations()) == null) {
            return null;
        }
        return animations[placeableIndex];
    }

    private final int updateAndReturnOffsetFor(int[] iArr, T t) {
        int lane = t.getLane();
        int span = t.getSpan() + lane;
        int i = 0;
        while (lane < span) {
            int mainAxisSizeWithSpacings = iArr[lane] + t.getMainAxisSizeWithSpacings();
            iArr[lane] = mainAxisSizeWithSpacings;
            i = Math.max(i, mainAxisSizeWithSpacings);
            lane++;
        }
        return i;
    }

    /* renamed from: getMinSizeToFitDisappearingItems-YbymL2g, reason: not valid java name */
    public final long m1150getMinSizeToFitDisappearingItemsYbymL2g() {
        long m7172getZeroYbymL2g = IntSize.INSTANCE.m7172getZeroYbymL2g();
        List<LazyLayoutItemAnimation> list = this.disappearingItems;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = list.get(i);
            GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
            if (layer != null) {
                m7172getZeroYbymL2g = IntSizeKt.IntSize(Math.max(IntSize.m7167getWidthimpl(m7172getZeroYbymL2g), IntOffset.m7125getXimpl(lazyLayoutItemAnimation.getRawOffset()) + IntSize.m7167getWidthimpl(layer.getSize())), Math.max(IntSize.m7166getHeightimpl(m7172getZeroYbymL2g), IntOffset.m7126getYimpl(lazyLayoutItemAnimation.getRawOffset()) + IntSize.m7166getHeightimpl(layer.getSize())));
            }
        }
        return m7172getZeroYbymL2g;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    private final boolean getHasAnimations(T t) {
        int placeablesCount = t.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            if (LazyLayoutItemAnimatorKt.access$getSpecs(t.getParentData(i)) != null) {
                return true;
            }
        }
        return false;
    }

    private final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long mo1097getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo1097getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.getIsVertical() ? IntOffset.m7126getYimpl(mo1097getOffsetBjo55l4) : IntOffset.m7125getXimpl(mo1097getOffsetBjo55l4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCrossAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long mo1097getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo1097getOffsetBjo55l4(0);
        return !lazyLayoutMeasuredItem.getIsVertical() ? IntOffset.m7126getYimpl(mo1097getOffsetBjo55l4) : IntOffset.m7125getXimpl(mo1097getOffsetBjo55l4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LazyLayoutItemAnimator.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J=\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00028\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010*R0\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u001e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u001a\u0010 \u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;", "", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "<set-?>", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "animations", "getAnimations", "()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "getConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "setConstraints-_Sx5XlM", "(Landroidx/compose/ui/unit/Constraints;)V", "crossAxisOffset", "", "getCrossAxisOffset", "()I", "setCrossAxisOffset", "(I)V", "isRunningPlacement", "", "()Z", "lane", "getLane", "setLane", "layoutMaxOffset", "getLayoutMaxOffset", "layoutMinOffset", "getLayoutMinOffset", TtmlNode.TAG_SPAN, "getSpan", "setSpan", "updateAnimation", "", "positionedItem", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;III)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public final class ItemInfo {
        private Constraints constraints;
        private int crossAxisOffset;
        private int lane;
        private int layoutMaxOffset;
        private int layoutMinOffset;
        private LazyLayoutItemAnimation[] animations = LazyLayoutItemAnimatorKt.access$getEmptyArray$p();
        private int span = 1;

        public ItemInfo() {
        }

        public final LazyLayoutItemAnimation[] getAnimations() {
            return this.animations;
        }

        /* renamed from: getConstraints-DWUhwKw, reason: not valid java name and from getter */
        public final Constraints getConstraints() {
            return this.constraints;
        }

        /* renamed from: setConstraints-_Sx5XlM, reason: not valid java name */
        public final void m1152setConstraints_Sx5XlM(Constraints constraints) {
            this.constraints = constraints;
        }

        public final int getCrossAxisOffset() {
            return this.crossAxisOffset;
        }

        public final void setCrossAxisOffset(int i) {
            this.crossAxisOffset = i;
        }

        public final int getLane() {
            return this.lane;
        }

        public final void setLane(int i) {
            this.lane = i;
        }

        public final int getSpan() {
            return this.span;
        }

        public final void setSpan(int i) {
            this.span = i;
        }

        private final boolean isRunningPlacement() {
            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : this.animations) {
                if (lazyLayoutItemAnimation != null && lazyLayoutItemAnimation.getIsRunningMovingAwayAnimation()) {
                    return true;
                }
            }
            return false;
        }

        public final int getLayoutMinOffset() {
            return this.layoutMinOffset;
        }

        public final int getLayoutMaxOffset() {
            return this.layoutMaxOffset;
        }

        public static /* synthetic */ void updateAnimation$default(ItemInfo itemInfo, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, CoroutineScope coroutineScope, GraphicsContext graphicsContext, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 32) != 0) {
                i3 = LazyLayoutItemAnimator.this.getCrossAxisOffset(lazyLayoutMeasuredItem);
            }
            itemInfo.updateAnimation(lazyLayoutMeasuredItem, coroutineScope, graphicsContext, i, i2, i3);
        }

        public final void updateAnimation(T positionedItem, CoroutineScope coroutineScope, GraphicsContext graphicsContext, int layoutMinOffset, int layoutMaxOffset, int crossAxisOffset) {
            if (!isRunningPlacement()) {
                this.layoutMinOffset = layoutMinOffset;
                this.layoutMaxOffset = layoutMaxOffset;
            }
            int length = this.animations.length;
            for (int placeablesCount = positionedItem.getPlaceablesCount(); placeablesCount < length; placeablesCount++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = this.animations[placeablesCount];
                if (lazyLayoutItemAnimation != null) {
                    lazyLayoutItemAnimation.release();
                }
            }
            if (this.animations.length != positionedItem.getPlaceablesCount()) {
                Object[] copyOf = Arrays.copyOf(this.animations, positionedItem.getPlaceablesCount());
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                this.animations = (LazyLayoutItemAnimation[]) copyOf;
            }
            this.constraints = Constraints.m6938boximpl(positionedItem.getConstraints());
            this.crossAxisOffset = crossAxisOffset;
            this.lane = positionedItem.getLane();
            this.span = positionedItem.getSpan();
            int placeablesCount2 = positionedItem.getPlaceablesCount();
            final LazyLayoutItemAnimator<T> lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i = 0; i < placeablesCount2; i++) {
                LazyLayoutAnimationSpecsNode access$getSpecs = LazyLayoutItemAnimatorKt.access$getSpecs(positionedItem.getParentData(i));
                if (access$getSpecs == null) {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.animations[i];
                    if (lazyLayoutItemAnimation2 != null) {
                        lazyLayoutItemAnimation2.release();
                    }
                    this.animations[i] = null;
                } else {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation3 = this.animations[i];
                    if (lazyLayoutItemAnimation3 == null) {
                        lazyLayoutItemAnimation3 = new LazyLayoutItemAnimation(coroutineScope, graphicsContext, new Function0<Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                DrawModifierNode drawModifierNode;
                                drawModifierNode = ((LazyLayoutItemAnimator) lazyLayoutItemAnimator).displayingNode;
                                if (drawModifierNode != null) {
                                    DrawModifierNodeKt.invalidateDraw(drawModifierNode);
                                }
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        });
                        this.animations[i] = lazyLayoutItemAnimation3;
                    }
                    lazyLayoutItemAnimation3.setFadeInSpec(access$getSpecs.getFadeInSpec());
                    lazyLayoutItemAnimation3.setPlacementSpec(access$getSpecs.getPlacementSpec());
                    lazyLayoutItemAnimation3.setFadeOutSpec(access$getSpecs.getFadeOutSpec());
                }
            }
        }
    }

    /* compiled from: LazyLayoutItemAnimator.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004HÂ\u0003J\u0017\u0010\u0007\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004HÆ\u0001J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\f\u0010\u0014\u001a\u00020\u0012*\u00020\u0015H\u0016R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "animator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "component1", "copy", "create", "equals", "", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    private static final /* data */ class DisplayingDisappearingItemsElement extends ModifierNodeElement<DisplayingDisappearingItemsNode> {
        private final LazyLayoutItemAnimator<?> animator;

        private final LazyLayoutItemAnimator<?> component1() {
            return this.animator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsElement copy$default(DisplayingDisappearingItemsElement displayingDisappearingItemsElement, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i, Object obj) {
            if ((i & 1) != 0) {
                lazyLayoutItemAnimator = displayingDisappearingItemsElement.animator;
            }
            return displayingDisappearingItemsElement.copy(lazyLayoutItemAnimator);
        }

        public final DisplayingDisappearingItemsElement copy(LazyLayoutItemAnimator<?> animator) {
            return new DisplayingDisappearingItemsElement(animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsElement) && Intrinsics.areEqual(this.animator, ((DisplayingDisappearingItemsElement) other).animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return this.animator.hashCode();
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.animator + ')';
        }

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* renamed from: create */
        public DisplayingDisappearingItemsNode getNode() {
            return new DisplayingDisappearingItemsNode(this.animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(DisplayingDisappearingItemsNode node) {
            node.setAnimator(this.animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("DisplayingDisappearingItemsElement");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LazyLayoutItemAnimator.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004HÂ\u0003J\u0017\u0010\u0007\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\u0011\u001a\u00020\u000f2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\f\u0010\u0014\u001a\u00020\u000f*\u00020\u0015H\u0016R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "animator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "", "onAttach", "", "onDetach", "setAnimator", "toString", "", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public static final /* data */ class DisplayingDisappearingItemsNode extends Modifier.Node implements DrawModifierNode {
        private LazyLayoutItemAnimator<?> animator;

        private final LazyLayoutItemAnimator<?> component1() {
            return this.animator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsNode copy$default(DisplayingDisappearingItemsNode displayingDisappearingItemsNode, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i, Object obj) {
            if ((i & 1) != 0) {
                lazyLayoutItemAnimator = displayingDisappearingItemsNode.animator;
            }
            return displayingDisappearingItemsNode.copy(lazyLayoutItemAnimator);
        }

        public final DisplayingDisappearingItemsNode copy(LazyLayoutItemAnimator<?> animator) {
            return new DisplayingDisappearingItemsNode(animator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsNode) && Intrinsics.areEqual(this.animator, ((DisplayingDisappearingItemsNode) other).animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.animator + ')';
        }

        public DisplayingDisappearingItemsNode(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        @Override // androidx.compose.ui.node.DrawModifierNode
        public void draw(ContentDrawScope contentDrawScope) {
            List list = ((LazyLayoutItemAnimator) this.animator).disappearingItems;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) list.get(i);
                GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
                if (layer != null) {
                    float m7125getXimpl = IntOffset.m7125getXimpl(lazyLayoutItemAnimation.getFinalOffset());
                    ContentDrawScope contentDrawScope2 = contentDrawScope;
                    float m7125getXimpl2 = m7125getXimpl - IntOffset.m7125getXimpl(layer.getTopLeft());
                    float m7126getYimpl = IntOffset.m7126getYimpl(lazyLayoutItemAnimation.getFinalOffset()) - IntOffset.m7126getYimpl(layer.getTopLeft());
                    contentDrawScope2.getDrawContext().getTransform().translate(m7125getXimpl2, m7126getYimpl);
                    try {
                        GraphicsLayerKt.drawLayer(contentDrawScope2, layer);
                    } finally {
                        contentDrawScope2.getDrawContext().getTransform().translate(-m7125getXimpl2, -m7126getYimpl);
                    }
                }
            }
            contentDrawScope.drawContent();
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onAttach() {
            ((LazyLayoutItemAnimator) this.animator).displayingNode = this;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onDetach() {
            this.animator.reset();
        }

        public final void setAnimator(LazyLayoutItemAnimator<?> animator) {
            if (Intrinsics.areEqual(this.animator, animator) || !getNode().getIsAttached()) {
                return;
            }
            this.animator.reset();
            ((LazyLayoutItemAnimator) animator).displayingNode = this;
            this.animator = animator;
        }
    }
}
