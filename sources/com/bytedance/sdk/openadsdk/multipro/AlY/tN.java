package com.bytedance.sdk.openadsdk.multipro.AlY;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.openadsdk.core.lG;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* loaded from: classes.dex */
public class tN implements com.bytedance.sdk.openadsdk.multipro.YFl {
    private Context YFl;

    private Context Sg() {
        Context context = this.YFl;
        return context == null ? lG.YFl() : context;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    @NonNull
    public String YFl() {
        return "t_sp";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public Cursor YFl(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        Map<String, ?> tN;
        if (!uri.getPath().split("/")[2].equals("get_all") || (tN = Sg.tN(Sg(), uri.getQueryParameter("sp_file_name"))) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
        for (String str3 : tN.keySet()) {
            Object[] objArr = new Object[3];
            objArr[0] = str3;
            Object obj = tN.get(str3);
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

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public String YFl(@NonNull Uri uri) {
        String[] split = uri.getPath().split("/");
        String str = split[2];
        String str2 = split[3];
        if (str.equals("contain")) {
            return String.valueOf(Sg.YFl(lG.YFl(), uri.getQueryParameter("sp_file_name"), str2));
        }
        return Sg.YFl(Sg(), uri.getQueryParameter("sp_file_name"), str2, str);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public Uri YFl(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        String str = uri.getPath().split("/")[3];
        Object obj = contentValues.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (obj != null) {
            Sg.YFl(Sg(), uri.getQueryParameter("sp_file_name"), str, obj);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public int YFl(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        String[] split = uri.getPath().split("/");
        if (split[2].equals("clean")) {
            Sg.Sg(Sg(), uri.getQueryParameter("sp_file_name"));
            return 0;
        }
        String str2 = split[3];
        if (Sg.YFl(Sg(), uri.getQueryParameter("sp_file_name"), str2)) {
            Sg.Sg(Sg(), uri.getQueryParameter("sp_file_name"), str2);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public int YFl(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        YFl(uri, contentValues);
        return 0;
    }
}
