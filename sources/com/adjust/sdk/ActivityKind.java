package com.adjust.sdk;

import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinMediationProvider;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes.dex */
public enum ActivityKind {
    UNKNOWN,
    SESSION,
    EVENT,
    CLICK,
    ATTRIBUTION,
    REVENUE,
    REATTRIBUTION,
    INFO,
    GDPR,
    AD_REVENUE,
    DISABLE_THIRD_PARTY_SHARING,
    SUBSCRIPTION,
    THIRD_PARTY_SHARING,
    MEASUREMENT_CONSENT;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ActivityKind.values().length];
            a = iArr;
            try {
                iArr[ActivityKind.SESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ActivityKind.EVENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ActivityKind.CLICK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ActivityKind.ATTRIBUTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ActivityKind.INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ActivityKind.GDPR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ActivityKind.DISABLE_THIRD_PARTY_SHARING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ActivityKind.AD_REVENUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ActivityKind.SUBSCRIPTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ActivityKind.THIRD_PARTY_SHARING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ActivityKind.MEASUREMENT_CONSENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static ActivityKind fromString(String str) {
        return "session".equals(str) ? SESSION : NotificationCompat.CATEGORY_EVENT.equals(str) ? EVENT : CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str) ? CLICK : "attribution".equals(str) ? ATTRIBUTION : "info".equals(str) ? INFO : "gdpr".equals(str) ? GDPR : "disable_third_party_sharing".equals(str) ? DISABLE_THIRD_PARTY_SHARING : "ad_revenue".equals(str) ? AD_REVENUE : "subscription".equals(str) ? SUBSCRIPTION : "third_party_sharing".equals(str) ? THIRD_PARTY_SHARING : "measurement_consent".equals(str) ? MEASUREMENT_CONSENT : UNKNOWN;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (a.a[ordinal()]) {
            case 1:
                return "session";
            case 2:
                return NotificationCompat.CATEGORY_EVENT;
            case 3:
                return CampaignEx.JSON_NATIVE_VIDEO_CLICK;
            case 4:
                return "attribution";
            case 5:
                return "info";
            case 6:
                return "gdpr";
            case 7:
                return "disable_third_party_sharing";
            case 8:
                return "ad_revenue";
            case 9:
                return "subscription";
            case 10:
                return "third_party_sharing";
            case 11:
                return "measurement_consent";
            default:
                return AppLovinMediationProvider.UNKNOWN;
        }
    }
}
