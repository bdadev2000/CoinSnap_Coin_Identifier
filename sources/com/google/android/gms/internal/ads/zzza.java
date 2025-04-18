package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
public final class zzza {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzyt[] zzd = new zzyt[100];

    public zzza(boolean z2, int i2) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzyt zzb() {
        zzyt zzytVar;
        try {
            this.zzb++;
            int i2 = this.zzc;
            if (i2 > 0) {
                zzyt[] zzytVarArr = this.zzd;
                int i3 = i2 - 1;
                this.zzc = i3;
                zzytVar = zzytVarArr[i3];
                zzytVar.getClass();
                zzytVarArr[i3] = null;
            } else {
                zzytVar = new zzyt(new byte[65536], 0);
                int i4 = this.zzb;
                zzyt[] zzytVarArr2 = this.zzd;
                int length = zzytVarArr2.length;
                if (i4 > length) {
                    this.zzd = (zzyt[]) Arrays.copyOf(zzytVarArr2, length + length);
                    return zzytVar;
                }
            }
            return zzytVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc(zzyt zzytVar) {
        zzyt[] zzytVarArr = this.zzd;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        zzytVarArr[i2] = zzytVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(@Nullable zzyu zzyuVar) {
        while (zzyuVar != null) {
            try {
                zzyt[] zzytVarArr = this.zzd;
                int i2 = this.zzc;
                this.zzc = i2 + 1;
                zzytVarArr[i2] = zzyuVar.zzc();
                this.zzb--;
                zzyuVar = zzyuVar.zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i2) {
        int i3 = this.zza;
        this.zza = i2;
        if (i2 < i3) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i2 = this.zza;
        int i3 = zzeu.zza;
        int max = Math.max(0, ((i2 + Settings.DEFAULT_INITIAL_WINDOW_SIZE) / 65536) - this.zzb);
        int i4 = this.zzc;
        if (max >= i4) {
            return;
        }
        Arrays.fill(this.zzd, max, i4, (Object) null);
        this.zzc = max;
    }
}
