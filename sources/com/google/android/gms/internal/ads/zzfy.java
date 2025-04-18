package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzfy extends zzfw {

    @Nullable
    private Uri zza;

    @Nullable
    private byte[] zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private final zzfx zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfy(byte[] bArr) {
        super(false);
        zzfx zzfxVar = new zzfx(bArr);
        this.zzf = zzfxVar;
        zzdb.zzd(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.zzd;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        byte[] bArr2 = this.zzb;
        zzdb.zzb(bArr2);
        System.arraycopy(bArr2, this.zzc, bArr, i10, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws IOException {
        zzi(zzgiVar);
        this.zza = zzgiVar.zza;
        byte[] bArr = this.zzf.zza;
        this.zzb = bArr;
        long j3 = zzgiVar.zze;
        int length = bArr.length;
        if (j3 <= length) {
            int i10 = (int) j3;
            this.zzc = i10;
            int i11 = length - i10;
            this.zzd = i11;
            long j10 = zzgiVar.zzf;
            if (j10 != -1) {
                this.zzd = (int) Math.min(i11, j10);
            }
            this.zze = true;
            zzj(zzgiVar);
            long j11 = zzgiVar.zzf;
            if (j11 != -1) {
                return j11;
            }
            return this.zzd;
        }
        throw new zzge(2008);
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    @Nullable
    public final Uri zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() {
        if (this.zze) {
            this.zze = false;
            zzh();
        }
        this.zza = null;
        this.zzb = null;
    }
}
