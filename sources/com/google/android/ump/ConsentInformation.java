package com.google.android.ump;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public interface ConsentInformation {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ConsentStatus {
        public static final int NOT_REQUIRED = 1;
        public static final int OBTAINED = 3;
        public static final int REQUIRED = 2;
        public static final int UNKNOWN = 0;
    }

    /* loaded from: classes2.dex */
    public interface OnConsentInfoUpdateFailureListener {
        void onConsentInfoUpdateFailure(@RecentlyNonNull FormError formError);
    }

    /* loaded from: classes2.dex */
    public interface OnConsentInfoUpdateSuccessListener {
        void onConsentInfoUpdateSuccess();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class PrivacyOptionsRequirementStatus {

        @RecentlyNonNull
        public static final PrivacyOptionsRequirementStatus NOT_REQUIRED;

        @RecentlyNonNull
        public static final PrivacyOptionsRequirementStatus REQUIRED;

        @RecentlyNonNull
        public static final PrivacyOptionsRequirementStatus UNKNOWN;
        public static final /* synthetic */ PrivacyOptionsRequirementStatus[] b;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus] */
        static {
            ?? r02 = new Enum("UNKNOWN", 0);
            UNKNOWN = r02;
            ?? r12 = new Enum("NOT_REQUIRED", 1);
            NOT_REQUIRED = r12;
            ?? r22 = new Enum("REQUIRED", 2);
            REQUIRED = r22;
            b = new PrivacyOptionsRequirementStatus[]{r02, r12, r22};
        }

        @RecentlyNonNull
        public static PrivacyOptionsRequirementStatus valueOf(@RecentlyNonNull String str) {
            return (PrivacyOptionsRequirementStatus) Enum.valueOf(PrivacyOptionsRequirementStatus.class, str);
        }

        @RecentlyNonNull
        public static PrivacyOptionsRequirementStatus[] values() {
            return (PrivacyOptionsRequirementStatus[]) b.clone();
        }
    }

    boolean canRequestAds();

    int getConsentStatus();

    @RecentlyNonNull
    PrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus();

    boolean isConsentFormAvailable();

    void requestConsentInfoUpdate(@RecentlyNonNull Activity activity, @RecentlyNonNull ConsentRequestParameters consentRequestParameters, @RecentlyNonNull OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, @RecentlyNonNull OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener);

    void reset();
}
