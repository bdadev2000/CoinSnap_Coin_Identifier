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
    private final com.applovin.impl.sdk.ad.b f8862h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinAdRewardListener f8863i;

    public ln(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateAppLovinReward", kVar);
        this.f8862h = bVar;
        this.f8863i = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.nn
    public void a(ch chVar) {
        this.f8862h.a(chVar);
        String b = chVar.b();
        Map<String, String> a6 = chVar.a();
        if (b.equals("accepted")) {
            this.f8863i.userRewardVerified(this.f8862h, a6);
            return;
        }
        if (b.equals("quota_exceeded")) {
            this.f8863i.userOverQuota(this.f8862h, a6);
        } else if (b.equals("rejected")) {
            this.f8863i.userRewardRejected(this.f8862h, a6);
        } else {
            this.f8863i.validationRequestFailed(this.f8862h, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.jn
    public String f() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.nn
    public boolean h() {
        return this.f8862h.O0();
    }

    @Override // com.applovin.impl.jn
    public void a(int i9) {
        String str;
        super.a(i9);
        if (i9 >= 400 && i9 < 500) {
            this.f8863i.userRewardRejected(this.f8862h, Collections.emptyMap());
            str = "rejected";
        } else {
            this.f8863i.validationRequestFailed(this.f8862h, i9);
            str = "network_timeout";
        }
        this.f8862h.a(ch.a(str));
    }

    @Override // com.applovin.impl.jn
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f8862h.getAdZone().e());
        String clCode = this.f8862h.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }
}
