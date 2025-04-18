package com.vungle.ads.internal.network;

import androidx.annotation.Keep;
import bh.g1;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import wh.s0;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H&J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H&¨\u0006\u0018"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApi;", "", "", "ua", MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "Lbh/g1;", TtmlNode.TAG_BODY, "Lcom/vungle/ads/internal/network/a;", "Lbh/t2;", "config", "Lbh/z;", com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "Ljava/lang/Void;", "ri", "url", "pingTPAT", "Lwh/s0;", "requestBody", "sendMetrics", "sendErrors", "sendAdMarkup", "appId", "", "setAppId", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes4.dex */
public interface VungleApi {
    a ads(String ua2, String path, g1 body);

    a config(String ua2, String path, g1 body);

    a pingTPAT(String ua2, String url);

    a ri(String ua2, String path, g1 body);

    a sendAdMarkup(String path, s0 requestBody);

    a sendErrors(String ua2, String path, s0 requestBody);

    a sendMetrics(String ua2, String path, s0 requestBody);

    void setAppId(String appId);
}
