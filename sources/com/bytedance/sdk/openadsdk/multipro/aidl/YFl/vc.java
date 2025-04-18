package com.bytedance.sdk.openadsdk.multipro.aidl.YFl;

import android.content.ContentValues;
import android.net.Uri;
import com.bytedance.sdk.component.vc.YFl.vc;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.settings.YoT;
import java.util.Map;

/* loaded from: classes.dex */
public class vc extends vc.YFl {
    private static volatile vc YFl;

    public static vc Sg() {
        if (YFl == null) {
            synchronized (vc.class) {
                if (YFl == null) {
                    YFl = new vc();
                }
            }
        }
        return YFl;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.vc
    public Map YFl(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!YoT.YFl()) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.YFl.YFl.YFl(com.bytedance.sdk.openadsdk.multipro.wN.YFl(lG.YFl()).YFl(uri, strArr, str, strArr2, str2));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.vc.YFl.vc
    public String YFl(Uri uri) {
        if (YoT.YFl()) {
            return com.bytedance.sdk.openadsdk.multipro.wN.YFl(lG.YFl()).YFl(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.vc
    public String YFl(Uri uri, ContentValues contentValues) {
        Uri YFl2;
        if (YoT.YFl() && (YFl2 = com.bytedance.sdk.openadsdk.multipro.wN.YFl(lG.YFl()).YFl(uri, contentValues)) != null) {
            return YFl2.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.vc
    public int YFl(Uri uri, String str, String[] strArr) {
        if (YoT.YFl()) {
            return com.bytedance.sdk.openadsdk.multipro.wN.YFl(lG.YFl()).YFl(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.vc
    public int YFl(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (YoT.YFl()) {
            return com.bytedance.sdk.openadsdk.multipro.wN.YFl(lG.YFl()).YFl(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
