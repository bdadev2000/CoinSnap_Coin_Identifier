package com.bytedance.sdk.openadsdk.multipro.zp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.HWF.zp.HWF;
import com.bytedance.sdk.openadsdk.core.COT;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.multipro.jU;
import com.bytedance.sdk.openadsdk.utils.YhE;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class zp {
    private static final ConcurrentHashMap<String, Object> lMd = new ConcurrentHashMap<>();
    public static HWF zp;

    public static HWF zp(Context context) {
        if (context == null) {
            try {
                KVG.zp();
            } catch (Throwable unused) {
                YhE.ku("binder error");
            }
        }
        if (zp == null) {
            if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                zp = HWF.zp.zp(com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp().zp(5));
            } else {
                zp = com.bytedance.sdk.openadsdk.multipro.aidl.zp.HWF.lMd();
            }
        }
        return zp;
    }

    private static String zp() {
        return AbstractC2914a.h(new StringBuilder(), jU.lMd, "/t_db/ttopensdk.db/");
    }

    public static void zp(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (zp(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                COT.zp(context).zp().zp(str, (String) null, contentValues);
                return;
            }
            HWF zp2 = zp(context);
            if (zp2 != null) {
                zp2.zp(Uri.parse(zp() + str), contentValues);
            }
        }
    }

    public static int zp(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (zp(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                return COT.zp(context).zp().zp(str, str2, strArr);
            }
            HWF zp2 = zp(context);
            if (zp2 != null) {
                return zp2.zp(Uri.parse(zp() + str), str2, strArr);
            }
            return 0;
        }
    }

    public static int zp(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (zp(str)) {
                if (!com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                    return COT.zp(context).zp().zp(str, contentValues, str2, strArr);
                }
                HWF zp2 = zp(context);
                if (zp2 != null) {
                    return zp2.zp(Uri.parse(zp() + str), contentValues, str2, strArr);
                }
            }
        }
        return 0;
    }

    public static Map<String, List<String>> zp(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (zp(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                return zp(COT.zp(context).zp().zp(str, strArr, str2, strArr2, str3, str4, str5));
            }
            HWF zp2 = zp(context);
            if (zp2 != null) {
                return zp2.zp(Uri.parse(zp() + str), strArr, str2, strArr2, str5);
            }
            return null;
        }
    }

    public static Map<String, List<String>> zp(Cursor cursor) {
        HashMap hashMap = new HashMap();
        if (cursor != null) {
            try {
                String[] columnNames = cursor.getColumnNames();
                while (cursor.getCount() > 0 && cursor.moveToNext()) {
                    for (String str : columnNames) {
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, new LinkedList());
                        }
                        ((List) hashMap.get(str)).add(cursor.getString(cursor.getColumnIndex(str)));
                    }
                }
            } catch (Throwable unused) {
            }
            cursor.close();
        }
        return hashMap;
    }

    private static Object zp(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = lMd;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (zp.class) {
            try {
                obj = concurrentHashMap.get(str);
                if (obj == null) {
                    obj = new Object();
                    concurrentHashMap.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
