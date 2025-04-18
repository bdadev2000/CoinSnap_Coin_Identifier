package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzflr {
    private final Context zza;
    private final Executor zzb;
    private final com.google.android.gms.ads.internal.util.client.zzr zzc;
    private final zzfko zzd;

    public zzflr(Context context, Executor executor, com.google.android.gms.ads.internal.util.client.zzr zzrVar, zzfko zzfkoVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzrVar;
        this.zzd = zzfkoVar;
    }

    public final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    public final /* synthetic */ void zzb(String str, zzfkl zzfklVar) {
        zzfka zza = zzfjz.zza(this.zza, 14);
        zza.zzi();
        zza.zzg(this.zzc.zza(str));
        if (zzfklVar == null) {
            this.zzd.zzb(zza.zzm());
        } else {
            zzfklVar.zza(zza);
            zzfklVar.zzh();
        }
    }

    public final void zzc(final String str, @Nullable final zzfkl zzfklVar) {
        if (zzfko.zza() && ((Boolean) zzbeg.zzd.zze()).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzflq
                @Override // java.lang.Runnable
                public final void run() {
                    zzflr.this.zzb(str, zzfklVar);
                }
            });
        } else {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzflp
                @Override // java.lang.Runnable
                public final void run() {
                    zzflr.this.zza(str);
                }
            });
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), null);
        }
    }
}
