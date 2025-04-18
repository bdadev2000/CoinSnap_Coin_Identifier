package com.bytedance.sdk.openadsdk.multipro.YFl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.vc.YFl.vc;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.wN;
import com.bytedance.sdk.openadsdk.multipro.AlY;
import com.bytedance.sdk.openadsdk.utils.Sco;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import vd.e;

/* loaded from: classes.dex */
public class YFl {
    private static final ConcurrentHashMap<String, Object> Sg = new ConcurrentHashMap<>();
    public static vc YFl;

    public static vc YFl(Context context) {
        if (context == null) {
            try {
                lG.YFl();
            } catch (Throwable unused) {
                Sco.qsH("binder error");
            }
        }
        if (YFl == null) {
            if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                YFl = vc.YFl.YFl(com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl().YFl(5));
            } else {
                YFl = com.bytedance.sdk.openadsdk.multipro.aidl.YFl.vc.Sg();
            }
        }
        return YFl;
    }

    private static String YFl() {
        return e.h(new StringBuilder(), AlY.Sg, "/t_db/ttopensdk.db/");
    }

    public static void YFl(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (YFl(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                wN.YFl(context).YFl().YFl(str, (String) null, contentValues);
                return;
            }
            vc YFl2 = YFl(context);
            if (YFl2 != null) {
                YFl2.YFl(Uri.parse(YFl() + str), contentValues);
            }
        }
    }

    public static int YFl(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (YFl(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                return wN.YFl(context).YFl().YFl(str, str2, strArr);
            }
            vc YFl2 = YFl(context);
            if (YFl2 != null) {
                return YFl2.YFl(Uri.parse(YFl() + str), str2, strArr);
            }
            return 0;
        }
    }

    public static int YFl(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (YFl(str)) {
                if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                    return wN.YFl(context).YFl().YFl(str, contentValues, str2, strArr);
                }
                vc YFl2 = YFl(context);
                if (YFl2 != null) {
                    return YFl2.YFl(Uri.parse(YFl() + str), contentValues, str2, strArr);
                }
            }
        }
        return 0;
    }

    public static Map<String, List<String>> YFl(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (YFl(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                return YFl(wN.YFl(context).YFl().YFl(str, strArr, str2, strArr2, str3, str4, str5));
            }
            vc YFl2 = YFl(context);
            if (YFl2 != null) {
                return YFl2.YFl(Uri.parse(YFl() + str), strArr, str2, strArr2, str5);
            }
            return null;
        }
    }

    public static Map<String, List<String>> YFl(Cursor cursor) {
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

    private static Object YFl(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = Sg;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (YFl.class) {
            obj = concurrentHashMap.get(str);
            if (obj == null) {
                obj = new Object();
                concurrentHashMap.put(str, obj);
            }
        }
        return obj;
    }
}
