package com.google.android.ump;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* loaded from: classes3.dex */
public class ConsentRequestParameters {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11891b;

    /* renamed from: c, reason: collision with root package name */
    public final ConsentDebugSettings f11892c;

    /* loaded from: classes3.dex */
    public static final class Builder {
        public boolean a;

        /* renamed from: b, reason: collision with root package name */
        public String f11893b;

        /* renamed from: c, reason: collision with root package name */
        public ConsentDebugSettings f11894c;

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this);
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setAdMobAppId(@Nullable String str) {
            this.f11893b = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(@Nullable ConsentDebugSettings consentDebugSettings) {
            this.f11894c = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z10) {
            this.a = z10;
            return this;
        }
    }

    public /* synthetic */ ConsentRequestParameters(Builder builder) {
        this.a = builder.a;
        this.f11891b = builder.f11893b;
        this.f11892c = builder.f11894c;
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.f11892c;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.a;
    }

    @RecentlyNullable
    public final String zza() {
        return this.f11891b;
    }
}
