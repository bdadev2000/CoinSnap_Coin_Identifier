package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzgzc {
    private static final Pattern zza = Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
    private static final Pattern zzb = Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeyVersions/([0-9a-zA-Z\\-\\.\\_~])+$", 2);

    public static void zza(int i9) throws InvalidAlgorithmParameterException {
        if (i9 != 16 && i9 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i9 * 8)));
        }
    }
}
