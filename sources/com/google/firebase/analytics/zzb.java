package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzdy;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-api@@22.1.2 */
/* loaded from: classes11.dex */
public final class zzb implements Callable<Long> {
    private final /* synthetic */ FirebaseAnalytics zza;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Long call() throws Exception {
        zzdy zzdyVar;
        zzdyVar = this.zza.zzb;
        return zzdyVar.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }
}
