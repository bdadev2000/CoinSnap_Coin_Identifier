package com.bytedance.sdk.openadsdk.core.NjR;

import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class Sg {
    private static com.bytedance.sdk.openadsdk.core.NjR.YFl YFl;
    private String Sg;

    /* loaded from: classes.dex */
    public static class YFl {
        private static final Sg YFl = new Sg();
    }

    public String AlY() {
        String AlY;
        com.bytedance.sdk.openadsdk.core.NjR.YFl yFl = YFl;
        if (yFl != null && (AlY = yFl.AlY()) != null) {
            return AlY;
        }
        return "";
    }

    public int DSW() {
        com.bytedance.sdk.openadsdk.core.NjR.YFl yFl = YFl;
        if (yFl != null) {
            return yFl.DSW();
        }
        return 1;
    }

    public void Sg(String str) {
        com.bytedance.sdk.openadsdk.core.NjR.YFl yFl;
        if (TextUtils.isEmpty(str) || (yFl = YFl) == null) {
            return;
        }
        yFl.Sg(str);
    }

    public void YFl(String str) {
        com.bytedance.sdk.openadsdk.core.NjR.YFl yFl;
        if (TextUtils.isEmpty(str) || (yFl = YFl) == null) {
            return;
        }
        yFl.YFl(str);
    }

    public void tN(@NonNull String str) {
        com.bytedance.sdk.openadsdk.core.NjR.YFl yFl = YFl;
        if (yFl != null) {
            yFl.tN(str);
        }
    }

    public long vc() {
        com.bytedance.sdk.openadsdk.core.NjR.YFl yFl = YFl;
        if (yFl != null) {
            return yFl.vc();
        }
        return 0L;
    }

    public String wN() {
        com.bytedance.sdk.openadsdk.core.NjR.YFl yFl = YFl;
        if (yFl != null) {
            return yFl.wN();
        }
        return "";
    }

    private Sg() {
        this.Sg = null;
        YFl = new com.bytedance.sdk.openadsdk.core.NjR.YFl();
    }

    public boolean tN() {
        com.bytedance.sdk.openadsdk.core.NjR.YFl yFl = YFl;
        if (yFl == null) {
            return false;
        }
        return yFl.Sg();
    }

    public static Sg Sg() {
        return YFl.YFl;
    }

    public void YFl() {
        com.bytedance.sdk.openadsdk.core.NjR.YFl yFl = YFl;
        if (yFl != null) {
            yFl.tN();
        }
    }

    public Map<String, String> YFl(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.NjR.YFl yFl = YFl;
        if (yFl != null) {
            return yFl.YFl(str, bArr);
        }
        return new HashMap();
    }

    public void YFl(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.NjR.YFl yFl = YFl;
        if (yFl != null) {
            yFl.YFl(motionEvent);
        }
    }
}
