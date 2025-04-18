package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdy;
import com.google.android.gms.measurement.internal.zzlb;
import com.google.android.gms.tasks.Tasks;
import dc.d;
import dc.e;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import va.g;
import ya.a;

/* loaded from: classes3.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f12065b;
    public final zzdy a;

    public FirebaseAnalytics(zzdy zzdyVar) {
        Preconditions.checkNotNull(zzdyVar);
        this.a = zzdyVar;
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f12065b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f12065b == null) {
                    f12065b = new FirebaseAnalytics(zzdy.zza(context));
                }
            }
        }
        return f12065b;
    }

    @Nullable
    @Keep
    public static zzlb getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        zzdy zza = zzdy.zza(context, (String) null, (String) null, (String) null, bundle);
        if (zza == null) {
            return null;
        }
        return new a(zza);
    }

    public final void a(Bundle bundle, String str) {
        this.a.zza(str, bundle);
    }

    @NonNull
    @Keep
    public final String getFirebaseInstanceId() {
        try {
            Object obj = d.f16973m;
            g c10 = g.c();
            Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
            return (String) Tasks.await(((d) c10.b(e.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(@NonNull Activity activity, @Nullable String str, @Nullable String str2) {
        this.a.zza(activity, str, str2);
    }
}
