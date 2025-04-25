package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.base.utils.StatusBarUtils;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* compiled from: DatePicker.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(J$\u0010)\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020&H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010-J\u008e\u0002\u0010,\u001a\u00020\u00192\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u00020/2\b\b\u0002\u00104\u001a\u00020/2\b\b\u0002\u00105\u001a\u00020/2\b\b\u0002\u00106\u001a\u00020/2\b\b\u0002\u00107\u001a\u00020/2\b\b\u0002\u00108\u001a\u00020/2\b\b\u0002\u00109\u001a\u00020/2\b\b\u0002\u0010:\u001a\u00020/2\b\b\u0002\u0010;\u001a\u00020/2\b\b\u0002\u0010<\u001a\u00020/2\b\b\u0002\u0010=\u001a\u00020/2\b\b\u0002\u0010>\u001a\u00020/2\b\b\u0002\u0010?\u001a\u00020/2\b\b\u0002\u0010@\u001a\u00020/2\b\b\u0002\u0010A\u001a\u00020/2\b\b\u0002\u0010B\u001a\u00020/2\b\b\u0002\u0010C\u001a\u00020/2\b\b\u0002\u0010D\u001a\u00020/2\b\b\u0002\u0010E\u001a\u00020/2\b\b\u0002\u0010F\u001a\u00020/2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010HH\u0007ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ$\u0010#\u001a\u00020$2\b\b\u0002\u0010K\u001a\u00020\r2\b\b\u0002\u0010L\u001a\u00020\r2\b\b\u0002\u0010M\u001a\u00020\rJ'\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u000e\b\u0002\u0010R\u001a\b\u0012\u0004\u0012\u00020T0SH\u0001¢\u0006\u0004\bU\u0010VR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u00020\u0019*\u00020\u001a8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006W"}, d2 = {"Landroidx/compose/material3/DatePickerDefaults;", "", "()V", "AllDates", "Landroidx/compose/material3/SelectableDates;", "getAllDates", "()Landroidx/compose/material3/SelectableDates;", "TonalElevation", "Landroidx/compose/ui/unit/Dp;", "getTonalElevation-D9Ej5fM", "()F", "F", "YearAbbrMonthDaySkeleton", "", "YearMonthSkeleton", "YearMonthWeekdayDaySkeleton", "YearRange", "Lkotlin/ranges/IntRange;", "getYearRange", "()Lkotlin/ranges/IntRange;", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultDatePickerColors", "Landroidx/compose/material3/DatePickerColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultDatePickerColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/DatePickerColors;", "DatePickerHeadline", "", "selectedDateMillis", "", "displayMode", "Landroidx/compose/material3/DisplayMode;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "modifier", "Landroidx/compose/ui/Modifier;", "DatePickerHeadline-3kbWawI", "(Ljava/lang/Long;ILandroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DatePickerTitle", "DatePickerTitle-hOD91z4", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/DatePickerColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "navigationContentColor", "yearContentColor", "disabledYearContentColor", "currentYearContentColor", "selectedYearContentColor", "disabledSelectedYearContentColor", "selectedYearContainerColor", "disabledSelectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContentColor", "dayInSelectionRangeContainerColor", "dividerColor", "dateTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "colors-bSRYm20", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)Landroidx/compose/material3/DatePickerColors;", "yearSelectionSkeleton", "selectedDateSkeleton", "selectedDateDescriptionSkeleton", "rememberSnapFlingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "rememberSnapFlingBehavior$material3_release", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class DatePickerDefaults {
    public static final int $stable = 0;
    public static final String YearAbbrMonthDaySkeleton = "yMMMd";
    public static final String YearMonthSkeleton = "yMMMM";
    public static final String YearMonthWeekdayDaySkeleton = "yMMMMEEEEd";
    public static final DatePickerDefaults INSTANCE = new DatePickerDefaults();
    private static final IntRange YearRange = new IntRange(1900, 2100);
    private static final float TonalElevation = ElevationTokens.INSTANCE.m3494getLevel0D9Ej5fM();
    private static final SelectableDates AllDates = new SelectableDates() { // from class: androidx.compose.material3.DatePickerDefaults$AllDates$1
    };

    private DatePickerDefaults() {
    }

    public final DatePickerColors colors(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -275219611, "C(colors)432@18805L11,432@18817L23:DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-275219611, i, -1, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:432)");
        }
        DatePickerColors defaultDatePickerColors = getDefaultDatePickerColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i << 3) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultDatePickerColors;
    }

    /* renamed from: colors-bSRYm20, reason: not valid java name */
    public final DatePickerColors m2344colorsbSRYm20(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, TextFieldColors textFieldColors, Composer composer, int i, int i2, int i3, int i4) {
        ComposerKt.sourceInformationMarkerStart(composer, 1991626358, "C(colors)P(0:c#ui.graphics.Color,20:c#ui.graphics.Color,13:c#ui.graphics.Color,23:c#ui.graphics.Color,19:c#ui.graphics.Color,14:c#ui.graphics.Color,24:c#ui.graphics.Color,11:c#ui.graphics.Color,1:c#ui.graphics.Color,18:c#ui.graphics.Color,10:c#ui.graphics.Color,17:c#ui.graphics.Color,9:c#ui.graphics.Color,3:c#ui.graphics.Color,6:c#ui.graphics.Color,16:c#ui.graphics.Color,8:c#ui.graphics.Color,15:c#ui.graphics.Color,7:c#ui.graphics.Color,21:c#ui.graphics.Color,22:c#ui.graphics.Color,5:c#ui.graphics.Color,4:c#ui.graphics.Color,12:c#ui.graphics.Color)501@23101L11,501@23113L23:DatePicker.kt#uh7d8r");
        long m4551getUnspecified0d7_KjU = (i4 & 1) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j;
        long m4551getUnspecified0d7_KjU2 = (i4 & 2) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j2;
        long m4551getUnspecified0d7_KjU3 = (i4 & 4) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j3;
        long m4551getUnspecified0d7_KjU4 = (i4 & 8) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j4;
        long m4551getUnspecified0d7_KjU5 = (i4 & 16) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j5;
        long m4551getUnspecified0d7_KjU6 = (i4 & 32) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j6;
        long m4551getUnspecified0d7_KjU7 = (i4 & 64) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j7;
        long m4551getUnspecified0d7_KjU8 = (i4 & 128) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j8;
        long m4551getUnspecified0d7_KjU9 = (i4 & 256) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j9;
        long m4551getUnspecified0d7_KjU10 = (i4 & 512) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j10;
        long m4551getUnspecified0d7_KjU11 = (i4 & 1024) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j11;
        long m4551getUnspecified0d7_KjU12 = (i4 & 2048) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j12;
        long m4551getUnspecified0d7_KjU13 = (i4 & 4096) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j13;
        long m4551getUnspecified0d7_KjU14 = (i4 & 8192) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j14;
        long m4551getUnspecified0d7_KjU15 = (i4 & 16384) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j15;
        long m4551getUnspecified0d7_KjU16 = (32768 & i4) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j16;
        long m4551getUnspecified0d7_KjU17 = (65536 & i4) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j17;
        long m4551getUnspecified0d7_KjU18 = (131072 & i4) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j18;
        long m4551getUnspecified0d7_KjU19 = (262144 & i4) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j19;
        long m4551getUnspecified0d7_KjU20 = (524288 & i4) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j20;
        long m4551getUnspecified0d7_KjU21 = (1048576 & i4) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j21;
        long m4551getUnspecified0d7_KjU22 = (2097152 & i4) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j22;
        long m4551getUnspecified0d7_KjU23 = (4194304 & i4) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j23;
        long m4551getUnspecified0d7_KjU24 = (8388608 & i4) != 0 ? Color.INSTANCE.m4551getUnspecified0d7_KjU() : j24;
        TextFieldColors textFieldColors2 = (i4 & 16777216) != 0 ? null : textFieldColors;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1991626358, i, i2, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:501)");
        }
        DatePickerColors m2317copytNwlRmA = getDefaultDatePickerColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i3 >> 12) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA).m2317copytNwlRmA(m4551getUnspecified0d7_KjU, m4551getUnspecified0d7_KjU2, m4551getUnspecified0d7_KjU3, m4551getUnspecified0d7_KjU4, m4551getUnspecified0d7_KjU5, m4551getUnspecified0d7_KjU6, m4551getUnspecified0d7_KjU7, m4551getUnspecified0d7_KjU8, m4551getUnspecified0d7_KjU9, m4551getUnspecified0d7_KjU10, m4551getUnspecified0d7_KjU11, m4551getUnspecified0d7_KjU12, m4551getUnspecified0d7_KjU13, m4551getUnspecified0d7_KjU14, m4551getUnspecified0d7_KjU15, m4551getUnspecified0d7_KjU16, m4551getUnspecified0d7_KjU17, m4551getUnspecified0d7_KjU18, m4551getUnspecified0d7_KjU19, m4551getUnspecified0d7_KjU20, m4551getUnspecified0d7_KjU21, m4551getUnspecified0d7_KjU23, m4551getUnspecified0d7_KjU22, m4551getUnspecified0d7_KjU24, textFieldColors2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m2317copytNwlRmA;
    }

    public final DatePickerColors getDefaultDatePickerColors(ColorScheme colorScheme, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1180555308, "C:DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1180555308, i, -1, "androidx.compose.material3.DatePickerDefaults.<get-defaultDatePickerColors> (DatePicker.kt:531)");
        }
        DatePickerColors defaultDatePickerColorsCached = colorScheme.getDefaultDatePickerColorsCached();
        composer.startReplaceGroup(-653681037);
        ComposerKt.sourceInformation(composer, "*589@28839L30");
        if (defaultDatePickerColorsCached == null) {
            defaultDatePickerColorsCached = new DatePickerColors(ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getHeaderSupportingTextColor()), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getHeaderHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getWeekdaysLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadColor()), colorScheme.getOnSurfaceVariant(), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getSelectionYearUnselectedLabelTextColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getSelectionYearUnselectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getDateTodayLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getSelectionYearSelectedLabelTextColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getSelectionYearSelectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getSelectionYearSelectedContainerColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getSelectionYearSelectedContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getDateUnselectedLabelTextColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getDateUnselectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getDateSelectedLabelTextColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getDateSelectedLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getDateSelectedContainerColor()), Color.m4514copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getDateSelectedContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getDateTodayLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getDateTodayContainerOutlineColor()), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getRangeSelectionActiveIndicatorContainerColor()), ColorSchemeKt.fromToken(colorScheme, DatePickerModalTokens.INSTANCE.getSelectionDateInRangeLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, DividerTokens.INSTANCE.getColor()), OutlinedTextFieldDefaults.INSTANCE.getDefaultOutlinedTextFieldColors(colorScheme, composer, (i & 14) | 48), null);
            colorScheme.setDefaultDatePickerColorsCached$material3_release(defaultDatePickerColorsCached);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultDatePickerColorsCached;
    }

    public static /* synthetic */ DatePickerFormatter dateFormatter$default(DatePickerDefaults datePickerDefaults, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = YearMonthSkeleton;
        }
        if ((i & 2) != 0) {
            str2 = YearAbbrMonthDaySkeleton;
        }
        if ((i & 4) != 0) {
            str3 = YearMonthWeekdayDaySkeleton;
        }
        return datePickerDefaults.dateFormatter(str, str2, str3);
    }

    public final DatePickerFormatter dateFormatter(String yearSelectionSkeleton, String selectedDateSkeleton, String selectedDateDescriptionSkeleton) {
        return new DatePickerFormatterImpl(yearSelectionSkeleton, selectedDateSkeleton, selectedDateDescriptionSkeleton);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* renamed from: DatePickerTitle-hOD91z4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2343DatePickerTitlehOD91z4(final int r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerDefaults.m2343DatePickerTitlehOD91z4(int, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009c  */
    /* renamed from: DatePickerHeadline-3kbWawI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2342DatePickerHeadline3kbWawI(final java.lang.Long r36, final int r37, final androidx.compose.material3.DatePickerFormatter r38, androidx.compose.ui.Modifier r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerDefaults.m2342DatePickerHeadline3kbWawI(java.lang.Long, int, androidx.compose.material3.DatePickerFormatter, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public final FlingBehavior rememberSnapFlingBehavior$material3_release(LazyListState lazyListState, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -2036003494, "C(rememberSnapFlingBehavior)P(1)708@33801L669:DatePicker.kt#uh7d8r");
        if ((i2 & 2) != 0) {
            decayAnimationSpec = DecayAnimationSpecKt.exponentialDecay$default(0.0f, 0.0f, 3, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2036003494, i, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:707)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2078676503, "CC(remember):DatePicker.kt#9igjgp");
        boolean changed = ((((i & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i & 6) == 4) | composer.changed(decayAnimationSpec);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            final SnapLayoutInfoProvider SnapLayoutInfoProvider$default = LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider$default(lazyListState, null, 2, null);
            rememberedValue = SnapFlingBehaviorKt.snapFlingBehavior(new SnapLayoutInfoProvider() { // from class: androidx.compose.material3.DatePickerDefaults$rememberSnapFlingBehavior$1$snapLayoutInfoProvider$1
                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public float calculateApproachOffset(float velocity, float decayOffset) {
                    return 0.0f;
                }

                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public float calculateSnapOffset(float velocity) {
                    return SnapLayoutInfoProvider.this.calculateSnapOffset(velocity);
                }
            }, decayAnimationSpec, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null));
            composer.updateRememberedValue(rememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return targetedFlingBehavior;
    }

    public final IntRange getYearRange() {
        return YearRange;
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m2345getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }

    public final Shape getShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 700927667, "C734@34850L5:DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(700927667, i, -1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:734)");
        }
        Shape value = ShapesKt.getValue(DatePickerModalTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final SelectableDates getAllDates() {
        return AllDates;
    }
}
