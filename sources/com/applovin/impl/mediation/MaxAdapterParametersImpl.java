package com.applovin.impl.mediation;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.impl.ge;
import com.applovin.impl.pe;
import com.applovin.impl.zj;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* loaded from: classes4.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {

    /* renamed from: a, reason: collision with root package name */
    private String f25261a;

    /* renamed from: b, reason: collision with root package name */
    private Map f25262b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f25263c;
    private Bundle d;
    private Boolean e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f25264f;

    /* renamed from: g, reason: collision with root package name */
    private String f25265g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25266h;

    /* renamed from: i, reason: collision with root package name */
    private String f25267i;

    /* renamed from: j, reason: collision with root package name */
    private String f25268j;

    /* renamed from: k, reason: collision with root package name */
    private long f25269k;

    /* renamed from: l, reason: collision with root package name */
    private MaxAdFormat f25270l;

    private MaxAdapterParametersImpl() {
    }

    public static MaxAdapterParametersImpl a(ge geVar) {
        MaxAdapterParametersImpl a2 = a((pe) geVar);
        a2.f25267i = geVar.U();
        a2.f25268j = geVar.D();
        a2.f25269k = geVar.C();
        return a2;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.f25270l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f25261a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.f25269k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f25268j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public String getConsentString() {
        return this.f25265g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f25262b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f25263c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f25267i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean hasUserConsent() {
        return this.e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean isAgeRestrictedUser() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean isDoNotSell() {
        return this.f25264f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f25266h;
    }

    public static MaxAdapterParametersImpl a(zj zjVar, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl a2 = a(zjVar);
        a2.f25261a = str;
        a2.f25270l = maxAdFormat;
        return a2;
    }

    public static MaxAdapterParametersImpl a(pe peVar) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f25261a = peVar.getAdUnitId();
        maxAdapterParametersImpl.e = peVar.n();
        maxAdapterParametersImpl.f25264f = peVar.o();
        maxAdapterParametersImpl.f25265g = peVar.d();
        maxAdapterParametersImpl.f25262b = peVar.i();
        maxAdapterParametersImpl.f25263c = peVar.l();
        maxAdapterParametersImpl.d = peVar.f();
        maxAdapterParametersImpl.f25266h = peVar.p();
        return maxAdapterParametersImpl;
    }
}
