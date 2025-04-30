package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzgkw implements zzggy {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = new byte[0];
    private static final Set zzc;
    private final String zzd;
    private final zzghx zze;
    private final zzggy zzf;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzc = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public zzgkw(zzgwm zzgwmVar, zzggy zzggyVar) throws GeneralSecurityException {
        if (zzc.contains(zzgwmVar.zzi())) {
            this.zzd = zzgwmVar.zzi();
            zzgwl zzc2 = zzgwm.zzc(zzgwmVar);
            zzc2.zza(zzgxn.RAW);
            this.zze = zzgie.zza(((zzgwm) zzc2.zzbr()).zzaV());
            this.zzf = zzggyVar;
            return;
        }
        throw new IllegalArgumentException(AbstractC2914a.e("Unsupported DEK key type: ", zzgwmVar.zzi(), ". Only Tink AEAD key types are supported."));
    }

    @Override // com.google.android.gms.internal.ads.zzggy
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i9 = wrap.getInt();
            if (i9 > 0 && i9 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i9];
                wrap.get(bArr3, 0, i9);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                byte[] zza2 = this.zzf.zza(bArr3, zzb);
                String str = this.zzd;
                zzhac zzhacVar = zzhac.zzb;
                return ((zzggy) zzgpi.zza().zzc(zzgpl.zzc().zza(zzgql.zza(str, zzhac.zzv(zza2, 0, zza2.length), zzgwg.SYMMETRIC, zzgxn.RAW, null), zzghh.zza()), zzggy.class)).zza(bArr4, bArr2);
            }
            throw new GeneralSecurityException("invalid ciphertext");
        } catch (IndexOutOfBoundsException e4) {
            e = e4;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e9) {
            e = e9;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
