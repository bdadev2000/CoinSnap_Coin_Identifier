package com.applovin.impl.sdk;

import android.graphics.Color;
import androidx.annotation.Nullable;
import com.applovin.impl.hg;
import com.applovin.impl.ig;
import com.applovin.impl.oj;
import com.applovin.impl.ql;
import com.applovin.impl.sdk.array.ArrayDirectDownloadAd;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AppLovinAdBase implements hg, ArrayDirectDownloadAd {

    @Nullable
    protected final JSONObject adObject;
    private final long createdAtMillis;

    @Nullable
    protected final JSONObject fullResponse;
    protected final k sdk;

    @Nullable
    protected final ql synchronizedAdObject;

    @Nullable
    protected final ql synchronizedFullResponse;
    protected final Object adObjectLock = new Object();
    protected final Object fullResponseLock = new Object();

    public AppLovinAdBase(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        if (jSONObject != null) {
            if (jSONObject2 != null) {
                if (kVar != null) {
                    this.sdk = kVar;
                    if (((Boolean) kVar.a(oj.f9836q6)).booleanValue()) {
                        this.synchronizedAdObject = new ql(jSONObject);
                        this.synchronizedFullResponse = new ql(jSONObject2);
                        this.adObject = null;
                        this.fullResponse = null;
                    } else {
                        this.adObject = jSONObject;
                        this.fullResponse = jSONObject2;
                        this.synchronizedAdObject = null;
                        this.synchronizedFullResponse = null;
                    }
                    this.createdAtMillis = System.currentTimeMillis();
                    return;
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No response specified");
        }
        throw new IllegalArgumentException("No ad object specified");
    }

    public boolean containsKeyForAdObject(String str) {
        boolean has;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return qlVar.a(str);
        }
        synchronized (this.adObjectLock) {
            has = this.adObject.has(str);
        }
        return has;
    }

    public String getAdDomain() {
        return getStringFromFullResponse("adomain", "");
    }

    @Override // com.applovin.impl.hg
    public abstract /* synthetic */ ig getAdEventTracker();

    public abstract long getAdIdNumber();

    public boolean getBooleanFromAdObject(String str, Boolean bool) {
        boolean booleanValue;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return qlVar.a(str, bool).booleanValue();
        }
        synchronized (this.adObjectLock) {
            booleanValue = JsonUtils.getBoolean(this.adObject, str, bool).booleanValue();
        }
        return booleanValue;
    }

    public boolean getBooleanFromFullResponse(String str, boolean z8) {
        boolean booleanValue;
        ql qlVar = this.synchronizedFullResponse;
        if (qlVar != null) {
            return qlVar.a(str, Boolean.valueOf(z8)).booleanValue();
        }
        synchronized (this.fullResponseLock) {
            booleanValue = JsonUtils.getBoolean(this.fullResponse, str, Boolean.valueOf(z8)).booleanValue();
        }
        return booleanValue;
    }

    public String getClCode() {
        String stringFromAdObject = getStringFromAdObject("clcode", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return stringFromAdObject;
        }
        return getStringFromFullResponse("clcode", "");
    }

    public int getColorFromAdObject(String str, int i9) {
        String stringFromAdObject = getStringFromAdObject(str, null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Color.parseColor(stringFromAdObject);
        }
        return i9;
    }

    public long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public String getDspId() {
        return getStringFromFullResponse("dsp_id", "");
    }

    public String getDspName() {
        return getStringFromFullResponse("dsp_name", "");
    }

    public long getFetchLatencyMillis() {
        return getLongFromFullResponse("ad_fetch_latency_millis", -1L);
    }

    public long getFetchResponseSize() {
        return getLongFromFullResponse("ad_fetch_response_size", -1L);
    }

    public float getFloatFromAdObject(String str, float f9) {
        float f10;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return qlVar.a(str, f9);
        }
        synchronized (this.adObjectLock) {
            f10 = JsonUtils.getFloat(this.adObject, str, f9);
        }
        return f10;
    }

    public int getIntFromAdObject(String str, int i9) {
        int i10;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return qlVar.a(str, i9);
        }
        synchronized (this.adObjectLock) {
            i10 = JsonUtils.getInt(this.adObject, str, i9);
        }
        return i10;
    }

    public List<Integer> getIntegerListFromAdObject(String str, List<Integer> list) {
        List<Integer> integerList;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return qlVar.a(str, (List) list);
        }
        synchronized (this.adObjectLock) {
            integerList = JsonUtils.getIntegerList(this.adObject, str, list);
        }
        return integerList;
    }

    public JSONArray getJsonArrayFromAdObject(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return qlVar.a(str, jSONArray);
        }
        synchronized (this.adObjectLock) {
            jSONArray2 = JsonUtils.getJSONArray(this.adObject, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject getJsonObjectFromAdObject(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return qlVar.a(str, jSONObject);
        }
        synchronized (this.adObjectLock) {
            jSONObject2 = JsonUtils.getJSONObject(this.adObject, str, jSONObject);
        }
        return jSONObject2;
    }

    public long getLongFromAdObject(String str, long j7) {
        long j9;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return qlVar.a(str, j7);
        }
        synchronized (this.adObjectLock) {
            j9 = JsonUtils.getLong(this.adObject, str, j7);
        }
        return j9;
    }

    public long getLongFromFullResponse(String str, long j7) {
        long j9;
        ql qlVar = this.synchronizedFullResponse;
        if (qlVar != null) {
            return qlVar.a(str, j7);
        }
        synchronized (this.fullResponseLock) {
            j9 = JsonUtils.getLong(this.fullResponse, str, j7);
        }
        return j9;
    }

    @Override // com.applovin.impl.hg
    @Nullable
    public abstract /* synthetic */ String getOpenMeasurementContentUrl();

    @Override // com.applovin.impl.hg
    public abstract /* synthetic */ String getOpenMeasurementCustomReferenceData();

    @Override // com.applovin.impl.hg
    public abstract /* synthetic */ List getOpenMeasurementVerificationScriptResources();

    public k getSdk() {
        return this.sdk;
    }

    public String getStringFromAdObject(String str, String str2) {
        String string;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return qlVar.a(str, str2);
        }
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, str, str2);
        }
        return string;
    }

    public String getStringFromFullResponse(String str, String str2) {
        String string;
        ql qlVar = this.synchronizedFullResponse;
        if (qlVar != null) {
            return qlVar.a(str, str2);
        }
        synchronized (this.fullResponseLock) {
            string = JsonUtils.getString(this.fullResponse, str, str2);
        }
        return string;
    }

    public List<String> getStringListFromAdObject(String str, List<String> list) {
        List<String> stringList;
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return qlVar.b(str, list);
        }
        synchronized (this.adObjectLock) {
            stringList = JsonUtils.getStringList(this.adObject, str, list);
        }
        return stringList;
    }

    @Override // com.applovin.impl.hg
    public abstract /* synthetic */ boolean isOpenMeasurementEnabled();
}
