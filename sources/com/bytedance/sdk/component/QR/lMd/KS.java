package com.bytedance.sdk.component.QR.lMd;

import android.text.TextUtils;
import com.bytedance.sdk.component.lMd.zp.Bj;
import com.bytedance.sdk.component.lMd.zp.tG;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class KS {
    String COT;
    int HWF;
    protected Bj KS;
    protected String jU = null;
    protected final Map<String, String> QR = new HashMap();
    protected String ku = null;
    protected boolean YW = false;

    public KS(Bj bj) {
        this.KS = bj;
        KS(UUID.randomUUID().toString());
    }

    public void KS(String str) {
        this.jU = str;
    }

    public void jU(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.QR.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void lMd(String str) {
        this.ku = str;
    }

    public void zp(String str) {
        this.COT = str;
    }

    public void lMd(String str, String str2) {
        this.QR.put(str, str2);
    }

    public void zp(int i9) {
        this.HWF = i9;
    }

    public String lMd() {
        return this.jU;
    }

    public void zp(tG.zp zpVar) {
        if (zpVar != null && this.QR.size() > 0) {
            for (Map.Entry<String, String> entry : this.QR.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    zpVar.lMd(key, value);
                }
            }
        }
    }
}
