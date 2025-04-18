package com.mbridge.msdk.click;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;

/* loaded from: classes4.dex */
public final class g extends AppletSchemeCallBack {
    private final NativeListener.NativeTrackingListener a;

    /* renamed from: b, reason: collision with root package name */
    private final CampaignEx f12533b;

    /* renamed from: c, reason: collision with root package name */
    private final AppletsModel f12534c;

    /* renamed from: d, reason: collision with root package name */
    private final a f12535d;

    public g(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        this.a = nativeTrackingListener;
        this.f12533b = campaignEx;
        this.f12534c = appletsModel;
        this.f12535d = aVar;
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    public final void onRequestFailed(int i10, String str, String str2) {
        CampaignEx campaignEx = this.f12533b;
        if (campaignEx != null && this.f12534c != null) {
            try {
                NativeListener.NativeTrackingListener nativeTrackingListener = this.a;
                if (nativeTrackingListener != null) {
                    try {
                        nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e2.getMessage());
                        }
                    }
                }
                this.f12534c.setUserClick(false);
                this.f12534c.setRequestingFinish();
                this.f12533b.setClickURL(str2);
                a aVar = this.f12535d;
                if (aVar != null) {
                    try {
                        aVar.a(this.f12533b);
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e10.getMessage());
                        }
                    }
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("DefaultAppletSchemeCallBack", e11.getMessage());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    public final void onRequestStart() {
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    public final void onRequestSuccess(String str) {
        CampaignEx campaignEx = this.f12533b;
        if (campaignEx != null && this.f12534c != null) {
            try {
                NativeListener.NativeTrackingListener nativeTrackingListener = this.a;
                if (nativeTrackingListener != null) {
                    try {
                        nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e2.getMessage());
                        }
                    }
                }
                this.f12534c.setUserClick(false);
                this.f12534c.setRequestingFinish();
                this.f12533b.setDeepLinkUrl(str);
                a aVar = this.f12535d;
                if (aVar != null) {
                    try {
                        aVar.a(this.f12533b);
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e10.getMessage());
                        }
                    }
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("DefaultAppletSchemeCallBack", e11.getMessage());
                }
            }
        }
    }
}
