package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import q0.l;

/* loaded from: classes.dex */
public final class ReportDrawnKt {
    public static final void a(l lVar, Composer composer, int i2) {
        FullyDrawnReporter fullyDrawnReporter;
        ComposerImpl g2 = composer.g(945311272);
        FullyDrawnReporterOwner a2 = LocalFullyDrawnReporterOwner.a(g2);
        if (a2 == null || (fullyDrawnReporter = a2.getFullyDrawnReporter()) == null) {
            RecomposeScopeImpl Z = g2.Z();
            if (Z == null) {
                return;
            }
            Z.d = new ReportDrawnKt$ReportDrawnAfter$fullyDrawnReporter$1(i2, lVar);
            return;
        }
        EffectsKt.e(lVar, fullyDrawnReporter, new ReportDrawnKt$ReportDrawnAfter$1(fullyDrawnReporter, lVar, null), g2);
        RecomposeScopeImpl Z2 = g2.Z();
        if (Z2 == null) {
            return;
        }
        Z2.d = new ReportDrawnKt$ReportDrawnAfter$2(i2, lVar);
    }

    public static final void b(q0.a aVar, Composer composer, int i2) {
        int i3;
        FullyDrawnReporter fullyDrawnReporter;
        ComposerImpl g2 = composer.g(-2047119994);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(aVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            FullyDrawnReporterOwner a2 = LocalFullyDrawnReporterOwner.a(g2);
            if (a2 == null || (fullyDrawnReporter = a2.getFullyDrawnReporter()) == null) {
                RecomposeScopeImpl Z = g2.Z();
                if (Z == null) {
                    return;
                }
                Z.d = new ReportDrawnKt$ReportDrawnWhen$fullyDrawnReporter$1(aVar, i2);
                return;
            }
            EffectsKt.b(fullyDrawnReporter, aVar, new ReportDrawnKt$ReportDrawnWhen$1(fullyDrawnReporter, aVar), g2);
        }
        RecomposeScopeImpl Z2 = g2.Z();
        if (Z2 == null) {
            return;
        }
        Z2.d = new ReportDrawnKt$ReportDrawnWhen$2(aVar, i2);
    }
}
