package com.mbridge.msdk.out;

import android.text.TextUtils;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public class MBridgeIds implements NoProGuard, Serializable {
    private String bidToken = "";
    private boolean isCache = false;
    private String localRequestId;
    private String placementId;
    private String requestId;
    private String unitId;

    public MBridgeIds() {
    }

    public String getBidToken() {
        if (TextUtils.isEmpty(this.bidToken)) {
            this.bidToken = "";
        }
        return this.bidToken;
    }

    public String getLocalRequestId() {
        return this.localRequestId;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public String getRequestId() {
        if (TextUtils.isEmpty(this.requestId)) {
            return "";
        }
        return this.requestId;
    }

    public String getUnitId() {
        return this.unitId;
    }

    public boolean isCache() {
        return this.isCache;
    }

    public void setBidToken(String str) {
        this.bidToken = str;
    }

    public void setCache(boolean z8) {
        this.isCache = z8;
    }

    public void setLocalRequestId(String str) {
        this.localRequestId = str;
    }

    public void setPlacementId(String str) {
        this.placementId = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setUnitId(String str) {
        this.unitId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MBridgeIds{placementId='");
        sb.append(this.placementId);
        sb.append("', unitId='");
        sb.append(this.unitId);
        sb.append("', bidToken='");
        sb.append(this.bidToken);
        sb.append("', localRequestId='");
        return AbstractC2914a.h(sb, this.localRequestId, "'}");
    }

    public MBridgeIds(String str, String str2) {
        this.placementId = str;
        this.unitId = str2;
    }

    public MBridgeIds(String str, String str2, String str3) {
        this.placementId = str;
        this.unitId = str2;
        this.requestId = str3;
    }
}
