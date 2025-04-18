package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzboz implements zzgev {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final ListenableFuture zzb;

    public zzboz(ListenableFuture listenableFuture, String str, zzbog zzbogVar, zzbof zzbofVar) {
        this.zzb = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgev
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final ListenableFuture zzb(final Object obj) {
        return zzgfo.zzn(this.zzb, new zzgev() { // from class: com.google.android.gms.internal.ads.zzbox
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj2) {
                return zzboz.this.zzc(obj, (zzboa) obj2);
            }
        }, zzcan.zzf);
    }

    public final /* synthetic */ ListenableFuture zzc(Object obj, zzboa zzboaVar) throws Exception {
        zzcas zzcasVar = new zzcas();
        com.google.android.gms.ads.internal.zzu.zzp();
        String uuid = UUID.randomUUID().toString();
        zzbjv.zzo.zzc(uuid, new zzboy(this, zzcasVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzboaVar.zzl(this.zza, jSONObject);
        return zzcasVar;
    }
}
