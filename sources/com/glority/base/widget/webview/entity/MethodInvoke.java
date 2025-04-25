package com.glority.base.widget.webview.entity;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MethodInvoke.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0003J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\u0006\u0010\u0012\u001a\u00020\u0003J\u001c\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0003J\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006'"}, d2 = {"Lcom/glority/base/widget/webview/entity/MethodInvoke;", "", FirebaseAnalytics.Param.METHOD, "", "params", "", "invokeId", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;)V", "getMethod", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "getInvokeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStringParams", "key", "getIntParams", "(Ljava/lang/String;)Ljava/lang/Integer;", "getBooleanParams", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getStringList", "", "getMapParams", "getDoubleParams", "", "(Ljava/lang/String;)Ljava/lang/Double;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;)Lcom/glority/base/widget/webview/entity/MethodInvoke;", "equals", "other", "hashCode", "toString", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class MethodInvoke {
    public static final int $stable = 8;
    private final Integer invokeId;
    private final String method;
    private final Map<String, Object> params;

    /* renamed from: component1, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    public final Map<String, Object> component2() {
        return this.params;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getInvokeId() {
        return this.invokeId;
    }

    public final MethodInvoke copy(String method, Map<String, ? extends Object> params, Integer invokeId) {
        Intrinsics.checkNotNullParameter(method, "method");
        return new MethodInvoke(method, params, invokeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MethodInvoke)) {
            return false;
        }
        MethodInvoke methodInvoke = (MethodInvoke) other;
        return Intrinsics.areEqual(this.method, methodInvoke.method) && Intrinsics.areEqual(this.params, methodInvoke.params) && Intrinsics.areEqual(this.invokeId, methodInvoke.invokeId);
    }

    public int hashCode() {
        int hashCode = this.method.hashCode() * 31;
        Map<String, Object> map = this.params;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.invokeId;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "MethodInvoke(method=" + this.method + ", params=" + this.params + ", invokeId=" + this.invokeId + ")";
    }

    public MethodInvoke(String method, Map<String, ? extends Object> map, Integer num) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.method = method;
        this.params = map;
        this.invokeId = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MethodInvoke copy$default(MethodInvoke methodInvoke, String str, Map map, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = methodInvoke.method;
        }
        if ((i & 2) != 0) {
            map = methodInvoke.params;
        }
        if ((i & 4) != 0) {
            num = methodInvoke.invokeId;
        }
        return methodInvoke.copy(str, map, num);
    }

    public final String getMethod() {
        return this.method;
    }

    public final Map<String, Object> getParams() {
        return this.params;
    }

    public final Integer getInvokeId() {
        return this.invokeId;
    }

    public final String getStringParams(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, Object> map = this.params;
        String str = (String) (map != null ? map.get(key) : null);
        if (Intrinsics.areEqual(str, "undefined")) {
            return null;
        }
        return str;
    }

    public final Integer getIntParams(String key) {
        Object obj;
        String obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, Object> map = this.params;
        Object obj3 = map != null ? map.get(key) : null;
        if (obj3 instanceof Double) {
            return Integer.valueOf((int) ((Number) obj3).doubleValue());
        }
        if (obj3 instanceof Integer) {
            return (Integer) obj3;
        }
        Map<String, Object> map2 = this.params;
        if (map2 == null || (obj = map2.get(key)) == null || (obj2 = obj.toString()) == null) {
            return null;
        }
        return StringsKt.toIntOrNull(obj2);
    }

    public final Boolean getBooleanParams(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, Object> map = this.params;
        return (Boolean) (map != null ? map.get(key) : null);
    }

    public final List<String> getStringList(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, Object> map = this.params;
        Object obj = map != null ? map.get(key) : null;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        return (List) obj;
    }

    public final Map<String, Object> getMapParams(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, Object> map = this.params;
        Object obj = map != null ? map.get(key) : null;
        Map<String, Object> map2 = obj instanceof Map ? (Map) obj : null;
        return map2 == null ? new LinkedHashMap() : map2;
    }

    public final Double getDoubleParams(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, Object> map = this.params;
        Double d = (Double) (map != null ? map.get(key) : null);
        if (d == null) {
            return null;
        }
        return d;
    }
}
