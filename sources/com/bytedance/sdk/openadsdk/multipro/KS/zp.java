package com.bytedance.sdk.openadsdk.multipro.KS;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.HWF.zp.HWF;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.multipro.jU;
import java.util.Objects;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class zp implements com.bytedance.sdk.openadsdk.multipro.zp {
    private static String COT() {
        return AbstractC2914a.h(new StringBuilder(), jU.lMd, "/t_frequent/");
    }

    public static String KS() {
        if (KVG.zp() == null) {
            return null;
        }
        try {
            HWF jU = jU();
            if (jU != null) {
                return jU.zp(Uri.parse(COT() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static HWF jU() {
        try {
            if (KVG.zp() != null) {
                return com.bytedance.sdk.openadsdk.multipro.zp.zp.zp(KVG.zp());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean lMd() {
        if (KVG.zp() == null) {
            return false;
        }
        try {
            HWF jU = jU();
            if (jU != null) {
                return "true".equals(jU.zp(Uri.parse(COT() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public int zp(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public int zp(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public Cursor zp(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public Uri zp(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    public static boolean zp(String str) {
        if (KVG.zp() == null) {
            return false;
        }
        try {
            HWF jU = jU();
            if (jU != null) {
                return "true".equals(jU.zp(Uri.parse(COT() + "checkFrequency?rit=" + str)));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    @NonNull
    public String zp() {
        return "t_frequent";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public String zp(@NonNull Uri uri) {
        Objects.toString(uri);
        String str = uri.getPath().split("/")[2];
        if ("checkFrequency".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.jU.zp.zp().zp(uri.getQueryParameter("rit")) ? "true" : "false";
        }
        if ("isSilent".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.jU.zp.zp().lMd() ? "true" : "false";
        }
        if ("maxRit".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.jU.zp.zp().KS();
        }
        return null;
    }
}
