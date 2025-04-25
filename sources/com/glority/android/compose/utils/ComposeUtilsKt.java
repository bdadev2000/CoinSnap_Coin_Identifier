package com.glority.android.compose.utils;

import android.app.Activity;
import android.content.Context;
import androidx.compose.material3.windowsizeclass.AndroidWindowSizeClass_androidKt;
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposeUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"windowSizeClassMapper", "", "baseCount", "(ILandroidx/compose/runtime/Composer;I)I", "lib-compose_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class ComposeUtilsKt {
    public static final int windowSizeClassMapper(int i, Composer composer, int i2) {
        composer.startReplaceableGroup(-1123165058);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1123165058, i2, -1, "com.glority.android.compose.utils.windowSizeClassMapper (ComposeUtils.kt:15)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Intrinsics.checkNotNull(consume, "null cannot be cast to non-null type android.app.Activity");
        int widthSizeClass = AndroidWindowSizeClass_androidKt.calculateWindowSizeClass((Activity) consume, composer, 8).getWidthSizeClass();
        if (!WindowWidthSizeClass.m3960equalsimpl0(widthSizeClass, WindowWidthSizeClass.INSTANCE.m3968getCompactY0FxcvE())) {
            if (WindowWidthSizeClass.m3960equalsimpl0(widthSizeClass, WindowWidthSizeClass.INSTANCE.m3970getMediumY0FxcvE())) {
                i *= 2;
            } else if (WindowWidthSizeClass.m3960equalsimpl0(widthSizeClass, WindowWidthSizeClass.INSTANCE.m3969getExpandedY0FxcvE())) {
                i *= 3;
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return i;
    }
}
