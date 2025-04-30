package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.consent_sdk.zzcl;
import com.google.android.gms.internal.consent_sdk.zzct;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ConsentDebugSettings {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14237a;
    public final int b;

    /* loaded from: classes2.dex */
    public static class Builder {
        public final Context b;

        /* renamed from: d, reason: collision with root package name */
        public boolean f14240d;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f14238a = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public int f14239c = 0;

        public Builder(@RecentlyNonNull Context context) {
            this.b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public Builder addTestDeviceHashedId(@RecentlyNonNull String str) {
            this.f14238a.add(str);
            return this;
        }

        @RecentlyNonNull
        public ConsentDebugSettings build() {
            boolean z8 = true;
            if (!zzct.zza(true) && !this.f14238a.contains(zzcl.zza(this.b)) && !this.f14240d) {
                z8 = false;
            }
            return new ConsentDebugSettings(z8, this);
        }

        @RecentlyNonNull
        public Builder setDebugGeography(int i9) {
            this.f14239c = i9;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setForceTesting(boolean z8) {
            this.f14240d = z8;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
    }

    public /* synthetic */ ConsentDebugSettings(boolean z8, Builder builder) {
        this.f14237a = z8;
        this.b = builder.f14239c;
    }

    public int getDebugGeography() {
        return this.b;
    }

    public boolean isTestDevice() {
        return this.f14237a;
    }
}
