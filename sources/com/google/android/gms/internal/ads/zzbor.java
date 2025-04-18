package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzbor implements zzbod {
    private final zzbof zza;
    private final zzbog zzb;
    private final zzbnz zzc;
    private final String zzd;

    public zzbor(zzbnz zzbnzVar, String str, zzbog zzbogVar, zzbof zzbofVar) {
        this.zzc = zzbnzVar;
        this.zzd = str;
        this.zzb = zzbogVar;
        this.zza = zzbofVar;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzbor zzborVar, zzbnt zzbntVar, zzboa zzboaVar, Object obj, zzcas zzcasVar) {
        try {
            com.google.android.gms.ads.internal.zzu.zzp();
            String uuid = UUID.randomUUID().toString();
            zzbjv.zzo.zzc(uuid, new zzboq(zzborVar, zzbntVar, zzcasVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", zzborVar.zzb.zzb(obj));
            zzboaVar.zzl(zzborVar.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzcasVar.zzd(e);
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to invokeJavascript", e);
            } finally {
                zzbntVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgev
    public final ListenableFuture zza(@Nullable Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final ListenableFuture zzb(Object obj) {
        zzcas zzcasVar = new zzcas();
        zzbnt zzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzb.zzj(new zzboo(this, zzb, obj, zzcasVar), new zzbop(this, zzcasVar, zzb));
        return zzcasVar;
    }
}
