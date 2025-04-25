package com.glority.base.composables;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposableExtensions.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\t*\u00020\u0002H\u0007¢\u0006\u0002\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\f*\u00020\u0002H\u0007¢\u0006\u0002\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u000f*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"asString", "", "", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatArgs", "", "", "(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "asColor", "Landroidx/compose/ui/graphics/Color;", "(ILandroidx/compose/runtime/Composer;I)J", "asDp", "Landroidx/compose/ui/unit/Dp;", "(ILandroidx/compose/runtime/Composer;I)F", "asPainter", "Landroidx/compose/ui/graphics/painter/Painter;", "(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "base_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ComposableExtensionsKt {
    public static final String asString(int i, Composer composer, int i2) {
        composer.startReplaceableGroup(1782844040);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1782844040, i2, -1, "com.glority.base.composables.asString (ComposableExtensions.kt:16)");
        }
        String stringResource = StringResources_androidKt.stringResource(i, composer, i2 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stringResource;
    }

    public static final String asString(int i, Object[] formatArgs, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        composer.startReplaceableGroup(2026737631);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2026737631, i2, -1, "com.glority.base.composables.asString (ComposableExtensions.kt:21)");
        }
        String stringResource = StringResources_androidKt.stringResource(i, Arrays.copyOf(formatArgs, formatArgs.length), composer, (i2 & 14) | 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stringResource;
    }

    public static final long asColor(int i, Composer composer, int i2) {
        composer.startReplaceableGroup(302424036);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(302424036, i2, -1, "com.glority.base.composables.asColor (ComposableExtensions.kt:26)");
        }
        long colorResource = ColorResources_androidKt.colorResource(i, composer, i2 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return colorResource;
    }

    public static final float asDp(int i, Composer composer, int i2) {
        composer.startReplaceableGroup(1654651774);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1654651774, i2, -1, "com.glority.base.composables.asDp (ComposableExtensions.kt:31)");
        }
        float dimensionResource = PrimitiveResources_androidKt.dimensionResource(i, composer, i2 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dimensionResource;
    }

    public static final Painter asPainter(int i, Composer composer, int i2) {
        composer.startReplaceableGroup(-1519212956);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1519212956, i2, -1, "com.glority.base.composables.asPainter (ComposableExtensions.kt:36)");
        }
        Painter painterResource = PainterResources_androidKt.painterResource(i, composer, i2 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return painterResource;
    }
}
