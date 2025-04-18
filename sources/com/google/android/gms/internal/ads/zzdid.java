package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdid implements zzhfx {
    private final zzhgp zza;

    public zzdid(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* synthetic */ Object zzb() {
        VersionInfoParcel zza = ((zzcid) this.zza).zza();
        com.google.android.gms.ads.internal.zzv.zzq();
        return new zzayi(UUID.randomUUID().toString(), zza, "native", new JSONObject(), false, true);
    }
}
