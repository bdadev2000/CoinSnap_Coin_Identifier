package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlr implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ zzo zze;
    private final /* synthetic */ zzkx zzf;

    public zzlr(zzkx zzkxVar, AtomicReference atomicReference, String str, String str2, String str3, zzo zzoVar) {
        this.zza = atomicReference;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = zzoVar;
        this.zzf = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfl zzflVar;
        synchronized (this.zza) {
            try {
                try {
                    zzflVar = this.zzf.zzb;
                } catch (RemoteException e4) {
                    this.zzf.zzj().zzg().zza("(legacy) Failed to get conditional properties; remote exception", zzfw.zza(this.zzb), this.zzc, e4);
                    this.zza.set(Collections.emptyList());
                }
                if (zzflVar == null) {
                    this.zzf.zzj().zzg().zza("(legacy) Failed to get conditional properties; not connected to service", zzfw.zza(this.zzb), this.zzc, this.zzd);
                    this.zza.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.zzb)) {
                    Preconditions.checkNotNull(this.zze);
                    this.zza.set(zzflVar.zza(this.zzc, this.zzd, this.zze));
                } else {
                    this.zza.set(zzflVar.zza(this.zzb, this.zzc, this.zzd));
                }
                this.zzf.zzaq();
                this.zza.notify();
            } finally {
                this.zza.notify();
            }
        }
    }
}
