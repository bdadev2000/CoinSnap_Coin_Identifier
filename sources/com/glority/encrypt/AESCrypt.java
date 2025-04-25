package com.glority.encrypt;

import android.content.Context;
import android.util.Base64;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AESCrypt {
    private static byte[] SEED_32_CHARACTER;
    private static final Map<String, ThreadLocal<Cipher>> map = Collections.synchronizedMap(new HashMap());
    private static boolean sEnabled = true;
    private boolean enabled;

    private Cipher getCipher(String str) {
        Map<String, ThreadLocal<Cipher>> map2 = map;
        if (map2.containsKey(str)) {
            return map2.get(str).get();
        }
        ThreadLocal<Cipher> threadLocal = new ThreadLocal<Cipher>() { // from class: com.glority.encrypt.AESCrypt.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            public Cipher initialValue() {
                try {
                    return Cipher.getInstance("AES/ECB/PKCS5Padding");
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        };
        map2.put(str, threadLocal);
        return threadLocal.get();
    }

    private Cipher getDefaultCipher() {
        return getCipher(new String(SEED_32_CHARACTER));
    }

    public AESCrypt(Context context) throws Exception {
        getSeed32Character(context);
        this.enabled = sEnabled;
    }

    public static void setEnabled(boolean z) {
        sEnabled = z;
    }

    private static byte[] getSeed32Character(Context context) {
        if (SEED_32_CHARACTER == null) {
            SEED_32_CHARACTER = Encrypt.getPrivateKey(context);
        }
        return SEED_32_CHARACTER;
    }

    public String encryptToString(String str) throws Exception {
        Cipher defaultCipher = getDefaultCipher();
        defaultCipher.init(1, new SecretKeySpec(SEED_32_CHARACTER, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM));
        return Base64.encodeToString(defaultCipher.doFinal(str.getBytes(StandardCharsets.UTF_8)), 2);
    }

    public byte[] encrypt(String str) throws Exception {
        Cipher defaultCipher = getDefaultCipher();
        defaultCipher.init(1, new SecretKeySpec(SEED_32_CHARACTER, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM));
        return Base64.encode(defaultCipher.doFinal(str.getBytes(StandardCharsets.UTF_8)), 2);
    }

    public byte[] encrypt(String str, String str2) throws Exception {
        Cipher cipher = getCipher(str2);
        cipher.init(1, new SecretKeySpec(str2.getBytes(), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM));
        return Base64.encode(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)), 2);
    }

    public byte[] decrypt(byte[] bArr) throws Exception {
        Cipher defaultCipher = getDefaultCipher();
        defaultCipher.init(2, new SecretKeySpec(SEED_32_CHARACTER, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM));
        return defaultCipher.doFinal(bArr);
    }

    public byte[] decrypt(byte[] bArr, String str) throws Exception {
        Cipher cipher = getCipher(str);
        cipher.init(2, new SecretKeySpec(str.getBytes(), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM));
        return cipher.doFinal(bArr);
    }

    public String decryptString(String str) throws Exception {
        Cipher defaultCipher = getDefaultCipher();
        defaultCipher.init(2, new SecretKeySpec(SEED_32_CHARACTER, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM));
        return new String(defaultCipher.doFinal(Base64.decode(str, 2)), StandardCharsets.UTF_8);
    }

    public JSONObject decryptResponse(String str) throws Exception {
        if (this.enabled) {
            String decryptString = decryptString(str);
            if ("[]".equals(decryptString)) {
                return new JSONObject();
            }
            return new JSONObject(decryptString);
        }
        return new JSONObject(str);
    }

    public Map<String, Object> encryptParams(Map<String, Object> map2) throws Exception {
        if (!this.enabled) {
            return map2;
        }
        String encryptToString = encryptToString(new JSONObject(map2).toString());
        HashMap hashMap = new HashMap();
        hashMap.put("ciphertext", encryptToString);
        return hashMap;
    }
}
