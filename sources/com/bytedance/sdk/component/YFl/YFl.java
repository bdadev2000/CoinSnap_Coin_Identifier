package com.bytedance.sdk.component.YFl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.component.sdk.annotation.AnyThread;
import com.bytedance.component.sdk.annotation.MainThread;
import com.bytedance.sdk.component.YFl.DSW;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import vd.e;

/* loaded from: classes.dex */
public abstract class YFl {
    DSW DSW;
    protected GA Sg;
    protected Context YFl;
    protected qsH tN;
    protected String wN;
    protected Handler AlY = new Handler(Looper.getMainLooper());

    /* renamed from: vc, reason: collision with root package name */
    protected volatile boolean f10342vc = false;
    private final Map<String, DSW> qsH = new HashMap();

    public void Sg() {
        this.DSW.YFl();
        Iterator<DSW> it = this.qsH.values().iterator();
        while (it.hasNext()) {
            it.next().YFl();
        }
        this.AlY.removeCallbacksAndMessages(null);
        this.f10342vc = true;
    }

    public abstract void Sg(nc ncVar);

    public abstract Context YFl(nc ncVar);

    public abstract String YFl();

    @AnyThread
    public abstract void YFl(String str);

    public void invokeMethod(final String str) {
        if (this.f10342vc) {
            return;
        }
        this.AlY.post(new Runnable() { // from class: com.bytedance.sdk.component.YFl.YFl.1
            @Override // java.lang.Runnable
            public void run() {
                rkt rktVar;
                if (!YFl.this.f10342vc) {
                    try {
                        rktVar = YFl.this.YFl(new JSONObject(str));
                    } catch (Exception unused) {
                        rktVar = null;
                    }
                    if (rkt.YFl(rktVar)) {
                        Objects.toString(rktVar);
                        if (rktVar != null) {
                            YFl.this.Sg(bZ.YFl(new Wwa(rktVar.YFl, "Failed to parse invocation.")), rktVar);
                            return;
                        }
                        return;
                    }
                    YFl.this.YFl(rktVar);
                }
            }
        });
    }

    public void YFl(String str, rkt rktVar) {
        YFl(str);
    }

    @MainThread
    public final void YFl(rkt rktVar) {
        String YFl;
        if (this.f10342vc || (YFl = YFl()) == null) {
            return;
        }
        DSW Sg = Sg(rktVar.DSW);
        if (Sg == null) {
            rktVar.toString();
            if (this.Sg != null) {
                YFl();
            }
            Sg(bZ.YFl(new Wwa(-4, e.h(new StringBuilder("Namespace "), rktVar.DSW, " unknown."))), rktVar);
            return;
        }
        vc vcVar = new vc();
        vcVar.Sg = YFl;
        vcVar.YFl = this.YFl;
        vcVar.tN = Sg;
        try {
            DSW.YFl YFl2 = Sg.YFl(rktVar, vcVar);
            if (YFl2 == null) {
                rktVar.toString();
                if (this.Sg != null) {
                    YFl();
                }
                Sg(bZ.YFl(new Wwa(-2, "Function " + rktVar.AlY + " is not registered.")), rktVar);
                return;
            }
            if (YFl2.YFl) {
                Sg(YFl2.Sg, rktVar);
            }
            if (this.Sg != null) {
                YFl();
            }
        } catch (Exception e2) {
            rktVar.toString();
            Sg(bZ.YFl(e2), rktVar);
        }
    }

    public final void Sg(String str, rkt rktVar) {
        JSONObject jSONObject;
        if (this.f10342vc || TextUtils.isEmpty(rktVar.f10346vc)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            NjR.YFl(new IllegalArgumentException("Illegal callback data: ".concat(str)));
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        YFl(EH.YFl().YFl("__msg_type", "callback").YFl("__callback_id", rktVar.f10346vc).YFl("__params", jSONObject).Sg(), rktVar);
    }

    private DSW Sg(String str) {
        if (!TextUtils.equals(str, this.wN) && !TextUtils.isEmpty(str)) {
            return this.qsH.get(str);
        }
        return this.DSW;
    }

    public final void YFl(nc ncVar, wXo wxo) {
        this.YFl = YFl(ncVar);
        this.tN = ncVar.AlY;
        this.Sg = ncVar.NjR;
        this.DSW = new DSW(ncVar, this, wxo);
        this.wN = ncVar.eT;
        Sg(ncVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public rkt YFl(JSONObject jSONObject) {
        String optString;
        Object opt;
        if (this.f10342vc) {
            return null;
        }
        String optString2 = jSONObject.optString("__callback_id");
        String optString3 = jSONObject.optString("func");
        if (YFl() == null) {
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
                    return rkt.YFl().YFl(string2).Sg(string).tN(optString3).AlY(optString).wN(optString2).vc(optString4).DSW(jSONObject.optString("__iframe_url")).YFl();
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
            return rkt.YFl().YFl(string22).Sg(string).tN(optString3).AlY(optString).wN(optString2).vc(optString42).DSW(jSONObject.optString("__iframe_url")).YFl();
        } catch (JSONException unused2) {
            return rkt.YFl(optString2, -1);
        }
    }
}
