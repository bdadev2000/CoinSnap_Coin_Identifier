package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class zzfjy {
    private final zzfjc zza;
    private final zzfjw zzb;
    private final zzfiy zzc;
    private zzfke zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfjy(zzfjc zzfjcVar, zzfiy zzfiyVar, zzfjw zzfjwVar) {
        this.zza = zzfjcVar;
        this.zzc = zzfiyVar;
        this.zzb = zzfjwVar;
        zzfiyVar.zzb(new zzfjt(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgy)).booleanValue() && !com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfjx zzfjxVar = (zzfjx) this.zzd.pollFirst();
                if (zzfjxVar == null || (zzfjxVar.zza() != null && this.zza.zze(zzfjxVar.zza()))) {
                    zzfke zzfkeVar = new zzfke(this.zza, this.zzb, zzfjxVar);
                    this.zze = zzfkeVar;
                    zzfkeVar.zzd(new zzfju(this, zzfjxVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    @Nullable
    public final synchronized f4.c zza(zzfjx zzfjxVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzfjxVar);
    }

    public final synchronized void zze(zzfjx zzfjxVar) {
        this.zzd.add(zzfjxVar);
    }

    public final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
