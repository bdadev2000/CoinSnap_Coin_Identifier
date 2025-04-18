package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.mraid.a;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.vungle.ads.internal.presenter.q;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MraidSignalCommunication extends BaseMraidSignalCommunication {
    private b a;

    public void close(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.C0182a.a.a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b, "close");
        }
        try {
            ad.b("MraidSignalCommunication", "MRAID close");
            b bVar = this.a;
            if (bVar != null) {
                bVar.close();
            }
        } catch (Throwable th2) {
            ad.b("MraidSignalCommunication", "MRAID close", th2);
        }
    }

    public void expand(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.C0182a.a.a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b, "expand");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("url");
            String optString2 = jSONObject.optString("shouldUseCustomClose");
            ad.b("MraidSignalCommunication", "MRAID expand " + optString + " " + optString2);
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && this.a != null) {
                this.a.expand(optString, optString2.toLowerCase().equals("true"));
            }
        } catch (Throwable th2) {
            ad.b("MraidSignalCommunication", "MRAID expand", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.h
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof b) {
                this.a = (b) context;
                return;
            }
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof b)) {
                this.a = (b) windVaneWebView.getObject();
            }
            if (windVaneWebView.getMraidObject() != null && (windVaneWebView.getMraidObject() instanceof b)) {
                this.a = (b) windVaneWebView.getMraidObject();
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public void open(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            com.mbridge.msdk.mbsignalcommon.windvane.a aVar = (com.mbridge.msdk.mbsignalcommon.windvane.a) obj;
            windVaneWebView = aVar.f14146b;
            a.C0182a.a.a(aVar.f14146b, q.OPEN);
        } else {
            windVaneWebView = null;
        }
        try {
            String optString = new JSONObject(str).optString("url");
            ad.b("MraidSignalCommunication", "MRAID Open " + optString);
            if (this.a != null && !TextUtils.isEmpty(optString)) {
                if (windVaneWebView != null && System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.mbridge.msdk.click.b.a.f12506c && com.mbridge.msdk.click.b.a.a(this.a.getMraidCampaign(), windVaneWebView.getUrl(), com.mbridge.msdk.click.b.a.a)) {
                    return;
                }
                this.a.open(optString);
            }
        } catch (Throwable th2) {
            ad.b("MraidSignalCommunication", "MRAID Open", th2);
        }
    }

    public void setOrientationProperties(Object obj, String str) {
        String str2;
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.C0182a.a.a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b, q.SET_ORIENTATION_PROPERTIES);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("allowOrientationChange");
            String optString2 = jSONObject.optString("forceOrientation");
            ad.b("MraidSignalCommunication", "MRAID setOrientationProperties");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && this.a != null) {
                optString.toLowerCase().equals("true");
                String lowerCase = optString2.toLowerCase();
                int hashCode = lowerCase.hashCode();
                if (hashCode != 729267099) {
                    if (hashCode == 1430647483) {
                        str2 = "landscape";
                    } else {
                        return;
                    }
                } else {
                    str2 = "portrait";
                }
                lowerCase.equals(str2);
            }
        } catch (Throwable th2) {
            ad.b("MraidSignalCommunication", "MRAID setOrientationProperties", th2);
        }
    }

    public void unload(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.C0182a.a.a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b, "unload");
        }
        try {
            ad.b("MraidSignalCommunication", "MRAID unload");
            b bVar = this.a;
            if (bVar != null) {
                bVar.unload();
            }
        } catch (Throwable th2) {
            ad.b("MraidSignalCommunication", "MRAID unload", th2);
        }
    }

    public void useCustomClose(Object obj, String str) {
        if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
            a.C0182a.a.a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f14146b, "useCustomClose");
        }
        try {
            String optString = new JSONObject(str).optString("shouldUseCustomClose");
            ad.b("MraidSignalCommunication", "MRAID useCustomClose " + optString);
            if (!TextUtils.isEmpty(optString) && this.a != null) {
                this.a.useCustomClose(optString.toLowerCase().equals("true"));
            }
        } catch (Throwable th2) {
            ad.b("MraidSignalCommunication", "MRAID useCustomClose", th2);
        }
    }
}
