package com.applovin.impl.mediation.ads;

import Q7.n0;
import android.app.Activity;
import androidx.annotation.Nullable;
import com.applovin.impl.be;
import com.applovin.impl.lc;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class a {
    protected final MaxAdFormat adFormat;
    protected MaxAdListener adListener;

    @Nullable
    protected MaxAdReviewListener adReviewListener;
    protected final String adUnitId;

    @Nullable
    protected MaxAdExpirationListener expirationListener;
    protected final t logger;

    @Nullable
    protected MaxAdRequestListener requestListener;

    @Nullable
    protected MaxAdRevenueListener revenueListener;
    protected final com.applovin.impl.sdk.k sdk;
    protected final String tag;
    protected final Map<String, Object> localExtraParameters = n0.q();
    protected final Map<String, Object> extraParameters = n0.q();

    /* renamed from: com.applovin.impl.mediation.ads.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0023a extends MaxAdListener, MaxAdRevenueListener, MaxAdRequestListener {
    }

    public a(String str, MaxAdFormat maxAdFormat, String str2, com.applovin.impl.sdk.k kVar) {
        this.adUnitId = str;
        this.adFormat = maxAdFormat;
        this.sdk = kVar;
        this.tag = str2;
        this.logger = kVar.L();
    }

    public void a(be beVar) {
        lc lcVar = new lc();
        lcVar.a().a("MAX Ad").a(beVar).a();
        if (t.a()) {
            this.logger.a(this.tag, lcVar.toString());
        }
    }

    public void destroy() {
        this.localExtraParameters.clear();
        this.adListener = null;
        this.revenueListener = null;
        this.requestListener = null;
        this.expirationListener = null;
        this.adReviewListener = null;
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public void logApiCall(String str) {
        if (t.a()) {
            this.logger.a(this.tag, str);
        }
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        if (t.a()) {
            this.logger.a(this.tag, "Setting Ad Review creative id listener: " + maxAdReviewListener);
        }
        this.adReviewListener = maxAdReviewListener;
    }

    public void setExpirationListener(@Nullable MaxAdExpirationListener maxAdExpirationListener) {
        if (t.a()) {
            this.logger.a(this.tag, "Setting expiration listener: " + maxAdExpirationListener);
        }
        this.expirationListener = maxAdExpirationListener;
    }

    public void setExtraParameter(String str, String str2) {
        if (str != null) {
            if (zp.c(this.sdk) && ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str))) {
                throw new IllegalArgumentException("`setExtraParameter()` is an incorrect method for passing `amazon_ad_response` or `amazon_ad_error`. Please use the following method: `setLocalExtraParameter()`. Also note that this exception occurs in development builds only.");
            }
            if (this.adFormat.isAdViewAd() && "ad_refresh_seconds".equals(str) && StringUtils.isValidString(str2)) {
                int parseInt = Integer.parseInt(str2);
                if (parseInt > TimeUnit.MINUTES.toSeconds(2L)) {
                    t.h(this.tag, "Attempting to set extra parameter \"ad_refresh_seconds\" to over 2 minutes (" + parseInt + "s) - this will be ignored");
                }
            }
            this.extraParameters.put(str, str2);
            return;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public void setListener(MaxAdListener maxAdListener) {
        if (t.a()) {
            this.logger.a(this.tag, "Setting listener: " + maxAdListener);
        }
        this.adListener = maxAdListener;
    }

    public void setLocalExtraParameter(String str, Object obj) {
        if (str != null) {
            if (obj instanceof Activity) {
                if (t.a()) {
                    this.logger.b(this.tag, "Ignoring setting local extra parameter to Activity instance - please pass a WeakReference of it instead!");
                    return;
                }
                return;
            } else {
                if ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str)) {
                    setExtraParameter("is_amazon_integration", Boolean.toString(true));
                }
                this.localExtraParameters.put(str, obj);
                return;
            }
        }
        throw new IllegalArgumentException("No key specified");
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        if (t.a()) {
            this.logger.a(this.tag, "Setting request listener: " + maxAdRequestListener);
        }
        this.requestListener = maxAdRequestListener;
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        if (t.a()) {
            this.logger.a(this.tag, "Setting revenue listener: " + maxAdRevenueListener);
        }
        this.revenueListener = maxAdRevenueListener;
    }

    public static void logApiCall(String str, String str2) {
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.f10832A0;
        if (kVar != null) {
            kVar.L();
            if (t.a()) {
                com.applovin.impl.sdk.k.f10832A0.L().a(str, str2);
            }
        }
    }
}
