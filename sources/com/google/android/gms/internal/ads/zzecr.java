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

/* loaded from: classes2.dex */
public final class zzecr {
    public f4.c zza;
    private final zzdce zzb;
    private final zzebz zzc;
    private final zzflt zzd;
    private final zzfho zze;
    private final VersionInfoParcel zzf;
    private final zzfmq zzg;
    private final zzfmn zzh;
    private final Context zzi;
    private final zzgge zzj;

    public zzecr(zzdce zzdceVar, zzebz zzebzVar, zzflt zzfltVar, zzfho zzfhoVar, VersionInfoParcel versionInfoParcel, zzfmq zzfmqVar, zzfmn zzfmnVar, Context context, zzgge zzggeVar) {
        this.zzb = zzdceVar;
        this.zzc = zzebzVar;
        this.zzd = zzfltVar;
        this.zze = zzfhoVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzfmqVar;
        this.zzh = zzfmnVar;
        this.zzi = context;
        this.zzj = zzggeVar;
    }

    public final /* synthetic */ zzbwz zza(zzbxu zzbxuVar, zzeec zzeecVar) {
        zzeecVar.zzc.put("Content-Type", zzeecVar.zze);
        zzeecVar.zzc.put(Command.HTTP_HEADER_USER_AGENT, com.google.android.gms.ads.internal.zzu.zzp().zzc(this.zzi, zzbxuVar.zzb.afmaVersion));
        Bundle bundle = new Bundle();
        for (Map.Entry entry : zzeecVar.zzc.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzbwz(zzeecVar.zza, zzeecVar.zzb, bundle, zzeecVar.zzd, zzeecVar.zzf, zzbxuVar.zzd, zzbxuVar.zzh);
    }

    public final f4.c zzc(final zzbxu zzbxuVar, final JSONObject jSONObject, final zzbxx zzbxxVar) {
        this.zzb.zzdn(zzbxuVar);
        zzflk zzb = this.zzd.zzb(zzfln.PROXY, zzgft.zzm(this.zzd.zzb(zzfln.PREPARE_HTTP_REQUEST, zzgft.zzh(new zzeeg(jSONObject, zzbxxVar))).zze(new zzeeh(zzbxuVar.zzg, this.zzh, zzfmb.zza(this.zzi, zzfmu.CUI_NAME_ADREQUEST_BUILDURL))).zza(), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzecn
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                return zzecr.this.zza(zzbxuVar, (zzeec) obj);
            }
        }, this.zzj));
        final zzebz zzebzVar = this.zzc;
        Objects.requireNonNull(zzebzVar);
        zzfky zza = zzb.zzf(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeco
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzebz.this.zzc((zzbwz) obj);
            }
        }).zza();
        this.zza = zza;
        f4.c zzn = zzgft.zzn(this.zzd.zzb(zzfln.PRE_PROCESS, zza).zze(new zzfkw() { // from class: com.google.android.gms.internal.ads.zzecm
            @Override // com.google.android.gms.internal.ads.zzfkw
            public final Object zza(Object obj) {
                return new zzedp(zzeed.zza(new InputStreamReader((InputStream) obj)), jSONObject, zzbxxVar);
            }
        }).zzf(com.google.android.gms.ads.internal.zzu.zzf().zza(this.zzi, this.zzf, this.zzg).zza("google.afma.response.normalize", zzedp.zza, zzbqe.zzb)).zza(), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzecp
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzecr.this.zzd(zzbxuVar, (InputStream) obj);
            }
        }, this.zzj);
        zzgft.zzr(zzn, new zzecq(this), this.zzj);
        return zzn;
    }

    public final /* synthetic */ f4.c zzd(zzbxu zzbxuVar, InputStream inputStream) throws Exception {
        return zzgft.zzh(new zzfhf(new zzfhc(this.zze), zzfhe.zza(new InputStreamReader(inputStream), zzbxuVar)));
    }
}
