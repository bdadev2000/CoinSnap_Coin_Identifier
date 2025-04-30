package com.vungle.ads.internal.protos;

import com.google.protobuf.N3;
import com.google.protobuf.O3;
import java.util.List;

/* loaded from: classes3.dex */
public interface c extends O3 {
    @Override // com.google.protobuf.O3
    /* synthetic */ N3 getDefaultInstanceForType();

    Sdk$SDKMetric getMetrics(int i9);

    int getMetricsCount();

    List<Sdk$SDKMetric> getMetricsList();

    @Override // com.google.protobuf.O3
    /* synthetic */ boolean isInitialized();
}
