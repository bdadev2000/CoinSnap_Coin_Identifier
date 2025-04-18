package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.mbridge.msdk.foundation.download.Command;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzeag {
    public ua.b zza;
    private final zzczh zzb;
    private final zzdzo zzc;
    private final zzfjr zzd;
    private final zzffo zze;
    private final VersionInfoParcel zzf;
    private final zzfko zzg;
    private final zzfkl zzh;
    private final Context zzi;
    private final zzges zzj;

    public zzeag(zzczh zzczhVar, zzdzo zzdzoVar, zzfjr zzfjrVar, zzffo zzffoVar, VersionInfoParcel versionInfoParcel, zzfko zzfkoVar, zzfkl zzfklVar, Context context, zzges zzgesVar) {
        this.zzb = zzczhVar;
        this.zzc = zzdzoVar;
        this.zzd = zzfjrVar;
        this.zze = zzffoVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzfkoVar;
        this.zzh = zzfklVar;
        this.zzi = context;
        this.zzj = zzgesVar;
    }

    public final /* synthetic */ zzbvb zza(zzbvx zzbvxVar, zzebs zzebsVar) {
        zzebsVar.zzc.put("Content-Type", zzebsVar.zze);
        zzebsVar.zzc.put(Command.HTTP_HEADER_USER_AGENT, com.google.android.gms.ads.internal.zzv.zzq().zzc(this.zzi, zzbvxVar.zzb.afmaVersion));
        Bundle bundle = new Bundle();
        for (Map.Entry entry : zzebsVar.zzc.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzbvb(zzebsVar.zza, zzebsVar.zzb, bundle, zzebsVar.zzd, zzebsVar.zzf, zzbvxVar.zzd, zzbvxVar.zzh);
    }

    public final ua.b zzc(final zzbvx zzbvxVar, final JSONObject jSONObject, final zzbvz zzbvzVar) {
        this.zzb.zzdn(zzbvxVar);
        zzfjh zzb = this.zzd.zzb(zzfjl.PROXY, zzgei.zzm(this.zzd.zzb(zzfjl.PREPARE_HTTP_REQUEST, zzgei.zzh(new zzebw(jSONObject, zzbvzVar))).zze(new zzebx(zzbvxVar.zzg, this.zzh, zzfjz.zza(this.zzi, 9))).zza(), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzeac
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return zzeag.this.zza(zzbvxVar, (zzebs) obj);
            }
        }, this.zzj));
        final zzdzo zzdzoVar = this.zzc;
        Objects.requireNonNull(zzdzoVar);
        zzfix zza = zzb.zzf(new zzgdp() { // from class: com.google.android.gms.internal.ads.zzead
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzdzo.this.zzc((zzbvb) obj);
            }
        }).zza();
        this.zza = zza;
        ua.b zzn = zzgei.zzn(this.zzd.zzb(zzfjl.PRE_PROCESS, zza).zze(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzeab
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj) {
                return new zzebf(zzebt.zza(new InputStreamReader((InputStream) obj)), jSONObject, zzbvzVar);
            }
        }).zzf(com.google.android.gms.ads.internal.zzv.zzg().zza(this.zzi, this.zzf, this.zzg).zza("google.afma.response.normalize", zzebf.zza, zzbof.zzb)).zza(), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzeae
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzeag.this.zzd(zzbvxVar, (InputStream) obj);
            }
        }, this.zzj);
        zzgei.zzr(zzn, new zzeaf(this), this.zzj);
        return zzn;
    }

    public final /* synthetic */ ua.b zzd(zzbvx zzbvxVar, InputStream inputStream) throws Exception {
        return zzgei.zzh(new zzfff(new zzffc(this.zze), zzffe.zza(new InputStreamReader(inputStream), zzbvxVar)));
    }
}
