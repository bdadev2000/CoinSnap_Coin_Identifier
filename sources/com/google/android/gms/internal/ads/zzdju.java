package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzdju implements zzhii {
    private final zzhja zza;

    public zzdju(zzhja zzhjaVar, zzhja zzhjaVar2) {
        this.zza = zzhjaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* synthetic */ Object zzb() {
        VersionInfoParcel zza = ((zzcih) this.zza).zza();
        com.google.android.gms.ads.internal.zzu.zzp();
        return new zzayr(UUID.randomUUID().toString(), zza, "native", new JSONObject(), false, true);
    }
}
