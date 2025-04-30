package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzzv {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzzo[] zzd = new zzzo[100];

    public zzzv(boolean z8, int i9) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzzo zzb() {
        zzzo zzzoVar;
        try {
            this.zzb++;
            int i9 = this.zzc;
            if (i9 > 0) {
                zzzo[] zzzoVarArr = this.zzd;
                int i10 = i9 - 1;
                this.zzc = i10;
                zzzoVar = zzzoVarArr[i10];
                zzzoVar.getClass();
                zzzoVarArr[i10] = null;
            } else {
                zzzoVar = new zzzo(new byte[65536], 0);
                int i11 = this.zzb;
                zzzo[] zzzoVarArr2 = this.zzd;
                int length = zzzoVarArr2.length;
                if (i11 > length) {
                    this.zzd = (zzzo[]) Arrays.copyOf(zzzoVarArr2, length + length);
                    return zzzoVar;
                }
            }
            return zzzoVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc(zzzo zzzoVar) {
        zzzo[] zzzoVarArr = this.zzd;
        int i9 = this.zzc;
        this.zzc = i9 + 1;
        zzzoVarArr[i9] = zzzoVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(@Nullable zzzp zzzpVar) {
        while (zzzpVar != null) {
            try {
                zzzo[] zzzoVarArr = this.zzd;
                int i9 = this.zzc;
                this.zzc = i9 + 1;
                zzzoVarArr[i9] = zzzpVar.zzc();
                this.zzb--;
                zzzpVar = zzzpVar.zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i9) {
        int i10 = this.zza;
        this.zza = i9;
        if (i9 < i10) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i9 = this.zza;
        int i10 = zzgd.zza;
        int max = Math.max(0, ((i9 + 65535) / 65536) - this.zzb);
        int i11 = this.zzc;
        if (max >= i11) {
            return;
        }
        Arrays.fill(this.zzd, max, i11, (Object) null);
        this.zzc = max;
    }
}
