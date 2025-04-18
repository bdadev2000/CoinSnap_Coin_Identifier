package com.mbridge.msdk.newreward.function.h;

import android.text.TextUtils;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String path = new URL(str).getPath();
            return path.substring(path.lastIndexOf(47) + 1);
        } catch (Exception unused) {
            return str;
        }
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ai.i(str);
    }

    public static boolean c(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String[] split2 = str.split("_");
            if (split2.length < 4) {
                return false;
            }
            String str2 = split2[3];
            if (!TextUtils.isEmpty(str2) && (split = x.a(str2).split("\\|")) != null) {
                if (split.length != 0) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static double d(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return 0.0d;
        }
        try {
            split = str.split("_");
        } catch (Exception unused) {
        }
        if (split.length < 4) {
            return 0.0d;
        }
        String str2 = split[3];
        if (TextUtils.isEmpty(str2)) {
            return 0.0d;
        }
        String[] split2 = x.a(str2).split("\\|");
        if (split2.length > 0) {
            return Double.parseDouble(split2[0]);
        }
        return 0.0d;
    }

    public static String a(File file) {
        StringBuilder sb2 = new StringBuilder();
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                        for (int read = fileInputStream2.read(bArr); read > 0; read = fileInputStream2.read(bArr)) {
                            sb2.append(new String(bArr, 0, read));
                        }
                        fileInputStream2.close();
                    } catch (Exception unused) {
                        fileInputStream = fileInputStream2;
                        sb2.setLength(0);
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return sb2.toString();
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception unused3) {
            }
        } catch (Exception unused4) {
        }
        return sb2.toString();
    }

    public static void a(final String str, final int i10, final int i11, final int i12) {
        MBridgeTaskManager.commonExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.h.a.1
            @Override // java.lang.Runnable
            public final void run() {
                int i13;
                try {
                    JSONObject jSONObject = new JSONObject();
                    int i14 = 1;
                    jSONObject.put("ivRewardEnable", 1);
                    if (i10 == com.mbridge.msdk.foundation.same.a.G) {
                        i13 = 0;
                    } else {
                        i13 = 1;
                    }
                    jSONObject.put("ivRewardMode", i13);
                    if (i11 == com.mbridge.msdk.foundation.same.a.I) {
                        i14 = 0;
                    }
                    jSONObject.put("ivRewardPlayValueMode", i14);
                    jSONObject.put("ivRewardPlayValue", i12);
                    h.a().f(str, jSONObject.toString());
                } catch (Exception unused) {
                }
            }
        });
    }
}
