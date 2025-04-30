package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzfid {
    public zzfid() {
        try {
            zzgig.zza();
        } catch (GeneralSecurityException e4) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e4.toString()));
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgzz zzt = zzhac.zzt();
        try {
            zzghb.zzb(zzght.zzb(zzghl.zza(zzgph.zzb().zza("AES128_GCM"))), zzgha.zzb(zzt));
        } catch (IOException | GeneralSecurityException e4) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e4.toString()));
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(zzt.zzb().zzB(), 11);
        zzt.zzc();
        return encodeToString;
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdux zzduxVar) {
        zzght zzc = zzc(str);
        if (zzc == null) {
            return null;
        }
        try {
            byte[] zza = ((zzggy) zzc.zzd(zzgqp.zza(), zzggy.class)).zza(bArr, bArr2);
            zzduxVar.zzb().put("ds", "1");
            return new String(zza, "UTF-8");
        } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e4) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e4.toString()));
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "CryptoUtils.decrypt");
            zzduxVar.zzb().put("dsf", e4.toString());
            return null;
        }
    }

    private static final zzght zzc(String str) {
        try {
            return zzghb.zza(zzggz.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e4) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e4.toString()));
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "CryptoUtils.getHandle");
            return null;
        }
    }
}
