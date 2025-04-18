package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;

/* loaded from: classes4.dex */
public final class zzfjm {
    private final zzfiq zza;
    private final zzfjk zzb;
    private final zzfim zzc;
    private zzfjs zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfjm(zzfiq zzfiqVar, zzfim zzfimVar, zzfjk zzfjkVar) {
        this.zza = zzfiqVar;
        this.zzc = zzfimVar;
        this.zzb = zzfjkVar;
        zzfimVar.zzb(new zzfjh(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzga)).booleanValue() && !com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfjl zzfjlVar = (zzfjl) this.zzd.pollFirst();
                if (zzfjlVar == null || (zzfjlVar.zza() != null && this.zza.zze(zzfjlVar.zza()))) {
                    zzfjs zzfjsVar = new zzfjs(this.zza, this.zzb, zzfjlVar);
                    this.zze = zzfjsVar;
                    zzfjsVar.zzd(new zzfji(this, zzfjlVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    @Nullable
    public final synchronized ListenableFuture zza(zzfjl zzfjlVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzfjlVar);
    }

    public final synchronized void zze(zzfjl zzfjlVar) {
        this.zzd.add(zzfjlVar);
    }

    public final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
