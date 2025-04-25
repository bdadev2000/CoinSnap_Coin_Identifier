package com.glority.android.picturexx.theme;

import android.content.Context;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.glority.android.picturexx.business.R;
import kotlin.Metadata;

/* compiled from: CoinColor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\u0007J\u000f\u0010\u000e\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0015\u0010\u0007J\u000f\u0010\u0016\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0007J\u000f\u0010\u0018\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0019\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/glority/android/picturexx/theme/CoinColor;", "", "<init>", "()V", "primaryColor", "Landroidx/compose/ui/graphics/Color;", "primaryColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "dividerColor", "dividerColor-WaAFU9c", "white", "white-WaAFU9c", "black", "black-WaAFU9c", "textColor33", "textColor33-WaAFU9c", "textColor66", "textColor66-WaAFU9c", "colorF3F3F3", "colorF3F3F3-WaAFU9c", "colorF2F2F2", "colorF2F2F2-WaAFU9c", "colorF5F5F5", "colorF5F5F5-WaAFU9c", "surfaceColor", "surfaceColor-WaAFU9c", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CoinColor {
    public static final int $stable = 0;
    public static final CoinColor INSTANCE = new CoinColor();

    private CoinColor() {
    }

    /* renamed from: primaryColor-WaAFU9c, reason: not valid java name */
    public final long m7871primaryColorWaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(-461132131);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-461132131, i, -1, "com.glority.android.picturexx.theme.CoinColor.primaryColor (CoinColor.kt:12)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        long Color = androidx.compose.ui.graphics.ColorKt.Color(((Context) consume).getColor(R.color.colorAccentDE));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return Color;
    }

    /* renamed from: dividerColor-WaAFU9c, reason: not valid java name */
    public final long m7870dividerColorWaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(256606324);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(256606324, i, -1, "com.glority.android.picturexx.theme.CoinColor.dividerColor (CoinColor.kt:18)");
        }
        long Color = androidx.compose.ui.graphics.ColorKt.Color(DarkThemeKt.isSystemInDarkTheme(composer, 0) ? 4281545523L : 4291611852L);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return Color;
    }

    /* renamed from: white-WaAFU9c, reason: not valid java name */
    public final long m7875whiteWaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(-1864712751);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1864712751, i, -1, "com.glority.android.picturexx.theme.CoinColor.white (CoinColor.kt:24)");
        }
        long m4541getBlack0d7_KjU = DarkThemeKt.isSystemInDarkTheme(composer, 0) ? Color.INSTANCE.m4541getBlack0d7_KjU() : Color.INSTANCE.m4552getWhite0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m4541getBlack0d7_KjU;
    }

    /* renamed from: black-WaAFU9c, reason: not valid java name */
    public final long m7866blackWaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(1933971643);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1933971643, i, -1, "com.glority.android.picturexx.theme.CoinColor.black (CoinColor.kt:30)");
        }
        long m4552getWhite0d7_KjU = DarkThemeKt.isSystemInDarkTheme(composer, 0) ? Color.INSTANCE.m4552getWhite0d7_KjU() : Color.INSTANCE.m4541getBlack0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m4552getWhite0d7_KjU;
    }

    /* renamed from: textColor33-WaAFU9c, reason: not valid java name */
    public final long m7873textColor33WaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(-931543036);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-931543036, i, -1, "com.glority.android.picturexx.theme.CoinColor.textColor33 (CoinColor.kt:36)");
        }
        long m4552getWhite0d7_KjU = DarkThemeKt.isSystemInDarkTheme(composer, 0) ? Color.INSTANCE.m4552getWhite0d7_KjU() : androidx.compose.ui.graphics.ColorKt.Color(4281545523L);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m4552getWhite0d7_KjU;
    }

    /* renamed from: textColor66-WaAFU9c, reason: not valid java name */
    public final long m7874textColor66WaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(1258394532);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1258394532, i, -1, "com.glority.android.picturexx.theme.CoinColor.textColor66 (CoinColor.kt:42)");
        }
        long m4552getWhite0d7_KjU = DarkThemeKt.isSystemInDarkTheme(composer, 0) ? Color.INSTANCE.m4552getWhite0d7_KjU() : androidx.compose.ui.graphics.ColorKt.Color(4284900966L);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m4552getWhite0d7_KjU;
    }

    /* renamed from: colorF3F3F3-WaAFU9c, reason: not valid java name */
    public final long m7868colorF3F3F3WaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(-2083685328);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2083685328, i, -1, "com.glority.android.picturexx.theme.CoinColor.colorF3F3F3 (CoinColor.kt:48)");
        }
        long Color = androidx.compose.ui.graphics.ColorKt.Color(DarkThemeKt.isSystemInDarkTheme(composer, 0) ? 4281545523L : 4294177779L);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return Color;
    }

    /* renamed from: colorF2F2F2-WaAFU9c, reason: not valid java name */
    public final long m7867colorF2F2F2WaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(-948211437);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-948211437, i, -1, "com.glority.android.picturexx.theme.CoinColor.colorF2F2F2 (CoinColor.kt:54)");
        }
        long Color = androidx.compose.ui.graphics.ColorKt.Color(DarkThemeKt.isSystemInDarkTheme(composer, 0) ? 4281545523L : 4294111986L);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return Color;
    }

    /* renamed from: colorF5F5F5-WaAFU9c, reason: not valid java name */
    public final long m7869colorF5F5F5WaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(-59665814);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-59665814, i, -1, "com.glority.android.picturexx.theme.CoinColor.colorF5F5F5 (CoinColor.kt:60)");
        }
        long Color = androidx.compose.ui.graphics.ColorKt.Color(DarkThemeKt.isSystemInDarkTheme(composer, 0) ? 4284900966L : 4294309365L);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return Color;
    }

    /* renamed from: surfaceColor-WaAFU9c, reason: not valid java name */
    public final long m7872surfaceColorWaAFU9c(Composer composer, int i) {
        composer.startReplaceableGroup(-1661037816);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1661037816, i, -1, "com.glority.android.picturexx.theme.CoinColor.surfaceColor (CoinColor.kt:67)");
        }
        long Color = androidx.compose.ui.graphics.ColorKt.Color(DarkThemeKt.isSystemInDarkTheme(composer, 0) ? 4281545523L : 4294966270L);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return Color;
    }
}
