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

/* loaded from: classes3.dex */
public class BaseRewardSignalH5 extends a {

    /* renamed from: a, reason: collision with root package name */
    protected IJSFactory f19098a;

    private String a(int i9) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i9);
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
        int i9;
        ad.a("JS-Reward-Communication", "cai:" + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    String optString = new JSONObject(str).optString("packageName");
                    if (TextUtils.isEmpty(optString)) {
                        d.a(obj, "packageName is empty");
                    }
                    if (ai.c(c.m().c(), optString)) {
                        i9 = 1;
                    } else {
                        i9 = 2;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", d.b);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", i9);
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e4) {
                        d.a(obj, e4.getMessage());
                        ad.a("JS-Reward-Communication", e4.getMessage());
                    }
                } catch (JSONException e9) {
                    d.a(obj, "exception: " + e9.getLocalizedMessage());
                    ad.b("JS-Reward-Communication", "cai", e9);
                }
            } catch (Throwable th) {
                d.a(obj, "exception: " + th.getLocalizedMessage());
                ad.b("JS-Reward-Communication", "cai", th);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        String str2;
        try {
            IJSFactory iJSFactory = this.f19098a;
            if (iJSFactory != null) {
                String a6 = iJSFactory.getIJSRewardVideoV1().a();
                if (!TextUtils.isEmpty(a6)) {
                    str2 = Base64.encodeToString(a6.getBytes(), 2);
                    ad.a("JS-Reward-Communication", "getEndScreenInfo success");
                } else {
                    str2 = "";
                    ad.a("JS-Reward-Communication", "getEndScreenInfo failed");
                }
                g.a().a(obj, str2);
            }
        } catch (Throwable th) {
            ad.b("JS-Reward-Communication", "getEndScreenInfo", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.f19098a != null && !TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString(NotificationCompat.CATEGORY_MESSAGE);
                ad.a("JS-Reward-Communication", "handlerPlayableException,msg:" + str);
                this.f19098a.getIJSRewardVideoV1().c(optString);
            }
        } catch (Throwable th) {
            ad.b("JS-Reward-Communication", "setOrientation", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        if (context instanceof IJSFactory) {
            this.f19098a = (IJSFactory) context;
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        try {
            if (this.f19098a != null) {
                ad.a("JS-Reward-Communication", "install:" + str);
                if (this.f19098a.getJSContainerModule().endCardShowing()) {
                    this.f19098a.getJSCommon().click(3, str);
                } else {
                    this.f19098a.getJSCommon().click(1, str);
                }
            }
        } catch (Throwable th) {
            ad.b("JS-Reward-Communication", "install", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f19098a != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                ad.a("JS-Reward-Communication", "notifyCloseBtn,state:" + str);
                this.f19098a.getIJSRewardVideoV1().notifyCloseBtn(optInt);
            }
        } catch (Throwable th) {
            ad.b("JS-Reward-Communication", "notifyCloseBtn", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        ad.b("JS-Reward-Communication", "openURL:" + str);
        Context c9 = c.m().c();
        if (!TextUtils.isEmpty(str)) {
            if (c9 == null) {
                try {
                    if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b) != null) {
                        c9 = windVaneWebView.getContext();
                    }
                } catch (Exception e4) {
                    ad.b("JS-Reward-Communication", e4.getMessage());
                }
            }
            if (c9 == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    com.mbridge.msdk.click.c.c(c9, optString);
                } else if (optInt == 2) {
                    com.mbridge.msdk.click.c.e(c9, optString);
                }
            } catch (JSONException e9) {
                ad.b("JS-Reward-Communication", e9.getMessage());
            } catch (Throwable th) {
                ad.b("JS-Reward-Communication", th.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
        try {
            if (this.f19098a != null && !TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("state");
                ad.a("JS-Reward-Communication", "setOrientation,state:" + str);
                this.f19098a.getIJSRewardVideoV1().b(optString);
            }
        } catch (Throwable th) {
            ad.b("JS-Reward-Communication", "setOrientation", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f19098a != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                ad.a("JS-Reward-Communication", "toggleCloseBtn,state:" + str);
                this.f19098a.getIJSRewardVideoV1().toggleCloseBtn(optInt);
            }
        } catch (Throwable th) {
            ad.b("JS-Reward-Communication", "toggleCloseBtn", th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f19098a != null && !TextUtils.isEmpty(str)) {
                g.a().a(obj, a(0));
                this.f19098a.getIJSRewardVideoV1().a(new JSONObject(str).optString("state"));
                ad.a("JS-Reward-Communication", "triggerCloseBtn,state:" + str);
            }
        } catch (Throwable th) {
            ad.b("JS-Reward-Communication", "triggerCloseBtn", th);
            g.a().a(obj, a(-1));
        }
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        if (obj instanceof IJSFactory) {
            this.f19098a = (IJSFactory) obj;
        }
    }
}
