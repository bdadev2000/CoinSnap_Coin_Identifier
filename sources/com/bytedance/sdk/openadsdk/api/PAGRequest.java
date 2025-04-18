package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes.dex */
public class PAGRequest {
    private Map<String, Object> Sg;
    private String YFl;
    private Bundle tN = null;

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.tN == null) {
            this.tN = new Bundle();
        }
        this.tN.putBundle(cls.getName(), bundle);
    }

    public String getAdString() {
        return this.YFl;
    }

    public Map<String, Object> getExtraInfo() {
        return this.Sg;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.tN;
    }

    public void setAdString(String str) {
        this.YFl = str;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.Sg = map;
    }
}
