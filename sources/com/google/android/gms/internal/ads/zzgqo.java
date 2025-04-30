package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class zzgqo {
    private static final ThreadLocal zza = new zzgqn();

    public static /* synthetic */ SecureRandom zza() {
        SecureRandom zzc = zzc();
        zzc.nextLong();
        return zzc;
    }

    public static byte[] zzb(int i9) {
        byte[] bArr = new byte[i9];
        ((SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }

    private static SecureRandom zzc() {
        try {
            try {
                try {
                    try {
                        try {
                            return SecureRandom.getInstance("SHA1PRNG", ProviderInstaller.PROVIDER_NAME);
                        } catch (ClassNotFoundException e4) {
                            e = e4;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        } catch (IllegalAccessException e9) {
                            e = e9;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        } catch (IllegalArgumentException e10) {
                            e = e10;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        } catch (NoSuchMethodException e11) {
                            e = e11;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        } catch (InvocationTargetException e12) {
                            e = e12;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        }
                    } catch (GeneralSecurityException unused) {
                        return SecureRandom.getInstance("SHA1PRNG", (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null));
                    }
                } catch (GeneralSecurityException unused2) {
                    return SecureRandom.getInstance("SHA1PRNG", "AndroidOpenSSL");
                }
            } catch (GeneralSecurityException unused3) {
                return SecureRandom.getInstance("SHA1PRNG", "Conscrypt");
            }
        } catch (GeneralSecurityException unused4) {
            return new SecureRandom();
        }
    }
}
