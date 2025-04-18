package com.applovin.impl.mediation;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.impl.be;
import com.applovin.impl.ke;
import com.applovin.impl.wj;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* loaded from: classes.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private Map f5972b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f5973c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f5974d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f5975e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f5976f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f5977g;

    /* renamed from: h, reason: collision with root package name */
    private String f5978h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5979i;

    /* renamed from: j, reason: collision with root package name */
    private String f5980j;

    /* renamed from: k, reason: collision with root package name */
    private String f5981k;

    /* renamed from: l, reason: collision with root package name */
    private long f5982l;

    /* renamed from: m, reason: collision with root package name */
    private MaxAdFormat f5983m;

    private MaxAdapterParametersImpl() {
    }

    public static MaxAdapterParametersImpl a(be beVar) {
        MaxAdapterParametersImpl a = a((ke) beVar);
        a.f5980j = beVar.S();
        a.f5981k = beVar.C();
        a.f5982l = beVar.B();
        return a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.f5983m;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.f5982l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f5981k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public String getConsentString() {
        return this.f5978h;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.f5974d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f5972b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f5973c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f5980j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean hasUserConsent() {
        return this.f5975e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isAgeRestrictedUser() {
        return this.f5976f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isDoNotSell() {
        return this.f5977g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f5979i;
    }

    public static MaxAdapterParametersImpl a(wj wjVar, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl a = a(wjVar);
        a.a = str;
        a.f5983m = maxAdFormat;
        return a;
    }

    public static MaxAdapterParametersImpl a(ke keVar) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.a = keVar.getAdUnitId();
        maxAdapterParametersImpl.f5975e = keVar.n();
        maxAdapterParametersImpl.f5976f = keVar.o();
        maxAdapterParametersImpl.f5977g = keVar.p();
        maxAdapterParametersImpl.f5978h = keVar.d();
        maxAdapterParametersImpl.f5972b = keVar.i();
        maxAdapterParametersImpl.f5973c = keVar.l();
        maxAdapterParametersImpl.f5974d = keVar.f();
        maxAdapterParametersImpl.f5979i = keVar.q();
        return maxAdapterParametersImpl;
    }
}
