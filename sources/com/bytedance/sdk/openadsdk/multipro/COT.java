package com.bytedance.sdk.openadsdk.multipro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class COT implements zp {
    private static final List<zp> KS;
    private static WeakReference<Context> lMd;
    private static volatile COT zp;

    static {
        List<zp> synchronizedList = Collections.synchronizedList(new ArrayList());
        KS = synchronizedList;
        synchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.jU.KS());
        synchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.zp.lMd());
        synchronizedList.add(new com.bytedance.sdk.openadsdk.multipro.KS.zp());
        synchronizedList.add(new com.bytedance.sdk.openadsdk.lMd.zp.COT(new com.bytedance.sdk.component.HWF.zp.lMd.lMd.lMd()));
        Iterator<zp> it = synchronizedList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private COT() {
    }

    private boolean KS(Uri uri) {
        return true;
    }

    private zp lMd(Uri uri) {
        if (uri == null || !KS(uri)) {
            return null;
        }
        String[] split = uri.getPath().split("/");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (zp zpVar : KS) {
            if (str.equals(zpVar.zp())) {
                return zpVar;
            }
        }
        return null;
    }

    public static COT zp(Context context) {
        if (context != null) {
            lMd = new WeakReference<>(context.getApplicationContext());
        }
        if (zp == null) {
            synchronized (COT.class) {
                try {
                    if (zp == null) {
                        zp = new COT();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    @NonNull
    public String zp() {
        return "";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public Cursor zp(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        try {
            zp lMd2 = lMd(uri);
            if (lMd2 != null) {
                return lMd2.zp(uri, strArr, str, strArr2, str2);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public String zp(@NonNull Uri uri) {
        try {
            zp lMd2 = lMd(uri);
            if (lMd2 != null) {
                return lMd2.zp(uri);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public Uri zp(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        try {
            zp lMd2 = lMd(uri);
            if (lMd2 != null) {
                return lMd2.zp(uri, contentValues);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public int zp(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        try {
            zp lMd2 = lMd(uri);
            if (lMd2 != null) {
                return lMd2.zp(uri, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public int zp(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        try {
            zp lMd2 = lMd(uri);
            if (lMd2 != null) {
                return lMd2.zp(uri, contentValues, str, strArr);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
