package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.ge;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

/* loaded from: classes3.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* renamed from: a, reason: collision with root package name */
    private final ge f25256a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25257b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25258c;
    private final List d;
    private final long e;

    /* renamed from: f, reason: collision with root package name */
    private final List f25259f;

    /* renamed from: g, reason: collision with root package name */
    private final String f25260g;

    public MaxAdWaterfallInfoImpl(ge geVar, long j2, List<MaxNetworkResponseInfo> list, String str) {
        this(geVar, geVar.X(), geVar.Y(), j2, list, geVar.W(), str);
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f25256a;
    }

    public String getMCode() {
        return this.f25260g;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f25257b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.d;
    }

    public List<String> getPostbackUrls() {
        return this.f25259f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f25258c;
    }

    @NonNull
    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f25257b + ", testName=" + this.f25258c + ", networkResponses=" + this.d + ", latencyMillis=" + this.e + '}';
    }

    public MaxAdWaterfallInfoImpl(@Nullable ge geVar, String str, String str2, long j2, List<MaxNetworkResponseInfo> list, List<String> list2, String str3) {
        this.f25256a = geVar;
        this.f25257b = str;
        this.f25258c = str2;
        this.d = list;
        this.e = j2;
        this.f25259f = list2;
        this.f25260g = str3;
    }
}
