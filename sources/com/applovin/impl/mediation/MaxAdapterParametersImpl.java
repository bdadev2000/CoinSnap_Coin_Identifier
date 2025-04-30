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

    /* renamed from: a, reason: collision with root package name */
    private String f8929a;
    private Map b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f8930c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f8931d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f8932e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f8933f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f8934g;

    /* renamed from: h, reason: collision with root package name */
    private String f8935h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8936i;

    /* renamed from: j, reason: collision with root package name */
    private String f8937j;

    /* renamed from: k, reason: collision with root package name */
    private String f8938k;
    private long l;
    private MaxAdFormat m;

    private MaxAdapterParametersImpl() {
    }

    public static MaxAdapterParametersImpl a(be beVar) {
        MaxAdapterParametersImpl a6 = a((ke) beVar);
        a6.f8937j = beVar.S();
        a6.f8938k = beVar.C();
        a6.l = beVar.B();
        return a6;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.m;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f8929a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f8938k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public String getConsentString() {
        return this.f8935h;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.f8931d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f8930c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f8937j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean hasUserConsent() {
        return this.f8932e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isAgeRestrictedUser() {
        return this.f8933f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isDoNotSell() {
        return this.f8934g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f8936i;
    }

    public static MaxAdapterParametersImpl a(wj wjVar, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl a6 = a(wjVar);
        a6.f8929a = str;
        a6.m = maxAdFormat;
        return a6;
    }

    public static MaxAdapterParametersImpl a(ke keVar) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f8929a = keVar.getAdUnitId();
        maxAdapterParametersImpl.f8932e = keVar.n();
        maxAdapterParametersImpl.f8933f = keVar.o();
        maxAdapterParametersImpl.f8934g = keVar.p();
        maxAdapterParametersImpl.f8935h = keVar.d();
        maxAdapterParametersImpl.b = keVar.i();
        maxAdapterParametersImpl.f8930c = keVar.l();
        maxAdapterParametersImpl.f8931d = keVar.f();
        maxAdapterParametersImpl.f8936i = keVar.q();
        return maxAdapterParametersImpl;
    }
}
