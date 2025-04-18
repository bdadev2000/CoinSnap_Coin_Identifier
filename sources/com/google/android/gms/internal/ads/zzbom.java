package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbom implements zzbny {
    private final zzboa zza;
    private final zzbob zzb;
    private final zzbnu zzc;
    private final String zzd;

    public zzbom(zzbnu zzbnuVar, String str, zzbob zzbobVar, zzboa zzboaVar) {
        this.zzc = zzbnuVar;
        this.zzd = str;
        this.zzb = zzbobVar;
        this.zza = zzboaVar;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzbom zzbomVar, zzbno zzbnoVar, zzbnv zzbnvVar, Object obj, zzcao zzcaoVar) {
        try {
            com.google.android.gms.ads.internal.zzv.zzq();
            String uuid = UUID.randomUUID().toString();
            zzbjq.zzo.zzc(uuid, new zzbol(zzbomVar, zzbnoVar, zzcaoVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", zzbomVar.zzb.zzb(obj));
            zzbnvVar.zzl(zzbomVar.zzd, jSONObject);
        } catch (Exception e2) {
            try {
                zzcaoVar.zzd(e2);
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to invokeJavascript", e2);
            } finally {
                zzbnoVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdp
    public final ua.b zza(@Nullable Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbny
    public final ua.b zzb(Object obj) {
        zzcao zzcaoVar = new zzcao();
        zzbno zzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzb.zzj(new zzboj(this, zzb, obj, zzcaoVar), new zzbok(this, zzcaoVar, zzb));
        return zzcaoVar;
    }
}
