package com.cooldev.gba.emulator.gameboy.utils;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.o0;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.UserMessagingPlatform;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes.dex */
public final class ConsentInformationUtils {
    public static final int $stable = 8;

    @NotNull
    private final Activity activity;
    private ConsentInformation consentInformation;

    @NotNull
    private final AtomicBoolean isMobileAdsInitializeCalled;

    public ConsentInformationUtils(@NotNull Activity activity) {
        p0.a.s(activity, "activity");
        this.activity = activity;
        this.isMobileAdsInitializeCalled = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeMobileAdsSdk() {
        if (this.isMobileAdsInitializeCalled.get()) {
            return;
        }
        this.isMobileAdsInitializeCalled.set(true);
        e.v(p0.a.c(o0.f22356b), null, 0, new ConsentInformationUtils$initializeMobileAdsSdk$1(this, null), 3);
    }

    public final boolean isConsentFormAvailable() {
        ConsentInformation consentInformation = this.consentInformation;
        if (consentInformation != null) {
            if (consentInformation == null) {
                p0.a.B0("consentInformation");
                throw null;
            }
            if (consentInformation.isConsentFormAvailable()) {
                return true;
            }
        }
        return false;
    }

    public final void setUpConsentInformation() {
        ConsentRequestParameters build = new ConsentRequestParameters.Builder().setTagForUnderAgeOfConsent(false).build();
        p0.a.r(build, "build(...)");
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(this.activity);
        p0.a.r(consentInformation, "getConsentInformation(...)");
        this.consentInformation = consentInformation;
        e.v(p0.a.c(o0.f22356b), null, 0, new ConsentInformationUtils$setUpConsentInformation$1(this, build, null), 3);
    }
}
