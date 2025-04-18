package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzfng {
    private final Context zza;
    private final Executor zzb;
    private final com.google.android.gms.ads.internal.util.client.zzr zzc;
    private final zzfmd zzd;

    public zzfng(Context context, Executor executor, com.google.android.gms.ads.internal.util.client.zzr zzrVar, zzfmd zzfmdVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzrVar;
        this.zzd = zzfmdVar;
    }

    public final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    public final /* synthetic */ void zzb(String str, zzfma zzfmaVar) {
        zzflp zza = zzflo.zza(this.zza, 14);
        zza.zzi();
        zza.zzg(this.zzc.zza(str));
        if (zzfmaVar == null) {
            this.zzd.zzb(zza.zzm());
        } else {
            zzfmaVar.zza(zza);
            zzfmaVar.zzh();
        }
    }

    public final void zzc(final String str, @Nullable final zzfma zzfmaVar) {
        if (zzfmd.zza() && ((Boolean) zzbek.zzd.zze()).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfnf
                @Override // java.lang.Runnable
                public final void run() {
                    zzfng.this.zzb(str, zzfmaVar);
                }
            });
        } else {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfne
                @Override // java.lang.Runnable
                public final void run() {
                    zzfng.this.zza(str);
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
