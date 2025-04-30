package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzgw extends zzgv {
    private final byte[] zza;

    @Nullable
    private Uri zzb;
    private int zzc;
    private int zzd;
    private boolean zze;

    public zzgw(byte[] bArr) {
        super(false);
        zzeq.zzd(bArr.length > 0);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.zzd;
        if (i11 == 0) {
            return -1;
        }
        int min = Math.min(i10, i11);
        System.arraycopy(this.zza, this.zzc, bArr, i9, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhh zzhhVar) throws IOException {
        this.zzb = zzhhVar.zza;
        zzi(zzhhVar);
        long j7 = zzhhVar.zze;
        int length = this.zza.length;
        if (j7 <= length) {
            int i9 = (int) j7;
            this.zzc = i9;
            int i10 = length - i9;
            this.zzd = i10;
            long j9 = zzhhVar.zzf;
            if (j9 != -1) {
                this.zzd = (int) Math.min(i10, j9);
            }
            this.zze = true;
            zzj(zzhhVar);
            long j10 = zzhhVar.zzf;
            if (j10 != -1) {
                return j10;
            }
            return this.zzd;
        }
        throw new zzhc(2008);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        if (this.zze) {
            this.zze = false;
            zzh();
        }
        this.zzb = null;
    }
}
