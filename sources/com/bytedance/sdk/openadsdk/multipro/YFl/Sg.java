package com.bytedance.sdk.openadsdk.multipro.YFl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.wN;

/* loaded from: classes.dex */
public class Sg implements com.bytedance.sdk.openadsdk.multipro.YFl {
    private static final Object Sg = new Object();
    private Context YFl;

    private boolean Sg(Uri uri) {
        return uri == null || TextUtils.isEmpty(uri.getPath());
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    @NonNull
    public String YFl() {
        return "t_db";
    }

    private Context Sg() {
        Context context = this.YFl;
        return context == null ? lG.YFl() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public Cursor YFl(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        synchronized (Sg) {
            if (Sg(uri)) {
                return null;
            }
            String[] split = uri.getPath().split("/");
            if (split != null && split.length >= 4) {
                String str3 = split[2];
                String str4 = split[3];
                if (!"ttopensdk.db".equals(str3)) {
                    return null;
                }
                return wN.YFl(Sg()).YFl().YFl(str4, strArr, str, strArr2, null, null, str2);
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public String YFl(@NonNull Uri uri) {
        synchronized (Sg) {
            if (Sg(uri)) {
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
                            wN.YFl(Sg()).YFl().YFl(Uri.decode(queryParameter));
                        }
                    } else if ("transactionBegin".equals(str2)) {
                        wN.YFl(Sg()).YFl().Sg();
                    } else if ("transactionSetSuccess".equals(str2)) {
                        wN.YFl(Sg()).YFl().tN();
                    } else if ("transactionEnd".equals(str2)) {
                        wN.YFl(Sg()).YFl().AlY();
                    }
                }
                return null;
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public Uri YFl(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        synchronized (Sg) {
            if (Sg(uri)) {
                return null;
            }
            String[] split = uri.getPath().split("/");
            if (split != null && split.length >= 4) {
                String str = split[2];
                String str2 = split[3];
                if ("ttopensdk.db".equals(str)) {
                    wN.YFl(Sg()).YFl().YFl(str2, (String) null, contentValues);
                }
                return null;
            }
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public int YFl(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        synchronized (Sg) {
            if (Sg(uri)) {
                return 0;
            }
            String[] split = uri.getPath().split("/");
            if (split != null && split.length >= 4) {
                String str2 = split[2];
                String str3 = split[3];
                if (!"ttopensdk.db".equals(str2)) {
                    return 0;
                }
                return wN.YFl(Sg()).YFl().YFl(str3, str, strArr);
            }
            return 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public int YFl(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        synchronized (Sg) {
            if (Sg(uri)) {
                return 0;
            }
            String[] split = uri.getPath().split("/");
            if (split != null && split.length >= 4) {
                String str2 = split[2];
                String str3 = split[3];
                if (!"ttopensdk.db".equals(str2)) {
                    return 0;
                }
                return wN.YFl(Sg()).YFl().YFl(str3, contentValues, str, strArr);
            }
            return 0;
        }
    }
}
