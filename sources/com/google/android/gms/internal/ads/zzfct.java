package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzfct extends zzfcb {
    public zzfct(Context context, Executor executor, zzcjd zzcjdVar, zzfek zzfekVar, zzfcr zzfcrVar, zzfhm zzfhmVar, VersionInfoParcel versionInfoParcel) {
        super(context, executor, zzcjdVar, zzfekVar, zzfcrVar, zzfhmVar, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.zzfcb
    public final /* bridge */ /* synthetic */ zzcyr zze(zzcsc zzcscVar, zzcyv zzcyvVar, zzdfc zzdfcVar) {
        zzcrs zzd = this.zza.zzd();
        zzd.zzd(zzcyvVar);
        zzd.zzc(zzdfcVar);
        return zzd;
    }
}
