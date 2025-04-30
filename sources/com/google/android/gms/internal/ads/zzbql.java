package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbql implements zzbpx {
    private final zzbpz zza;
    private final zzbqa zzb;
    private final zzbpt zzc;
    private final String zzd;

    public zzbql(zzbpt zzbptVar, String str, zzbqa zzbqaVar, zzbpz zzbpzVar) {
        this.zzc = zzbptVar;
        this.zzd = str;
        this.zzb = zzbqaVar;
        this.zza = zzbpzVar;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzbql zzbqlVar, zzbpn zzbpnVar, zzbpu zzbpuVar, Object obj, zzccn zzccnVar) {
        try {
            com.google.android.gms.ads.internal.zzu.zzp();
            String uuid = UUID.randomUUID().toString();
            zzblo.zzo.zzc(uuid, new zzbqk(zzbqlVar, zzbpnVar, zzccnVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", zzbqlVar.zzb.zzb(obj));
            zzbpuVar.zzl(zzbqlVar.zzd, jSONObject);
        } catch (Exception e4) {
            try {
                zzccnVar.zzd(e4);
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to invokeJavascript", e4);
            } finally {
                zzbpnVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final f4.c zza(@Nullable Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final f4.c zzb(Object obj) {
        zzccn zzccnVar = new zzccn();
        zzbpn zzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzb.zzj(new zzbqi(this, zzb, obj, zzccnVar), new zzbqj(this, zzccnVar, zzb));
        return zzccnVar;
    }
}
