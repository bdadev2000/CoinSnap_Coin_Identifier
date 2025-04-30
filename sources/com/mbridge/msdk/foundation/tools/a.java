package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class a {
    private static byte[] b = new byte[32];

    /* renamed from: a, reason: collision with root package name */
    private static byte[] f15974a = new byte[16];

    /* renamed from: com.mbridge.msdk.foundation.tools.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0162a extends Provider {
        public C0162a() {
            super("Crypto", 1.0d, "HARMONY (SHA1 digest; SecureRandom; SHA1withDSA signature)");
            put("SecureRandom.SHA1PRNG", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl");
            put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
        }
    }

    static {
        if (!TextUtils.isEmpty("ebmclXzZOhtU2sRlZxGL8A")) {
            try {
                byte[] digest = MessageDigest.getInstance("sha-384").digest("ebmclXzZOhtU2sRlZxGL8A".getBytes());
                System.arraycopy(digest, 0, b, 0, 32);
                System.arraycopy(digest, 32, f15974a, 0, 16);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    public static String a(String str) {
        return a(str, b, f15974a);
    }

    private static String a(String str, byte[] bArr, byte[] bArr2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Security.addProvider(new C0162a());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return new String(Base64.encode(cipher.doFinal(str.getBytes()), 0));
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }
}
