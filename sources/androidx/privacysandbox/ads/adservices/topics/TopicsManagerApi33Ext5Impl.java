package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.annotation.SuppressLint;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import p0.a;

@RequiresExtension
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo
/* loaded from: classes3.dex */
public final class TopicsManagerApi33Ext5Impl extends TopicsManagerImplCommon {
    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public final android.adservices.topics.GetTopicsRequest b(GetTopicsRequest getTopicsRequest) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest.Builder shouldRecordObservation;
        android.adservices.topics.GetTopicsRequest build;
        a.s(getTopicsRequest, "request");
        adsSdkName = androidx.privacysandbox.ads.adservices.customaudience.a.g().setAdsSdkName(getTopicsRequest.f20860a);
        shouldRecordObservation = adsSdkName.setShouldRecordObservation(getTopicsRequest.f20861b);
        build = shouldRecordObservation.build();
        a.r(build, "Builder()\n            .s…ion)\n            .build()");
        return build;
    }
}
