package com.bytedance.sdk.openadsdk.lG;

import android.content.Context;
import android.location.Address;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.YoT;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.utils.Sco;
import java.util.Map;

/* loaded from: classes.dex */
public class Sg implements com.bytedance.sdk.component.DSW.tN.Sg {
    public static String YFl = "sp_multi_ttadnet_config";
    private final Context Sg;

    public Sg(Context context) {
        this.Sg = context;
    }

    @Override // com.bytedance.sdk.component.DSW.tN.Sg
    public int AlY() {
        return BuildConfig.VERSION_CODE;
    }

    @Override // com.bytedance.sdk.component.DSW.tN.Sg
    public String Sg() {
        return "pangle_sdk";
    }

    @Override // com.bytedance.sdk.component.DSW.tN.Sg
    public Address YFl(Context context) {
        return null;
    }

    @Override // com.bytedance.sdk.component.DSW.tN.Sg
    public String tN() {
        return "android";
    }

    @Override // com.bytedance.sdk.component.DSW.tN.Sg
    public String[] vc() {
        String[] strArr = {"tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com", "tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com"};
        String mB = lG.AlY().mB();
        if (!TextUtils.isEmpty(mB)) {
            if ("SG".equals(mB) || "CN".equals(mB)) {
                return new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"};
            }
            return strArr;
        }
        int rkt = Sco.rkt();
        if (rkt == 2 || rkt == 1) {
            return new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"};
        }
        return strArr;
    }

    @Override // com.bytedance.sdk.component.DSW.tN.Sg
    public String wN() {
        return YoT.YFl(this.Sg);
    }

    @Override // com.bytedance.sdk.component.DSW.tN.Sg
    public int YFl() {
        return Integer.parseInt("1371");
    }

    @Override // com.bytedance.sdk.component.DSW.tN.Sg
    public String YFl(Context context, String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.AlY.YFl.Sg(YFl, str, str2);
    }

    @Override // com.bytedance.sdk.component.DSW.tN.Sg
    public void YFl(Context context, Map<String, ?> map) {
        if (map != null) {
            try {
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl(YFl, entry.getKey(), (Integer) value);
                    } else if (value instanceof Long) {
                        com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl(YFl, entry.getKey(), (Long) value);
                    } else if (value instanceof Float) {
                        com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl(YFl, entry.getKey(), (Float) value);
                    } else if (value instanceof Boolean) {
                        com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl(YFl, entry.getKey(), (Boolean) value);
                    } else if (value instanceof String) {
                        com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl(YFl, entry.getKey(), (String) value);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
