package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbou implements zzgdp {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final ua.b zzb;

    public zzbou(ua.b bVar, String str, zzbob zzbobVar, zzboa zzboaVar) {
        this.zzb = bVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdp
    public final ua.b zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final ua.b zzb(final Object obj) {
        return zzgei.zzn(this.zzb, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzbos
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj2) {
                return zzbou.this.zzc(obj, (zzbnv) obj2);
            }
        }, zzcaj.zzf);
    }

    public final /* synthetic */ ua.b zzc(Object obj, zzbnv zzbnvVar) throws Exception {
        zzcao zzcaoVar = new zzcao();
        com.google.android.gms.ads.internal.zzv.zzq();
        String uuid = UUID.randomUUID().toString();
        zzbjq.zzo.zzc(uuid, new zzbot(this, zzcaoVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbnvVar.zzl(this.zza, jSONObject);
        return zzcaoVar;
    }
}
