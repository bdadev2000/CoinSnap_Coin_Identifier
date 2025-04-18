package com.cooldev.gba.emulator.gameboy.features.paywalls.utils;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.network.models.SlackMessage;
import com.cooldev.gba.emulator.gameboy.network.repo.SlackApiRepositoryImpl;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PublicSignedData {
    public static final int $stable = 0;

    @NotNull
    private static final String BASE_64_ENCODED_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1cgvDL3kes40S016jNcKhPZzp5TDT1ZTnGyQS6HZAPgVgaxdeWTENcI0uIdeoO8l+YtdkfeIUjjlnfn7X4E19lnHeIv0E/QOdraxExv9XelsEh0OZfw9Bs0fKJNbQq51ESrPGUMEMbh/lomNMY05eaHwSIcH1Lt3yZ0E1tMmCOMtoIprqAlHWri8xhoTLysq8qEWKmC+m3kaQ5PMrcXxDa3Sh1hzUxJT+6Du7FlRuF52Yg1Yu2mRM+L9FzRPyvXWXT5pZlGqDePMkILI8pokUc2tKKtZ8woNjLaXz4lKirmVI2vC9hwaup5+W8YnR/cX5LJQjHLkXEMsWEvl5xyNDwIDAQAB";

    @NotNull
    public static final PublicSignedData INSTANCE = new PublicSignedData();

    @NotNull
    private static final String KEY_FACTORY_ALGORITHM = "RSA";

    @NotNull
    private static final String SIGNATURE_ALGORITHM = "SHA1withRSA";

    @NotNull
    private static final String TAG = "IABUtil/Security";

    private PublicSignedData() {
    }

    private final PublicKey generatePublicKey() throws IOException {
        try {
            PublicKey generatePublic = KeyFactory.getInstance(KEY_FACTORY_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode(BASE_64_ENCODED_PUBLIC_KEY, 0)));
            a.r(generatePublic, "generatePublic(...)");
            return generatePublic;
        } catch (Throwable th) {
            new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            String str = "Invalid key specification: " + th;
            Log.w(TAG, str);
            throw new IOException(str);
        }
    }

    private final boolean verify(PublicKey publicKey, String str, String str2) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            a.r(decode, "decode(...)");
            try {
                Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
                signature.initVerify(publicKey);
                byte[] bytes = str.getBytes(z0.a.f31458a);
                a.r(bytes, "getBytes(...)");
                signature.update(bytes);
                if (signature.verify(decode)) {
                    return true;
                }
                Log.w(TAG, "Signature verification failed...");
                return false;
            } catch (InvalidKeyException unused) {
                Log.w(TAG, "Invalid key specification.");
                return false;
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            } catch (SignatureException unused2) {
                Log.w(TAG, "Signature exception.");
                return false;
            }
        } catch (IllegalArgumentException unused3) {
            Log.w(TAG, "Base64 decoding failed.");
            return false;
        }
    }

    public final boolean verifyPurchase(@NotNull String str, @NotNull String str2) throws IOException {
        a.s(str, "signedData");
        a.s(str2, "signature");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(BASE_64_ENCODED_PUBLIC_KEY) && !TextUtils.isEmpty(str2)) {
            return verify(generatePublicKey(), str, str2);
        }
        Log.w(TAG, "Purchase verification failed: missing data.");
        return false;
    }
}
