package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class zzfhy {
    private final zzfhc zza;
    private final zzfhw zzb;
    private final zzfgy zzc;
    private zzfie zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfhy(zzfhc zzfhcVar, zzfgy zzfgyVar, zzfhw zzfhwVar) {
        this.zza = zzfhcVar;
        this.zzc = zzfgyVar;
        this.zzb = zzfhwVar;
        zzfgyVar.zzb(new zzfht(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgf)).booleanValue() && !com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfhx zzfhxVar = (zzfhx) this.zzd.pollFirst();
                if (zzfhxVar == null || (zzfhxVar.zza() != null && this.zza.zze(zzfhxVar.zza()))) {
                    zzfie zzfieVar = new zzfie(this.zza, this.zzb, zzfhxVar);
                    this.zze = zzfieVar;
                    zzfieVar.zzd(new zzfhu(this, zzfhxVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    @Nullable
    public final synchronized ua.b zza(zzfhx zzfhxVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzfhxVar);
    }

    public final synchronized void zze(zzfhx zzfhxVar) {
        this.zzd.add(zzfhxVar);
    }

    public final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
