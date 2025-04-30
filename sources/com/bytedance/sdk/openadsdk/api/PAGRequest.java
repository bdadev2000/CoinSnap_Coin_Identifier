package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes.dex */
public class PAGRequest {
    private Bundle KS = null;
    private Map<String, Object> lMd;
    private String zp;

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.KS == null) {
            this.KS = new Bundle();
        }
        this.KS.putBundle(cls.getName(), bundle);
    }

    public String getAdString() {
        return this.zp;
    }

    public Map<String, Object> getExtraInfo() {
        return this.lMd;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.KS;
    }

    public void setAdString(String str) {
        this.zp = str;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.lMd = map;
    }
}
