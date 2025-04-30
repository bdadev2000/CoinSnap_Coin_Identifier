package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbbd {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    @Nullable
    public final zzbbc zza(boolean z8) {
        int i9;
        synchronized (this.zzb) {
            try {
                zzbbc zzbbcVar = null;
                if (this.zzc.isEmpty()) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Queue empty");
                    return null;
                }
                int i10 = 0;
                if (this.zzc.size() >= 2) {
                    int i11 = Integer.MIN_VALUE;
                    int i12 = 0;
                    for (zzbbc zzbbcVar2 : this.zzc) {
                        int zzb = zzbbcVar2.zzb();
                        if (zzb > i11) {
                            i10 = i12;
                        }
                        if (zzb > i11) {
                            i9 = zzb;
                        } else {
                            i9 = i11;
                        }
                        if (zzb > i11) {
                            zzbbcVar = zzbbcVar2;
                        }
                        i12++;
                        i11 = i9;
                    }
                    this.zzc.remove(i10);
                    return zzbbcVar;
                }
                zzbbc zzbbcVar3 = (zzbbc) this.zzc.get(0);
                if (z8) {
                    this.zzc.remove(0);
                } else {
                    zzbbcVar3.zzi();
                }
                return zzbbcVar3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(zzbbc zzbbcVar) {
        synchronized (this.zzb) {
            try {
                if (this.zzc.size() >= 10) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Queue is full, current size = " + this.zzc.size());
                    this.zzc.remove(0);
                }
                int i9 = this.zza;
                this.zza = i9 + 1;
                zzbbcVar.zzj(i9);
                zzbbcVar.zzn();
                this.zzc.add(zzbbcVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc(zzbbc zzbbcVar) {
        synchronized (this.zzb) {
            try {
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    zzbbc zzbbcVar2 = (zzbbc) it.next();
                    if (!com.google.android.gms.ads.internal.zzu.zzo().zzi().zzP()) {
                        if (!zzbbcVar.equals(zzbbcVar2) && zzbbcVar2.zzd().equals(zzbbcVar.zzd())) {
                            it.remove();
                            return true;
                        }
                    } else if (!com.google.android.gms.ads.internal.zzu.zzo().zzi().zzQ() && !zzbbcVar.equals(zzbbcVar2) && zzbbcVar2.zzf().equals(zzbbcVar.zzf())) {
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

    public final boolean zzd(zzbbc zzbbcVar) {
        synchronized (this.zzb) {
            try {
                if (this.zzc.contains(zzbbcVar)) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
