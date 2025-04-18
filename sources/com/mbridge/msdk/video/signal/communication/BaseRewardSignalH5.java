package com.mbridge.msdk.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbsignalcommon.communication.d;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class BaseRewardSignalH5 extends a {
    protected IJSFactory a;

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
            ad.b("JS-Reward-Communication", "code to string is error");
            return "";
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void cai(Object obj, String str) {
        int i10;
        ad.a("JS-Reward-Communication", "cai:" + str);
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
                        ad.a("JS-Reward-Communication", e2.getMessage());
                    }
                } catch (JSONException e10) {
                    d.a(obj, "exception: " + e10.getLocalizedMessage());
                    ad.b("JS-Reward-Communication", "cai", e10);
                }
            } catch (Throwable th2) {
                d.a(obj, "exception: " + th2.getLocalizedMessage());
                ad.b("JS-Reward-Communication", "cai", th2);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        String str2;
        try {
            IJSFactory iJSFactory = this.a;
            if (iJSFactory != null) {
                String a = iJSFactory.getIJSRewardVideoV1().a();
                if (!TextUtils.isEmpty(a)) {
                    str2 = Base64.encodeToString(a.getBytes(), 2);
                    ad.a("JS-Reward-Communication", "getEndScreenInfo success");
                } else {
                    str2 = "";
                    ad.a("JS-Reward-Communication", "getEndScreenInfo failed");
                }
                g.a().a(obj, str2);
            }
        } catch (Throwable th2) {
            ad.b("JS-Reward-Communication", "getEndScreenInfo", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.a != null && !TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString(NotificationCompat.CATEGORY_MESSAGE);
                ad.a("JS-Reward-Communication", "handlerPlayableException,msg:" + str);
                this.a.getIJSRewardVideoV1().c(optString);
            }
        } catch (Throwable th2) {
            ad.b("JS-Reward-Communication", "setOrientation", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        if (context instanceof IJSFactory) {
            this.a = (IJSFactory) context;
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        try {
            if (this.a != null) {
                ad.a("JS-Reward-Communication", "install:" + str);
                if (this.a.getJSContainerModule().endCardShowing()) {
                    this.a.getJSCommon().click(3, str);
                } else {
                    this.a.getJSCommon().click(1, str);
                }
            }
        } catch (Throwable th2) {
            ad.b("JS-Reward-Communication", "install", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.a != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                ad.a("JS-Reward-Communication", "notifyCloseBtn,state:" + str);
                this.a.getIJSRewardVideoV1().notifyCloseBtn(optInt);
            }
        } catch (Throwable th2) {
            ad.b("JS-Reward-Communication", "notifyCloseBtn", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        ad.b("JS-Reward-Communication", "openURL:" + str);
        Context c10 = c.m().c();
        if (!TextUtils.isEmpty(str)) {
            if (c10 == null) {
                try {
                    if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b) != null) {
                        c10 = windVaneWebView.getContext();
                    }
                } catch (Exception e2) {
                    ad.b("JS-Reward-Communication", e2.getMessage());
                }
            }
            if (c10 == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    com.mbridge.msdk.click.c.c(c10, optString);
                } else if (optInt == 2) {
                    com.mbridge.msdk.click.c.e(c10, optString);
                }
            } catch (JSONException e10) {
                ad.b("JS-Reward-Communication", e10.getMessage());
            } catch (Throwable th2) {
                ad.b("JS-Reward-Communication", th2.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
        try {
            if (this.a != null && !TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("state");
                ad.a("JS-Reward-Communication", "setOrientation,state:" + str);
                this.a.getIJSRewardVideoV1().b(optString);
            }
        } catch (Throwable th2) {
            ad.b("JS-Reward-Communication", "setOrientation", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.a != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                ad.a("JS-Reward-Communication", "toggleCloseBtn,state:" + str);
                this.a.getIJSRewardVideoV1().toggleCloseBtn(optInt);
            }
        } catch (Throwable th2) {
            ad.b("JS-Reward-Communication", "toggleCloseBtn", th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.a != null && !TextUtils.isEmpty(str)) {
                g.a().a(obj, a(0));
                this.a.getIJSRewardVideoV1().a(new JSONObject(str).optString("state"));
                ad.a("JS-Reward-Communication", "triggerCloseBtn,state:" + str);
            }
        } catch (Throwable th2) {
            ad.b("JS-Reward-Communication", "triggerCloseBtn", th2);
            g.a().a(obj, a(-1));
        }
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        if (obj instanceof IJSFactory) {
            this.a = (IJSFactory) obj;
        }
    }
}
