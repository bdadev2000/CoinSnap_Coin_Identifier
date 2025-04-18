package com.facebook.appevents;

import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.cloudbridge.AppEventsCAPIManager;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.integrity.BlocklistEventsManager;
import com.facebook.appevents.integrity.MACARuleMatchingManager;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.appevents.integrity.RedactedEventsManager;
import com.facebook.appevents.integrity.SensitiveParamsManager;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class AppEventsManager$start$1 implements FetchedAppSettingsManager.FetchedAppSettingsCallback {
    /* renamed from: onSuccess$lambda-0 */
    public static final void m444onSuccess$lambda0(boolean z2) {
        if (z2) {
            MetadataIndexer.enable();
        }
    }

    /* renamed from: onSuccess$lambda-1 */
    public static final void m445onSuccess$lambda1(boolean z2) {
        if (z2) {
            RestrictiveDataManager.enable();
        }
    }

    /* renamed from: onSuccess$lambda-10 */
    public static final void m446onSuccess$lambda10(boolean z2) {
        if (z2) {
            AppEventsCAPIManager.enable();
        }
    }

    /* renamed from: onSuccess$lambda-2 */
    public static final void m447onSuccess$lambda2(boolean z2) {
        if (z2) {
            ModelManager.enable();
        }
    }

    /* renamed from: onSuccess$lambda-3 */
    public static final void m448onSuccess$lambda3(boolean z2) {
        if (z2) {
            EventDeactivationManager.enable();
        }
    }

    /* renamed from: onSuccess$lambda-4 */
    public static final void m449onSuccess$lambda4(boolean z2) {
        if (z2) {
            InAppPurchaseManager.enableAutoLogging();
        }
    }

    /* renamed from: onSuccess$lambda-5 */
    public static final void m450onSuccess$lambda5(boolean z2) {
        if (z2) {
            ProtectedModeManager.enable();
        }
    }

    /* renamed from: onSuccess$lambda-6 */
    public static final void m451onSuccess$lambda6(boolean z2) {
        if (z2) {
            MACARuleMatchingManager.enable();
        }
    }

    /* renamed from: onSuccess$lambda-7 */
    public static final void m452onSuccess$lambda7(boolean z2) {
        if (z2) {
            BlocklistEventsManager.enable();
        }
    }

    /* renamed from: onSuccess$lambda-8 */
    public static final void m453onSuccess$lambda8(boolean z2) {
        if (z2) {
            RedactedEventsManager.enable();
        }
    }

    /* renamed from: onSuccess$lambda-9 */
    public static final void m454onSuccess$lambda9(boolean z2) {
        if (z2) {
            SensitiveParamsManager.enable();
        }
    }

    @Override // com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback
    public void onError() {
    }

    @Override // com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback
    public void onSuccess(@Nullable FetchedAppSettings fetchedAppSettings) {
        FeatureManager featureManager = FeatureManager.INSTANCE;
        FeatureManager.checkFeature(FeatureManager.Feature.AAM, new androidx.compose.animation.core.a(26));
        FeatureManager.checkFeature(FeatureManager.Feature.RestrictiveDataFiltering, new androidx.compose.animation.core.a(28));
        FeatureManager.checkFeature(FeatureManager.Feature.PrivacyProtection, new androidx.compose.animation.core.a(29));
        FeatureManager.checkFeature(FeatureManager.Feature.EventDeactivation, new c(0));
        FeatureManager.checkFeature(FeatureManager.Feature.IapLogging, new c(1));
        FeatureManager.checkFeature(FeatureManager.Feature.ProtectedMode, new c(2));
        FeatureManager.checkFeature(FeatureManager.Feature.MACARuleMatching, new c(3));
        FeatureManager.checkFeature(FeatureManager.Feature.BlocklistEvents, new c(4));
        FeatureManager.checkFeature(FeatureManager.Feature.FilterRedactedEvents, new c(5));
        FeatureManager.checkFeature(FeatureManager.Feature.FilterSensitiveParams, new c(6));
        FeatureManager.checkFeature(FeatureManager.Feature.CloudBridge, new androidx.compose.animation.core.a(27));
    }
}
