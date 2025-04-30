package com.bytedance.sdk.openadsdk.multipro.aidl.zp;

import android.content.ContentValues;
import android.net.Uri;
import com.bytedance.sdk.component.HWF.zp.HWF;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.settings.Bj;
import java.util.Map;

/* loaded from: classes.dex */
public class HWF extends HWF.zp {
    private static volatile HWF zp;

    public static HWF lMd() {
        if (zp == null) {
            synchronized (HWF.class) {
                try {
                    if (zp == null) {
                        zp = new HWF();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.HWF
    public Map zp(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!Bj.zp()) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.zp.zp.zp(com.bytedance.sdk.openadsdk.multipro.COT.zp(KVG.zp()).zp(uri, strArr, str, strArr2, str2));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.HWF.zp.HWF
    public String zp(Uri uri) {
        if (Bj.zp()) {
            return com.bytedance.sdk.openadsdk.multipro.COT.zp(KVG.zp()).zp(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.HWF
    public String zp(Uri uri, ContentValues contentValues) {
        Uri zp2;
        if (Bj.zp() && (zp2 = com.bytedance.sdk.openadsdk.multipro.COT.zp(KVG.zp()).zp(uri, contentValues)) != null) {
            return zp2.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.HWF
    public int zp(Uri uri, String str, String[] strArr) {
        if (Bj.zp()) {
            return com.bytedance.sdk.openadsdk.multipro.COT.zp(KVG.zp()).zp(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.HWF
    public int zp(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (Bj.zp()) {
            return com.bytedance.sdk.openadsdk.multipro.COT.zp(KVG.zp()).zp(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
