package wh;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f27150b;

    public o(String scheme, Map authParams) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(authParams, "authParams");
        this.a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : authParams.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str == null) {
                lowerCase = null;
            } else {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                lowerCase = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            }
            linkedHashMap.put(lowerCase, str2);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f27150b = unmodifiableMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (Intrinsics.areEqual(oVar.a, this.a) && Intrinsics.areEqual(oVar.f27150b, this.f27150b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f27150b.hashCode() + vd.e.c(this.a, 899, 31);
    }

    public final String toString() {
        return this.a + " authParams=" + this.f27150b;
    }
}
