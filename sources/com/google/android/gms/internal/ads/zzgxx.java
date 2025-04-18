package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzgxx implements zzggt {
    private final zzgyp zza;
    private final zzghr zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzgxx(zzgyp zzgypVar, zzghr zzghrVar, int i2, byte[] bArr) {
        this.zza = zzgypVar;
        this.zzb = zzghrVar;
        this.zzc = i2;
        this.zzd = bArr;
    }

    public static zzggt zzb(zzgik zzgikVar) throws GeneralSecurityException {
        zzgxq zzgxqVar = new zzgxq(zzgikVar.zzd().zzd(zzghc.zza()), zzgikVar.zzb().zzd());
        String valueOf = String.valueOf(zzgikVar.zzb().zzg());
        return new zzgxx(zzgxqVar, new zzgyu(new zzgyt("HMAC".concat(valueOf), new SecretKeySpec(zzgikVar.zze().zzd(zzghc.zza()), "HMAC")), zzgikVar.zzb().zze()), zzgikVar.zzb().zze(), zzgikVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzggt
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int i2 = this.zzc;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length2 < i2 + length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzgrg.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, this.zzd.length, length2 - this.zzc);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length2 - this.zzc, length2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((zzgyu) this.zzb).zzc(zzgxv.zzb(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), copyOfRange2)) {
            return this.zza.zza(copyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
