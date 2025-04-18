package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkConfiguration;

/* loaded from: classes.dex */
public class k3 {
    private final AppLovinSdkConfiguration.ConsentFlowUserGeography a;

    public k3(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        this.a = consentFlowUserGeography;
    }

    public boolean a(Object obj) {
        return obj instanceof k3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        if (!k3Var.a(this)) {
            return false;
        }
        AppLovinSdkConfiguration.ConsentFlowUserGeography a = a();
        AppLovinSdkConfiguration.ConsentFlowUserGeography a10 = k3Var.a();
        return a != null ? a.equals(a10) : a10 == null;
    }

    public int hashCode() {
        AppLovinSdkConfiguration.ConsentFlowUserGeography a = a();
        return (a == null ? 43 : a.hashCode()) + 59;
    }

    public String toString() {
        return "CmpAdapterParameters(debugUserGeography=" + a() + ")";
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography a() {
        return this.a;
    }
}
