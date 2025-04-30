package com.bytedance.sdk.openadsdk.dislike;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.woN;
import java.util.List;

/* loaded from: classes.dex */
public class zp {
    private static volatile zp zp;
    private final woN<com.bytedance.sdk.openadsdk.lMd.zp> lMd = KVG.KS();

    private zp() {
    }

    public static zp zp() {
        if (zp == null) {
            synchronized (zp.class) {
                try {
                    if (zp == null) {
                        zp = new zp();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    public void zp(@NonNull String str, List<FilterWord> list) {
        zp(str, list, null, null);
    }

    public void zp(@NonNull String str, List<FilterWord> list, String str2, String str3) {
        this.lMd.zp(str, list, str2, str3);
    }
}
