package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbqt implements zzgfa {
    private final zzbpz zza;
    private final zzbqa zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final f4.c zzd;

    public zzbqt(f4.c cVar, String str, zzbqa zzbqaVar, zzbpz zzbpzVar) {
        this.zzd = cVar;
        this.zzb = zzbqaVar;
        this.zza = zzbpzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final f4.c zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final f4.c zzb(final Object obj) {
        return zzgft.zzn(this.zzd, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzbqr
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj2) {
                return zzbqt.this.zzc(obj, (zzbpu) obj2);
            }
        }, zzcci.zzf);
    }

    public final /* synthetic */ f4.c zzc(Object obj, zzbpu zzbpuVar) throws Exception {
        zzccn zzccnVar = new zzccn();
        com.google.android.gms.ads.internal.zzu.zzp();
        String uuid = UUID.randomUUID().toString();
        zzblo.zzo.zzc(uuid, new zzbqs(this, zzccnVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbpuVar.zzl(this.zzc, jSONObject);
        return zzccnVar;
    }
}
