package com.glority.android.compose.ui.theme;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: GlTextColor.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\r\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\bJ\u000e\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Lcom/glority/android/compose/ui/theme/GlTextColor;", "", "()V", "enableDarkMode", "", "color000000", "Landroidx/compose/ui/graphics/Color;", "color000000-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "color333333", "color333333-WaAFU9c", "color666666", "color666666-WaAFU9c", "color999999", "color999999-WaAFU9c", "colorCCCCCC", "colorCCCCCC-WaAFU9c", "", "enable", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class GlTextColor {
    private static boolean enableDarkMode;
    public static final GlTextColor INSTANCE = new GlTextColor();
    public static final int $stable = 8;

    private GlTextColor() {
    }

    public final void enableDarkMode(boolean enable) {
        enableDarkMode = enable;
    }

    /* renamed from: color000000-WaAFU9c, reason: not valid java name */
    public final long m7730color000000WaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(-536221891);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-536221891, i, -1, "com.glority.android.compose.ui.theme.GlTextColor.color000000 (GlTextColor.kt:14)");
        }
        long Color = ColorKt.Color((DarkThemeKt.isSystemInDarkTheme(composer, 0) && enableDarkMode) ? 4294967295L : 4278190080L);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return Color;
    }

    /* renamed from: color333333-WaAFU9c, reason: not valid java name */
    public final long m7731color333333WaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(93161565);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(93161565, i, -1, "com.glority.android.compose.ui.theme.GlTextColor.color333333 (GlTextColor.kt:19)");
        }
        long Color = ColorKt.Color((DarkThemeKt.isSystemInDarkTheme(composer, 0) && enableDarkMode) ? 4293322470L : 4281545523L);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return Color;
    }

    /* renamed from: color666666-WaAFU9c, reason: not valid java name */
    public final long m7732color666666WaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(722545021);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(722545021, i, -1, "com.glority.android.compose.ui.theme.GlTextColor.color666666 (GlTextColor.kt:25)");
        }
        long Color = ColorKt.Color((DarkThemeKt.isSystemInDarkTheme(composer, 0) && enableDarkMode) ? 4291611852L : 4284900966L);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return Color;
    }

    /* renamed from: color999999-WaAFU9c, reason: not valid java name */
    public final long m7733color999999WaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(1351928477);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1351928477, i, -1, "com.glority.android.compose.ui.theme.GlTextColor.color999999 (GlTextColor.kt:31)");
        }
        long Color = ColorKt.Color(4288256409L);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return Color;
    }

    /* renamed from: colorCCCCCC-WaAFU9c, reason: not valid java name */
    public final long m7734colorCCCCCCWaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(2018217565);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2018217565, i, -1, "com.glority.android.compose.ui.theme.GlTextColor.colorCCCCCC (GlTextColor.kt:36)");
        }
        long Color = ColorKt.Color(4291611852L);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return Color;
    }
}
