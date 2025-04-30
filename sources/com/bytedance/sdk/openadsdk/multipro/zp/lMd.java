package com.bytedance.sdk.openadsdk.multipro.zp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.COT;
import com.bytedance.sdk.openadsdk.core.KVG;

/* loaded from: classes.dex */
public class lMd implements com.bytedance.sdk.openadsdk.multipro.zp {
    private static final Object lMd = new Object();
    private Context zp;

    private boolean lMd(Uri uri) {
        return uri == null || TextUtils.isEmpty(uri.getPath());
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    @NonNull
    public String zp() {
        return "t_db";
    }

    private Context lMd() {
        Context context = this.zp;
        return context == null ? KVG.zp() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public Cursor zp(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        synchronized (lMd) {
            try {
                if (lMd(uri)) {
                    return null;
                }
                String[] split = uri.getPath().split("/");
                if (split != null && split.length >= 4) {
                    String str3 = split[2];
                    String str4 = split[3];
                    if (!"ttopensdk.db".equals(str3)) {
                        return null;
                    }
                    return COT.zp(lMd()).zp().zp(str4, strArr, str, strArr2, null, null, str2);
                }
                return null;
            } finally {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public String zp(@NonNull Uri uri) {
        synchronized (lMd) {
            try {
                if (lMd(uri)) {
                    return null;
                }
                String[] split = uri.getPath().split("/");
                if (split != null && split.length >= 5) {
                    String str = split[2];
                    String str2 = split[4];
                    if ("ttopensdk.db".equals(str)) {
                        if ("execSQL".equals(str2)) {
                            String queryParameter = uri.getQueryParameter("sql");
                            if (!TextUtils.isEmpty(queryParameter)) {
                                COT.zp(lMd()).zp().zp(Uri.decode(queryParameter));
                            }
                        } else if ("transactionBegin".equals(str2)) {
                            COT.zp(lMd()).zp().lMd();
                        } else if ("transactionSetSuccess".equals(str2)) {
                            COT.zp(lMd()).zp().KS();
                        } else if ("transactionEnd".equals(str2)) {
                            COT.zp(lMd()).zp().jU();
                        }
                    }
                    return null;
                }
                return null;
            } finally {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public Uri zp(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        synchronized (lMd) {
            try {
                if (lMd(uri)) {
                    return null;
                }
                String[] split = uri.getPath().split("/");
                if (split != null && split.length >= 4) {
                    String str = split[2];
                    String str2 = split[3];
                    if ("ttopensdk.db".equals(str)) {
                        COT.zp(lMd()).zp().zp(str2, (String) null, contentValues);
                    }
                    return null;
                }
                return null;
            } finally {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public int zp(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        synchronized (lMd) {
            try {
                if (lMd(uri)) {
                    return 0;
                }
                String[] split = uri.getPath().split("/");
                if (split != null && split.length >= 4) {
                    String str2 = split[2];
                    String str3 = split[3];
                    if (!"ttopensdk.db".equals(str2)) {
                        return 0;
                    }
                    return COT.zp(lMd()).zp().zp(str3, str, strArr);
                }
                return 0;
            } finally {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public int zp(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        synchronized (lMd) {
            try {
                if (lMd(uri)) {
                    return 0;
                }
                String[] split = uri.getPath().split("/");
                if (split != null && split.length >= 4) {
                    String str2 = split[2];
                    String str3 = split[3];
                    if (!"ttopensdk.db".equals(str2)) {
                        return 0;
                    }
                    return COT.zp(lMd()).zp().zp(str3, contentValues, str, strArr);
                }
                return 0;
            } finally {
            }
        }
    }
}
