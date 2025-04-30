package com.bytedance.sdk.openadsdk.Bj;

import android.content.Context;
import android.location.Address;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.Bj;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.utils.YhE;
import java.util.Map;

/* loaded from: classes.dex */
public class lMd implements com.bytedance.sdk.component.QR.KS.lMd {
    public static String zp = "sp_multi_ttadnet_config";
    private final Context lMd;

    public lMd(Context context) {
        this.lMd = context;
    }

    @Override // com.bytedance.sdk.component.QR.KS.lMd
    public String COT() {
        return Bj.zp(this.lMd);
    }

    @Override // com.bytedance.sdk.component.QR.KS.lMd
    public String[] HWF() {
        String[] strArr = {"tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com", "tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com"};
        String BO = KVG.jU().BO();
        if (!TextUtils.isEmpty(BO)) {
            if ("SG".equals(BO) || "CN".equals(BO)) {
                return new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"};
            }
            return strArr;
        }
        int KVG = YhE.KVG();
        if (KVG == 2 || KVG == 1) {
            return new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"};
        }
        return strArr;
    }

    @Override // com.bytedance.sdk.component.QR.KS.lMd
    public String KS() {
        return "android";
    }

    @Override // com.bytedance.sdk.component.QR.KS.lMd
    public int jU() {
        return 6003;
    }

    @Override // com.bytedance.sdk.component.QR.KS.lMd
    public String lMd() {
        return "pangle_sdk";
    }

    @Override // com.bytedance.sdk.component.QR.KS.lMd
    public Address zp(Context context) {
        return null;
    }

    @Override // com.bytedance.sdk.component.QR.KS.lMd
    public int zp() {
        return Integer.parseInt("1371");
    }

    @Override // com.bytedance.sdk.component.QR.KS.lMd
    public String zp(Context context, String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.jU.zp.lMd(zp, str, str2);
    }

    @Override // com.bytedance.sdk.component.QR.KS.lMd
    public void zp(Context context, Map<String, ?> map) {
        if (map != null) {
            try {
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        com.bytedance.sdk.openadsdk.multipro.jU.zp.zp(zp, entry.getKey(), (Integer) value);
                    } else if (value instanceof Long) {
                        com.bytedance.sdk.openadsdk.multipro.jU.zp.zp(zp, entry.getKey(), (Long) value);
                    } else if (value instanceof Float) {
                        com.bytedance.sdk.openadsdk.multipro.jU.zp.zp(zp, entry.getKey(), (Float) value);
                    } else if (value instanceof Boolean) {
                        com.bytedance.sdk.openadsdk.multipro.jU.zp.zp(zp, entry.getKey(), (Boolean) value);
                    } else if (value instanceof String) {
                        com.bytedance.sdk.openadsdk.multipro.jU.zp.zp(zp, entry.getKey(), (String) value);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
