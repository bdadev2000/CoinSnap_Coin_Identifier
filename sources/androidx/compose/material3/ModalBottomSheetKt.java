package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.base.utils.StatusBarUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* compiled from: ModalBottomSheet.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÄ\u0001\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00132\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\u00182\u0013\b\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u001a0\n¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u001e¢\u0006\u0002\b\u0018¢\u0006\u0002\b H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a0\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u00132\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010%\u001a\u00020&H\u0003ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a-\u0010)\u001a\u00020\u000e2\b\b\u0002\u0010*\u001a\u00020&2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020&0\u001eH\u0007¢\u0006\u0002\u0010-\u001aó\u0001\u0010.\u001a\u00020\b*\u00020/2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203012\u0006\u00104\u001a\u0002052\f\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\n2!\u00107\u001a\u001d\u0012\u0013\u0012\u001102¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\b0\u001e2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00042\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\u00182\u0013\b\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u001a0\n¢\u0006\u0002\b\u00182\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u001e¢\u0006\u0002\b\u0018¢\u0006\u0002\b H\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u0014\u0010=\u001a\u000202*\u00020>2\u0006\u0010?\u001a\u000202H\u0002\u001a\u0014\u0010@\u001a\u000202*\u00020>2\u0006\u0010?\u001a\u000202H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A²\u0006\n\u0010B\u001a\u000202X\u008a\u0084\u0002"}, d2 = {"PredictiveBackChildTransformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "J", "PredictiveBackMaxScaleXDistance", "Landroidx/compose/ui/unit/Dp;", "F", "PredictiveBackMaxScaleYDistance", "ModalBottomSheet", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "Landroidx/compose/material3/SheetState;", "sheetMaxWidth", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "scrimColor", "dragHandle", "Landroidx/compose/runtime/Composable;", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "properties", "Landroidx/compose/material3/ModalBottomSheetProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "ModalBottomSheet-dYc4hso", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Scrim", "color", "visible", "", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberModalBottomSheetState", "skipPartiallyExpanded", "confirmValueChange", "Landroidx/compose/material3/SheetValue;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "ModalBottomSheetContent", "Landroidx/compose/foundation/layout/BoxScope;", "predictiveBackProgress", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "animateToDismiss", "settleToDismiss", "Lkotlin/ParameterName;", "name", "velocity", "ModalBottomSheetContent-IQkwcL4", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/animation/core/Animatable;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "calculatePredictiveBackScaleX", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "progress", "calculatePredictiveBackScaleY", "material3_release", "alpha"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class ModalBottomSheetKt {
    private static final float PredictiveBackMaxScaleXDistance = Dp.m6997constructorimpl(48);
    private static final float PredictiveBackMaxScaleYDistance = Dp.m6997constructorimpl(24);
    private static final long PredictiveBackChildTransformOrigin = TransformOriginKt.TransformOrigin(0.5f, 0.0f);

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bb  */
    /* renamed from: ModalBottomSheet-dYc4hso, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2563ModalBottomSheetdYc4hso(final kotlin.jvm.functions.Function0<kotlin.Unit> r45, androidx.compose.ui.Modifier r46, androidx.compose.material3.SheetState r47, float r48, androidx.compose.ui.graphics.Shape r49, long r50, long r52, float r54, long r55, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.foundation.layout.WindowInsets> r58, androidx.compose.material3.ModalBottomSheetProperties r59, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r60, androidx.compose.runtime.Composer r61, final int r62, final int r63, final int r64) {
        /*
            Method dump skipped, instructions count: 1265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheetKt.m2563ModalBottomSheetdYc4hso(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.material3.SheetState, float, androidx.compose.ui.graphics.Shape, long, long, float, long, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material3.ModalBottomSheetProperties, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0198, code lost:
    
        if (r0.changedInstance(r62) == false) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f3  */
    /* renamed from: ModalBottomSheetContent-IQkwcL4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2564ModalBottomSheetContentIQkwcL4(final androidx.compose.foundation.layout.BoxScope r47, final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r48, final kotlinx.coroutines.CoroutineScope r49, final kotlin.jvm.functions.Function0<kotlin.Unit> r50, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r51, androidx.compose.ui.Modifier r52, androidx.compose.material3.SheetState r53, float r54, androidx.compose.ui.graphics.Shape r55, long r56, long r58, float r60, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r61, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.foundation.layout.WindowInsets> r62, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r63, androidx.compose.runtime.Composer r64, final int r65, final int r66, final int r67) {
        /*
            Method dump skipped, instructions count: 1273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheetKt.m2564ModalBottomSheetContentIQkwcL4(androidx.compose.foundation.layout.BoxScope, androidx.compose.animation.core.Animatable, kotlinx.coroutines.CoroutineScope, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.material3.SheetState, float, androidx.compose.ui.graphics.Shape, long, long, float, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope, float f) {
        float m4343getWidthimpl = Size.m4343getWidthimpl(graphicsLayerScope.getSize());
        if (Float.isNaN(m4343getWidthimpl) || m4343getWidthimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo677toPx0680j_4(PredictiveBackMaxScaleXDistance), m4343getWidthimpl), f) / m4343getWidthimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope, float f) {
        float m4340getHeightimpl = Size.m4340getHeightimpl(graphicsLayerScope.getSize());
        if (Float.isNaN(m4340getHeightimpl) || m4340getHeightimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo677toPx0680j_4(PredictiveBackMaxScaleYDistance), m4340getHeightimpl), f) / m4340getHeightimpl);
    }

    public static final SheetState rememberModalBottomSheetState(boolean z, Function1<? super SheetValue, Boolean> function1, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -778250030, "C(rememberModalBottomSheetState)P(1)400@18058L160:ModalBottomSheet.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            function1 = new Function1<SheetValue, Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$rememberModalBottomSheetState$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(SheetValue sheetValue) {
                    return true;
                }
            };
        }
        Function1<? super SheetValue, Boolean> function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-778250030, i, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:400)");
        }
        SheetState rememberSheetState = SheetDefaultsKt.rememberSheetState(z2, function12, SheetValue.Hidden, false, composer, (i & 14) | 384 | (i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return rememberSheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m2565Scrim3JVO9M(final long j, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(951870469);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)P(0:c#ui.graphics.Color)410@18376L87,411@18489L29,426@19112L79,426@19062L129:ModalBottomSheet.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(951870469, i3, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.kt:407)");
            }
            if (j != 16) {
                final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                Strings.Companion companion2 = Strings.INSTANCE;
                final String m3296getString2EP1pXo = Strings_androidKt.m3296getString2EP1pXo(Strings.m3226constructorimpl(androidx.compose.ui.R.string.close_sheet), startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(-1785653838);
                ComposerKt.sourceInformation(startRestartGroup, "414@18629L44,415@18730L263");
                if (z) {
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1785652017, "CC(remember):ModalBottomSheet.kt#9igjgp");
                    int i4 = i3 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA;
                    boolean z2 = i4 == 32;
                    ModalBottomSheetKt$Scrim$dismissSheet$1$1 rememberedValue = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new ModalBottomSheetKt$Scrim$dismissSheet$1$1(function0, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion3, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1785648566, "CC(remember):ModalBottomSheet.kt#9igjgp");
                    boolean changed = startRestartGroup.changed(m3296getString2EP1pXo) | (i4 == 32);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$2$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 1.0f);
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, m3296getString2EP1pXo);
                                final Function0<Unit> function02 = function0;
                                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        function02.invoke();
                                        return true;
                                    }
                                }, 1, null);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    companion = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue2);
                } else {
                    companion = Modifier.INSTANCE;
                }
                startRestartGroup.endReplaceGroup();
                Modifier then = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(companion);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1785636526, "CC(remember):ModalBottomSheet.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(animateFloatAsState) | ((i3 & 14) == 4);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float Scrim_3J_VO9M$lambda$10;
                            long j2 = j;
                            Scrim_3J_VO9M$lambda$10 = ModalBottomSheetKt.Scrim_3J_VO9M$lambda$10(animateFloatAsState);
                            DrawScope.m5065drawRectnJ9OG0$default(drawScope, j2, 0L, 0L, RangesKt.coerceIn(Scrim_3J_VO9M$lambda$10, 0.0f, 1.0f), null, null, 0, 118, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    ModalBottomSheetKt.m2565Scrim3JVO9M(j, function0, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$10(State<Float> state) {
        return state.getValue().floatValue();
    }
}
