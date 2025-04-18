package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzff extends zzdy.zza {
    private final /* synthetic */ Long zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ boolean zzg;
    private final /* synthetic */ boolean zzh;
    private final /* synthetic */ zzdy zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzff(zzdy zzdyVar, Long l2, String str, String str2, Bundle bundle, boolean z2, boolean z3) {
        super(zzdyVar);
        this.zzc = l2;
        this.zzd = str;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = zzdyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zza() throws RemoteException {
        zzdj zzdjVar;
        Long l2 = this.zzc;
        long longValue = l2 == null ? this.zza : l2.longValue();
        zzdjVar = this.zzi.zzj;
        ((zzdj) Preconditions.checkNotNull(zzdjVar)).logEvent(this.zzd, this.zze, this.zzf, this.zzg, this.zzh, longValue);
    }
}
