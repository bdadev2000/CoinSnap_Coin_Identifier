package com.glority.android.cmsui.model;

import com.glority.android.core.definition.ParameterCheckFailException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: CmsStaticUrl.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0016J\u001c\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00162\u0006\u0010\u0017\u001a\u00020\u0012R&\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/glority/android/cmsui/model/CmsStaticUrl;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "()V", "<set-?>", "", "darkUrl", "getDarkUrl", "()Ljava/lang/String;", "setDarkUrl", "(Ljava/lang/String;)V", "lightUrl", "getLightUrl", "setLightUrl", "equals", "", "other", "", "getJsonMap", "", "keepNull", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class CmsStaticUrl implements Serializable, Cloneable {
    public String darkUrl;
    public String lightUrl;

    public CmsStaticUrl() {
    }

    public Object clone() {
        return super.clone();
    }

    public final String getLightUrl() {
        String str = this.lightUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lightUrl");
        }
        return str;
    }

    public final void setLightUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lightUrl = str;
    }

    public final String getDarkUrl() {
        String str = this.darkUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("darkUrl");
        }
        return str;
    }

    public final void setDarkUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.darkUrl = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CmsStaticUrl(JSONObject obj) throws Exception {
        this();
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("light_url") && !obj.isNull("light_url")) {
            String string = obj.getString("light_url");
            Intrinsics.checkNotNullExpressionValue(string, "obj.getString(\"light_url\")");
            this.lightUrl = string;
            if (obj.has("dark_url") && !obj.isNull("dark_url")) {
                String string2 = obj.getString("dark_url");
                Intrinsics.checkNotNullExpressionValue(string2, "obj.getString(\"dark_url\")");
                this.darkUrl = string2;
                return;
            }
            throw new ParameterCheckFailException("darkUrl is missing in model CmsStaticUrl");
        }
        throw new ParameterCheckFailException("lightUrl is missing in model CmsStaticUrl");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.lightUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lightUrl");
        }
        hashMap.put("light_url", str);
        String str2 = this.darkUrl;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("darkUrl");
        }
        hashMap.put("dark_url", str2);
        return hashMap;
    }

    public final Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsStaticUrl)) {
            return false;
        }
        if (this.lightUrl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lightUrl");
        }
        CmsStaticUrl cmsStaticUrl = (CmsStaticUrl) other;
        if (cmsStaticUrl.lightUrl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lightUrl");
        }
        if (!Intrinsics.areEqual(r1, r3)) {
            return false;
        }
        String str = this.darkUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("darkUrl");
        }
        String str2 = cmsStaticUrl.darkUrl;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("darkUrl");
        }
        return !(Intrinsics.areEqual(str, str2) ^ true);
    }
}
