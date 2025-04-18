package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.consent_sdk.zzcl;
import com.google.android.gms.internal.consent_sdk.zzct;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class ConsentDebugSettings {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11886b;

    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: b, reason: collision with root package name */
        public final Context f11887b;

        /* renamed from: d, reason: collision with root package name */
        public boolean f11889d;
        public final ArrayList a = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public int f11888c = 0;

        public Builder(@RecentlyNonNull Context context) {
            this.f11887b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public Builder addTestDeviceHashedId(@RecentlyNonNull String str) {
            this.a.add(str);
            return this;
        }

        @RecentlyNonNull
        public ConsentDebugSettings build() {
            boolean z10 = true;
            if (!zzct.zza(true) && !this.a.contains(zzcl.zza(this.f11887b)) && !this.f11889d) {
                z10 = false;
            }
            return new ConsentDebugSettings(z10, this);
        }

        @RecentlyNonNull
        public Builder setDebugGeography(int i10) {
            this.f11888c = i10;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setForceTesting(boolean z10) {
            this.f11889d = z10;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
    }

    public /* synthetic */ ConsentDebugSettings(boolean z10, Builder builder) {
        this.a = z10;
        this.f11886b = builder.f11888c;
    }

    public int getDebugGeography() {
        return this.f11886b;
    }

    public boolean isTestDevice() {
        return this.a;
    }
}
