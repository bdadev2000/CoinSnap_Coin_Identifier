package com.facebook.internal;

import android.net.Uri;
import e0.u;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import z0.m;

/* loaded from: classes3.dex */
public final class FetchedAppSettings {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final JSONArray MACARuleMatchingSetting;
    private final boolean automaticLoggingEnabled;

    @Nullable
    private final JSONArray blocklistEvents;
    private final boolean codelessEventsEnabled;

    @NotNull
    private final Map<String, Map<String, DialogFeatureConfig>> dialogConfigurations;

    @NotNull
    private final FacebookRequestErrorClassification errorClassification;

    @Nullable
    private final JSONArray eventBindings;
    private final boolean iAPAutomaticLoggingEnabled;

    @Nullable
    private final Map<String, Boolean> migratedAutoLogValues;
    private final boolean monitorViaDialogEnabled;

    @NotNull
    private final String nuxContent;
    private final boolean nuxEnabled;

    @Nullable
    private final JSONArray protectedModeStandardParamsSetting;

    @Nullable
    private final String rawAamRules;

    @Nullable
    private final JSONArray redactedEvents;

    @Nullable
    private final String restrictiveDataSetting;

    @NotNull
    private final String sdkUpdateMessage;

    @Nullable
    private final JSONArray sensitiveParams;
    private final int sessionTimeoutInSeconds;

    @NotNull
    private final String smartLoginBookmarkIconURL;

    @NotNull
    private final String smartLoginMenuIconURL;

    @NotNull
    private final EnumSet<SmartLoginOption> smartLoginOptions;

