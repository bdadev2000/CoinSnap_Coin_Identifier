package com.mbridge.msdk.mbbid.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.authoritycontroller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbbid.common.a.b;
import java.util.Map;

/* loaded from: classes3.dex */
public class BidManager {

    /* renamed from: a, reason: collision with root package name */
    private b f16399a;
    private BidListennning b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16400c;

    public BidManager(String str, String str2) {
        this(str, str2, "0");
    }

    public static String getBuyerUid(Context context) {
        if (com.mbridge.msdk.e.b.a()) {
            try {
                c.c(true);
            } catch (Throwable th) {
                ad.b("BidManager", th.getMessage());
            }
        }
        return com.mbridge.msdk.mbbid.common.b.a(context, "");
    }

    public void bid() {
        b bVar = this.f16399a;
        if (bVar != null) {
            bVar.b(this.f16400c);
            return;
        }
        BidListennning bidListennning = this.b;
        if (bidListennning != null) {
            bidListennning.onFailed("you need init the class :BidManager");
        }
    }

    public void setBidListener(BidListennning bidListennning) {
        this.b = bidListennning;
        b bVar = this.f16399a;
        if (bVar != null) {
            bVar.a(bidListennning);
        }
    }

    public void setRewardPlus(boolean z8) {
        this.f16400c = z8;
    }

    public BidManager(String str, String str2, String str3) {
        this.f16400c = false;
        this.f16399a = new b(str, str2, str3);
    }

    public <T extends CommonBidRequestParams> BidManager(T t9) {
        this(t9 == null ? "" : t9.getmPlacementId(), t9 == null ? "" : t9.getmUnitId(), t9 != null ? t9.getmFloorPrice() : "");
        if (t9 instanceof BannerBidRequestParams) {
            BannerBidRequestParams bannerBidRequestParams = (BannerBidRequestParams) t9;
            this.f16399a.a(bannerBidRequestParams.getHeight());
            this.f16399a.b(bannerBidRequestParams.getWidth());
            this.f16399a.b(296);
            if (t9 instanceof SplashBidRequestParams) {
                SplashBidRequestParams splashBidRequestParams = (SplashBidRequestParams) t9;
                this.f16399a.a(splashBidRequestParams.a());
                this.f16399a.a(splashBidRequestParams.getOrientation());
                this.f16399a.b(297);
                return;
            }
            return;
        }
        if (t9 instanceof AdvancedNativeBidRequestParams) {
            AdvancedNativeBidRequestParams advancedNativeBidRequestParams = (AdvancedNativeBidRequestParams) t9;
            this.f16399a.a(advancedNativeBidRequestParams.getHeight());
            this.f16399a.b(advancedNativeBidRequestParams.getWidth());
            this.f16399a.b(298);
        }
    }

    public static String getBuyerUid(Context context, String str) {
        if (com.mbridge.msdk.e.b.a()) {
            try {
                c.c(true);
            } catch (Throwable th) {
                ad.b("BidManager", th.getMessage());
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return com.mbridge.msdk.mbbid.common.b.a(context, str);
    }

    public static String getBuyerUid(Context context, Map<String, String> map) {
        if (com.mbridge.msdk.e.b.a()) {
            try {
                c.c(true);
            } catch (Throwable th) {
                ad.b("BidManager", th.getMessage());
            }
        }
        return com.mbridge.msdk.mbbid.common.b.a(context, map);
    }
}
