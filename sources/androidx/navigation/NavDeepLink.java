package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import b1.f0;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.sessions.settings.RemoteSettings;
import d0.b0;
import d0.h;
import d0.i;
import d0.k;
import d0.p;
import e0.q;
import e0.t;
import e0.u;
import e0.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z0.m;

/* loaded from: classes2.dex */
public final class NavDeepLink {

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f20398p = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f20399q = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: a, reason: collision with root package name */
    public final String f20400a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20401b = null;

    /* renamed from: c, reason: collision with root package name */
    public final String f20402c = null;
    public final ArrayList d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final p f20403f;

    /* renamed from: g, reason: collision with root package name */
    public final p f20404g;

    /* renamed from: h, reason: collision with root package name */
    public final h f20405h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20406i;

    /* renamed from: j, reason: collision with root package name */
    public final h f20407j;

    /* renamed from: k, reason: collision with root package name */
    public final h f20408k;

    /* renamed from: l, reason: collision with root package name */
    public final h f20409l;

    /* renamed from: m, reason: collision with root package name */
    public final p f20410m;

    /* renamed from: n, reason: collision with root package name */
    public final p f20411n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f20412o;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f20413a;

        /* loaded from: classes2.dex */
        public static final class Companion {
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    /* loaded from: classes2.dex */
    public static final class MimeType implements Comparable<MimeType> {

        /* renamed from: a, reason: collision with root package name */
        public final String f20414a;

        /* renamed from: b, reason: collision with root package name */
        public final String f20415b;

