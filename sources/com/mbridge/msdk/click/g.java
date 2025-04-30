package com.mbridge.msdk.click;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;

/* loaded from: classes3.dex */
public final class g extends AppletSchemeCallBack {

    /* renamed from: a, reason: collision with root package name */
    private final NativeListener.NativeTrackingListener f14825a;
    private final CampaignEx b;

    /* renamed from: c, reason: collision with root package name */
    private final AppletsModel f14826c;

    /* renamed from: d, reason: collision with root package name */
    private final a f14827d;

    public g(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        this.f14825a = nativeTrackingListener;
        this.b = campaignEx;
        this.f14826c = appletsModel;
        this.f14827d = aVar;
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    public final void onRequestFailed(int i9, String str, String str2) {
        CampaignEx campaignEx = this.b;
        if (campaignEx != null && this.f14826c != null) {
            try {
                NativeListener.NativeTrackingListener nativeTrackingListener = this.f14825a;
                if (nativeTrackingListener != null) {
                    try {
                        nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e4.getMessage());
                        }
                    }
                }
                this.f14826c.setUserClick(false);
                this.f14826c.setRequestingFinish();
                this.b.setClickURL(str2);
                a aVar = this.f14827d;
                if (aVar != null) {
                    try {
                        aVar.a(this.b);
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e9.getMessage());
                        }
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("DefaultAppletSchemeCallBack", e10.getMessage());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    public final void onRequestStart() {
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    public final void onRequestSuccess(String str) {
        CampaignEx campaignEx = this.b;
        if (campaignEx != null && this.f14826c != null) {
            try {
                NativeListener.NativeTrackingListener nativeTrackingListener = this.f14825a;
                if (nativeTrackingListener != null) {
                    try {
                        nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e4.getMessage());
                        }
                    }
                }
                this.f14826c.setUserClick(false);
                this.f14826c.setRequestingFinish();
                this.b.setDeepLinkUrl(str);
                a aVar = this.f14827d;
                if (aVar != null) {
                    try {
                        aVar.a(this.b);
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("DefaultAppletSchemeCallBack", e9.getMessage());
                        }
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("DefaultAppletSchemeCallBack", e10.getMessage());
                }
            }
        }
    }
}
