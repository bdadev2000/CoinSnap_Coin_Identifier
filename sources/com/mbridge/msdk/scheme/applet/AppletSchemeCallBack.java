package com.mbridge.msdk.scheme.applet;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public abstract class AppletSchemeCallBack implements IAppletSchemeCallBack {
    private static final String TAG = "AppletSchemeCallBack";

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestFailed(int i10, String str, String str2) {
        try {
            onRequestFailed(i10, str, str2);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, e2.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestStart() {
        try {
            onRequestStart();
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, e2.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestSuccess(String str) {
        try {
            onRequestSuccess(str);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, e2.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onNetworkError(int i10, String str, String str2) {
        try {
            onRequestFailed(i10, str, str2);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, e2.getMessage());
            }
        }
    }

    public abstract void onRequestFailed(int i10, String str, String str2);

    public abstract void onRequestStart();

    public abstract void onRequestSuccess(String str);
}
