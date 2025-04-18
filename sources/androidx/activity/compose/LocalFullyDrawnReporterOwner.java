package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.activity.ViewTreeFullyDrawnReporterOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

@StabilityInferred
/* loaded from: classes2.dex */
public final class LocalFullyDrawnReporterOwner {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f222a = CompositionLocalKt.c(LocalFullyDrawnReporterOwner$LocalFullyDrawnReporterOwner$1.f223a);

    public static FullyDrawnReporterOwner a(Composer composer) {
        composer.t(540186968);
        FullyDrawnReporterOwner fullyDrawnReporterOwner = (FullyDrawnReporterOwner) composer.K(f222a);
        composer.t(1606493384);
        if (fullyDrawnReporterOwner == null) {
            fullyDrawnReporterOwner = ViewTreeFullyDrawnReporterOwner.a((View) composer.K(AndroidCompositionLocals_androidKt.f16327f));
        }
        composer.H();
        if (fullyDrawnReporterOwner == null) {
            Object obj = (Context) composer.K(AndroidCompositionLocals_androidKt.f16325b);
            while (true) {
                if (!(obj instanceof ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof FullyDrawnReporterOwner) {
                    break;
                }
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            fullyDrawnReporterOwner = (FullyDrawnReporterOwner) obj;
        }
        composer.H();
        return fullyDrawnReporterOwner;
    }
}
