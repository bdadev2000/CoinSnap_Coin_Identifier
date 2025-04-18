package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzfch extends zzfbp {
    public zzfch(Context context, Executor executor, zzcho zzchoVar, zzfdy zzfdyVar, zzfcf zzfcfVar, zzfha zzfhaVar, VersionInfoParcel versionInfoParcel) {
        super(context, executor, zzchoVar, zzfdyVar, zzfcfVar, zzfhaVar, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.zzfbp
    public final /* bridge */ /* synthetic */ zzcxg zze(zzcqo zzcqoVar, zzcxk zzcxkVar, zzddu zzdduVar) {
        zzcqe zzd = this.zza.zzd();
        zzd.zzd(zzcxkVar);
        zzd.zzc(zzdduVar);
        return zzd;
    }
}
