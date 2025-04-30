package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlt implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ zzo zze;
    private final /* synthetic */ boolean zzf;
    private final /* synthetic */ zzkx zzg;

    public zzlt(zzkx zzkxVar, AtomicReference atomicReference, String str, String str2, String str3, zzo zzoVar, boolean z8) {
        this.zza = atomicReference;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = zzoVar;
        this.zzf = z8;
        this.zzg = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfl zzflVar;
        synchronized (this.zza) {
            try {
                try {
                    zzflVar = this.zzg.zzb;
                } catch (RemoteException e4) {
                    this.zzg.zzj().zzg().zza("(legacy) Failed to get user properties; remote exception", zzfw.zza(this.zzb), this.zzc, e4);
                    this.zza.set(Collections.emptyList());
                }
                if (zzflVar == null) {
                    this.zzg.zzj().zzg().zza("(legacy) Failed to get user properties; not connected to service", zzfw.zza(this.zzb), this.zzc, this.zzd);
                    this.zza.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.zzb)) {
                    Preconditions.checkNotNull(this.zze);
                    this.zza.set(zzflVar.zza(this.zzc, this.zzd, this.zzf, this.zze));
                } else {
                    this.zza.set(zzflVar.zza(this.zzb, this.zzc, this.zzd, this.zzf));
                }
                this.zzg.zzaq();
                this.zza.notify();
            } finally {
                this.zza.notify();
            }
        }
    }
}
