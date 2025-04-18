package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzfgd {
    public zzfgd() {
        try {
            zzggr.zza();
        } catch (GeneralSecurityException e2) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e2.toString()));
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        byte[] bArr;
        try {
            zzggf zzb = zzggf.zzb(zzgfz.zza(zzgnv.zzb().zza("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzgfp.zzb(zzb, zzgfo.zzb(byteArrayOutputStream));
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e2) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e2.toString()));
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "CryptoUtils.generateKey");
            bArr = new byte[0];
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdsh zzdshVar) {
        zzggf zzc = zzc(str);
        if (zzc != null) {
            try {
                byte[] zza = ((zzgfm) zzc.zzd(zzgpa.zzd(), zzgfm.class)).zza(bArr, bArr2);
                zzdshVar.zzb().put("ds", "1");
                return new String(zza, "UTF-8");
            } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e2) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e2.toString()));
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "CryptoUtils.decrypt");
                zzdshVar.zzb().put("dsf", e2.toString());
            }
        }
        return null;
    }

    private static final zzggf zzc(String str) {
        try {
            try {
                return zzgfp.zza(zzgfn.zzb(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e2) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e2.toString()));
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "CryptoUtils.getHandle");
            return null;
        }
    }
}
