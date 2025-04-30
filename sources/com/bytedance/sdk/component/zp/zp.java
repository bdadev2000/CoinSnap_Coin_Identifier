package com.bytedance.sdk.component.zp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.component.sdk.annotation.AnyThread;
import com.bytedance.component.sdk.annotation.MainThread;
import com.bytedance.sdk.component.zp.QR;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public abstract class zp {
    protected String COT;
    protected ku KS;
    QR QR;
    protected tG lMd;
    protected Context zp;
    protected Handler jU = new Handler(Looper.getMainLooper());
    protected volatile boolean HWF = false;
    private final Map<String, QR> ku = new HashMap();

    public void invokeMethod(final String str) {
        if (this.HWF) {
            return;
        }
        this.jU.post(new Runnable() { // from class: com.bytedance.sdk.component.zp.zp.1
            @Override // java.lang.Runnable
            public void run() {
                KVG kvg;
                if (!zp.this.HWF) {
                    try {
                        kvg = zp.this.zp(new JSONObject(str));
                    } catch (Exception unused) {
                        kvg = null;
                    }
                    if (KVG.zp(kvg)) {
                        Objects.toString(kvg);
                        if (kvg != null) {
                            zp.this.lMd(ox.zp(new vwr(kvg.zp, "Failed to parse invocation.")), kvg);
                            return;
                        }
                        return;
                    }
                    zp.this.zp(kvg);
                }
            }
        });
    }

    public void lMd() {
        this.QR.zp();
        Iterator<QR> it = this.ku.values().iterator();
        while (it.hasNext()) {
            it.next().zp();
        }
        this.jU.removeCallbacksAndMessages(null);
        this.HWF = true;
    }

    public abstract void lMd(dT dTVar);

    public abstract Context zp(dT dTVar);

    public abstract String zp();

    @AnyThread
    public abstract void zp(String str);

    public void zp(String str, KVG kvg) {
        zp(str);
    }

    @MainThread
    public final void zp(KVG kvg) {
        String zp;
        if (this.HWF || (zp = zp()) == null) {
            return;
        }
        QR lMd = lMd(kvg.QR);
        if (lMd == null) {
            kvg.toString();
            if (this.lMd != null) {
                zp();
            }
            lMd(ox.zp(new vwr(-4, AbstractC2914a.h(new StringBuilder("Namespace "), kvg.QR, " unknown."))), kvg);
            return;
        }
        HWF hwf = new HWF();
        hwf.lMd = zp;
        hwf.zp = this.zp;
        hwf.KS = lMd;
        try {
            QR.zp zp2 = lMd.zp(kvg, hwf);
            if (zp2 == null) {
                kvg.toString();
                if (this.lMd != null) {
                    zp();
                }
                lMd(ox.zp(new vwr(-2, "Function " + kvg.jU + " is not registered.")), kvg);
                return;
            }
            if (zp2.zp) {
                lMd(zp2.lMd, kvg);
            }
            if (this.lMd != null) {
                zp();
            }
        } catch (Exception e4) {
            kvg.toString();
            lMd(ox.zp(e4), kvg);
        }
    }

    public final void lMd(String str, KVG kvg) {
        JSONObject jSONObject;
        if (this.HWF || TextUtils.isEmpty(kvg.HWF)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            YW.zp(new IllegalArgumentException("Illegal callback data: ".concat(str)));
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        zp(dQp.zp().zp("__msg_type", "callback").zp("__callback_id", kvg.HWF).zp("__params", jSONObject).lMd(), kvg);
    }

    private QR lMd(String str) {
        if (!TextUtils.equals(str, this.COT) && !TextUtils.isEmpty(str)) {
            return this.ku.get(str);
        }
        return this.QR;
    }

    public final void zp(dT dTVar, FP fp) {
        this.zp = zp(dTVar);
        this.KS = dTVar.jU;
        this.lMd = dTVar.YW;
        this.QR = new QR(dTVar, this, fp);
        this.COT = dTVar.Bj;
        lMd(dTVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public KVG zp(JSONObject jSONObject) {
        String optString;
        Object opt;
        if (this.HWF) {
            return null;
        }
        String optString2 = jSONObject.optString("__callback_id");
        String optString3 = jSONObject.optString("func");
        if (zp() == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String str = "";
            try {
                opt = jSONObject.opt("params");
            } catch (Throwable unused) {
                optString = jSONObject.optString("params");
            }
            if (opt != null) {
                if (opt instanceof JSONObject) {
                    optString = String.valueOf((JSONObject) opt);
                    String string2 = jSONObject.getString("JSSDK");
                    String optString4 = jSONObject.optString("namespace");
                    return KVG.zp().zp(string2).lMd(string).KS(optString3).jU(optString).COT(optString2).HWF(optString4).QR(jSONObject.optString("__iframe_url")).zp();
                }
                if (opt instanceof String) {
                    str = (String) opt;
                } else {
                    str = String.valueOf(opt);
                }
            }
            optString = str;
            String string22 = jSONObject.getString("JSSDK");
            String optString42 = jSONObject.optString("namespace");
            return KVG.zp().zp(string22).lMd(string).KS(optString3).jU(optString).COT(optString2).HWF(optString42).QR(jSONObject.optString("__iframe_url")).zp();
        } catch (JSONException unused2) {
            return KVG.zp(optString2, -1);
        }
    }
}
