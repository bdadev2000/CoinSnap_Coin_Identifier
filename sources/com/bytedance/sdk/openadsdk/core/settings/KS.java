package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes.dex */
public class KS {
    private static String KS = null;
    private static int jU = 0;
    private static volatile String lMd = "";
    private static volatile String zp = "";

    public static String KS() {
        if (jU != 0) {
            return lMd;
        }
        zp();
        return lMd;
    }

    public static String jU() {
        if (TextUtils.isEmpty(KS)) {
            KS = KVG.zp().getPackageManager().getInstallerPackageName(YhE.COT());
        }
        if (KS == null) {
            KS = "";
        }
        return KS;
    }

    public static String lMd() {
        if (jU != 0) {
            return zp;
        }
        zp();
        return zp;
    }

    public static void zp() {
        try {
            AppSet.getClient(KVG.zp()).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                @Keep
                public void onSuccess(AppSetIdInfo appSetIdInfo) {
                    String unused = KS.zp = Integer.toString(appSetIdInfo.getScope());
                    String unused2 = KS.lMd = appSetIdInfo.getId();
                    int unused3 = KS.jU = 1;
                }
            });
        } catch (Throwable unused) {
            jU = 2;
        }
    }
}
