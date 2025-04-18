package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.net.HttpHeaders;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzebq {

    @VisibleForTesting
    public ListenableFuture zza;
    private final zzdaw zzb;
    private final zzeay zzc;
    private final zzflg zzd;
    private final zzfhc zze;
    private final VersionInfoParcel zzf;
    private final zzfmd zzg;
    private final zzfma zzh;
    private final Context zzi;
    private final zzgfz zzj;

    public zzebq(zzdaw zzdawVar, zzeay zzeayVar, zzflg zzflgVar, zzfhc zzfhcVar, VersionInfoParcel versionInfoParcel, zzfmd zzfmdVar, zzfma zzfmaVar, Context context, zzgfz zzgfzVar) {
        this.zzb = zzdawVar;
        this.zzc = zzeayVar;
        this.zzd = zzflgVar;
        this.zze = zzfhcVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzfmdVar;
        this.zzh = zzfmaVar;
        this.zzi = context;
        this.zzj = zzgfzVar;
    }

    public final /* synthetic */ zzbvf zza(zzbwa zzbwaVar, zzedb zzedbVar) {
        zzedbVar.zzc.put("Content-Type", zzedbVar.zze);
        zzedbVar.zzc.put(HttpHeaders.USER_AGENT, com.google.android.gms.ads.internal.zzu.zzp().zzc(this.zzi, zzbwaVar.zzb.afmaVersion));
        Bundle bundle = new Bundle();
        for (Map.Entry entry : zzedbVar.zzc.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzbvf(zzedbVar.zza, zzedbVar.zzb, bundle, zzedbVar.zzd, zzedbVar.zzf, zzbwaVar.zzd, zzbwaVar.zzh);
    }

    public final ListenableFuture zzc(final zzbwa zzbwaVar, final JSONObject jSONObject, final zzbwc zzbwcVar) {
        this.zzb.zzdn(zzbwaVar);
        zzfkx zzb = this.zzd.zzb(zzfla.PROXY, zzgfo.zzm(this.zzd.zzb(zzfla.PREPARE_HTTP_REQUEST, zzgfo.zzh(new zzedf(jSONObject, zzbwcVar))).zze(new zzedg(zzbwaVar.zzg, this.zzh, zzflo.zza(this.zzi, 9))).zza(), new zzfxq() { // from class: com.google.android.gms.internal.ads.zzebm
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                return zzebq.this.zza(zzbwaVar, (zzedb) obj);
            }
        }, this.zzj));
        final zzeay zzeayVar = this.zzc;
        Objects.requireNonNull(zzeayVar);
        zzfkl zza = zzb.zzf(new zzgev() { // from class: com.google.android.gms.internal.ads.zzebn
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzeay.this.zzc((zzbvf) obj);
            }
        }).zza();
        this.zza = zza;
        ListenableFuture zzn = zzgfo.zzn(this.zzd.zzb(zzfla.PRE_PROCESS, zza).zze(new zzfkj() { // from class: com.google.android.gms.internal.ads.zzebl
            @Override // com.google.android.gms.internal.ads.zzfkj
            public final Object zza(Object obj) {
                return new zzeco(zzedc.zza(new InputStreamReader((InputStream) obj)), jSONObject, zzbwcVar);
            }
        }).zzf(com.google.android.gms.ads.internal.zzu.zzf().zza(this.zzi, this.zzf, this.zzg).zza("google.afma.response.normalize", zzeco.zza, zzbok.zzb)).zza(), new zzgev() { // from class: com.google.android.gms.internal.ads.zzebo
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzebq.this.zzd(zzbwaVar, (InputStream) obj);
            }
        }, this.zzj);
        zzgfo.zzr(zzn, new zzebp(this), this.zzj);
        return zzn;
    }

    public final /* synthetic */ ListenableFuture zzd(zzbwa zzbwaVar, InputStream inputStream) throws Exception {
        return zzgfo.zzh(new zzfgt(new zzfgq(this.zze), zzfgs.zza(new InputStreamReader(inputStream), zzbwaVar)));
    }
}
