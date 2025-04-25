package androidx.compose.material3.windowsizeclass;

import android.app.Activity;
import android.content.res.Configuration;
import androidx.compose.material3.windowsizeclass.WindowSizeClass;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.layout.WindowMetricsCalculator;
import kotlin.Metadata;

/* compiled from: AndroidWindowSizeClass.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"calculateWindowSizeClass", "Landroidx/compose/material3/windowsizeclass/WindowSizeClass;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/windowsizeclass/WindowSizeClass;", "material3-window-size-class_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class AndroidWindowSizeClass_androidKt {
    public static final WindowSizeClass calculateWindowSizeClass(Activity activity, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 866044206, "C(calculateWindowSizeClass)41@1807L7,42@1846L7:AndroidWindowSizeClass.android.kt#hkqeis");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(866044206, i, -1, "androidx.compose.material3.windowsizeclass.calculateWindowSizeClass (AndroidWindowSizeClass.android.kt:36)");
        }
        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        composer.consume(localConfiguration);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        WindowSizeClass m3954calculateFromSizeqzXmJYc$default = WindowSizeClass.Companion.m3954calculateFromSizeqzXmJYc$default(WindowSizeClass.INSTANCE, ((Density) consume).mo675toDpSizekrfVVM(RectHelper_androidKt.toComposeRect(WindowMetricsCalculator.INSTANCE.getOrCreate().computeCurrentWindowMetrics(activity).getBounds()).m4307getSizeNHjbRc()), null, null, 6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m3954calculateFromSizeqzXmJYc$default;
    }
}
