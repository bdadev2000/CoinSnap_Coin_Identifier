package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzgyf implements zzggy {
    private final zzgyx zza;
    private final zzghw zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzgyf(zzgyx zzgyxVar, zzghw zzghwVar, int i9, byte[] bArr) {
        this.zza = zzgyxVar;
        this.zzb = zzghwVar;
        this.zzc = i9;
        this.zzd = bArr;
    }

    public static zzggy zzb(zzgiq zzgiqVar) throws GeneralSecurityException {
        zzgxy zzgxyVar = new zzgxy(zzgiqVar.zzd().zzd(zzghh.zza()), zzgiqVar.zzb().zzd());
        String valueOf = String.valueOf(zzgiqVar.zzb().zzg());
        return new zzgyf(zzgxyVar, new zzgzb(new zzgza("HMAC".concat(valueOf), new SecretKeySpec(zzgiqVar.zze().zzd(zzghh.zza()), "HMAC")), zzgiqVar.zzb().zze()), zzgiqVar.zzb().zze(), zzgiqVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzggy
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int i9 = this.zzc;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length2 >= i9 + length) {
            if (zzgra.zzc(bArr3, bArr)) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, this.zzd.length, length2 - this.zzc);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length2 - this.zzc, length2);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                if (MessageDigest.isEqual(((zzgzb) this.zzb).zzc(zzgyd.zzb(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), copyOfRange2)) {
                    return this.zza.zza(copyOfRange);
                }
                throw new GeneralSecurityException("invalid MAC");
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
    }
}
