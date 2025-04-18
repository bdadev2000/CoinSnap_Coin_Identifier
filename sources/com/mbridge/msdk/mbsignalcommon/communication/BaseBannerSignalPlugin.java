package com.mbridge.msdk.mbsignalcommon.communication;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

/* loaded from: classes4.dex */
public abstract class BaseBannerSignalPlugin extends BannerSignalPluginDiff {
    public e a;

    /* renamed from: e, reason: collision with root package name */
    private final String f14118e = "BannerSignalPlugin";

    public void click(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", CampaignEx.JSON_NATIVE_VIDEO_CLICK);
            e eVar = this.a;
            if (eVar != null) {
                eVar.b(obj, str);
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalPlugin", CampaignEx.JSON_NATIVE_VIDEO_CLICK, th2);
        }
    }

    public void getFileInfo(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "getFileInfo");
            e eVar = this.a;
            if (eVar != null) {
                eVar.j(obj, str);
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalPlugin", "getFileInfo", th2);
        }
    }

    public void getNetstat(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "getNetstat");
            e eVar = this.a;
            if (eVar != null) {
                eVar.o(obj, str);
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalPlugin", "getNetstat", th2);
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "handlerH5Exception");
            e eVar = this.a;
            if (eVar != null) {
                eVar.m(obj, str);
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalPlugin", "handlerH5Exception", th2);
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "increaseOfferFrequence");
            e eVar = this.a;
            if (eVar != null) {
                eVar.l(obj, str);
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalPlugin", "increaseOfferFrequence", th2);
        }
    }

    public void init(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "init");
            e eVar = this.a;
            if (eVar != null) {
                eVar.a(obj, str);
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalPlugin", "init", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mbridge.msdk.mbsignalcommon.windvane.h
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof e) {
                this.a = (e) context;
            } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof e)) {
                this.a = (e) windVaneWebView.getObject();
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalPlugin", "initialize", th2);
        }
    }

    public void install(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "install");
            e eVar = this.a;
            if (eVar != null) {
                eVar.g(obj, str);
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalPlugin", "install", th2);
        }
    }

    public void onSignalCommunication(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "onSignalCommunication");
            e eVar = this.a;
            if (eVar != null) {
                eVar.f(obj, str);
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalPlugin", "onSignalCommunication", th2);
        }
    }

    public void openURL(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "openURL");
            e eVar = this.a;
            if (eVar != null) {
                eVar.n(obj, str);
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalPlugin", "openURL", th2);
        }
    }

    public void readyStatus(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "readyStatus");
            e eVar = this.a;
            if (eVar != null) {
                eVar.c(obj, str);
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalPlugin", "readyStatus", th2);
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "reportUrls");
            e eVar = this.a;
            if (eVar != null) {
                eVar.k(obj, str);
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalPlugin", "reportUrls", th2);
        }
    }

    public void resetCountdown(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "resetCountdown");
            e eVar = this.a;
            if (eVar != null) {
                eVar.h(obj, str);
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalPlugin", "resetCountdown", th2);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "sendImpressions");
            e eVar = this.a;
            if (eVar != null) {
                eVar.i(obj, str);
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalPlugin", "sendImpressions", th2);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "toggleCloseBtn");
            e eVar = this.a;
            if (eVar != null) {
                eVar.d(obj, str);
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalPlugin", "toggleCloseBtn", th2);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        try {
            ad.b("BannerSignalPlugin", "triggerCloseBtn");
            e eVar = this.a;
            if (eVar != null) {
                eVar.e(obj, str);
            }
        } catch (Throwable th2) {
            ad.b("BannerSignalPlugin", "triggerCloseBtn", th2);
        }
    }
}
