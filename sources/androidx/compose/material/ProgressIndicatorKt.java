package androidx.compose.material;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* compiled from: ProgressIndicator.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a0\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001aD\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a8\u0010\u001e\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001aN\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a0\u00101\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a:\u00101\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a8\u00101\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001aD\u00101\u001a\u00020\u001f2\b\b\u0001\u0010,\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010'\u001a\u00020#2\b\b\u0002\u0010(\u001a\u00020)H\u0007ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a6\u0010:\u001a\u00020\u001f*\u00020;2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a&\u0010B\u001a\u00020\u001f*\u00020;2\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001a6\u0010E\u001a\u00020\u001f*\u00020;2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010A\u001a>\u0010G\u001a\u00020\u001f*\u00020;2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001a>\u0010J\u001a\u00020\u001f*\u00020;2\u0006\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010(\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a.\u0010O\u001a\u00020\u001f*\u00020;2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010(\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a\f\u0010R\u001a\u00020!*\u00020!H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0012\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\u0013\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006S²\u0006\n\u0010T\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010U\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010V\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010W\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010X\u001a\u00020\bX\u008a\u0084\u0002²\u0006\n\u0010Y\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010Z\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010<\u001a\u00020\u0001X\u008a\u0084\u0002"}, d2 = {"BaseRotationAngle", "", "CircularEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "CircularIndicatorDiameter", "Landroidx/compose/ui/unit/Dp;", "F", "FirstLineHeadDelay", "", "FirstLineHeadDuration", "FirstLineHeadEasing", "FirstLineTailDelay", "FirstLineTailDuration", "FirstLineTailEasing", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "JumpRotationAngle", "LinearAnimationDuration", "LinearIndicatorHeight", "LinearIndicatorWidth", "RotationAngleOffset", "RotationDuration", "RotationsPerCycle", "SecondLineHeadDelay", "SecondLineHeadDuration", "SecondLineHeadEasing", "SecondLineTailDelay", "SecondLineTailDuration", "SecondLineTailEasing", "StartAngleOffset", "CircularProgressIndicator", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "strokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "progress", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-DUhRLBM", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-_5eSR-E", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "drawCircularIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startAngle", "sweep", "stroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicatorBackground", "drawCircularIndicatorBackground-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawDeterminateCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawIndeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawLinearIndicator", "startFraction", "endFraction", "drawLinearIndicator-qYKTg0g", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", "drawLinearIndicatorBackground", "drawLinearIndicatorBackground-AZGd3zU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V", "increaseSemanticsBounds", "material_release", "firstLineHead", "firstLineTail", "secondLineHead", "secondLineTail", "currentRotation", "baseRotation", "endAngle"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ProgressIndicatorKt {
    private static final float BaseRotationAngle = 286.0f;
    private static final int FirstLineHeadDelay = 0;
    private static final int FirstLineHeadDuration = 750;
    private static final int FirstLineTailDelay = 333;
    private static final int FirstLineTailDuration = 850;
    private static final int HeadAndTailAnimationDuration = 666;
    private static final int HeadAndTailDelayDuration = 666;
    private static final float JumpRotationAngle = 290.0f;
    private static final int LinearAnimationDuration = 1800;
    private static final float RotationAngleOffset = 216.0f;
    private static final int RotationDuration = 1332;
    private static final int RotationsPerCycle = 5;
    private static final int SecondLineHeadDelay = 1000;
    private static final int SecondLineHeadDuration = 567;
    private static final int SecondLineTailDelay = 1267;
    private static final int SecondLineTailDuration = 533;
    private static final float StartAngleOffset = -90.0f;
    private static final float LinearIndicatorHeight = ProgressIndicatorDefaults.INSTANCE.m1921getStrokeWidthD9Ej5fM();
    private static final float LinearIndicatorWidth = Dp.m6997constructorimpl(PsExtractor.VIDEO_STREAM_MASK);
    private static final float CircularIndicatorDiameter = Dp.m6997constructorimpl(40);
    private static final CubicBezierEasing FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
    private static final CubicBezierEasing FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final CubicBezierEasing SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
    private static final CubicBezierEasing SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
    private static final CubicBezierEasing CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x005e  */
    /* renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1928LinearProgressIndicator_5eSRE(final float r22, androidx.compose.ui.Modifier r23, long r24, long r26, int r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1928LinearProgressIndicator_5eSRE(float, androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0253  */
    /* renamed from: LinearProgressIndicator-2cYBFYY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1926LinearProgressIndicator2cYBFYY(androidx.compose.ui.Modifier r23, long r24, long r26, int r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1926LinearProgressIndicator2cYBFYY(androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0061  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m1929LinearProgressIndicatoreaDK9VM(final float r20, androidx.compose.ui.Modifier r21, long r22, long r24, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1929LinearProgressIndicatoreaDK9VM(float, androidx.compose.ui.Modifier, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ void m1927LinearProgressIndicatorRIQooxk(Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        Modifier.Companion companion;
        long j5;
        Composer startRestartGroup = composer.startRestartGroup(-819397058);
        ComposerKt.sourceInformation(startRestartGroup, "C(LinearProgressIndicator)P(2,1:c#ui.graphics.Color,0:c#ui.graphics.Color)239@9758L6,241@9854L104:ProgressIndicator.kt#jmzs0o");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            j3 = j;
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(j3)) ? 32 : 16;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            j4 = j2;
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j4)) ? 256 : 128;
        } else {
            j4 = j2;
        }
        if ((i3 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            companion = modifier2;
            j5 = j3;
        } else {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1799getPrimary0d7_KjU();
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    j4 = Color.m4514copywmQWz5c$default(j3, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    i3 &= -897;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                companion = modifier2;
            }
            int i5 = i3;
            j5 = j3;
            long j6 = j4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-819397058, i5, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:241)");
            }
            m1926LinearProgressIndicator2cYBFYY(companion, j5, j6, StrokeCap.INSTANCE.m4868getButtKaPHkGw(), startRestartGroup, (i5 & 14) | (i5 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | (i5 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j4 = j6;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier3 = companion;
            final long j7 = j5;
            final long j8 = j4;
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$6
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

                public final void invoke(Composer composer2, int i6) {
                    ProgressIndicatorKt.m1927LinearProgressIndicatorRIQooxk(Modifier.this, j7, j8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicator-qYKTg0g, reason: not valid java name */
    public static final void m1939drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f, float f2, long j, float f3, int i) {
        float m4343getWidthimpl = Size.m4343getWidthimpl(drawScope.mo5071getSizeNHjbRc());
        float m4340getHeightimpl = Size.m4340getHeightimpl(drawScope.mo5071getSizeNHjbRc());
        float f4 = 2;
        float f5 = m4340getHeightimpl / f4;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f6 = (z ? f : 1.0f - f2) * m4343getWidthimpl;
        float f7 = (z ? f2 : 1.0f - f) * m4343getWidthimpl;
        if (StrokeCap.m4864equalsimpl0(i, StrokeCap.INSTANCE.m4868getButtKaPHkGw()) || m4340getHeightimpl > m4343getWidthimpl) {
            DrawScope.m5057drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(f6, f5), OffsetKt.Offset(f7, f5), f3, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f8 = f3 / f4;
        ClosedFloatingPointRange<Float> rangeTo = RangesKt.rangeTo(f8, m4343getWidthimpl - f8);
        float floatValue = ((Number) RangesKt.coerceIn(Float.valueOf(f6), rangeTo)).floatValue();
        float floatValue2 = ((Number) RangesKt.coerceIn(Float.valueOf(f7), rangeTo)).floatValue();
        if (Math.abs(f2 - f) > 0.0f) {
            DrawScope.m5057drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(floatValue, f5), OffsetKt.Offset(floatValue2, f5), f3, i, null, 0.0f, null, 0, 480, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicatorBackground-AZGd3zU, reason: not valid java name */
    public static final void m1940drawLinearIndicatorBackgroundAZGd3zU(DrawScope drawScope, long j, float f, int i) {
        m1939drawLinearIndicatorqYKTg0g(drawScope, 0.0f, 1.0f, j, f, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x005e  */
    /* renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1922CircularProgressIndicatorDUhRLBM(final float r18, androidx.compose.ui.Modifier r19, long r20, float r22, long r23, int r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1922CircularProgressIndicatorDUhRLBM(float, androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006c  */
    /* renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1923CircularProgressIndicatorLxG7B9w(androidx.compose.ui.Modifier r23, long r24, float r26, long r27, int r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1923CircularProgressIndicatorLxG7B9w(androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0063  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m1924CircularProgressIndicatorMBs18nI(final float r20, androidx.compose.ui.Modifier r21, long r22, float r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1924CircularProgressIndicatorMBs18nI(float, androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m1925CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier r19, long r20, float r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1925CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m1935drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        float f3 = 2;
        float width = stroke.getWidth() / f3;
        float m4343getWidthimpl = Size.m4343getWidthimpl(drawScope.mo5071getSizeNHjbRc()) - (f3 * width);
        DrawScope.m5050drawArcyD3GUKo$default(drawScope, j, f, f2, false, OffsetKt.Offset(width, width), SizeKt.Size(m4343getWidthimpl, m4343getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCircularIndicatorBackground-bw27NRU, reason: not valid java name */
    public static final void m1936drawCircularIndicatorBackgroundbw27NRU(DrawScope drawScope, long j, Stroke stroke) {
        m1935drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    public static final void m1937drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        m1935drawCircularIndicator42QJj7c(drawScope, f, f2, j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final void m1938drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f, float f2, float f3, long j, Stroke stroke) {
        m1935drawCircularIndicator42QJj7c(drawScope, f + (StrokeCap.m4864equalsimpl0(stroke.getCap(), StrokeCap.INSTANCE.m4868getButtKaPHkGw()) ? 0.0f : ((f2 / Dp.m6997constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f), Math.max(f3, 0.1f), j, stroke);
    }

    public static final Modifier increaseSemanticsBounds(Modifier modifier) {
        final float m6997constructorimpl = Dp.m6997constructorimpl(10);
        return PaddingKt.m987paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(modifier, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material.ProgressIndicatorKt$increaseSemanticsBounds$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return m1941invoke3p2s80s(measureScope, measurable, constraints.getValue());
            }

            /* renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m1941invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                final int i = measureScope.mo671roundToPx0680j_4(m6997constructorimpl);
                int i2 = i * 2;
                final Placeable mo5851measureBRTryo0 = measurable.mo5851measureBRTryo0(ConstraintsKt.m6969offsetNN6EwU(j, 0, i2));
                return MeasureScope.layout$default(measureScope, mo5851measureBRTryo0.getWidth(), mo5851measureBRTryo0.getHeight() - i2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$increaseSemanticsBounds$1.1
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
                        Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, -i, 0.0f, 4, null);
                    }
                }, 4, null);
            }
        }), true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$increaseSemanticsBounds$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }
        }), 0.0f, m6997constructorimpl, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CircularProgressIndicator_LxG7B9w$lambda$8(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$9(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$10(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }
}
