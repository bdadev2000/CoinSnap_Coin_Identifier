package com.vungle.ads.internal.network;

import androidx.annotation.Keep;
import c7.C0631h0;
import i8.G;

@Keep
/* loaded from: classes3.dex */
public interface VungleApi {
    InterfaceC2099a ads(String str, String str2, C0631h0 c0631h0);

    InterfaceC2099a config(String str, String str2, C0631h0 c0631h0);

    InterfaceC2099a pingTPAT(String str, String str2);

    InterfaceC2099a ri(String str, String str2, C0631h0 c0631h0);

    InterfaceC2099a sendAdMarkup(String str, G g9);

    InterfaceC2099a sendErrors(String str, String str2, G g9);

    InterfaceC2099a sendMetrics(String str, String str2, G g9);

    void setAppId(String str);
}
