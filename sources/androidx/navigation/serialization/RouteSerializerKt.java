package androidx.navigation.serialization;

import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavType;
import e1.t0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import k1.a;
import k1.c;
import kotlin.jvm.internal.g0;

/* loaded from: classes4.dex */
public final class RouteSerializerKt {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        r1 = (x0.o) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (r1 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        r8 = (androidx.navigation.NavType) r8.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if ((r8 instanceof androidx.navigation.NavType) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        r0 = androidx.navigation.serialization.UNKNOWN.f20797q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r8 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        p0.a.s(r7, "<this>");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        switch(androidx.navigation.serialization.NavTypeConverterKt.b(r7).ordinal()) {
            case 0: goto L80;
            case 1: goto L79;
            case 2: goto L78;
            case 3: goto L77;
            case 4: goto L76;
            case 5: goto L75;
            case 6: goto L74;
            case 7: goto L73;
            case 8: goto L72;
            case 9: goto L71;
            case 10: goto L70;
            case 11: goto L69;
            case 12: goto L68;
            case 13: goto L67;
            case 14: goto L66;
            case 15: goto L65;
            case 16: goto L64;
            case 17: goto L61;
            case 18: goto L44;
            case 19: goto L32;
            case 20: goto L29;
            default: goto L28;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        r7 = androidx.navigation.serialization.NavTypeConverterKt.a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        if (java.lang.Enum.class.isAssignableFrom(r7) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        r8 = new androidx.navigation.serialization.InternalNavType.EnumNullableType(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        r7 = androidx.navigation.serialization.NavTypeConverterKt.a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        if (android.os.Parcelable.class.isAssignableFrom(r7) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        r8 = new androidx.navigation.NavType.ParcelableType(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        if (r8 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        if (java.lang.Enum.class.isAssignableFrom(r7) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        r8 = new androidx.navigation.NavType.EnumType(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        if (java.io.Serializable.class.isAssignableFrom(r7) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        r8 = new androidx.navigation.NavType.SerializableType(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
    
        r7 = androidx.navigation.serialization.NavTypeConverterKt.b(r7.f(0)).ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        if (r7 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        if (r7 == 2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cd, code lost:
    
        if (r7 == 6) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d1, code lost:
    
        if (r7 == 8) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d5, code lost:
    
        if (r7 == 10) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d8, code lost:
    
        r7 = androidx.navigation.NavType.f20504p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dc, code lost:
    
        r7 = androidx.navigation.NavType.f20495g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00df, code lost:
    
        r7 = androidx.navigation.NavType.f20498j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e2, code lost:
    
        r7 = androidx.navigation.NavType.f20501m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e5, code lost:
    
        r7 = androidx.navigation.NavType.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f2, code lost:
    
        if (androidx.navigation.serialization.NavTypeConverterKt.b(r7.f(0)) != androidx.navigation.serialization.InternalType.f20769l) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f4, code lost:
    
        r7 = androidx.navigation.NavType.f20503o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f7, code lost:
    
        r7 = androidx.navigation.NavType.f20494f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fa, code lost:
    
        r7 = androidx.navigation.NavType.f20497i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fd, code lost:
    
        r7 = androidx.navigation.serialization.InternalNavType.f20757h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0100, code lost:
    
        r7 = androidx.navigation.NavType.f20500l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0103, code lost:
    
        r7 = androidx.navigation.NavType.f20493c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0106, code lost:
    
        r7 = androidx.navigation.NavType.f20502n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0109, code lost:
    
        r7 = androidx.navigation.serialization.InternalNavType.f20756g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010c, code lost:
    
        r7 = androidx.navigation.serialization.InternalNavType.f20755f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010f, code lost:
    
        r7 = androidx.navigation.NavType.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0112, code lost:
    
        r7 = androidx.navigation.serialization.InternalNavType.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0115, code lost:
    
        r7 = androidx.navigation.NavType.f20496h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0118, code lost:
    
        r7 = androidx.navigation.serialization.InternalNavType.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011b, code lost:
    
        r7 = androidx.navigation.serialization.InternalNavType.f20754c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011e, code lost:
    
        r7 = androidx.navigation.serialization.InternalNavType.f20753b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0121, code lost:
    
        r7 = androidx.navigation.NavType.f20499k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0124, code lost:
    
        r7 = androidx.navigation.serialization.InternalNavType.f20752a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0127, code lost:
    
        r7 = androidx.navigation.NavType.f20492b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012e, code lost:
    
        if (p0.a.g(r8, r0) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0131, code lost:
    
        p0.a.q(r8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0137, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x005b, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.navigation.NavType a(l1.f r7, java.util.Map r8) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.serialization.RouteSerializerKt.a(l1.f, java.util.Map):androidx.navigation.NavType");
    }

    public static final int b(a aVar) {
        int hashCode = aVar.b().g().hashCode();
        int d = aVar.b().d();
        for (int i2 = 0; i2 < d; i2++) {
            hashCode = (hashCode * 31) + aVar.b().e(i2).hashCode();
        }
        return hashCode;
    }

    public static final ArrayList c(a aVar, Map map) {
        p0.a.s(map, "typeMap");
        RouteSerializerKt$generateNavArguments$1 routeSerializerKt$generateNavArguments$1 = new RouteSerializerKt$generateNavArguments$1(aVar);
        if (aVar instanceof c) {
            routeSerializerKt$generateNavArguments$1.invoke();
            throw null;
        }
        int d = aVar.b().d();
        ArrayList arrayList = new ArrayList(d);
        for (int i2 = 0; i2 < d; i2++) {
            String e = aVar.b().e(i2);
            arrayList.add(NamedNavArgumentKt.a(e, new RouteSerializerKt$generateNavArguments$2$1(aVar, i2, map, e)));
        }
        return arrayList;
    }

    public static String d(a aVar, Map map) {
        p0.a.s(map, "typeMap");
        RouteSerializerKt$generateRoutePattern$1 routeSerializerKt$generateRoutePattern$1 = new RouteSerializerKt$generateRoutePattern$1(aVar);
        if (aVar instanceof c) {
            routeSerializerKt$generateRoutePattern$1.invoke();
            throw null;
        }
        RouteBuilder routeBuilder = new RouteBuilder(aVar);
        RouteSerializerKt$generateRoutePattern$2 routeSerializerKt$generateRoutePattern$2 = new RouteSerializerKt$generateRoutePattern$2(routeBuilder);
        int d = aVar.b().d();
        for (int i2 = 0; i2 < d; i2++) {
            String e = aVar.b().e(i2);
            NavType a2 = a(aVar.b().f(i2), map);
            if (a2 == null) {
                throw new IllegalArgumentException(f(e, aVar.b().f(i2).g(), aVar.b().g(), map.toString()));
            }
            routeSerializerKt$generateRoutePattern$2.invoke(Integer.valueOf(i2), e, a2);
        }
        return routeBuilder.f20781b + routeBuilder.f20782c + routeBuilder.d;
    }

    public static final String e(Object obj, LinkedHashMap linkedHashMap) {
        p0.a.s(obj, "route");
        a u2 = t0.u(g0.a(obj.getClass()));
        Map J0 = new RouteEncoder(u2, linkedHashMap).J0(obj);
        RouteBuilder routeBuilder = new RouteBuilder(u2);
        RouteSerializerKt$generateRouteWithArgs$1 routeSerializerKt$generateRouteWithArgs$1 = new RouteSerializerKt$generateRouteWithArgs$1(J0, routeBuilder);
        int d = u2.b().d();
        for (int i2 = 0; i2 < d; i2++) {
            String e = u2.b().e(i2);
            NavType navType = (NavType) linkedHashMap.get(e);
            if (navType == null) {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + e + ']').toString());
            }
            routeSerializerKt$generateRouteWithArgs$1.invoke(Integer.valueOf(i2), e, navType);
        }
        return routeBuilder.f20781b + routeBuilder.f20782c + routeBuilder.d;
    }

    public static final String f(String str, String str2, String str3, String str4) {
        StringBuilder t2 = androidx.compose.foundation.text.input.a.t("Route ", str3, " could not find any NavType for argument ", str, " of type ");
        t2.append(str2);
        t2.append(" - typeMap received was ");
        t2.append(str4);
        return t2.toString();
    }
}
