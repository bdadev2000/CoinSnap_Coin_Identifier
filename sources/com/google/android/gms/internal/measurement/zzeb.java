package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzeb extends zzdy.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ zzdk zze;
    private final /* synthetic */ zzdy zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzdy zzdyVar, String str, String str2, zzdk zzdkVar) {
        super(zzdyVar);
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzdkVar;
        this.zzf = zzdyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zza() throws RemoteException {
        zzdj zzdjVar;
        zzdjVar = this.zzf.zzj;
        ((zzdj) Preconditions.checkNotNull(zzdjVar)).getConditionalUserProperties(this.zzc, this.zzd, this.zze);
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zzb() {
        this.zze.zza((Bundle) null);
    }
}
