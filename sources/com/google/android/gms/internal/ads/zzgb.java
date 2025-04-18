package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzgb extends zzfz {

    @Nullable
    private Uri zza;

    @Nullable
    private byte[] zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private final zzga zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgb(byte[] bArr) {
        super(false);
        zzga zzgaVar = new zzga(bArr);
        this.zzf = zzgaVar;
        zzdi.zzd(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.zzd;
        if (i4 == 0) {
            return -1;
        }
        int min = Math.min(i3, i4);
        byte[] bArr2 = this.zzb;
        zzdi.zzb(bArr2);
        System.arraycopy(bArr2, this.zzc, bArr, i2, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(zzgm zzgmVar) throws IOException {
        zzi(zzgmVar);
        this.zza = zzgmVar.zza;
        byte[] bArr = this.zzf.zza;
        this.zzb = bArr;
        long j2 = zzgmVar.zze;
        int length = bArr.length;
        if (j2 > length) {
            throw new zzgh(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i2 = (int) j2;
        this.zzc = i2;
        int i3 = length - i2;
        this.zzd = i3;
        long j3 = zzgmVar.zzf;
        if (j3 != -1) {
            this.zzd = (int) Math.min(i3, j3);
        }
        this.zze = true;
        zzj(zzgmVar);
        long j4 = zzgmVar.zzf;
        return j4 != -1 ? j4 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    @Nullable
    public final Uri zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzd() {
        if (this.zze) {
            this.zze = false;
            zzh();
        }
        this.zza = null;
        this.zzb = null;
    }
}
