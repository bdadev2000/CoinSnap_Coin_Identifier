package com.applovin.impl.sdk.nativeAd;

import androidx.arch.core.util.Function;
import com.applovin.impl.tl;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Function {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26752c;

    public /* synthetic */ c(Object obj, int i2) {
        this.f26751b = i2;
        this.f26752c = obj;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        List lambda$getOpenMeasurementVerificationScriptResources$2;
        List lambda$getDirectClickTrackingPostbacks$1;
        List lambda$getOpenMeasurementVerificationScriptResources$3;
        int i2 = this.f26751b;
        Object obj2 = this.f26752c;
        switch (i2) {
            case 0:
                lambda$getOpenMeasurementVerificationScriptResources$2 = ((AppLovinNativeAdImpl) obj2).lambda$getOpenMeasurementVerificationScriptResources$2((JSONArray) obj);
                return lambda$getOpenMeasurementVerificationScriptResources$2;
            case 1:
                lambda$getDirectClickTrackingPostbacks$1 = ((AppLovinNativeAdImpl) obj2).lambda$getDirectClickTrackingPostbacks$1((tl) obj);
                return lambda$getDirectClickTrackingPostbacks$1;
            default:
                lambda$getOpenMeasurementVerificationScriptResources$3 = AppLovinNativeAdImpl.lambda$getOpenMeasurementVerificationScriptResources$3((Function) obj2, (tl) obj);
                return lambda$getOpenMeasurementVerificationScriptResources$3;
        }
    }
}
