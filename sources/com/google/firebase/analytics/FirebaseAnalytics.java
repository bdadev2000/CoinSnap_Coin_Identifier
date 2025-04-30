package com.google.firebase.analytics;

import O4.d;
import O4.e;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.zzkk;
import com.google.android.gms.tasks.Tasks;
import g4.C2296f;
import j4.C2397a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;

    /* renamed from: a, reason: collision with root package name */
    public final zzdq f14322a;

    public FirebaseAnalytics(zzdq zzdqVar) {
        Preconditions.checkNotNull(zzdqVar);
        this.f14322a = zzdqVar;
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(zzdq.zza(context));
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Nullable
    @Keep
    public static zzkk getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        zzdq zza = zzdq.zza(context, (String) null, (String) null, (String) null, bundle);
        if (zza == null) {
            return null;
        }
        return new C2397a(zza);
    }

    public final void a(Bundle bundle, String str) {
        this.f14322a.zza(str, bundle);
    }

    @NonNull
    @Keep
    public final String getFirebaseInstanceId() {
        try {
            Object obj = d.m;
            C2296f c9 = C2296f.c();
            Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
            return (String) Tasks.await(((d) c9.b(e.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            throw new IllegalStateException(e4);
        } catch (ExecutionException e9) {
            throw new IllegalStateException(e9.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(@NonNull Activity activity, @Nullable String str, @Nullable String str2) {
        this.f14322a.zza(activity, str, str2);
    }
}
