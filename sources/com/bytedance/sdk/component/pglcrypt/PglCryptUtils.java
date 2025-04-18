package com.bytedance.sdk.component.pglcrypt;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PglCryptUtils {
    public static final int BASE64_FAILED = 504;
    public static final int COMPRESS_FAILED = 503;
    public static final int CRYPT_OK = 0;
    public static final int CYPHER_VERSION = 4;
    public static final int DECRYPT_FAILED = 506;
    public static final int ENCRYPT_FAILED = 505;
    public static final int INPUT_INVALID = 502;
    public static final String KEY_CYPHER = "cypher";
    public static final String KEY_MESSAGE = "message";
    public static final int LOAD_SO_FAILED = 501;
    private static volatile boolean Sg = true;
    private static volatile PglCryptUtils YFl;

    private PglCryptUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[Catch: Exception -> 0x0061, TRY_LEAVE, TryCatch #7 {Exception -> 0x0061, blocks: (B:36:0x005d, B:29:0x0065), top: B:35:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] YFl(java.lang.String r5) {
        /*
            java.lang.String r0 = "ARMOR"
            r1 = 0
            if (r5 == 0) goto L74
            int r2 = r5.length()
            if (r2 != 0) goto Ld
            goto L74
        Ld:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            r2.<init>()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L35
            java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.lang.String r4 = "utf-8"
            byte[] r5 = r5.getBytes(r4)     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L59
            r3.write(r5)     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L59
            r3.close()     // Catch: java.lang.Exception -> L45
            byte[] r1 = r2.toByteArray()     // Catch: java.lang.Exception -> L45
            r2.close()     // Catch: java.lang.Exception -> L45
            goto L58
        L2b:
            r5 = move-exception
            goto L38
        L2d:
            r5 = move-exception
            goto L5b
        L2f:
            r5 = move-exception
            r3 = r1
            goto L38
        L32:
            r5 = move-exception
            r2 = r1
            goto L5b
        L35:
            r5 = move-exception
            r2 = r1
            r3 = r2
        L38:
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L59
            android.util.Log.e(r0, r5)     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L47
            r3.close()     // Catch: java.lang.Exception -> L45
            goto L47
        L45:
            r5 = move-exception
            goto L51
        L47:
            if (r2 == 0) goto L58
            byte[] r1 = r2.toByteArray()     // Catch: java.lang.Exception -> L45
            r2.close()     // Catch: java.lang.Exception -> L45
            goto L58
        L51:
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r0, r5)
        L58:
            return r1
        L59:
            r5 = move-exception
            r1 = r3
        L5b:
            if (r1 == 0) goto L63
            r1.close()     // Catch: java.lang.Exception -> L61
            goto L63
        L61:
            r1 = move-exception
            goto L6c
        L63:
            if (r2 == 0) goto L73
            r2.toByteArray()     // Catch: java.lang.Exception -> L61
            r2.close()     // Catch: java.lang.Exception -> L61
            goto L73
        L6c:
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r0, r1)
        L73:
            throw r5
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.pglcrypt.PglCryptUtils.YFl(java.lang.String):byte[]");
    }

    public static native byte[] bc(int i10, byte[] bArr);

    public static PglCryptUtils getInstance() {
        if (YFl == null) {
            synchronized (PglCryptUtils.class) {
                if (YFl == null) {
                    try {
                        System.loadLibrary("pglarmor");
                    } catch (Throwable unused) {
                        Sg = false;
                    }
                    YFl = new PglCryptUtils();
                }
            }
        }
        return YFl;
    }

    public Pair<Integer, String> cypher4Decrypt(String str) {
        byte[] bArr;
        if (!Sg) {
            return new Pair<>(Integer.valueOf(LOAD_SO_FAILED), null);
        }
        if (str != null && str.length() != 0) {
            byte[] decode = Base64.decode(str, 0);
            if (decode != null && decode.length != 0) {
                try {
                    bArr = bc(1011, decode);
                } catch (Throwable th2) {
                    Log.e("ARMOR", th2.toString());
                    bArr = null;
                }
                if (bArr != null && bArr.length != 0) {
                    String YFl2 = YFl(bArr);
                    if (TextUtils.isEmpty(YFl2)) {
                        return new Pair<>(Integer.valueOf(COMPRESS_FAILED), null);
                    }
                    return new Pair<>(0, YFl2);
                }
                return new Pair<>(Integer.valueOf(DECRYPT_FAILED), null);
            }
            return new Pair<>(Integer.valueOf(BASE64_FAILED), null);
        }
        return new Pair<>(Integer.valueOf(INPUT_INVALID), null);
    }

    public Pair<Integer, JSONObject> cypher4Encrypt(JSONObject jSONObject) throws JSONException {
        byte[] bArr;
        if (!Sg) {
            return new Pair<>(Integer.valueOf(LOAD_SO_FAILED), null);
        }
        if (jSONObject == null) {
            return new Pair<>(Integer.valueOf(INPUT_INVALID), null);
        }
        byte[] YFl2 = YFl(jSONObject.toString());
        if (YFl2 != null && YFl2.length != 0) {
            try {
                bArr = bc(1010, YFl2);
            } catch (Throwable th2) {
                Log.e("ARMOR", th2.toString());
                bArr = null;
            }
            if (bArr != null && bArr.length != 0) {
                String encodeToString = Base64.encodeToString(bArr, 0);
                JSONObject jSONObject2 = new JSONObject();
                if (TextUtils.isEmpty(encodeToString)) {
                    return new Pair<>(Integer.valueOf(BASE64_FAILED), null);
                }
                jSONObject2.put(KEY_MESSAGE, encodeToString);
                jSONObject2.put("cypher", 4);
                return new Pair<>(0, jSONObject2);
            }
            return new Pair<>(Integer.valueOf(ENCRYPT_FAILED), null);
        }
        return new Pair<>(Integer.valueOf(COMPRESS_FAILED), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.zip.GZIPInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r8v9 */
    private static String YFl(byte[] bArr) {
        ?? r32;
        Throwable th2;
        ?? r82;
        Exception exc;
        String str;
        String str2 = null;
        str2 = null;
        r1 = null;
        GZIPInputStream gZIPInputStream = null;
        if (bArr != 0) {
            try {
                if (bArr.length != 0) {
                    try {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                        bArr = new ByteArrayOutputStream();
                        try {
                            r32 = new GZIPInputStream(byteArrayInputStream);
                            try {
                                byte[] bArr2 = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                                while (true) {
                                    int read = r32.read(bArr2);
                                    if (read == -1) {
                                        break;
                                    }
                                    bArr.write(bArr2, 0, read);
                                }
                                str2 = bArr.toString("utf-8");
                                byteArrayInputStream.close();
                                try {
                                    r32.close();
                                    bArr.close();
                                    bArr = bArr;
                                } catch (Exception e2) {
                                    String obj = e2.toString();
                                    Log.e("ARMOR", obj);
                                    bArr = obj;
                                }
                            } catch (Exception e10) {
                                str = str2;
                                gZIPInputStream = r32;
                                exc = e10;
                                r82 = bArr;
                                Log.e("ARMOR", exc.toString());
                                if (gZIPInputStream != null) {
                                    try {
                                        gZIPInputStream.close();
                                    } catch (Exception e11) {
                                        r82 = e11.toString();
                                        Log.e("ARMOR", r82);
                                        str2 = str;
                                        bArr = r82;
                                        return str2;
                                    }
                                }
                                if (r82 != 0) {
                                    r82.close();
                                }
                                str2 = str;
                                bArr = r82;
                                return str2;
                            } catch (Throwable th3) {
                                th2 = th3;
                                if (r32 != null) {
                                    try {
                                        r32.close();
                                    } catch (Exception e12) {
                                        Log.e("ARMOR", e12.toString());
                                        throw th2;
                                    }
                                }
                                if (bArr != 0) {
                                    bArr.close();
                                }
                                throw th2;
                            }
                        } catch (Exception e13) {
                            exc = e13;
                            str = null;
                            r82 = bArr;
                        }
                    } catch (Exception e14) {
                        r82 = 0;
                        exc = e14;
                        str = null;
                    } catch (Throwable th4) {
                        r32 = null;
                        th2 = th4;
                        bArr = 0;
                    }
                    return str2;
                }
            } catch (Throwable th5) {
                r32 = str2;
                th2 = th5;
            }
        }
        return null;
    }

    public Pair<Integer, byte[]> cypher4Encrypt(byte[] bArr) {
        byte[] bArr2;
        if (!Sg) {
            return new Pair<>(Integer.valueOf(LOAD_SO_FAILED), null);
        }
        if (bArr != null && bArr.length != 0) {
            try {
                bArr2 = bc(1010, bArr);
            } catch (Throwable th2) {
                Log.e("ARMOR", th2.toString());
                bArr2 = null;
            }
            if (bArr2 != null && bArr2.length != 0) {
                return new Pair<>(0, bArr2);
            }
            return new Pair<>(Integer.valueOf(ENCRYPT_FAILED), null);
        }
        return new Pair<>(Integer.valueOf(INPUT_INVALID), null);
    }
}
