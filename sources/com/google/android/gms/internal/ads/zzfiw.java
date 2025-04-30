package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class zzfiw implements zzczo {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzccc zzc;

    public zzfiw(Context context, zzccc zzcccVar) {
        this.zzb = context;
        this.zzc = zzcccVar;
    }

    public final Bundle zzb() {
        return this.zzc.zzn(this.zzb, this);
    }

    public final synchronized void zzc(HashSet hashSet) {
        this.zza.clear();
        this.zza.addAll(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final synchronized void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.zzc.zzl(this.zza);
        }
    }
}
