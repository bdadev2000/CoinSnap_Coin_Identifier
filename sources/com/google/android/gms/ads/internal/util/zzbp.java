package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzara;
import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzasb;
import com.google.android.gms.internal.ads.zzccn;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbp extends zzare {
    private final zzccn zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbp(String str, Map map, zzccn zzccnVar) {
        super(0, str, new zzbo(zzccnVar));
        this.zza = zzccnVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.zzb = zzlVar;
        zzlVar.zzd(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzare
    public final zzark zzh(zzara zzaraVar) {
        return zzark.zzb(zzaraVar, zzasb.zzb(zzaraVar));
    }

    @Override // com.google.android.gms.internal.ads.zzare
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzara zzaraVar = (zzara) obj;
        this.zzb.zzf(zzaraVar.zzc, zzaraVar.zza);
        byte[] bArr = zzaraVar.zzb;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk() && bArr != null) {
            this.zzb.zzh(bArr);
        }
        this.zza.zzc(zzaraVar);
    }
}
