package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkConfiguration;

/* loaded from: classes.dex */
public class k3 {

    /* renamed from: a, reason: collision with root package name */
    private final AppLovinSdkConfiguration.ConsentFlowUserGeography f8539a;

    public k3(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        this.f8539a = consentFlowUserGeography;
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
        AppLovinSdkConfiguration.ConsentFlowUserGeography a6 = a();
        AppLovinSdkConfiguration.ConsentFlowUserGeography a9 = k3Var.a();
        if (a6 != null ? a6.equals(a9) : a9 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        AppLovinSdkConfiguration.ConsentFlowUserGeography a6 = a();
        if (a6 == null) {
            hashCode = 43;
        } else {
            hashCode = a6.hashCode();
        }
        return hashCode + 59;
    }

    public String toString() {
        return "CmpAdapterParameters(debugUserGeography=" + a() + ")";
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography a() {
        return this.f8539a;
    }
}
