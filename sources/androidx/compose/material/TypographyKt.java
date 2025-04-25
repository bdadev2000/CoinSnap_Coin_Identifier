package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: Typography.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"DefaultLineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "getDefaultLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "DefaultTextStyle", "Landroidx/compose/ui/text/TextStyle;", "getDefaultTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "LocalTypography", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Typography;", "getLocalTypography", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "withDefaultFontFamily", "default", "Landroidx/compose/ui/text/font/FontFamily;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TypographyKt {
    private static final LineHeightStyle DefaultLineHeightStyle;
    private static final TextStyle DefaultTextStyle;
    private static final ProvidableCompositionLocal<Typography> LocalTypography;

    public static final /* synthetic */ TextStyle access$withDefaultFontFamily(TextStyle textStyle, FontFamily fontFamily) {
        return withDefaultFontFamily(textStyle, fontFamily);
    }

    public static final TextStyle withDefaultFontFamily(TextStyle textStyle, FontFamily fontFamily) {
        TextStyle m6486copyp1EtxEg;
        if (textStyle.getFontFamily() != null) {
            return textStyle;
        }
        m6486copyp1EtxEg = textStyle.m6486copyp1EtxEg((r48 & 1) != 0 ? textStyle.spanStyle.m6410getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? textStyle.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily, (r48 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? textStyle.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? textStyle.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? textStyle.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? textStyle.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? textStyle.platformStyle : null, (r48 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? textStyle.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? textStyle.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null);
        return m6486copyp1EtxEg;
    }

    static {
        TextStyle m6486copyp1EtxEg;
        LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m6841getCenterPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m6856getNoneEVpEnUU(), null);
        DefaultLineHeightStyle = lineHeightStyle;
        m6486copyp1EtxEg = r0.m6486copyp1EtxEg((r48 & 1) != 0 ? r0.spanStyle.m6410getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r0.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? r0.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r0.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r0.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r0.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r0.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r0.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r0.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r0.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r0.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r0.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r0.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r0.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r0.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r0.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? r0.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r0.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r0.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r0.platformStyle : DefaultPlatformTextStyle_androidKt.defaultPlatformTextStyle(), (r48 & 1048576) != 0 ? r0.paragraphStyle.getLineHeightStyle() : lineHeightStyle, (r48 & 2097152) != 0 ? r0.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r0.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? TextStyle.INSTANCE.getDefault().paragraphStyle.getTextMotion() : null);
        DefaultTextStyle = m6486copyp1EtxEg;
        LocalTypography = CompositionLocalKt.staticCompositionLocalOf(new Function0<Typography>() { // from class: androidx.compose.material.TypographyKt$LocalTypography$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Typography invoke() {
                return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }
        });
    }

    public static final LineHeightStyle getDefaultLineHeightStyle() {
        return DefaultLineHeightStyle;
    }

    public static final TextStyle getDefaultTextStyle() {
        return DefaultTextStyle;
    }

    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return LocalTypography;
    }
}
