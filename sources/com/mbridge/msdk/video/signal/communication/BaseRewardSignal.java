package com.mbridge.msdk.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbsignalcommon.communication.d;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.signal.a.k;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class BaseRewardSignal extends BaseRewardSignalDiff {
    protected BaseIRewardCommunication a;

    private String a(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String jSONObject2 = jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject2)) {
                return "";
            }
            return Base64.encodeToString(jSONObject2.getBytes(), 2);
        } catch (Throwable unused) {
            ad.b("JS-Reward-Brigde", "code to string is error");
            return "";
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void cai(Object obj, String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    String optString = new JSONObject(str).optString("packageName");
                    if (TextUtils.isEmpty(optString)) {
                        d.a(obj, "packageName is empty");
                    }
                    if (ai.c(c.m().c(), optString)) {
                        i10 = 1;
                    } else {
                        i10 = 2;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", d.f14119b);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", i10);
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e2) {
                        d.a(obj, e2.getMessage());
                        ad.a("JS-Reward-Brigde", e2.getMessage());
                    }
                } catch (Throwable th2) {
                    d.a(obj, "exception: " + th2.getLocalizedMessage());
                    ad.b("JS-Reward-Brigde", "cai", th2);
                }
            } catch (JSONException e10) {
                d.a(obj, "exception: " + e10.getLocalizedMessage());
                ad.b("JS-Reward-Brigde", "cai", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        try {
            BaseIRewardCommunication baseIRewardCommunication = this.a;
            if (baseIRewardCommunication != null) {
                baseIRewardCommunication.getEndScreenInfo(obj, str);
                ad.b("JS-Reward-Brigde", "getEndScreenInfo factory is true");
            } else {
                ad.b("JS-Reward-Brigde", "getEndScreenInfo factory is null");
                if (obj != null) {
                    WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b;
                    if ((windVaneWebView instanceof WindVaneWebView) && windVaneWebView.getWebViewListener() != null) {
                        ((com.mbridge.msdk.mbsignalcommon.b.a) windVaneWebView.getWebViewListener()).a(obj);
                    }
                }
            }
        } catch (Throwable th2) {
            ad.b("JS-Reward-Brigde", "getEndScreenInfo", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.a != null && !TextUtils.isEmpty(str)) {
                this.a.handlerPlayableException(obj, str);
            }
        } catch (Throwable th2) {
            ad.b("JS-Reward-Brigde", "handlerPlayableException", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.h
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        boolean z10;
        super.initialize(context, windVaneWebView);
        try {
            z10 = IJSFactory.class.isInstance(context);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            z10 = false;
        }
        try {
            if (z10) {
                this.a = (BaseIRewardCommunication) BaseRewardSignalH5.class.newInstance();
                BaseRewardSignalH5.class.getMethod("initialize", Context.class, WindVaneWebView.class).invoke(this.a, context, windVaneWebView);
            } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof BaseIRewardCommunication)) {
                this.a = (BaseIRewardCommunication) windVaneWebView.getObject();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        try {
            BaseIRewardCommunication baseIRewardCommunication = this.a;
            if (baseIRewardCommunication != null) {
                baseIRewardCommunication.install(obj, str);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (obj != null) {
                com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
                if (aVar.f14146b.getObject() instanceof k) {
                    ((k) aVar.f14146b.getObject()).click(1, str);
                    ad.b("JS-Reward-Brigde", "JSCommon install jump success");
                }
            }
            ad.b("JS-Reward-Brigde", "JSCommon install failed");
        } catch (Throwable th2) {
            ad.b("JS-Reward-Brigde", "install", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.a != null && !TextUtils.isEmpty(str)) {
                this.a.notifyCloseBtn(obj, str);
            }
        } catch (Throwable th2) {
            ad.b("JS-Reward-Brigde", "notifyCloseBtn", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) {
        ad.b("JS-Reward-Brigde", "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    com.mbridge.msdk.click.c.c(this.f14166b, optString);
                } else if (optInt == 2) {
                    com.mbridge.msdk.click.c.e(this.f14166b, optString);
                }
            } catch (JSONException e2) {
                ad.b("JS-Reward-Brigde", e2.getMessage());
            } catch (Throwable th2) {
                ad.b("JS-Reward-Brigde", th2.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
        try {
            if (this.a != null && !TextUtils.isEmpty(str)) {
                this.a.setOrientation(obj, str);
            }
        } catch (Throwable th2) {
            ad.b("JS-Reward-Brigde", "setOrientation", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.a != null && !TextUtils.isEmpty(str)) {
                this.a.toggleCloseBtn(obj, str);
            }
        } catch (Throwable th2) {
            ad.b("JS-Reward-Brigde", "toggleCloseBtn", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.a != null && !TextUtils.isEmpty(str)) {
                this.a.triggerCloseBtn(obj, str);
            }
        } catch (Throwable th2) {
            ad.b("JS-Reward-Brigde", "triggerCloseBtn", th2);
            g.a().a(obj, a(-1));
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.h
    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        boolean z10;
        super.initialize(obj, windVaneWebView);
        try {
            z10 = IJSFactory.class.isInstance(obj);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            z10 = false;
        }
        try {
            if (z10) {
                this.a = (BaseIRewardCommunication) BaseRewardSignalH5.class.newInstance();
                BaseRewardSignalH5.class.getMethod("initialize", Object.class, WindVaneWebView.class).invoke(this.a, obj, windVaneWebView);
            } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof BaseIRewardCommunication)) {
                this.a = (BaseIRewardCommunication) windVaneWebView.getObject();
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }
}
