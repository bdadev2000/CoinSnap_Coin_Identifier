package com.facebook.internal.instrument;

import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.appevents.c;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.anrreport.ANRHandler;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import com.facebook.internal.instrument.threadcheck.ThreadCheckHandler;
import org.jetbrains.annotations.NotNull;

@RestrictTo
/* loaded from: classes.dex */
public final class InstrumentManager {

    @NotNull
    public static final InstrumentManager INSTANCE = new InstrumentManager();

    private InstrumentManager() {
    }

    public static final void start() {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            FeatureManager featureManager = FeatureManager.INSTANCE;
            FeatureManager.checkFeature(FeatureManager.Feature.CrashReport, new c(8));
            FeatureManager.checkFeature(FeatureManager.Feature.ErrorReport, new c(9));
            FeatureManager.checkFeature(FeatureManager.Feature.AnrReport, new c(10));
        }
    }

    /* renamed from: start$lambda-0 */
    public static final void m542start$lambda0(boolean z2) {
        if (z2) {
            CrashHandler.Companion.enable();
            FeatureManager featureManager = FeatureManager.INSTANCE;
            if (FeatureManager.isEnabled(FeatureManager.Feature.CrashShield)) {
                ExceptionAnalyzer.enable();
                CrashShieldHandler.enable();
            }
            if (FeatureManager.isEnabled(FeatureManager.Feature.ThreadCheck)) {
                ThreadCheckHandler.enable();
            }
        }
    }

    /* renamed from: start$lambda-1 */
    public static final void m543start$lambda1(boolean z2) {
        if (z2) {
            ErrorReportHandler.enable();
        }
    }

    /* renamed from: start$lambda-2 */
    public static final void m544start$lambda2(boolean z2) {
        if (z2) {
            ANRHandler.enable();
        }
    }
}
