package com.glority.android.compose.extensions;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.math.MathKt;

/* compiled from: UnitExtensions.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0011\u001a\u00020\u000e*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\"\u0015\u0010\u0013\u001a\u00020\u0005*\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u0015\u0010\u0017\u001a\u00020\u0014*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0015\u0010\u0017\u001a\u00020\u0014*\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016\"\u0015\u0010\u0017\u001a\u00020\u0014*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"fs", "Landroidx/compose/ui/unit/TextUnit;", "", "getFs", "(DLandroidx/compose/runtime/Composer;I)J", "", "(FLandroidx/compose/runtime/Composer;I)J", "", "(ILandroidx/compose/runtime/Composer;I)J", "pr", "Landroidx/compose/ui/graphics/painter/Painter;", "getPr", "(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "rs", "", "getRs", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "sr", "getSr", "toPx", "Landroidx/compose/ui/unit/Dp;", "getToPx", "(FLandroidx/compose/runtime/Composer;I)F", "w", "getW", "(DLandroidx/compose/runtime/Composer;I)F", "(ILandroidx/compose/runtime/Composer;I)F", "lib-compose_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UnitExtensionsKt {
    public static final float getW(int i, Composer composer, int i2) {
        Integer num;
        composer.startReplaceableGroup(-128675916);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-128675916, i2, -1, "com.glority.android.compose.extensions.<get-w> (UnitExtensions.kt:22)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) consume;
        if (i == 0) {
            float m6997constructorimpl = Dp.m6997constructorimpl(0.0f);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return m6997constructorimpl;
        }
        try {
            num = Integer.valueOf(context.getResources().getIdentifier("x" + Math.abs(i * 2), "dimen", context.getPackageName()));
        } catch (Throwable unused) {
            num = null;
        }
        if (num != null && num.intValue() != 0) {
            float dimensionResource = PrimitiveResources_androidKt.dimensionResource(num.intValue(), composer, 0);
            if (i < 0) {
                dimensionResource = Dp.m6997constructorimpl(-dimensionResource);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return dimensionResource;
        }
        float m6997constructorimpl2 = Dp.m6997constructorimpl(i);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m6997constructorimpl2;
    }

    public static final float getW(double d, Composer composer, int i) {
        composer.startReplaceableGroup(-879615182);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-879615182, i, -1, "com.glority.android.compose.extensions.<get-w> (UnitExtensions.kt:48)");
        }
        float w = getW(MathKt.roundToInt(d), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return w;
    }

    public static final float getW(float f, Composer composer, int i) {
        composer.startReplaceableGroup(-443343199);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-443343199, i, -1, "com.glority.android.compose.extensions.<get-w> (UnitExtensions.kt:52)");
        }
        float w = getW(MathKt.roundToInt(f), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return w;
    }

    public static final long getFs(int i, Composer composer, int i2) {
        composer.startReplaceableGroup(-125694609);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-125694609, i2, -1, "com.glority.android.compose.extensions.<get-fs> (UnitExtensions.kt:58)");
        }
        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localConfiguration);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float f = i / ((Configuration) consume).fontScale;
        ProvidableCompositionLocal<Configuration> localConfiguration2 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localConfiguration2);
        ComposerKt.sourceInformationMarkerEnd(composer);
        long sp = TextUnitKt.getSp(f * (((Configuration) consume2).smallestScreenWidthDp / 360.0f));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sp;
    }

    public static final long getFs(double d, Composer composer, int i) {
        composer.startReplaceableGroup(-2077539603);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2077539603, i, -1, "com.glority.android.compose.extensions.<get-fs> (UnitExtensions.kt:65)");
        }
        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localConfiguration);
        ComposerKt.sourceInformationMarkerEnd(composer);
        double d2 = d / ((Configuration) consume).fontScale;
        ProvidableCompositionLocal<Configuration> localConfiguration2 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localConfiguration2);
        ComposerKt.sourceInformationMarkerEnd(composer);
        long sp = TextUnitKt.getSp(d2 * (((Configuration) consume2).smallestScreenWidthDp / 360.0f));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sp;
    }

    public static final long getFs(float f, Composer composer, int i) {
        composer.startReplaceableGroup(11362140);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(11362140, i, -1, "com.glority.android.compose.extensions.<get-fs> (UnitExtensions.kt:71)");
        }
        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localConfiguration);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float f2 = f / ((Configuration) consume).fontScale;
        ProvidableCompositionLocal<Configuration> localConfiguration2 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localConfiguration2);
        ComposerKt.sourceInformationMarkerEnd(composer);
        long sp = TextUnitKt.getSp(f2 * (((Configuration) consume2).smallestScreenWidthDp / 360.0f));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sp;
    }

    public static final float getToPx(float f, Composer composer, int i) {
        composer.startReplaceableGroup(-711557825);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-711557825, i, -1, "com.glority.android.compose.extensions.<get-toPx> (UnitExtensions.kt:76)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float density = f * ((Density) consume).getDensity();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return density;
    }

    public static final String getRs(int i, Composer composer, int i2) {
        composer.startReplaceableGroup(-80759273);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-80759273, i2, -1, "com.glority.android.compose.extensions.<get-rs> (UnitExtensions.kt:84)");
        }
        String stringResource = StringResources_androidKt.stringResource(i, composer, i2 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stringResource;
    }

    public static final String getSr(int i, Composer composer, int i2) {
        composer.startReplaceableGroup(-1347404717);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1347404717, i2, -1, "com.glority.android.compose.extensions.<get-sr> (UnitExtensions.kt:88)");
        }
        String stringResource = StringResources_androidKt.stringResource(i, composer, i2 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stringResource;
    }

    public static final Painter getPr(int i, Composer composer, int i2) {
        composer.startReplaceableGroup(-891542423);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-891542423, i2, -1, "com.glority.android.compose.extensions.<get-pr> (UnitExtensions.kt:96)");
        }
        Painter painterResource = PainterResources_androidKt.painterResource(i, composer, i2 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return painterResource;
    }
}
