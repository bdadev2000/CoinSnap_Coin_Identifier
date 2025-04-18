package com.applovin.impl.sdk;

import android.graphics.Color;
import androidx.annotation.Nullable;
import com.applovin.impl.lg;
import com.applovin.impl.mg;
import com.applovin.impl.sdk.array.ArrayDirectDownloadAd;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sj;
import com.applovin.impl.tl;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AppLovinAdBase implements lg, ArrayDirectDownloadAd {

    @Nullable
    protected final JSONObject adObject;
    private final long createdAtMillis;

    @Nullable
    protected final JSONObject fullResponse;
    protected final j sdk;

    @Nullable
    protected final tl synchronizedAdObject;

    @Nullable
    protected final tl synchronizedFullResponse;
    protected final Object adObjectLock = new Object();
    protected final Object fullResponseLock = new Object();

    public AppLovinAdBase(JSONObject jSONObject, JSONObject jSONObject2, j jVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.sdk = jVar;
        if (((Boolean) jVar.a(sj.u6)).booleanValue()) {
            this.synchronizedAdObject = new tl(jSONObject);
            this.synchronizedFullResponse = new tl(jSONObject2);
            this.adObject = null;
            this.fullResponse = null;
        } else {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.synchronizedAdObject = null;
            this.synchronizedFullResponse = null;
        }
        this.createdAtMillis = System.currentTimeMillis();
    }

    public boolean containsKeyForAdObject(String str) {
        boolean has;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return tlVar.a(str);
        }
        synchronized (this.adObjectLock) {
            has = this.adObject.has(str);
        }
        return has;
    }

    public String getAdDomain() {
        return getStringFromFullResponse("adomain", "");
    }

    @Override // com.applovin.impl.lg
    public abstract /* synthetic */ mg getAdEventTracker();

    public abstract long getAdIdNumber();

    public boolean getBooleanFromAdObject(String str, Boolean bool) {
        boolean booleanValue;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return tlVar.a(str, bool).booleanValue();
        }
        synchronized (this.adObjectLock) {
            booleanValue = JsonUtils.getBoolean(this.adObject, str, bool).booleanValue();
        }
        return booleanValue;
    }

    public boolean getBooleanFromFullResponse(String str, boolean z2) {
        boolean booleanValue;
        tl tlVar = this.synchronizedFullResponse;
        if (tlVar != null) {
            return tlVar.a(str, Boolean.valueOf(z2)).booleanValue();
        }
        synchronized (this.fullResponseLock) {
            booleanValue = JsonUtils.getBoolean(this.fullResponse, str, Boolean.valueOf(z2)).booleanValue();
        }
        return booleanValue;
    }

    public String getClCode() {
        String stringFromAdObject = getStringFromAdObject("clcode", "");
        return StringUtils.isValidString(stringFromAdObject) ? stringFromAdObject : getStringFromFullResponse("clcode", "");
    }

    public int getColorFromAdObject(String str, int i2) {
        String stringFromAdObject = getStringFromAdObject(str, null);
        return StringUtils.isValidString(stringFromAdObject) ? Color.parseColor(stringFromAdObject) : i2;
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

    public float getFloatFromAdObject(String str, float f2) {
        float f3;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return tlVar.a(str, f2);
        }
        synchronized (this.adObjectLock) {
            f3 = JsonUtils.getFloat(this.adObject, str, f2);
        }
        return f3;
    }

    public int getIntFromAdObject(String str, int i2) {
        int i3;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return tlVar.a(str, i2);
        }
        synchronized (this.adObjectLock) {
            i3 = JsonUtils.getInt(this.adObject, str, i2);
        }
        return i3;
    }

    public List<Integer> getIntegerListFromAdObject(String str, List<Integer> list) {
        List<Integer> integerList;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return tlVar.a(str, (List) list);
        }
        synchronized (this.adObjectLock) {
            integerList = JsonUtils.getIntegerList(this.adObject, str, list);
        }
        return integerList;
    }

    public JSONArray getJsonArrayFromAdObject(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return tlVar.a(str, jSONArray);
        }
        synchronized (this.adObjectLock) {
            jSONArray2 = JsonUtils.getJSONArray(this.adObject, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject getJsonObjectFromAdObject(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return tlVar.a(str, jSONObject);
        }
        synchronized (this.adObjectLock) {
            jSONObject2 = JsonUtils.getJSONObject(this.adObject, str, jSONObject);
        }
        return jSONObject2;
    }

    public long getLongFromAdObject(String str, long j2) {
        long j3;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return tlVar.a(str, j2);
        }
        synchronized (this.adObjectLock) {
            j3 = JsonUtils.getLong(this.adObject, str, j2);
        }
        return j3;
    }

    public long getLongFromFullResponse(String str, long j2) {
        long j3;
        tl tlVar = this.synchronizedFullResponse;
        if (tlVar != null) {
            return tlVar.a(str, j2);
        }
        synchronized (this.fullResponseLock) {
            j3 = JsonUtils.getLong(this.fullResponse, str, j2);
        }
        return j3;
    }

    @Override // com.applovin.impl.lg
    @Nullable
    public abstract /* synthetic */ String getOpenMeasurementContentUrl();

    @Override // com.applovin.impl.lg
    public abstract /* synthetic */ String getOpenMeasurementCustomReferenceData();

    @Override // com.applovin.impl.lg
    public abstract /* synthetic */ List getOpenMeasurementVerificationScriptResources();

    public j getSdk() {
        return this.sdk;
    }

    public String getStringFromAdObject(String str, String str2) {
        String string;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return tlVar.a(str, str2);
        }
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, str, str2);
        }
        return string;
    }

    public String getStringFromFullResponse(String str, String str2) {
        String string;
        tl tlVar = this.synchronizedFullResponse;
        if (tlVar != null) {
            return tlVar.a(str, str2);
        }
        synchronized (this.fullResponseLock) {
            string = JsonUtils.getString(this.fullResponse, str, str2);
        }
        return string;
    }

    public List<String> getStringListFromAdObject(String str, List<String> list) {
        List<String> stringList;
        tl tlVar = this.synchronizedAdObject;
        if (tlVar != null) {
            return tlVar.b(str, list);
        }
        synchronized (this.adObjectLock) {
            stringList = JsonUtils.getStringList(this.adObject, str, list);
        }
        return stringList;
    }

    @Override // com.applovin.impl.lg
    public abstract /* synthetic */ boolean isOpenMeasurementEnabled();
}
