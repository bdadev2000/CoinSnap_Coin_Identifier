package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class kn extends mn {

    /* renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f24931h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinAdRewardListener f24932i;

    public kn(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.j jVar) {
        super("TaskValidateAppLovinReward", jVar);
        this.f24931h = bVar;
        this.f24932i = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.mn
    public void a(fh fhVar) {
        this.f24931h.a(fhVar);
        String b2 = fhVar.b();
        Map<String, String> a2 = fhVar.a();
        if (b2.equals("accepted")) {
            this.f24932i.userRewardVerified(this.f24931h, a2);
            return;
        }
        if (b2.equals("quota_exceeded")) {
            this.f24932i.userOverQuota(this.f24931h, a2);
        } else if (b2.equals("rejected")) {
            this.f24932i.userRewardRejected(this.f24931h, a2);
        } else {
            this.f24932i.validationRequestFailed(this.f24931h, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.in
    public String f() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.mn
    public boolean h() {
        return this.f24931h.Q0();
    }

    @Override // com.applovin.impl.in
    public void a(int i2) {
        String str;
        super.a(i2);
        if (i2 >= 400 && i2 < 500) {
            this.f24932i.userRewardRejected(this.f24931h, Collections.emptyMap());
            str = "rejected";
        } else {
            this.f24932i.validationRequestFailed(this.f24931h, i2);
            str = "network_timeout";
        }
        this.f24931h.a(fh.a(str));
    }

    @Override // com.applovin.impl.in
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f24931h.getAdZone().e());
        String clCode = this.f24931h.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }
}
