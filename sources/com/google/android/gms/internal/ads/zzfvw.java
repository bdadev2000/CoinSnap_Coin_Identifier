package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.adjust.sdk.Constants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public final class zzfvw {
    public static String zza(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Constants.SHA256);
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
