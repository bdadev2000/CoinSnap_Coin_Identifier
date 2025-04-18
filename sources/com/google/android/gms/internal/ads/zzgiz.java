package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzgiz implements zzgfm {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = new byte[0];
    private static final Set zzc;
    private final String zzd;
    private final zzgfm zze;

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
    public zzgiz(zzgue zzgueVar, zzgfm zzgfmVar) throws GeneralSecurityException {
        if (zzc.contains(zzgueVar.zzi())) {
            this.zzd = zzgueVar.zzi();
            zzguc zzb2 = zzgue.zzb(zzgueVar);
            zzb2.zza(zzgve.RAW);
            zzggp.zza(((zzgue) zzb2.zzbr()).zzaV());
            this.zze = zzgfmVar;
            return;
        }
        throw new IllegalArgumentException(e.f("Unsupported DEK key type: ", zzgueVar.zzi(), ". Only Tink AEAD key types are supported."));
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i10 = wrap.getInt();
            if (i10 > 0 && i10 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i10];
                wrap.get(bArr3, 0, i10);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                byte[] zza2 = this.zze.zza(bArr3, zzb);
                String str = this.zzd;
                zzgxp zzgxpVar = zzgxp.zzb;
                return ((zzgfm) zzgnw.zza().zzc(zzgnz.zzc().zza(zzgow.zza(str, zzgxp.zzv(zza2, 0, zza2.length), zzgty.SYMMETRIC, zzgve.RAW, null), zzgfv.zza()), zzgfm.class)).zza(bArr4, bArr2);
            }
            throw new GeneralSecurityException("invalid ciphertext");
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e2) {
            throw new GeneralSecurityException("invalid ciphertext", e2);
        }
    }
}
