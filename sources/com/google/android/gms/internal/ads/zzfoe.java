package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzfoe {
    private final Context zza;
    private final Executor zzb;
    private final com.google.android.gms.ads.internal.util.client.zzr zzc;
    private final zzfmq zzd;

    public zzfoe(Context context, Executor executor, com.google.android.gms.ads.internal.util.client.zzr zzrVar, zzfmq zzfmqVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzrVar;
        this.zzd = zzfmqVar;
    }

    public final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    public final /* synthetic */ void zzb(String str, zzfmn zzfmnVar) {
        zzfmc zza = zzfmb.zza(this.zza, zzfmu.CUI_NAME_PING);
        zza.zzj();
        zza.zzh(this.zzc.zza(str));
        if (zzfmnVar == null) {
            this.zzd.zzb(zza.zzn());
        } else {
            zzfmnVar.zza(zza);
            zzfmnVar.zzi();
        }
    }

    public final void zzc(final String str, @Nullable final zzfmn zzfmnVar) {
        if (zzfmq.zza() && ((Boolean) zzbgd.zzd.zze()).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfod
                @Override // java.lang.Runnable
                public final void run() {
                    zzfoe.this.zzb(str, zzfmnVar);
                }
            });
        } else {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfoc
                @Override // java.lang.Runnable
                public final void run() {
                    zzfoe.this.zza(str);
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