    @Nullable
    private final String suggestedEventsSetting;
    private final boolean supportsImplicitLogging;
    private final boolean trackUninstallEnabled;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        @Nullable
        public final DialogFeatureConfig getDialogFeatureConfig(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            p0.a.s(str, "applicationId");
            p0.a.s(str2, "actionName");
            p0.a.s(str3, "featureName");
            if (str2.length() == 0 || str3.length() == 0) {
                return null;
            }
            FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(str);
            Map<String, DialogFeatureConfig> map = appSettingsWithoutQuery == null ? null : appSettingsWithoutQuery.getDialogConfigurations().get(str2);
            if (map != null) {
                return map.get(str3);
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class DialogFeatureConfig {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private static final String DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR = "|";

        @NotNull
        private static final String DIALOG_CONFIG_NAME_KEY = "name";

        @NotNull
        private static final String DIALOG_CONFIG_URL_KEY = "url";

        @NotNull
        private static final String DIALOG_CONFIG_VERSIONS_KEY = "versions";

        @NotNull
        private final String dialogName;

        @Nullable
        private final Uri fallbackUrl;

        @NotNull
        private final String featureName;

        @Nullable
        private final int[] versionSpec;

        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            private final int[] parseVersionSpec(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                int length = jSONArray.length();
                int[] iArr = new int[length];
                if (length <= 0) {
                    return iArr;
                }
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    int i4 = -1;
                    int optInt = jSONArray.optInt(i2, -1);
                    if (optInt == -1) {
                        String optString = jSONArray.optString(i2);
                        if (!Utility.isNullOrEmpty(optString)) {
                            try {
                                p0.a.r(optString, "versionString");
                                i4 = Integer.parseInt(optString);
                            } catch (NumberFormatException e) {
                                Utility.logd(Utility.LOG_TAG, e);
                            }
                            optInt = i4;
                        }
                    }
                    iArr[i2] = optInt;
                    if (i3 >= length) {
                        return iArr;
                    }
                    i2 = i3;
                }
            }

            @Nullable
            public final DialogFeatureConfig parseDialogConfig(@NotNull JSONObject jSONObject) {
                p0.a.s(jSONObject, "dialogConfigJSON");
                String optString = jSONObject.optString("name");
                if (Utility.isNullOrEmpty(optString)) {
                    return null;
                }
                p0.a.r(optString, "dialogNameWithFeature");
                List o12 = m.o1(optString, new String[]{"|"}, 0, 6);
                if (o12.size() != 2) {
                    return null;
                }
                String str = (String) u.E0(o12);
                String str2 = (String) u.L0(o12);
                if (Utility.isNullOrEmpty(str) || Utility.isNullOrEmpty(str2)) {
                    return null;
                }
                String optString2 = jSONObject.optString("url");
                return new DialogFeatureConfig(str, str2, Utility.isNullOrEmpty(optString2) ? null : Uri.parse(optString2), parseVersionSpec(jSONObject.optJSONArray(DialogFeatureConfig.DIALOG_CONFIG_VERSIONS_KEY)), null);
            }
        }

        public /* synthetic */ DialogFeatureConfig(String str, String str2, Uri uri, int[] iArr, kotlin.jvm.internal.k kVar) {
            this(str, str2, uri, iArr);
        }

        @NotNull
        public final String getDialogName() {
            return this.dialogName;
        }

        @Nullable
        public final Uri getFallbackUrl() {
            return this.fallbackUrl;
        }

        @NotNull
        public final String getFeatureName() {
            return this.featureName;
        }

        @Nullable
        public final int[] getVersionSpec() {
            return this.versionSpec;
        }

        private DialogFeatureConfig(String str, String str2, Uri uri, int[] iArr) {
            this.dialogName = str;
            this.featureName = str2;
            this.fallbackUrl = uri;
            this.versionSpec = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FetchedAppSettings(boolean z2, @NotNull String str, boolean z3, int i2, @NotNull EnumSet<SmartLoginOption> enumSet, @NotNull Map<String, ? extends Map<String, DialogFeatureConfig>> map, boolean z4, @NotNull FacebookRequestErrorClassification facebookRequestErrorClassification, @NotNull String str2, @NotNull String str3, boolean z5, boolean z6, @Nullable JSONArray jSONArray, @NotNull String str4, boolean z7, boolean z8, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable JSONArray jSONArray2, @Nullable JSONArray jSONArray3, @Nullable Map<String, Boolean> map2, @Nullable JSONArray jSONArray4, @Nullable JSONArray jSONArray5, @Nullable JSONArray jSONArray6) {
        p0.a.s(str, "nuxContent");
        p0.a.s(enumSet, "smartLoginOptions");
        p0.a.s(map, "dialogConfigurations");
        p0.a.s(facebookRequestErrorClassification, "errorClassification");
        p0.a.s(str2, "smartLoginBookmarkIconURL");
        p0.a.s(str3, "smartLoginMenuIconURL");
        p0.a.s(str4, "sdkUpdateMessage");
        this.supportsImplicitLogging = z2;
        this.nuxContent = str;
        this.nuxEnabled = z3;
        this.sessionTimeoutInSeconds = i2;
        this.smartLoginOptions = enumSet;
        this.dialogConfigurations = map;
        this.automaticLoggingEnabled = z4;
        this.errorClassification = facebookRequestErrorClassification;
        this.smartLoginBookmarkIconURL = str2;
        this.smartLoginMenuIconURL = str3;
        this.iAPAutomaticLoggingEnabled = z5;
        this.codelessEventsEnabled = z6;
        this.eventBindings = jSONArray;
        this.sdkUpdateMessage = str4;
        this.trackUninstallEnabled = z7;
        this.monitorViaDialogEnabled = z8;
        this.rawAamRules = str5;
        this.suggestedEventsSetting = str6;
        this.restrictiveDataSetting = str7;
        this.protectedModeStandardParamsSetting = jSONArray2;
        this.MACARuleMatchingSetting = jSONArray3;
        this.migratedAutoLogValues = map2;
        this.blocklistEvents = jSONArray4;
        this.redactedEvents = jSONArray5;
        this.sensitiveParams = jSONArray6;
    }

    @Nullable
    public static final DialogFeatureConfig getDialogFeatureConfig(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return Companion.getDialogFeatureConfig(str, str2, str3);
    }

    public final boolean getAutomaticLoggingEnabled() {
        return this.automaticLoggingEnabled;
    }

    @Nullable
    public final JSONArray getBlocklistEvents() {
        return this.blocklistEvents;
    }

    public final boolean getCodelessEventsEnabled() {
        return this.codelessEventsEnabled;
    }

    @NotNull
    public final Map<String, Map<String, DialogFeatureConfig>> getDialogConfigurations() {
        return this.dialogConfigurations;
    }

    @NotNull
    public final FacebookRequestErrorClassification getErrorClassification() {
        return this.errorClassification;
    }

    @Nullable
    public final JSONArray getEventBindings() {
        return this.eventBindings;
    }

    public final boolean getIAPAutomaticLoggingEnabled() {
        return this.iAPAutomaticLoggingEnabled;
    }

    @Nullable
    public final JSONArray getMACARuleMatchingSetting() {
        return this.MACARuleMatchingSetting;
    }

    @Nullable
    public final Map<String, Boolean> getMigratedAutoLogValues() {
        return this.migratedAutoLogValues;
    }

    public final boolean getMonitorViaDialogEnabled() {
        return this.monitorViaDialogEnabled;
    }

    @NotNull
    public final String getNuxContent() {
        return this.nuxContent;
    }

    public final boolean getNuxEnabled() {
        return this.nuxEnabled;
    }

    @Nullable
    public final JSONArray getProtectedModeStandardParamsSetting() {
        return this.protectedModeStandardParamsSetting;
    }

    @Nullable
    public final String getRawAamRules() {
        return this.rawAamRules;
    }

    @Nullable
    public final JSONArray getRedactedEvents() {
        return this.redactedEvents;
    }

    @Nullable
    public final String getRestrictiveDataSetting() {
        return this.restrictiveDataSetting;
    }

    @NotNull
    public final String getSdkUpdateMessage() {
        return this.sdkUpdateMessage;
    }

    @Nullable
    public final JSONArray getSensitiveParams() {
        return this.sensitiveParams;
    }

    public final int getSessionTimeoutInSeconds() {
        return this.sessionTimeoutInSeconds;
    }

    @NotNull
    public final String getSmartLoginBookmarkIconURL() {
        return this.smartLoginBookmarkIconURL;
    }

    @NotNull
    public final String getSmartLoginMenuIconURL() {
        return this.smartLoginMenuIconURL;
    }

    @NotNull
    public final EnumSet<SmartLoginOption> getSmartLoginOptions() {
        return this.smartLoginOptions;
    }

    @Nullable
    public final String getSuggestedEventsSetting() {
        return this.suggestedEventsSetting;
    }

    public final boolean getTrackUninstallEnabled() {
        return this.trackUninstallEnabled;
    }

    public final boolean supportsImplicitLogging() {
        return this.supportsImplicitLogging;
    }
}
