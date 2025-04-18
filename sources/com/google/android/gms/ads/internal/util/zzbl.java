package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzapl;
import com.google.android.gms.internal.ads.zzapp;
import com.google.android.gms.internal.ads.zzapv;
import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzcao;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbl extends zzapp {
    private final zzcao zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbl(String str, Map map, zzcao zzcaoVar) {
        super(0, str, new zzbk(zzcaoVar));
        this.zza = zzcaoVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.zzb = zzlVar;
        zzlVar.zzd(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final zzapv zzh(zzapl zzaplVar) {
        return zzapv.zzb(zzaplVar, zzaqm.zzb(zzaplVar));
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzapl zzaplVar = (zzapl) obj;
        this.zzb.zzf(zzaplVar.zzc, zzaplVar.zza);
        byte[] bArr = zzaplVar.zzb;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk() && bArr != null) {
            this.zzb.zzh(bArr);
        }
        this.zza.zzc(zzaplVar);
    }
}
