package com.mbridge.msdk.mbbid.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.click.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.system.NoProGuard;

/* loaded from: classes3.dex */
public class BidResponsed implements NoProGuard {
    public static final String KEY_BID_ID = "bid";
    public static final String KEY_CUR = "cur";
    public static final String KEY_LN = "ln";
    public static final String KEY_PRICE = "price";
    public static final String KEY_TOKEN = "token";
    public static final String KEY_WN = "wn";
    private String bidId;
    private String bidToken;
    private String cur;
    protected String ln;
    private String price;
    protected String wn;

    public String getBidId() {
        return this.bidId;
    }

    public String getBidToken() {
        return this.bidToken;
    }

    public String getCur() {
        return this.cur;
    }

    public String getLn() {
        return this.ln;
    }

    public String getPrice() {
        return this.price;
    }

    public String getWn() {
        return this.wn;
    }

    public void sendLossNotice(Context context, BidLossCode bidLossCode) {
        if (!TextUtils.isEmpty(this.ln) && context != null && bidLossCode != null) {
            StringBuilder sb = new StringBuilder(this.ln);
            if (this.ln.contains("?")) {
                sb.append("&");
            } else {
                sb.append("?");
            }
            sb.append("reason=");
            sb.append(bidLossCode.getCurrentCode());
            a.a(context, (CampaignEx) null, "", sb.toString(), false, false);
        }
    }

    public void sendWinNotice(Context context) {
        if (!TextUtils.isEmpty(this.wn) && context != null) {
            a.a(context, (CampaignEx) null, "", this.wn, false, false);
        }
    }

    public void setBidId(String str) {
        this.bidId = str;
    }

    public void setBidToken(String str) {
        this.bidToken = str;
    }

    public void setCur(String str) {
        this.cur = str;
    }

    public void setPrice(String str) {
        this.price = str;
    }
}
