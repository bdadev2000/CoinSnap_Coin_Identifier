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
    public zzff(zzdy zzdyVar, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(zzdyVar);
        this.zzc = l10;
        this.zzd = str;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = z10;
        this.zzh = z11;
        this.zzi = zzdyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zza() throws RemoteException {
        long longValue;
        zzdj zzdjVar;
        Long l10 = this.zzc;
        if (l10 == null) {
            longValue = this.zza;
        } else {
            longValue = l10.longValue();
        }
        long j3 = longValue;
        zzdjVar = this.zzi.zzj;
        ((zzdj) Preconditions.checkNotNull(zzdjVar)).logEvent(this.zzd, this.zze, this.zzf, this.zzg, this.zzh, j3);
    }
}