        public MimeType(String str) {
            List list;
            List list2;
            p0.a.s(str, "mimeType");
            Pattern compile = Pattern.compile(RemoteSettings.FORWARD_SLASH_STRING);
            p0.a.r(compile, "compile(...)");
            m.l1(0);
            Matcher matcher = compile.matcher(str);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int i2 = 0;
                do {
                    arrayList.add(str.subSequence(i2, matcher.start()).toString());
                    i2 = matcher.end();
                } while (matcher.find());
                arrayList.add(str.subSequence(i2, str.length()).toString());
                list = arrayList;
            } else {
                list = f0.u(str.toString());
            }
            if (!list.isEmpty()) {
                ListIterator listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        list2 = u.U0(list, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list2 = w.f30218a;
            this.f20414a = (String) list2.get(0);
            this.f20415b = (String) list2.get(1);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(MimeType mimeType) {
            p0.a.s(mimeType, "other");
            int i2 = p0.a.g(this.f20414a, mimeType.f20414a) ? 2 : 0;
            return p0.a.g(this.f20415b, mimeType.f20415b) ? i2 + 1 : i2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class ParamQuery {

        /* renamed from: a, reason: collision with root package name */
        public String f20416a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f20417b = new ArrayList();
    }

    public NavDeepLink(String str) {
        this.f20400a = str;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f20403f = f0.t(new NavDeepLink$pathPattern$2(this));
        this.f20404g = f0.t(new NavDeepLink$isParameterizedQuery$2(this));
        i iVar = i.f30133c;
        this.f20405h = f0.s(iVar, new NavDeepLink$queryArgsMap$2(this));
        this.f20407j = f0.s(iVar, new NavDeepLink$fragArgsAndRegex$2(this));
        this.f20408k = f0.s(iVar, new NavDeepLink$fragArgs$2(this));
        this.f20409l = f0.s(iVar, new NavDeepLink$fragRegex$2(this));
        this.f20410m = f0.t(new NavDeepLink$fragPattern$2(this));
        this.f20411n = f0.t(new NavDeepLink$mimeTypePattern$2(this));
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        if (!f20398p.matcher(str).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
        matcher.find();
        boolean z2 = false;
        String substring = str.substring(0, matcher.start());
        p0.a.r(substring, "substring(...)");
        a(substring, arrayList, sb);
        if (!m.M0(sb, ".*", false) && !m.M0(sb, "([^/]+?)", false)) {
            z2 = true;
        }
        this.f20412o = z2;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String sb2 = sb.toString();
        p0.a.r(sb2, "uriRegex.toString()");
        this.e = m.k1(sb2, ".*", "\\E.*\\Q");
    }

    public static void a(String str, List list, StringBuilder sb) {
        Matcher matcher = f20399q.matcher(str);
        int i2 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            p0.a.q(group, "null cannot be cast to non-null type kotlin.String");
            list.add(group);
            if (matcher.start() > i2) {
                String substring = str.substring(i2, matcher.start());
                p0.a.r(substring, "substring(...)");
                sb.append(Pattern.quote(substring));
            }
            sb.append("([^/]*?|)");
            i2 = matcher.end();
        }
        if (i2 < str.length()) {
            String substring2 = str.substring(i2);
            p0.a.r(substring2, "substring(...)");
            sb.append(Pattern.quote(substring2));
        }
    }

    public static void g(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (navArgument == null) {
            bundle.putString(str, str2);
            return;
        }
        NavType navType = navArgument.f20320a;
        navType.getClass();
        p0.a.s(str, SDKConstants.PARAM_KEY);
        navType.e(bundle, str, navType.h(str2));
    }

    public final int b(Uri uri) {
        String str;
        if (uri == null || (str = this.f20400a) == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> pathSegments2 = Uri.parse(str).getPathSegments();
        p0.a.r(pathSegments, "requestedPathSegments");
        p0.a.r(pathSegments2, "uriPathSegments");
        List<String> list = pathSegments2;
        Set d12 = u.d1(pathSegments);
        Set set = d12;
        if (!(list instanceof Collection)) {
            list = u.Z0(list);
        }
        set.retainAll(list);
        return d12.size();
    }

    public final ArrayList c() {
        ArrayList arrayList = this.d;
        Collection values = ((Map) this.f20405h.getValue()).values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            t.t0(arrayList2, ((ParamQuery) it.next()).f20417b);
        }
        return u.P0((List) this.f20408k.getValue(), u.P0(arrayList2, arrayList));
    }

    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        p0.a.s(linkedHashMap, "arguments");
        Pattern pattern = (Pattern) this.f20403f.getValue();
        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!e(matcher, bundle, linkedHashMap)) {
            return null;
        }
        if (((Boolean) this.f20404g.getValue()).booleanValue() && !f(uri, bundle, linkedHashMap)) {
            return null;
        }
        String fragment = uri.getFragment();
        Pattern pattern2 = (Pattern) this.f20410m.getValue();
        Matcher matcher2 = pattern2 != null ? pattern2.matcher(String.valueOf(fragment)) : null;
        if (matcher2 != null && matcher2.matches()) {
            List list = (List) this.f20408k.getValue();
            ArrayList arrayList = new ArrayList(q.M(list, 10));
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    f0.D();
                    throw null;
                }
                String str = (String) obj;
                String decode = Uri.decode(matcher2.group(i3));
                NavArgument navArgument = (NavArgument) linkedHashMap.get(str);
                try {
                    p0.a.r(decode, "value");
                    g(bundle, str, decode, navArgument);
                    arrayList.add(b0.f30125a);
                    i2 = i3;
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        if (!NavArgumentKt.a(linkedHashMap, new NavDeepLink$getMatchingArguments$missingRequiredArguments$1(bundle)).isEmpty()) {
            return null;
        }
        return bundle;
    }

    public final boolean e(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(q.M(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                f0.D();
                throw null;
            }
            String str = (String) next;
            String decode = Uri.decode(matcher.group(i3));
            NavArgument navArgument = (NavArgument) linkedHashMap.get(str);
            try {
                p0.a.r(decode, "value");
                g(bundle, str, decode, navArgument);
                arrayList2.add(b0.f30125a);
                i2 = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof NavDeepLink)) {
            return false;
        }
        NavDeepLink navDeepLink = (NavDeepLink) obj;
        return p0.a.g(this.f20400a, navDeepLink.f20400a) && p0.a.g(this.f20401b, navDeepLink.f20401b) && p0.a.g(this.f20402c, navDeepLink.f20402c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        Object obj;
        boolean z2;
        String query;
        NavDeepLink navDeepLink = this;
        loop0: for (Map.Entry entry : ((Map) navDeepLink.f20405h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            ParamQuery paramQuery = (ParamQuery) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (navDeepLink.f20406i && (query = uri.getQuery()) != null && !p0.a.g(query, uri.toString())) {
                queryParameters = f0.u(query);
            }
            p0.a.r(queryParameters, "inputParams");
            b0 b0Var = b0.f30125a;
            int i2 = 0;
            Bundle a2 = BundleKt.a(new k[0]);
            Iterator it = paramQuery.f20417b.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                NavArgument navArgument = (NavArgument) linkedHashMap.get(str2);
                NavType navType = navArgument != null ? navArgument.f20320a : null;
                if ((navType instanceof CollectionNavType) && !navArgument.f20322c) {
                    navType.e(a2, str2, ((CollectionNavType) navType).h());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = paramQuery.f20416a;
                Matcher matcher = str4 != null ? Pattern.compile(str4, 32).matcher(str3) : null;
                if (matcher == null || !matcher.matches()) {
                    return i2;
                }
                ArrayList arrayList = paramQuery.f20417b;
                ArrayList arrayList2 = new ArrayList(q.M(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                int i3 = i2;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        f0.D();
                        throw null;
                    }
                    String str5 = (String) next;
                    String group = matcher.group(i4);
                    if (group == null) {
                        group = "";
                    }
                    NavArgument navArgument2 = (NavArgument) linkedHashMap.get(str5);
                    if (a2.containsKey(str5)) {
                        if (a2.containsKey(str5)) {
                            if (navArgument2 != null) {
                                NavType navType2 = navArgument2.f20320a;
                                Object a3 = navType2.a(a2, str5);
                                p0.a.s(str5, SDKConstants.PARAM_KEY);
                                if (!a2.containsKey(str5)) {
                                    throw new IllegalArgumentException("There is no previous value in this bundle.");
                                    break loop0;
                                }
                                navType2.e(a2, str5, navType2.c(a3, group));
                            }
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        obj = Boolean.valueOf(z2);
                        arrayList2.add(obj);
                        i2 = 0;
                        i3 = i4;
                    } else {
                        g(a2, str5, group, navArgument2);
                        obj = b0Var;
                        arrayList2.add(obj);
                        i2 = 0;
                        i3 = i4;
                    }
                }
            }
            bundle.putAll(a2);
            navDeepLink = this;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f20400a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f20401b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20402c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
