package com.bytedance.sdk.openadsdk.multipro.tN;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.vc.YFl.vc;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.multipro.AlY;
import java.util.Objects;
import vd.e;

/* loaded from: classes.dex */
public class YFl implements com.bytedance.sdk.openadsdk.multipro.YFl {
    private static vc AlY() {
        try {
            if (lG.YFl() != null) {
                return com.bytedance.sdk.openadsdk.multipro.YFl.YFl.YFl(lG.YFl());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean Sg() {
        if (lG.YFl() == null) {
            return false;
        }
        try {
            vc AlY = AlY();
            if (AlY != null) {
                return "true".equals(AlY.YFl(Uri.parse(wN() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String tN() {
        if (lG.YFl() == null) {
            return null;
        }
        try {
            vc AlY = AlY();
            if (AlY != null) {
                return AlY.YFl(Uri.parse(wN() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static String wN() {
        return e.h(new StringBuilder(), AlY.Sg, "/t_frequent/");
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public int YFl(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public int YFl(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public Cursor YFl(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public Uri YFl(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    @NonNull
    public String YFl() {
        return "t_frequent";
    }

    public static boolean YFl(String str) {
        if (lG.YFl() == null) {
            return false;
        }
        try {
            vc AlY = AlY();
            if (AlY != null) {
                return "true".equals(AlY.YFl(Uri.parse(wN() + "checkFrequency?rit=" + str)));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public String YFl(@NonNull Uri uri) {
        Objects.toString(uri);
        String str = uri.getPath().split("/")[2];
        if ("checkFrequency".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.DSW.YFl.YFl().YFl(uri.getQueryParameter("rit")) ? "true" : "false";
        }
        if ("isSilent".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.DSW.YFl.YFl().Sg() ? "true" : "false";
        }
        if ("maxRit".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.DSW.YFl.YFl().tN();
        }
        return null;
    }
}
