package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.be;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

/* loaded from: classes.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* renamed from: a, reason: collision with root package name */
    private final be f8923a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8924c;

    /* renamed from: d, reason: collision with root package name */
    private final List f8925d;

    /* renamed from: e, reason: collision with root package name */
    private final long f8926e;

    /* renamed from: f, reason: collision with root package name */
    private final List f8927f;

    /* renamed from: g, reason: collision with root package name */
    private final String f8928g;

    public MaxAdWaterfallInfoImpl(be beVar, long j7, List<MaxNetworkResponseInfo> list, String str) {
        this(beVar, beVar.U(), beVar.V(), j7, list, beVar.T(), str);
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f8926e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f8923a;
    }

    public String getMCode() {
        return this.f8928g;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f8925d;
    }

    public List<String> getPostbackUrls() {
        return this.f8927f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f8924c;
    }

    @NonNull
    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.b + ", testName=" + this.f8924c + ", networkResponses=" + this.f8925d + ", latencyMillis=" + this.f8926e + '}';
    }

    public MaxAdWaterfallInfoImpl(@Nullable be beVar, String str, String str2, long j7, List<MaxNetworkResponseInfo> list, List<String> list2, String str3) {
        this.f8923a = beVar;
        this.b = str;
        this.f8924c = str2;
        this.f8925d = list;
        this.f8926e = j7;
        this.f8927f = list2;
        this.f8928g = str3;
    }
}
