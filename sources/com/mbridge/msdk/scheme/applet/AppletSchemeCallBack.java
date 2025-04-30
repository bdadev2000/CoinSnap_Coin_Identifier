package com.mbridge.msdk.scheme.applet;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes3.dex */
public abstract class AppletSchemeCallBack implements IAppletSchemeCallBack {
    private static final String TAG = "AppletSchemeCallBack";

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestFailed(int i9, String str, String str2) {
        try {
            onRequestFailed(i9, str, str2);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, e4.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestStart() {
        try {
            onRequestStart();
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, e4.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestSuccess(String str) {
        try {
            onRequestSuccess(str);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, e4.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onNetworkError(int i9, String str, String str2) {
        try {
            onRequestFailed(i9, str, str2);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, e4.getMessage());
            }
        }
    }

    public abstract void onRequestFailed(int i9, String str, String str2);

    public abstract void onRequestStart();

    public abstract void onRequestSuccess(String str);
}
