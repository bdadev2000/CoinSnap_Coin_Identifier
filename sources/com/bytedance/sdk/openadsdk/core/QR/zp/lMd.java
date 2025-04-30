package com.bytedance.sdk.openadsdk.core.QR.zp;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.QR.lMd.KS;
import com.bytedance.sdk.openadsdk.utils.WNy;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class lMd {
    public int COT;
    public zp HWF;
    protected int KS;
    protected double jU;
    protected final Context lMd;
    public int zp;

    /* loaded from: classes.dex */
    public static class zp {
        public boolean KS;
        public int lMd;
        public int zp;
    }

    public lMd(Context context, int i9, int i10) {
        this.KS = 0;
        this.jU = 0.0d;
        if (i10 > 0 && i9 > 0) {
            this.jU = i9 / i10;
        }
        float COT = WNy.COT(context);
        if (COT != 0.0f && i9 > 0) {
            this.KS = (int) (i9 / COT);
        }
        this.lMd = context.getApplicationContext();
    }

    public String lMd(String str, List<KS> list) {
        String str2;
        int i9 = this.zp;
        if (i9 >= 5) {
            return null;
        }
        this.zp = i9 + 1;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.QR.lMd.lMd KS = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().KS();
            KS.lMd(str);
            com.bytedance.sdk.component.QR.lMd zp2 = KS.zp();
            str2 = zp2.jU();
            try {
                zp2.zp();
            } catch (Exception e4) {
                e = e4;
                zp(e, 0);
                if (!list.isEmpty()) {
                    KS.lMd(list, com.bytedance.sdk.openadsdk.core.QR.zp.zp.WRAPPER_TIMEOUT, -1L, null);
                }
                return str2;
            }
        } catch (Exception e9) {
            e = e9;
            str2 = null;
        }
        return str2;
    }

    public abstract com.bytedance.sdk.openadsdk.core.QR.zp zp(String str, List<KS> list);

    public void zp(Exception exc, int i9) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put("error_code", i9);
            com.bytedance.sdk.openadsdk.dT.KS.zp().zp("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    public boolean zp(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Integer.parseInt(str) < 2;
        } catch (NumberFormatException unused) {
            return true;
        }
    }
}
