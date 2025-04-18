package com.bytedance.sdk.openadsdk.core.YoT.YFl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.YoT.Sg.tN;
import com.bytedance.sdk.openadsdk.utils.GS;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class Sg {
    protected double AlY;
    protected final Context Sg;
    public int YFl;
    protected int tN;

    /* renamed from: vc, reason: collision with root package name */
    public YFl f10656vc;
    public int wN;

    /* loaded from: classes.dex */
    public static class YFl {
        public int Sg;
        public int YFl;
        public boolean tN;
    }

    public Sg(Context context, int i10, int i11) {
        this.tN = 0;
        this.AlY = 0.0d;
        if (i11 > 0 && i10 > 0) {
            this.AlY = i10 / i11;
        }
        float wN = GS.wN(context);
        if (wN != 0.0f && i10 > 0) {
            this.tN = (int) (i10 / wN);
        }
        this.Sg = context.getApplicationContext();
    }

    public String Sg(String str, List<tN> list) {
        String str2;
        int i10 = this.YFl;
        if (i10 >= 5) {
            return null;
        }
        this.YFl = i10 + 1;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.DSW.Sg.Sg tN = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().tN();
            tN.Sg(str);
            com.bytedance.sdk.component.DSW.Sg YFl2 = tN.YFl();
            str2 = YFl2.AlY();
            try {
                YFl2.YFl();
            } catch (Exception e2) {
                e = e2;
                YFl(e, 0);
                if (!list.isEmpty()) {
                    tN.Sg(list, com.bytedance.sdk.openadsdk.core.YoT.YFl.YFl.WRAPPER_TIMEOUT, -1L, null);
                }
                return str2;
            }
        } catch (Exception e10) {
            e = e10;
            str2 = null;
        }
        return str2;
    }

    public abstract com.bytedance.sdk.openadsdk.core.YoT.YFl YFl(String str, List<tN> list);

    public void YFl(Exception exc, int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put("error_code", i10);
            com.bytedance.sdk.openadsdk.pDU.tN.YFl().YFl("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    public boolean YFl(@Nullable String str) {
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
