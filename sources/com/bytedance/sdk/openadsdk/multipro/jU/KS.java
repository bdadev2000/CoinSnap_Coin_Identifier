package com.bytedance.sdk.openadsdk.multipro.jU;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* loaded from: classes.dex */
public class KS implements com.bytedance.sdk.openadsdk.multipro.zp {
    private Context zp;

    private Context lMd() {
        Context context = this.zp;
        if (context == null) {
            return KVG.zp();
        }
        return context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    @NonNull
    public String zp() {
        return "t_sp";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public Cursor zp(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        Map<String, ?> KS;
        if (!uri.getPath().split("/")[2].equals("get_all") || (KS = lMd.KS(lMd(), uri.getQueryParameter("sp_file_name"))) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
        for (String str3 : KS.keySet()) {
            Object[] objArr = new Object[3];
            objArr[0] = str3;
            Object obj = KS.get(str3);
            objArr[2] = obj;
            if (obj instanceof Boolean) {
                objArr[1] = "boolean";
            } else if (obj instanceof String) {
                objArr[1] = "string";
            } else if (obj instanceof Integer) {
                objArr[1] = "int";
            } else if (obj instanceof Long) {
                objArr[1] = Constants.LONG;
            } else if (obj instanceof Float) {
                objArr[1] = "float";
            }
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public String zp(@NonNull Uri uri) {
        String[] split = uri.getPath().split("/");
        String str = split[2];
        String str2 = split[3];
        if (str.equals("contain")) {
            return String.valueOf(lMd.zp(KVG.zp(), uri.getQueryParameter("sp_file_name"), str2));
        }
        return lMd.zp(lMd(), uri.getQueryParameter("sp_file_name"), str2, str);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public Uri zp(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        String str = uri.getPath().split("/")[3];
        Object obj = contentValues.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (obj != null) {
            lMd.zp(lMd(), uri.getQueryParameter("sp_file_name"), str, obj);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public int zp(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        String[] split = uri.getPath().split("/");
        if (split[2].equals("clean")) {
            lMd.lMd(lMd(), uri.getQueryParameter("sp_file_name"));
            return 0;
        }
        String str2 = split[3];
        if (lMd.zp(lMd(), uri.getQueryParameter("sp_file_name"), str2)) {
            lMd.lMd(lMd(), uri.getQueryParameter("sp_file_name"), str2);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public int zp(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        zp(uri, contentValues);
        return 0;
    }
}
