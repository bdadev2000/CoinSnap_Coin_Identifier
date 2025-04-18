package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzgkq implements zzggt {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = new byte[0];
    private static final Set zzc;
    private final String zzd;
    private final zzggt zze;

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
    public zzgkq(zzgwf zzgwfVar, zzggt zzggtVar) throws GeneralSecurityException {
        if (!zzc.contains(zzgwfVar.zzi())) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.input.a.A("Unsupported DEK key type: ", zzgwfVar.zzi(), ". Only Tink AEAD key types are supported."));
        }
        this.zzd = zzgwfVar.zzi();
        zzgwe zzc2 = zzgwf.zzc(zzgwfVar);
        zzc2.zza(zzgxf.RAW);
        zzghy.zza(((zzgwf) zzc2.zzbr()).zzaV());
        this.zze = zzggtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggt
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i2 = wrap.getInt();
            if (i2 <= 0 || i2 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i2];
            wrap.get(bArr3, 0, i2);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            byte[] zza2 = this.zze.zza(bArr3, zzb);
            String str = this.zzd;
            zzgzs zzgzsVar = zzgzs.zzb;
            return ((zzggt) zzgpn.zza().zzc(zzgpq.zzc().zza(zzgqr.zza(str, zzgzs.zzv(zza2, 0, zza2.length), zzgwa.SYMMETRIC, zzgxf.RAW, null), zzghc.zza()), zzggt.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
