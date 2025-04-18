package com.mbridge.msdk.mbbid.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.authoritycontroller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbbid.common.a.b;
import java.util.Map;

/* loaded from: classes4.dex */
public class BidManager {
    private b a;

    /* renamed from: b, reason: collision with root package name */
    private BidListennning f13920b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13921c;

    public BidManager(String str, String str2) {
        this(str, str2, "0");
    }

    public static String getBuyerUid(Context context) {
        if (com.mbridge.msdk.e.b.a()) {
            try {
                c.c(true);
            } catch (Throwable th2) {
                ad.b("BidManager", th2.getMessage());
            }
        }
        return com.mbridge.msdk.mbbid.common.b.a(context, "");
    }

    public void bid() {
        b bVar = this.a;
        if (bVar != null) {
            bVar.b(this.f13921c);
            return;
        }
        BidListennning bidListennning = this.f13920b;
        if (bidListennning != null) {
            bidListennning.onFailed("you need init the class :BidManager");
        }
    }

    public void setBidListener(BidListennning bidListennning) {
        this.f13920b = bidListennning;
        b bVar = this.a;
        if (bVar != null) {
            bVar.a(bidListennning);
        }
    }

    public void setRewardPlus(boolean z10) {
        this.f13921c = z10;
    }

    public BidManager(String str, String str2, String str3) {
        this.f13921c = false;
        this.a = new b(str, str2, str3);
    }

    public <T extends CommonBidRequestParams> BidManager(T t5) {
        this(t5 == null ? "" : t5.getmPlacementId(), t5 == null ? "" : t5.getmUnitId(), t5 != null ? t5.getmFloorPrice() : "");
        if (t5 instanceof BannerBidRequestParams) {
            BannerBidRequestParams bannerBidRequestParams = (BannerBidRequestParams) t5;
            this.a.a(bannerBidRequestParams.getHeight());
            this.a.b(bannerBidRequestParams.getWidth());
            this.a.b(296);
            if (t5 instanceof SplashBidRequestParams) {
                SplashBidRequestParams splashBidRequestParams = (SplashBidRequestParams) t5;
                this.a.a(splashBidRequestParams.a());
                this.a.a(splashBidRequestParams.getOrientation());
                this.a.b(297);
                return;
            }
            return;
        }
        if (t5 instanceof AdvancedNativeBidRequestParams) {
            AdvancedNativeBidRequestParams advancedNativeBidRequestParams = (AdvancedNativeBidRequestParams) t5;
            this.a.a(advancedNativeBidRequestParams.getHeight());
            this.a.b(advancedNativeBidRequestParams.getWidth());
            this.a.b(298);
        }
    }

    public static String getBuyerUid(Context context, String str) {
        if (com.mbridge.msdk.e.b.a()) {
            try {
                c.c(true);
            } catch (Throwable th2) {
                ad.b("BidManager", th2.getMessage());
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
            } catch (Throwable th2) {
                ad.b("BidManager", th2.getMessage());
            }
        }
        return com.mbridge.msdk.mbbid.common.b.a(context, map);
    }
}
