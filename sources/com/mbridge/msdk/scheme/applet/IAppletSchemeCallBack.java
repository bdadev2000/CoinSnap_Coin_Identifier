package com.mbridge.msdk.scheme.applet;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public interface IAppletSchemeCallBack extends Serializable {
    void onAppletSchemeRequestFailed(int i9, String str, String str2);

    void onAppletSchemeRequestStart();

    void onAppletSchemeRequestSuccess(String str);

    void onNetworkError(int i9, String str, String str2);
}
