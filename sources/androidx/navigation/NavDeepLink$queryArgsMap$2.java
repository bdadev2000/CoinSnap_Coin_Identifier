package androidx.navigation;

import android.net.Uri;
import androidx.navigation.NavDeepLink;
import e0.u;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.r;
import z0.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavDeepLink$queryArgsMap$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavDeepLink f20426a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDeepLink$queryArgsMap$2(NavDeepLink navDeepLink) {
        super(0);
        this.f20426a = navDeepLink;
    }

    @Override // q0.a
    public final Object invoke() {
        Pattern pattern = NavDeepLink.f20398p;
        NavDeepLink navDeepLink = this.f20426a;
        navDeepLink.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (((Boolean) navDeepLink.f20404g.getValue()).booleanValue()) {
            String str = navDeepLink.f20400a;
            Uri parse = Uri.parse(str);
            for (String str2 : parse.getQueryParameterNames()) {
                StringBuilder sb = new StringBuilder();
                List<String> queryParameters = parse.getQueryParameters(str2);
                if (queryParameters.size() > 1) {
                    throw new IllegalArgumentException(androidx.compose.foundation.text.input.a.m("Query parameter ", str2, " must only be present once in ", str, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                }
                String str3 = (String) u.F0(queryParameters);
                if (str3 == null) {
                    navDeepLink.f20406i = true;
                    str3 = str2;
                }
                Matcher matcher = NavDeepLink.f20399q.matcher(str3);
                NavDeepLink.ParamQuery paramQuery = new NavDeepLink.ParamQuery();
                int i2 = 0;
                while (matcher.find()) {
                    String group = matcher.group(1);
                    p0.a.q(group, "null cannot be cast to non-null type kotlin.String");
                    paramQuery.f20417b.add(group);
                    p0.a.r(str3, "queryParam");
                    String substring = str3.substring(i2, matcher.start());
                    p0.a.r(substring, "substring(...)");
                    sb.append(Pattern.quote(substring));
                    sb.append("(.+?)?");
                    i2 = matcher.end();
                }
                if (i2 < str3.length()) {
                    String substring2 = str3.substring(i2);
                    p0.a.r(substring2, "substring(...)");
                    sb.append(Pattern.quote(substring2));
                }
                String sb2 = sb.toString();
                p0.a.r(sb2, "argRegex.toString()");
                paramQuery.f20416a = m.k1(sb2, ".*", "\\E.*\\Q");
                p0.a.r(str2, "paramName");
                linkedHashMap.put(str2, paramQuery);
            }
        }
        return linkedHashMap;
    }
}
