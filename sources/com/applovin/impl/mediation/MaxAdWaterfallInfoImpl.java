package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.be;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {
    private final be a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5966b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5967c;

    /* renamed from: d, reason: collision with root package name */
    private final List f5968d;

    /* renamed from: e, reason: collision with root package name */
    private final long f5969e;

    /* renamed from: f, reason: collision with root package name */
    private final List f5970f;

    /* renamed from: g, reason: collision with root package name */
    private final String f5971g;

    public MaxAdWaterfallInfoImpl(be beVar, long j3, List<MaxNetworkResponseInfo> list, String str) {
        this(beVar, beVar.U(), beVar.V(), j3, list, beVar.T(), str);
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f5969e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.a;
    }

    public String getMCode() {
        return this.f5971g;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f5966b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f5968d;
    }

    public List<String> getPostbackUrls() {
        return this.f5970f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f5967c;
    }

    @NonNull
    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f5966b + ", testName=" + this.f5967c + ", networkResponses=" + this.f5968d + ", latencyMillis=" + this.f5969e + AbstractJsonLexerKt.END_OBJ;
    }

    public MaxAdWaterfallInfoImpl(@Nullable be beVar, String str, String str2, long j3, List<MaxNetworkResponseInfo> list, List<String> list2, String str3) {
        this.a = beVar;
        this.f5966b = str;
        this.f5967c = str2;
        this.f5968d = list;
        this.f5969e = j3;
        this.f5970f = list2;
        this.f5971g = str3;
    }
}
