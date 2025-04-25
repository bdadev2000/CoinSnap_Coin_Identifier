package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'J0\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.JD\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u00102J0\u00103\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105J0\u00106\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u00105R\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0013\u0010\rR\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u0016\u0010\u001a\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u001b\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/material/ButtonDefaults;", "", "()V", "ButtonHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonVerticalPadding", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "IconSize", "getIconSize-D9Ej5fM", "()F", "IconSpacing", "getIconSpacing-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "OutlinedBorderOpacity", "", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "TextButtonContentPadding", "getTextButtonContentPadding", "TextButtonHorizontalPadding", "outlinedBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "buttonColors", "Landroidx/compose/material/ButtonColors;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledBackgroundColor", "disabledContentColor", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "elevation", "Landroidx/compose/material/ButtonElevation;", "defaultElevation", "pressedElevation", "disabledElevation", "elevation-yajeYGU", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "hoveredElevation", "focusedElevation", "elevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "outlinedButtonColors", "outlinedButtonColors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "textButtonColors", "textButtonColors-RGew2ao", "material_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;
    private static final PaddingValues ContentPadding;
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    public static final float OutlinedBorderOpacity = 0.12f;
    private static final float OutlinedBorderSize;
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    private ButtonDefaults() {
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1770getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1769getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1767getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m1768getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1764buttonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1870371134);
        ComposerKt.sourceInformation(composer, "C(buttonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)405@16826L6,406@16872L32,407@16961L6,408@17039L6,409@17108L6,410@17164L8:Button.kt#jmzs0o");
        long m1799getPrimary0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1799getPrimary0d7_KjU() : j;
        long m1817contentColorForek8zF_U = (i2 & 2) != 0 ? ColorsKt.m1817contentColorForek8zF_U(m1799getPrimary0d7_KjU, composer, i & 14) : j2;
        long m4560compositeOverOWjLjI = (i2 & 4) != 0 ? ColorKt.m4560compositeOverOWjLjI(Color.m4514copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1798getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1803getSurface0d7_KjU()) : j3;
        long m4514copywmQWz5c$default = (i2 & 8) != 0 ? Color.m4514copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1798getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1870371134, i, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:411)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(m1799getPrimary0d7_KjU, m1817contentColorForek8zF_U, m4560compositeOverOWjLjI, m4514copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    /* renamed from: outlinedButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m1772outlinedButtonColorsRGew2ao(long j, long j2, long j3, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-2124406093);
        ComposerKt.sourceInformation(composer, "C(outlinedButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color)428@17911L6,429@17971L6,430@18039L6,431@18095L8:Button.kt#jmzs0o");
        long m1803getSurface0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1803getSurface0d7_KjU() : j;
        long m1799getPrimary0d7_KjU = (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1799getPrimary0d7_KjU() : j2;
        long m4514copywmQWz5c$default = (i2 & 4) != 0 ? Color.m4514copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1798getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2124406093, i, -1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:432)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(m1803getSurface0d7_KjU, m1799getPrimary0d7_KjU, m1803getSurface0d7_KjU, m4514copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    /* renamed from: textButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m1773textButtonColorsRGew2ao(long j, long j2, long j3, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(182742216);
        ComposerKt.sourceInformation(composer, "C(textButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color)450@18862L6,451@18930L6,452@18986L8:Button.kt#jmzs0o");
        long m4550getTransparent0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m4550getTransparent0d7_KjU() : j;
        long m1799getPrimary0d7_KjU = (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1799getPrimary0d7_KjU() : j2;
        long m4514copywmQWz5c$default = (i2 & 4) != 0 ? Color.m4514copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1798getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(182742216, i, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:453)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(m4550getTransparent0d7_KjU, m1799getPrimary0d7_KjU, m4550getTransparent0d7_KjU, m4514copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m1771getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    public final BorderStroke getOutlinedBorder(Composer composer, int i) {
        composer.startReplaceableGroup(-2091313033);
        ComposerKt.sourceInformation(composer, "C476@19690L6:Button.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2091313033, i, -1, "androidx.compose.material.ButtonDefaults.<get-outlinedBorder> (Button.kt:475)");
        }
        BorderStroke m567BorderStrokecXLIe8U = BorderStrokeKt.m567BorderStrokecXLIe8U(OutlinedBorderSize, Color.m4514copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1798getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m567BorderStrokecXLIe8U;
    }

    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another overload of elevation")
    /* renamed from: elevation-yajeYGU, reason: not valid java name */
    public final /* synthetic */ ButtonElevation m1766elevationyajeYGU(float f, float f2, float f3, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1428576874);
        ComposerKt.sourceInformation(composer, "C(elevation)P(0:c#ui.unit.Dp,2:c#ui.unit.Dp,1:c#ui.unit.Dp)348@14628L161:Button.kt#jmzs0o");
        float m6997constructorimpl = (i2 & 1) != 0 ? Dp.m6997constructorimpl(2) : f;
        float m6997constructorimpl2 = (i2 & 2) != 0 ? Dp.m6997constructorimpl(8) : f2;
        float m6997constructorimpl3 = (i2 & 4) != 0 ? Dp.m6997constructorimpl(0) : f3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1428576874, i, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:348)");
        }
        float f4 = 4;
        ButtonElevation m1765elevationR_JCAzs = m1765elevationR_JCAzs(m6997constructorimpl, m6997constructorimpl2, m6997constructorimpl3, Dp.m6997constructorimpl(f4), Dp.m6997constructorimpl(f4), composer, (i & 14) | 27648 | (i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | (i & 896) | ((i << 6) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1765elevationR_JCAzs;
    }

    /* renamed from: elevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1765elevationR_JCAzs(float f, float f2, float f3, float f4, float f5, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-737170518);
        ComposerKt.sourceInformation(composer, "C(elevation)P(0:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,3:c#ui.unit.Dp,2:c#ui.unit.Dp)377@15760L497:Button.kt#jmzs0o");
        float m6997constructorimpl = (i2 & 1) != 0 ? Dp.m6997constructorimpl(2) : f;
        float m6997constructorimpl2 = (i2 & 2) != 0 ? Dp.m6997constructorimpl(8) : f2;
        float m6997constructorimpl3 = (i2 & 4) != 0 ? Dp.m6997constructorimpl(0) : f3;
        float m6997constructorimpl4 = (i2 & 8) != 0 ? Dp.m6997constructorimpl(4) : f4;
        float m6997constructorimpl5 = (i2 & 16) != 0 ? Dp.m6997constructorimpl(4) : f5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-737170518, i, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:376)");
        }
        Object[] objArr = {Dp.m6995boximpl(m6997constructorimpl), Dp.m6995boximpl(m6997constructorimpl2), Dp.m6995boximpl(m6997constructorimpl3), Dp.m6995boximpl(m6997constructorimpl4), Dp.m6995boximpl(m6997constructorimpl5)};
        composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z = false;
        for (int i3 = 0; i3 < 5; i3++) {
            z |= composer.changed(objArr[i3]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new DefaultButtonElevation(m6997constructorimpl, m6997constructorimpl2, m6997constructorimpl3, m6997constructorimpl4, m6997constructorimpl5, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultButtonElevation defaultButtonElevation = (DefaultButtonElevation) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonElevation;
    }

    static {
        float m6997constructorimpl = Dp.m6997constructorimpl(16);
        ButtonHorizontalPadding = m6997constructorimpl;
        float f = 8;
        float m6997constructorimpl2 = Dp.m6997constructorimpl(f);
        ButtonVerticalPadding = m6997constructorimpl2;
        PaddingValues m981PaddingValuesa9UjIt4 = PaddingKt.m981PaddingValuesa9UjIt4(m6997constructorimpl, m6997constructorimpl2, m6997constructorimpl, m6997constructorimpl2);
        ContentPadding = m981PaddingValuesa9UjIt4;
        MinWidth = Dp.m6997constructorimpl(64);
        MinHeight = Dp.m6997constructorimpl(36);
        IconSize = Dp.m6997constructorimpl(18);
        IconSpacing = Dp.m6997constructorimpl(f);
        OutlinedBorderSize = Dp.m6997constructorimpl(1);
        float m6997constructorimpl3 = Dp.m6997constructorimpl(f);
        TextButtonHorizontalPadding = m6997constructorimpl3;
        TextButtonContentPadding = PaddingKt.m981PaddingValuesa9UjIt4(m6997constructorimpl3, m981PaddingValuesa9UjIt4.getTop(), m6997constructorimpl3, m981PaddingValuesa9UjIt4.getBottom());
    }
}
