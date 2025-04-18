package ni;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class q0 {

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f22841x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f22842y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    public final u0 a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f22843b;

    /* renamed from: c, reason: collision with root package name */
    public final Annotation[] f22844c;

    /* renamed from: d, reason: collision with root package name */
    public final Annotation[][] f22845d;

    /* renamed from: e, reason: collision with root package name */
    public final Type[] f22846e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22847f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22848g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22849h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22850i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22851j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f22852k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22853l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f22854m;

    /* renamed from: n, reason: collision with root package name */
    public String f22855n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f22856o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f22857p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f22858q;

    /* renamed from: r, reason: collision with root package name */
    public String f22859r;

    /* renamed from: s, reason: collision with root package name */
    public wh.z f22860s;

    /* renamed from: t, reason: collision with root package name */
    public wh.g0 f22861t;
    public LinkedHashSet u;

    /* renamed from: v, reason: collision with root package name */
    public va.b[] f22862v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f22863w;

    public q0(u0 u0Var, Method method) {
        this.a = u0Var;
        this.f22843b = method;
        this.f22844c = method.getAnnotations();
        this.f22846e = method.getGenericParameterTypes();
        this.f22845d = method.getParameterAnnotations();
    }

    public static Class a(Class cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        return cls;
    }

    public final void b(String str, String str2, boolean z10) {
        String str3 = this.f22855n;
        Method method = this.f22843b;
        if (str3 == null) {
            this.f22855n = str;
            this.f22856o = z10;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            Pattern pattern = f22841x;
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (pattern.matcher(substring).find()) {
                    throw com.facebook.appevents.g.B(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.f22859r = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.u = linkedHashSet;
            return;
        }
        throw com.facebook.appevents.g.B(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
    }

    public final void c(int i10, Type type) {
        if (!com.facebook.appevents.g.q(type)) {
        } else {
            throw com.facebook.appevents.g.C(this.f22843b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
