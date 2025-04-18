package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes.dex */
public class AlY {
    private static volatile int AlY = 0;
    private static volatile String Sg = "";
    private static volatile String YFl = "";
    private static String tN;

    public static String AlY() {
        if (TextUtils.isEmpty(tN)) {
            tN = lG.YFl().getPackageManager().getInstallerPackageName(Sco.wN());
        }
        if (tN == null) {
            tN = "";
        }
        return tN;
    }

    public static String tN() {
        if (AlY != 0) {
            return Sg;
        }
        YFl();
        return Sg;
    }

    public static String Sg() {
        if (AlY != 0) {
            return YFl;
        }
        YFl();
        return YFl;
    }

    public static void YFl() {
        try {
            AppSet.getClient(lG.YFl()).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                @Keep
                public void onSuccess(AppSetIdInfo appSetIdInfo) {
                    String unused = AlY.YFl = Integer.toString(appSetIdInfo.getScope());
                    String unused2 = AlY.Sg = appSetIdInfo.getId();
                    int unused3 = AlY.AlY = 1;
                }
            });
        } catch (Throwable unused) {
            AlY = 2;
        }
    }
}
