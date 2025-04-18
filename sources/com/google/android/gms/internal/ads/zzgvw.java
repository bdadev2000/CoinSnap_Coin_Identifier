package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class zzgvw implements zzgfm {
    private final zzgwm zza;
    private final zzggi zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzgvw(zzgwm zzgwmVar, zzggi zzggiVar, int i10, byte[] bArr) {
        this.zza = zzgwmVar;
        this.zzb = zzggiVar;
        this.zzc = i10;
        this.zzd = bArr;
    }

    public static zzgfm zzb(zzgha zzghaVar) throws GeneralSecurityException {
        zzgvp zzgvpVar = new zzgvp(zzghaVar.zzd().zzd(zzgfv.zza()), zzghaVar.zzb().zzd());
        String valueOf = String.valueOf(zzghaVar.zzb().zzg());
        return new zzgvw(zzgvpVar, new zzgwr(new zzgwq("HMAC".concat(valueOf), new SecretKeySpec(zzghaVar.zze().zzd(zzgfv.zza()), "HMAC")), zzghaVar.zzb().zze()), zzghaVar.zzb().zze(), zzghaVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int i10 = this.zzc;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length2 >= i10 + length) {
            if (zzgpj.zzc(bArr3, bArr)) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, this.zzd.length, length2 - this.zzc);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length2 - this.zzc, length2);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                if (MessageDigest.isEqual(((zzgwr) this.zzb).zzc(zzgvu.zzb(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), copyOfRange2)) {
                    return this.zza.zza(copyOfRange);
                }
                throw new GeneralSecurityException("invalid MAC");
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
    }
}
