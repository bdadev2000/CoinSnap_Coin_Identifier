package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzdy;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
/* loaded from: classes11.dex */
public final class zzc implements Callable<String> {
    private final /* synthetic */ FirebaseAnalytics zza;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        zzdy zzdyVar;
        zzdyVar = this.zza.zzb;
        return zzdyVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }
}
