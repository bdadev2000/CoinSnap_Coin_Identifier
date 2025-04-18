package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ln extends nn {

    /* renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f5899h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinAdRewardListener f5900i;

    public ln(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateAppLovinReward", kVar);
        this.f5899h = bVar;
        this.f5900i = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.nn
    public void a(ch chVar) {
        this.f5899h.a(chVar);
        String b3 = chVar.b();
        Map<String, String> a = chVar.a();
        if (b3.equals("accepted")) {
            this.f5900i.userRewardVerified(this.f5899h, a);
            return;
        }
        if (b3.equals("quota_exceeded")) {
            this.f5900i.userOverQuota(this.f5899h, a);
        } else if (b3.equals("rejected")) {
            this.f5900i.userRewardRejected(this.f5899h, a);
        } else {
            this.f5900i.validationRequestFailed(this.f5899h, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.jn
    public String f() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.nn
    public boolean h() {
        return this.f5899h.O0();
    }

    @Override // com.applovin.impl.jn
    public void a(int i10) {
        String str;
        super.a(i10);
        if (i10 >= 400 && i10 < 500) {
            this.f5900i.userRewardRejected(this.f5899h, Collections.emptyMap());
            str = "rejected";
        } else {
            this.f5900i.validationRequestFailed(this.f5899h, i10);
            str = "network_timeout";
        }
        this.f5899h.a(ch.a(str));
    }

    @Override // com.applovin.impl.jn
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f5899h.getAdZone().e());
        String clCode = this.f5899h.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }
}
