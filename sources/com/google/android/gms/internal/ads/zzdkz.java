package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdkz implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzdkz(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        VersionInfoParcel zza = ((zzcjv) this.zza).zza();
        com.google.android.gms.ads.internal.zzu.zzp();
        return new zzbaj(UUID.randomUUID().toString(), zza, "native", new JSONObject(), false, true);
    }
}
