package com.bytedance.sdk.openadsdk.core.COT;

import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class lMd {
    private static com.bytedance.sdk.openadsdk.core.COT.zp zp;
    private String lMd;

    /* loaded from: classes.dex */
    public static class zp {
        private static final lMd zp = new lMd();
    }

    public String COT() {
        com.bytedance.sdk.openadsdk.core.COT.zp zpVar = zp;
        if (zpVar != null) {
            return zpVar.COT();
        }
        return "";
    }

    public int HWF() {
        com.bytedance.sdk.openadsdk.core.COT.zp zpVar = zp;
        if (zpVar != null) {
            return zpVar.HWF();
        }
        return 1;
    }

    public void KS(@NonNull String str) {
        com.bytedance.sdk.openadsdk.core.COT.zp zpVar = zp;
        if (zpVar != null) {
            zpVar.KS(str);
        }
    }

    public String jU() {
        String jU;
        com.bytedance.sdk.openadsdk.core.COT.zp zpVar = zp;
        if (zpVar != null && (jU = zpVar.jU()) != null) {
            return jU;
        }
        return "";
    }

    public void lMd(String str) {
        com.bytedance.sdk.openadsdk.core.COT.zp zpVar;
        if (TextUtils.isEmpty(str) || (zpVar = zp) == null) {
            return;
        }
        zpVar.lMd(str);
    }

    public void zp(String str) {
        com.bytedance.sdk.openadsdk.core.COT.zp zpVar;
        if (TextUtils.isEmpty(str) || (zpVar = zp) == null) {
            return;
        }
        zpVar.zp(str);
    }

    private lMd() {
        this.lMd = null;
        zp = new com.bytedance.sdk.openadsdk.core.COT.zp();
    }

    public boolean KS() {
        com.bytedance.sdk.openadsdk.core.COT.zp zpVar = zp;
        if (zpVar == null) {
            return false;
        }
        return zpVar.lMd();
    }

    public static lMd lMd() {
        return zp.zp;
    }

    public void zp() {
        com.bytedance.sdk.openadsdk.core.COT.zp zpVar = zp;
        if (zpVar != null) {
            zpVar.KS();
        }
    }

    public Map<String, String> zp(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.COT.zp zpVar = zp;
        if (zpVar != null) {
            return zpVar.zp(str, bArr);
        }
        return new HashMap();
    }

    public void zp(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.COT.zp zpVar = zp;
        if (zpVar != null) {
            zpVar.zp(motionEvent);
        }
    }
}
