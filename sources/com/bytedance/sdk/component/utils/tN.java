package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.UByte;

/* loaded from: classes.dex */
public class tN {
    private static HashMap<String, ArrayList<String>> YFl = new HashMap<>();

    private static Signature[] Sg(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception e2) {
            YoT.Sg(e2.toString());
            return null;
        }
    }

    public static ArrayList<String> YFl(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (YFl.get(str) != null) {
                return YFl.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : Sg(context, packageName)) {
                    String str2 = "error!";
                    if (SameMD5.TAG.equals(str)) {
                        str2 = YFl(signature, SameMD5.TAG);
                    } else if ("SHA1".equals(str)) {
                        str2 = YFl(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        str2 = YFl(signature, "SHA256");
                    }
                    arrayList.add(str2);
                }
            } catch (Exception e2) {
                YoT.Sg(e2.toString());
            }
            YFl.put(str, arrayList);
        }
        return arrayList;
    }

    public static String YFl(Context context) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList<String> YFl2 = YFl(context, "SHA1");
        if (YFl2 != null && YFl2.size() != 0) {
            for (int i10 = 0; i10 < YFl2.size(); i10++) {
                sb2.append(YFl2.get(i10));
                if (i10 < YFl2.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }

    private static String YFl(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest == null) {
                return "error!";
            }
            byte[] digest = messageDigest.digest(byteArray);
            StringBuilder sb2 = new StringBuilder();
            for (byte b3 : digest) {
                sb2.append(Integer.toHexString((b3 & UByte.MAX_VALUE) | NotificationCompat.FLAG_LOCAL_ONLY).substring(1, 3).toUpperCase());
                sb2.append(":");
            }
            return sb2.substring(0, sb2.length() - 1).toString();
        } catch (Exception e2) {
            YoT.Sg(e2.toString());
            return "error!";
        }
    }
}
