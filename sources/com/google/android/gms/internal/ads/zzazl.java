package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzazl {

    @VisibleForTesting
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    @Nullable
    public final zzazk zza(boolean z2) {
        synchronized (this.zzb) {
            try {
                zzazk zzazkVar = null;
                if (this.zzc.isEmpty()) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Queue empty");
                    return null;
                }
                int i2 = 0;
                if (this.zzc.size() < 2) {
                    zzazk zzazkVar2 = (zzazk) this.zzc.get(0);
                    if (z2) {
                        this.zzc.remove(0);
                    } else {
                        zzazkVar2.zzi();
                    }
                    return zzazkVar2;
                }
                int i3 = Integer.MIN_VALUE;
                int i4 = 0;
                for (zzazk zzazkVar3 : this.zzc) {
                    int zzb = zzazkVar3.zzb();
                    if (zzb > i3) {
                        i2 = i4;
                    }
                    int i5 = zzb > i3 ? zzb : i3;
                    if (zzb > i3) {
                        zzazkVar = zzazkVar3;
                    }
                    i4++;
                    i3 = i5;
                }
                this.zzc.remove(i2);
                return zzazkVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(zzazk zzazkVar) {
        synchronized (this.zzb) {
            try {
                if (this.zzc.size() >= 10) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Queue is full, current size = " + this.zzc.size());
                    this.zzc.remove(0);
                }
                int i2 = this.zza;
                this.zza = i2 + 1;
                zzazkVar.zzj(i2);
                zzazkVar.zzn();
                this.zzc.add(zzazkVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc(zzazk zzazkVar) {
        synchronized (this.zzb) {
            try {
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    zzazk zzazkVar2 = (zzazk) it.next();
                    if (com.google.android.gms.ads.internal.zzu.zzo().zzi().zzP()) {
                        if (!com.google.android.gms.ads.internal.zzu.zzo().zzi().zzQ() && !zzazkVar.equals(zzazkVar2) && zzazkVar2.zzf().equals(zzazkVar.zzf())) {
                            it.remove();
                            return true;
                        }
                    } else if (!zzazkVar.equals(zzazkVar2) && zzazkVar2.zzd().equals(zzazkVar.zzd())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzd(zzazk zzazkVar) {
        synchronized (this.zzb) {
            try {
                return this.zzc.contains(zzazkVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
