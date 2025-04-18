package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.d;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt$valueIterator$1;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavigatorProvider;
import d0.p;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y0.j;
import y0.n;
import z0.m;

/* loaded from: classes.dex */
public class NavDestination {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f20430k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f20431a;

    /* renamed from: b, reason: collision with root package name */
    public NavGraph f20432b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f20433c;
    public final ArrayList d;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArrayCompat f20434f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f20435g;

    /* renamed from: h, reason: collision with root package name */
    public int f20436h;

    /* renamed from: i, reason: collision with root package name */
    public String f20437i;

    /* renamed from: j, reason: collision with root package name */
    public p f20438j;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes.dex */
    public @interface ClassType {
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public static String a(String str) {
            return str != null ? "android-app://androidx.navigation/".concat(str) : "";
        }

        public static String b(int i2, Context context) {
            String valueOf;
            p0.a.s(context, "context");
            if (i2 <= 16777215) {
                return String.valueOf(i2);
            }
            try {
                valueOf = context.getResources().getResourceName(i2);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i2);
            }
            p0.a.r(valueOf, "try {\n                  …tring()\n                }");
            return valueOf;
        }

        public static j c(NavDestination navDestination) {
            p0.a.s(navDestination, "<this>");
            return n.J(navDestination, NavDestination$Companion$hierarchy$1.f20439a);
        }
    }

    @RestrictTo
    /* loaded from: classes.dex */
    public static final class DeepLinkMatch implements Comparable<DeepLinkMatch> {

        /* renamed from: a, reason: collision with root package name */
        public final NavDestination f20440a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f20441b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f20442c;
        public final int d;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f20443f;

        /* renamed from: g, reason: collision with root package name */
        public final int f20444g;

        public DeepLinkMatch(NavDestination navDestination, Bundle bundle, boolean z2, int i2, boolean z3, int i3) {
            p0.a.s(navDestination, "destination");
            this.f20440a = navDestination;
            this.f20441b = bundle;
            this.f20442c = z2;
            this.d = i2;
            this.f20443f = z3;
            this.f20444g = i3;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(DeepLinkMatch deepLinkMatch) {
            p0.a.s(deepLinkMatch, "other");
            boolean z2 = deepLinkMatch.f20442c;
            boolean z3 = this.f20442c;
            if (z3 && !z2) {
                return 1;
            }
            if (!z3 && z2) {
                return -1;
            }
            int i2 = this.d - deepLinkMatch.d;
            if (i2 > 0) {
                return 1;
            }
            if (i2 < 0) {
                return -1;
            }
            Bundle bundle = deepLinkMatch.f20441b;
            Bundle bundle2 = this.f20441b;
            if (bundle2 != null && bundle == null) {
                return 1;
            }
            if (bundle2 == null && bundle != null) {
                return -1;
            }
            if (bundle2 != null) {
                int size = bundle2.size();
                p0.a.p(bundle);
                int size2 = size - bundle.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z4 = deepLinkMatch.f20443f;
            boolean z5 = this.f20443f;
            if (z5 && !z4) {
                return 1;
            }
            if (z5 || !z4) {
                return this.f20444g - deepLinkMatch.f20444g;
            }
            return -1;
        }
    }

    static {
        new LinkedHashMap();
    }

    public NavDestination(String str) {
        this.f20431a = str;
        this.d = new ArrayList();
        this.f20434f = new SparseArrayCompat(0);
        this.f20435g = new LinkedHashMap();
    }

    public final Bundle b(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.f20435g;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            NavArgument navArgument = (NavArgument) entry.getValue();
            navArgument.getClass();
            p0.a.s(str, "name");
            if (navArgument.f20322c && (obj = navArgument.e) != null) {
                navArgument.f20320a.e(bundle2, str, obj);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                NavArgument navArgument2 = (NavArgument) entry2.getValue();
                if (!navArgument2.d) {
                    p0.a.s(str2, "name");
                    boolean z2 = navArgument2.f20321b;
                    NavType navType = navArgument2.f20320a;
                    if (z2 || !bundle2.containsKey(str2) || bundle2.get(str2) != null) {
                        try {
                            navType.a(bundle2, str2);
                        } catch (ClassCastException unused) {
                        }
                    }
                    StringBuilder v2 = d.v("Wrong argument type for '", str2, "' in argument bundle. ");
                    v2.append(navType.b());
                    v2.append(" expected.");
                    throw new IllegalArgumentException(v2.toString().toString());
                }
            }
        }
        return bundle2;
    }

    public DeepLinkMatch c(NavDeepLinkRequest navDeepLinkRequest) {
        int i2;
        int i3;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        DeepLinkMatch deepLinkMatch = null;
        while (it.hasNext()) {
            NavDeepLink navDeepLink = (NavDeepLink) it.next();
            LinkedHashMap linkedHashMap = this.f20435g;
            Uri uri = navDeepLinkRequest.f20427a;
            Bundle d = uri != null ? navDeepLink.d(uri, linkedHashMap) : null;
            int b2 = navDeepLink.b(uri);
            String str = navDeepLinkRequest.f20428b;
            boolean z2 = str != null && p0.a.g(str, navDeepLink.f20401b);
            String str2 = navDeepLinkRequest.f20429c;
            if (str2 != null) {
                String str3 = navDeepLink.f20402c;
                if (str3 != null) {
                    Pattern pattern = (Pattern) navDeepLink.f20411n.getValue();
                    p0.a.p(pattern);
                    if (pattern.matcher(str2).matches()) {
                        i3 = new NavDeepLink.MimeType(str3).compareTo(new NavDeepLink.MimeType(str2));
                        i2 = i3;
                    }
                }
                i3 = -1;
                i2 = i3;
            } else {
                i2 = -1;
            }
            if (d == null) {
                if (z2 || i2 > -1) {
                    p0.a.s(linkedHashMap, "arguments");
                    Bundle bundle = new Bundle();
                    if (uri != null) {
                        Pattern pattern2 = (Pattern) navDeepLink.f20403f.getValue();
                        Matcher matcher = pattern2 != null ? pattern2.matcher(uri.toString()) : null;
                        if (matcher != null && matcher.matches()) {
                            navDeepLink.e(matcher, bundle, linkedHashMap);
                            if (((Boolean) navDeepLink.f20404g.getValue()).booleanValue()) {
                                navDeepLink.f(uri, bundle, linkedHashMap);
                            }
                        }
                    }
                    if (NavArgumentKt.a(linkedHashMap, new NavDestination$hasRequiredArguments$missingRequiredArguments$1(bundle)).isEmpty()) {
                    }
                }
            }
            DeepLinkMatch deepLinkMatch2 = new DeepLinkMatch(this, d, navDeepLink.f20412o, b2, z2, i2);
            if (deepLinkMatch == null || deepLinkMatch2.compareTo(deepLinkMatch) > 0) {
                deepLinkMatch = deepLinkMatch2;
            }
        }
        return deepLinkMatch;
    }

    public final DeepLinkMatch d(String str) {
        NavDeepLink navDeepLink;
        p0.a.s(str, "route");
        p pVar = this.f20438j;
        if (pVar == null || (navDeepLink = (NavDeepLink) pVar.getValue()) == null) {
            return null;
        }
        Uri parse = Uri.parse(Companion.a(str));
        p0.a.o(parse, "Uri.parse(this)");
        Bundle d = navDeepLink.d(parse, this.f20435g);
        if (d == null) {
            return null;
        }
        return new DeepLinkMatch(this, d, navDeepLink.f20412o, navDeepLink.b(parse), false, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto Lb5
            boolean r2 = r9 instanceof androidx.navigation.NavDestination
            if (r2 != 0) goto Ld
            goto Lb5
        Ld:
            java.util.ArrayList r2 = r8.d
            androidx.navigation.NavDestination r9 = (androidx.navigation.NavDestination) r9
            java.util.ArrayList r3 = r9.d
            boolean r2 = p0.a.g(r2, r3)
            androidx.collection.SparseArrayCompat r3 = r8.f20434f
            int r4 = r3.g()
            androidx.collection.SparseArrayCompat r5 = r9.f20434f
            int r6 = r5.g()
            if (r4 != r6) goto L53
            androidx.collection.SparseArrayKt$keyIterator$1 r4 = new androidx.collection.SparseArrayKt$keyIterator$1
            r4.<init>()
            y0.j r4 = y0.n.I(r4)
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L51
            java.lang.Object r6 = r4.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r7 = r3.c(r6)
            java.lang.Object r6 = r5.c(r6)
            boolean r6 = p0.a.g(r7, r6)
            if (r6 != 0) goto L32
            goto L53
        L51:
            r3 = r0
            goto L54
        L53:
            r3 = r1
        L54:
            java.util.LinkedHashMap r4 = r8.f20435g
            int r5 = r4.size()
            java.util.LinkedHashMap r6 = r9.f20435g
            int r7 = r6.size()
            if (r5 != r7) goto L9b
            java.util.Set r4 = r4.entrySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            e0.p r4 = e0.u.z0(r4)
            java.util.Iterator r4 = r4.iterator()
        L70:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L99
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r7 = r5.getKey()
            boolean r7 = r6.containsKey(r7)
            if (r7 == 0) goto L9b
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r7 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = p0.a.g(r7, r5)
            if (r5 == 0) goto L9b
            goto L70
        L99:
            r4 = r0
            goto L9c
        L9b:
            r4 = r1
        L9c:
            int r5 = r8.f20436h
            int r6 = r9.f20436h
            if (r5 != r6) goto Lb3
            java.lang.String r5 = r8.f20437i
            java.lang.String r9 = r9.f20437i
            boolean r9 = p0.a.g(r5, r9)
            if (r9 == 0) goto Lb3
            if (r2 == 0) goto Lb3
            if (r3 == 0) goto Lb3
            if (r4 == 0) goto Lb3
            goto Lb4
        Lb3:
            r0 = r1
        Lb4:
            return r0
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i2 = this.f20436h * 31;
        String str = this.f20437i;
        int hashCode = i2 + (str != null ? str.hashCode() : 0);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            NavDeepLink navDeepLink = (NavDeepLink) it.next();
            int i3 = hashCode * 31;
            String str2 = navDeepLink.f20400a;
            int hashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = navDeepLink.f20401b;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = navDeepLink.f20402c;
            hashCode = hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        SparseArrayCompat sparseArrayCompat = this.f20434f;
        p0.a.s(sparseArrayCompat, "<this>");
        SparseArrayKt$valueIterator$1 sparseArrayKt$valueIterator$1 = new SparseArrayKt$valueIterator$1(sparseArrayCompat);
        while (sparseArrayKt$valueIterator$1.hasNext()) {
            ((NavAction) sparseArrayKt$valueIterator$1.next()).getClass();
            hashCode *= 961;
        }
        LinkedHashMap linkedHashMap = this.f20435g;
        for (String str5 : linkedHashMap.keySet()) {
            int b2 = androidx.compose.foundation.text.input.a.b(str5, hashCode * 31, 31);
            Object obj = linkedHashMap.get(str5);
            hashCode = b2 + (obj != null ? obj.hashCode() : 0);
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append("0x");
        sb.append(Integer.toHexString(this.f20436h));
        sb.append(")");
        String str = this.f20437i;
        if (str != null && !m.Z0(str)) {
            sb.append(" route=");
            sb.append(this.f20437i);
        }
        if (this.f20433c != null) {
            sb.append(" label=");
            sb.append(this.f20433c);
        }
        String sb2 = sb.toString();
        p0.a.r(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestination(Navigator navigator) {
        this(NavigatorProvider.Companion.a(navigator.getClass()));
        p0.a.s(navigator, "navigator");
        LinkedHashMap linkedHashMap = NavigatorProvider.f20517b;
    }
}
