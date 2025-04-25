package androidx.compose.material3;

import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010!J\u0096\u0001\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0017\u001a\u00020\r2!\b\u0002\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#¢\u0006\u0002\b&2%\b\u0002\u0010'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(¢\u0006\u0002\b&2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-J3\u0010\u001e\u001a\u00020\u00122\u0006\u0010.\u001a\u00020/2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u00100J3\u0010\u001e\u001a\u00020\u00122\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u00103J\u0096\u0001\u0010\u001e\u001a\u00020\u00122\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0017\u001a\u00020\r2!\b\u0002\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#¢\u0006\u0002\b&2%\b\u0002\u0010'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(¢\u0006\u0002\b&2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u00104J\r\u0010\u0017\u001a\u00020\rH\u0007¢\u0006\u0002\u00105Jv\u0010\u0017\u001a\u00020\r2\b\b\u0002\u00106\u001a\u00020)2\b\b\u0002\u00107\u001a\u00020)2\b\b\u0002\u00108\u001a\u00020)2\b\b\u0002\u00109\u001a\u00020)2\b\b\u0002\u0010:\u001a\u00020)2\b\b\u0002\u0010;\u001a\u00020)2\b\b\u0002\u0010<\u001a\u00020)2\b\b\u0002\u0010=\u001a\u00020)2\b\b\u0002\u0010>\u001a\u00020)2\b\b\u0002\u0010?\u001a\u00020)H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ2\u0010\"\u001a\u00020\u00122\u0006\u0010B\u001a\u00020$2\u0006\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010GJÄ\u0001\u0010H\u001a\u00020\u0012*\u00020$2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020L2\u0006\u00109\u001a\u00020)2\u0006\u00107\u001a\u00020)2\u0006\u0010:\u001a\u00020)2\u0006\u00108\u001a\u00020)2\u0006\u0010N\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u001f\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#¢\u0006\u0002\b&2#\u0010'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(¢\u0006\u0002\b&2\u0006\u0010Q\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ>\u0010T\u001a\u00020\u0012*\u00020$2\u0006\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020U2\u0006\u0010E\u001a\u00020)2\u0006\u0010V\u001a\u00020L2\u0006\u0010W\u001a\u00020LH\u0002ø\u0001\u0000¢\u0006\u0004\bX\u0010YR\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\u00020\r*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/material3/SliderDefaults;", "", "()V", "TickSize", "Landroidx/compose/ui/unit/Dp;", "getTickSize-D9Ej5fM", "()F", "F", "TrackStopIndicatorSize", "getTrackStopIndicatorSize-D9Ej5fM", "trackPath", "Landroidx/compose/ui/graphics/Path;", "defaultSliderColors", "Landroidx/compose/material3/SliderColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultSliderColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SliderColors;", "Thumb", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "enabled", "", "thumbSize", "Landroidx/compose/ui/unit/DpSize;", "Thumb-9LiSoMs", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V", "Track", "rangeSliderState", "Landroidx/compose/material3/RangeSliderState;", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "drawStopIndicator", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "drawTick", "Lkotlin/Function3;", "Landroidx/compose/ui/graphics/Color;", "thumbTrackGapSize", "trackInsideCornerSize", "Track-4EFweAY", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "sliderPositions", "Landroidx/compose/material3/SliderPositions;", "(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "sliderState", "Landroidx/compose/material3/SliderState;", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;", "thumbColor", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;", "drawScope", TypedValues.CycleType.S_WAVE_OFFSET, LogEventArguments.ARG_SIZE, "color", "drawStopIndicator-x3O1jOs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFJ)V", "drawTrack", "tickFractions", "", "activeRangeStart", "", "activeRangeEnd", "height", "startThumbWidth", "endThumbWidth", "isRangeSlider", "drawTrack-ngJ0SCU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;[FFFJJJJFFFFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Z)V", "drawTrackPath", "Landroidx/compose/ui/geometry/Size;", "startCornerRadius", "endCornerRadius", "drawTrackPath-Cx2C_VA", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFF)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final SliderDefaults INSTANCE = new SliderDefaults();
    private static final float TrackStopIndicatorSize = SliderTokens.INSTANCE.m3820getStopIndicatorSizeD9Ej5fM();
    private static final float TickSize = SliderTokens.INSTANCE.m3820getStopIndicatorSizeD9Ej5fM();
    private static final Path trackPath = AndroidPath_androidKt.Path();

    private SliderDefaults() {
    }

    public final SliderColors colors(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1376295968, "C(colors)845@36907L11:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1376295968, i, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:845)");
        }
        SliderColors defaultSliderColors$material3_release = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultSliderColors$material3_release;
    }

    /* renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m2816colorsq0g_0yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Composer composer, int i, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 885588574, "C(colors)P(9:c#ui.graphics.Color,1:c#ui.graphics.Color,0:c#ui.graphics.Color,8:c#ui.graphics.Color,7:c#ui.graphics.Color,6:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.graphics.Color,4:c#ui.graphics.Color)887@39230L11:Slider.kt#uh7d8r");
        long m4551getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j;
        long m4551getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j2;
        long m4551getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j3;
        long m4551getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j4;
        long m4551getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j5;
        long m4551getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j6;
        long m4551getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j7;
        long m4551getUnspecified0d7_KjU8 = (i3 & 128) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j8;
        long m4551getUnspecified0d7_KjU9 = (i3 & 256) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j9;
        long m4551getUnspecified0d7_KjU10 = (i3 & 512) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(885588574, i, i2, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:887)");
        }
        SliderColors m2794copyK518z4 = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2794copyK518z4(m4551getUnspecified0d7_KjU, m4551getUnspecified0d7_KjU2, m4551getUnspecified0d7_KjU3, m4551getUnspecified0d7_KjU4, m4551getUnspecified0d7_KjU5, m4551getUnspecified0d7_KjU6, m4551getUnspecified0d7_KjU7, m4551getUnspecified0d7_KjU8, m4551getUnspecified0d7_KjU9, m4551getUnspecified0d7_KjU10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m2794copyK518z4;
    }

    public final SliderColors getDefaultSliderColors$material3_release(ColorScheme colorScheme) {
        SliderColors defaultSliderColorsCached = colorScheme.getDefaultSliderColorsCached();
        if (defaultSliderColorsCached != null) {
            return defaultSliderColorsCached;
        }
        SliderColors sliderColors = new SliderColors(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getHandleColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getActiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getInactiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getInactiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getActiveTrackColor()), ColorKt.m4560compositeOverOWjLjI(Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledHandleColor()), SliderTokens.INSTANCE.getDisabledHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledActiveTrackColor()), SliderTokens.INSTANCE.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledInactiveTrackColor()), SliderTokens.INSTANCE.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledInactiveTrackColor()), SliderTokens.INSTANCE.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledActiveTrackColor()), SliderTokens.INSTANCE.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultSliderColorsCached$material3_release(sliderColors);
        return sliderColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0069  */
    /* renamed from: Thumb-9LiSoMs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2813Thumb9LiSoMs(final androidx.compose.foundation.interaction.MutableInteractionSource r24, androidx.compose.ui.Modifier r25, androidx.compose.material3.SliderColors r26, boolean r27, long r28, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.m2813Thumb9LiSoMs(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0065  */
    @kotlin.Deprecated(message = "Use version that supports slider state")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Track(final androidx.compose.material3.SliderPositions r22, androidx.compose.ui.Modifier r23, androidx.compose.material3.SliderColors r24, boolean r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.Track(androidx.compose.material3.SliderPositions, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0062  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the overload that takes `drawStopIndicator`, `drawTick`, `thumbTrackGapSize` and `trackInsideCornerSize`, see `LegacySliderSample` on how to restore the previous behavior", replaceWith = @kotlin.ReplaceWith(expression = "Track(sliderState, modifier, enabled, colors, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void Track(final androidx.compose.material3.SliderState r20, androidx.compose.ui.Modifier r21, androidx.compose.material3.SliderColors r22, boolean r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.Track(androidx.compose.material3.SliderState, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026c  */
    /* renamed from: Track-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2815Track4EFweAY(final androidx.compose.material3.SliderState r28, androidx.compose.ui.Modifier r29, boolean r30, androidx.compose.material3.SliderColors r31, kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> r32, kotlin.jvm.functions.Function3<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.graphics.Color, kotlin.Unit> r33, float r34, float r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.m2815Track4EFweAY(androidx.compose.material3.SliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0062  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the overload that takes `drawStopIndicator`, `drawTick`, `thumbTrackGapSize` and `trackInsideCornerSize`, see `LegacyRangeSliderSample` on how to restore the previous behavior", replaceWith = @kotlin.ReplaceWith(expression = "Track(rangeSliderState, modifier, colors, enabled, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void Track(final androidx.compose.material3.RangeSliderState r20, androidx.compose.ui.Modifier r21, androidx.compose.material3.SliderColors r22, boolean r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.Track(androidx.compose.material3.RangeSliderState, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026c  */
    /* renamed from: Track-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2814Track4EFweAY(final androidx.compose.material3.RangeSliderState r28, androidx.compose.ui.Modifier r29, boolean r30, androidx.compose.material3.SliderColors r31, kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> r32, kotlin.jvm.functions.Function3<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.graphics.Color, kotlin.Unit> r33, float r34, float r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.m2814Track4EFweAY(androidx.compose.material3.RangeSliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawTrack-ngJ0SCU, reason: not valid java name */
    public final void m2811drawTrackngJ0SCU(DrawScope drawScope, float[] fArr, float f, float f2, long j, long j2, long j3, long j4, float f3, float f4, float f5, float f6, float f7, Function2<? super DrawScope, ? super Offset, Unit> function2, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, boolean z) {
        float f8;
        float f9;
        int i;
        float f10;
        float f11;
        long Offset = OffsetKt.Offset(0.0f, Offset.m4275getYimpl(drawScope.mo5070getCenterF1C5BW0()));
        long Offset2 = OffsetKt.Offset(Size.m4343getWidthimpl(drawScope.mo5071getSizeNHjbRc()), Offset.m4275getYimpl(drawScope.mo5070getCenterF1C5BW0()));
        float f12 = drawScope.mo677toPx0680j_4(f3);
        long Offset3 = OffsetKt.Offset(Offset.m4274getXimpl(Offset) + ((Offset.m4274getXimpl(Offset2) - Offset.m4274getXimpl(Offset)) * f2), Offset.m4275getYimpl(drawScope.mo5070getCenterF1C5BW0()));
        long Offset4 = OffsetKt.Offset(Offset.m4274getXimpl(Offset) + ((Offset.m4274getXimpl(Offset2) - Offset.m4274getXimpl(Offset)) * f), Offset.m4275getYimpl(drawScope.mo5070getCenterF1C5BW0()));
        float f13 = 2;
        float f14 = f12 / f13;
        float f15 = drawScope.mo677toPx0680j_4(f7);
        if (Dp.m6996compareTo0680j_4(f6, Dp.m6997constructorimpl(0)) > 0) {
            f8 = (drawScope.mo677toPx0680j_4(f4) / f13) + drawScope.mo677toPx0680j_4(f6);
            f9 = (drawScope.mo677toPx0680j_4(f5) / f13) + drawScope.mo677toPx0680j_4(f6);
        } else {
            f8 = 0.0f;
            f9 = 0.0f;
        }
        if (!z || Offset.m4274getXimpl(Offset4) <= Offset.m4274getXimpl(Offset) + f8 + f14) {
            i = 0;
            f10 = f12;
        } else {
            float m4274getXimpl = Offset.m4274getXimpl(Offset);
            i = 0;
            f10 = f12;
            m2812drawTrackPathCx2C_VA(drawScope, Offset.INSTANCE.m4290getZeroF1C5BW0(), SizeKt.Size((Offset.m4274getXimpl(Offset4) - f8) - m4274getXimpl, f12), j, f14, f15);
            if (function2 != null) {
                function2.invoke(drawScope, Offset.m4263boximpl(OffsetKt.Offset(m4274getXimpl + f14, Offset.m4275getYimpl(drawScope.mo5070getCenterF1C5BW0()))));
            }
        }
        if (Offset.m4274getXimpl(Offset3) < (Offset.m4274getXimpl(Offset2) - f9) - f14) {
            float m4274getXimpl2 = Offset.m4274getXimpl(Offset3) + f9;
            float m4274getXimpl3 = Offset.m4274getXimpl(Offset2);
            float f16 = f10;
            f11 = f16;
            m2812drawTrackPathCx2C_VA(drawScope, OffsetKt.Offset(m4274getXimpl2, 0.0f), SizeKt.Size(m4274getXimpl3 - m4274getXimpl2, f16), j, f15, f14);
            if (function2 != null) {
                function2.invoke(drawScope, Offset.m4263boximpl(OffsetKt.Offset(m4274getXimpl3 - f14, Offset.m4275getYimpl(drawScope.mo5070getCenterF1C5BW0()))));
            }
        } else {
            f11 = f10;
        }
        float m4274getXimpl4 = z ? Offset.m4274getXimpl(Offset4) + f8 : 0.0f;
        float m4274getXimpl5 = Offset.m4274getXimpl(Offset3) - f9;
        float f17 = z ? f15 : f14;
        float f18 = m4274getXimpl5 - m4274getXimpl4;
        if (f18 > f17) {
            m2812drawTrackPathCx2C_VA(drawScope, OffsetKt.Offset(m4274getXimpl4, 0.0f), SizeKt.Size(f18, f11), j2, f17, f15);
        }
        long Offset5 = OffsetKt.Offset(Offset.m4274getXimpl(Offset) + f14, Offset.m4275getYimpl(Offset));
        long Offset6 = OffsetKt.Offset(Offset.m4274getXimpl(Offset2) - f14, Offset.m4275getYimpl(Offset2));
        ClosedFloatingPointRange<Float> rangeTo = RangesKt.rangeTo(Offset.m4274getXimpl(Offset4) - f8, Offset.m4274getXimpl(Offset4) + f8);
        ClosedFloatingPointRange<Float> rangeTo2 = RangesKt.rangeTo(Offset.m4274getXimpl(Offset3) - f9, Offset.m4274getXimpl(Offset3) + f9);
        int length = fArr.length;
        int i2 = i;
        int i3 = i2;
        while (i3 < length) {
            float f19 = fArr[i3];
            int i4 = i2 + 1;
            int i5 = 1;
            if (function2 == null || ((!z || i2 != 0) && i2 != fArr.length - 1)) {
                if (f19 <= f2 && f19 >= f) {
                    i5 = i;
                }
                long Offset7 = OffsetKt.Offset(Offset.m4274getXimpl(OffsetKt.m4297lerpWko1d7g(Offset5, Offset6, f19)), Offset.m4275getYimpl(drawScope.mo5070getCenterF1C5BW0()));
                if ((!z || !rangeTo.contains(Float.valueOf(Offset.m4274getXimpl(Offset7)))) && !rangeTo2.contains(Float.valueOf(Offset.m4274getXimpl(Offset7)))) {
                    function3.invoke(drawScope, Offset.m4263boximpl(Offset7), Color.m4505boximpl(i5 != 0 ? j3 : j4));
                    i3++;
                    i2 = i4;
                }
            }
            i3++;
            i2 = i4;
        }
    }

    /* renamed from: drawTrackPath-Cx2C_VA, reason: not valid java name */
    private final void m2812drawTrackPathCx2C_VA(DrawScope drawScope, long j, long j2, long j3, float f, float f2) {
        long CornerRadius = CornerRadiusKt.CornerRadius(f, f);
        long CornerRadius2 = CornerRadiusKt.CornerRadius(f2, f2);
        RoundRect m4326RoundRectZAM2FJo = RoundRectKt.m4326RoundRectZAM2FJo(RectKt.m4314Recttz77jQw(OffsetKt.Offset(Offset.m4274getXimpl(j), 0.0f), SizeKt.Size(Size.m4343getWidthimpl(j2), Size.m4340getHeightimpl(j2))), CornerRadius, CornerRadius2, CornerRadius2, CornerRadius);
        Path path = trackPath;
        Path.addRoundRect$default(path, m4326RoundRectZAM2FJo, null, 2, null);
        DrawScope.m5061drawPathLG529CI$default(drawScope, path, j3, 0.0f, null, null, 0, 60, null);
        path.rewind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawStopIndicator-x3O1jOs, reason: not valid java name */
    public final void m2810drawStopIndicatorx3O1jOs(DrawScope drawScope, long offset, float size, long color) {
        DrawScope.m5052drawCircleVaOC9Bg$default(drawScope, color, drawScope.mo677toPx0680j_4(size) / 2.0f, offset, 0.0f, null, null, 0, 120, null);
    }

    /* renamed from: getTrackStopIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m2818getTrackStopIndicatorSizeD9Ej5fM() {
        return TrackStopIndicatorSize;
    }

    /* renamed from: getTickSize-D9Ej5fM, reason: not valid java name */
    public final float m2817getTickSizeD9Ej5fM() {
        return TickSize;
    }
}
