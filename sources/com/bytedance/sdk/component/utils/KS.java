package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class KS {
    private static HashMap<String, ArrayList<String>> zp = new HashMap<>();

    private static Signature[] lMd(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception e4) {
            tG.lMd(e4.toString());
            return null;
        }
    }

    public static ArrayList<String> zp(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (zp.get(str) != null) {
                return zp.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : lMd(context, packageName)) {
                    String str2 = "error!";
                    if (SameMD5.TAG.equals(str)) {
                        str2 = zp(signature, SameMD5.TAG);
                    } else if ("SHA1".equals(str)) {
                        str2 = zp(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        str2 = zp(signature, "SHA256");
                    }
                    arrayList.add(str2);
                }
            } catch (Exception e4) {
                tG.lMd(e4.toString());
            }
            zp.put(str, arrayList);
        }
        return arrayList;
    }

    public static String zp(Context context) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> zp2 = zp(context, "SHA1");
        if (zp2 != null && zp2.size() != 0) {
            for (int i9 = 0; i9 < zp2.size(); i9++) {
                sb.append(zp2.get(i9));
                if (i9 < zp2.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private static String zp(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest == null) {
                return "error!";
            }
            byte[] digest = messageDigest.digest(byteArray);
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 255) | NotificationCompat.FLAG_LOCAL_ONLY).substring(1, 3).toUpperCase());
                sb.append(":");
            }
            return sb.substring(0, sb.length() - 1).toString();
        } catch (Exception e4) {
            tG.lMd(e4.toString());
            return "error!";
        }
    }
}
