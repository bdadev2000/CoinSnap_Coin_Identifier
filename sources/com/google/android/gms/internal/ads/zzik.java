package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzik {

    @Nullable
    public byte[] zza;

    @Nullable
    public byte[] zzb;
    public int zzc;

    @Nullable
    public int[] zzd;

    @Nullable
    public int[] zze;
    public int zzf;
    public int zzg;
    public int zzh;
    private final MediaCodec.CryptoInfo zzi;

    @Nullable
    private final zzij zzj;

    public zzik() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.zzi = cryptoInfo;
        this.zzj = zzgd.zza >= 24 ? new zzij(cryptoInfo, null) : null;
    }

    public final MediaCodec.CryptoInfo zza() {
        return this.zzi;
    }

    public final void zzb(int i9) {
        if (i9 == 0) {
            return;
        }
        if (this.zzd == null) {
            int[] iArr = new int[1];
            this.zzd = iArr;
            this.zzi.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.zzd;
        iArr2[0] = iArr2[0] + i9;
    }

    public final void zzc(int i9, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        this.zzf = i9;
        this.zzd = iArr;
        this.zze = iArr2;
        this.zzb = bArr;
        this.zza = bArr2;
        this.zzc = i10;
        this.zzg = i11;
        this.zzh = i12;
        MediaCodec.CryptoInfo cryptoInfo = this.zzi;
        cryptoInfo.numSubSamples = i9;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i10;
        if (zzgd.zza >= 24) {
            zzij zzijVar = this.zzj;
            zzijVar.getClass();
            zzij.zza(zzijVar, i11, i12);
        }
    }
}
