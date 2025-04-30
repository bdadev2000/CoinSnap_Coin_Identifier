package com.google.android.ump;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* loaded from: classes2.dex */
public class ConsentRequestParameters {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14241a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final ConsentDebugSettings f14242c;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f14243a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public ConsentDebugSettings f14244c;

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this);
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setAdMobAppId(@Nullable String str) {
            this.b = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(@Nullable ConsentDebugSettings consentDebugSettings) {
            this.f14244c = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z8) {
            this.f14243a = z8;
            return this;
        }
    }

    public /* synthetic */ ConsentRequestParameters(Builder builder) {
        this.f14241a = builder.f14243a;
        this.b = builder.b;
        this.f14242c = builder.f14244c;
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.f14242c;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.f14241a;
    }

    @RecentlyNullable
    public final String zza() {
        return this.b;
    }
}
