package wh;

import com.adjust.sdk.Constants;
import com.applovin.sdk.AppLovinEventParameters;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public final class d0 {

    /* renamed from: k, reason: collision with root package name */
    public static final char[] f27032k;
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27033b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27034c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27035d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27036e;

    /* renamed from: f, reason: collision with root package name */
    public final List f27037f;

    /* renamed from: g, reason: collision with root package name */
    public final List f27038g;

    /* renamed from: h, reason: collision with root package name */
    public final String f27039h;

    /* renamed from: i, reason: collision with root package name */
    public final String f27040i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f27041j;

    static {
        int i10 = 0;
        new c0(i10, i10);
        f27032k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public d0(String scheme, String username, String password, String host, int i10, ArrayList pathSegments, ArrayList arrayList, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = scheme;
        this.f27033b = username;
        this.f27034c = password;
        this.f27035d = host;
        this.f27036e = i10;
        this.f27037f = pathSegments;
        this.f27038g = arrayList;
        this.f27039h = str;
        this.f27040i = url;
        this.f27041j = Intrinsics.areEqual(scheme, Constants.SCHEME);
    }

    public final String a() {
        boolean z10;
        int indexOf$default;
        int indexOf$default2;
        if (this.f27034c.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.f27040i;
        indexOf$default = StringsKt__StringsKt.indexOf$default(str, AbstractJsonLexerKt.COLON, length, false, 4, (Object) null);
        indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, '@', 0, false, 6, (Object) null);
        String substring = str.substring(indexOf$default + 1, indexOf$default2);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int indexOf$default;
        int length = this.a.length() + 3;
        String str = this.f27040i;
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '/', length, false, 4, (Object) null);
        String substring = str.substring(indexOf$default, xh.b.e(indexOf$default, str.length(), str, "?#"));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int indexOf$default;
        int length = this.a.length() + 3;
        String str = this.f27040i;
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '/', length, false, 4, (Object) null);
        int e2 = xh.b.e(indexOf$default, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf$default < e2) {
            int i10 = indexOf$default + 1;
            int f10 = xh.b.f(str, i10, e2, '/');
            String substring = str.substring(i10, f10);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            indexOf$default = f10;
        }
        return arrayList;
    }

    public final String d() {
        int indexOf$default;
        if (this.f27038g == null) {
            return null;
        }
        String str = this.f27040i;
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, '?', 0, false, 6, (Object) null);
        int i10 = indexOf$default + 1;
        String substring = str.substring(i10, xh.b.f(str, i10, str.length(), '#'));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        boolean z10;
        if (this.f27033b.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.f27040i;
        String substring = str.substring(length, xh.b.e(length, str.length(), str, ":@"));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d0) && Intrinsics.areEqual(((d0) obj).f27040i, this.f27040i);
    }

    public final b0 f() {
        int indexOf$default;
        String substring;
        b0 b0Var = new b0();
        String str = this.a;
        b0Var.a = str;
        String e2 = e();
        Intrinsics.checkNotNullParameter(e2, "<set-?>");
        b0Var.f27020b = e2;
        String a = a();
        Intrinsics.checkNotNullParameter(a, "<set-?>");
        b0Var.f27021c = a;
        b0Var.f27022d = this.f27035d;
        int f10 = c0.f(str);
        int i10 = this.f27036e;
        if (i10 == f10) {
            i10 = -1;
        }
        b0Var.f27023e = i10;
        ArrayList arrayList = b0Var.f27024f;
        arrayList.clear();
        arrayList.addAll(c());
        b0Var.b(d());
        if (this.f27039h == null) {
            substring = null;
        } else {
            String str2 = this.f27040i;
            indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str2, '#', 0, false, 6, (Object) null);
            substring = str2.substring(indexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        }
        b0Var.f27026h = substring;
        return b0Var;
    }

    public final String g() {
        b0 b0Var;
        Intrinsics.checkNotNullParameter("/...", "link");
        try {
            b0Var = new b0();
            b0Var.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            b0Var = null;
        }
        Intrinsics.checkNotNull(b0Var);
        b0Var.getClass();
        Intrinsics.checkNotNullParameter("", AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
        String e2 = c0.e("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        Intrinsics.checkNotNullParameter(e2, "<set-?>");
        b0Var.f27020b = e2;
        Intrinsics.checkNotNullParameter("", "password");
        String e10 = c0.e("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        Intrinsics.checkNotNullParameter(e10, "<set-?>");
        b0Var.f27021c = e10;
        return b0Var.a().f27040i;
    }

    public final URI h() {
        String replace;
        String e2;
        b0 f10 = f();
        String str = f10.f27022d;
        String str2 = null;
        if (str == null) {
            replace = null;
        } else {
            replace = new Regex("[\"<>^`{|}]").replace(str, "");
        }
        f10.f27022d = replace;
        ArrayList arrayList = f10.f27024f;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.set(i11, c0.e((String) arrayList.get(i11), 0, 0, "[]", true, true, false, false, 227));
        }
        List list = f10.f27025g;
        if (list != null) {
            int size2 = list.size();
            while (i10 < size2) {
                int i12 = i10 + 1;
                String str3 = (String) list.get(i10);
                if (str3 == null) {
                    e2 = null;
                } else {
                    e2 = c0.e(str3, 0, 0, "\\^`{|}", true, true, true, false, 195);
                }
                list.set(i10, e2);
                i10 = i12;
            }
        }
        String str4 = f10.f27026h;
        if (str4 != null) {
            str2 = c0.e(str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163);
        }
        f10.f27026h = str2;
        String b0Var = f10.toString();
        try {
            return new URI(b0Var);
        } catch (URISyntaxException e10) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(b0Var, ""));
                Intrinsics.checkNotNullExpressionValue(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final int hashCode() {
        return this.f27040i.hashCode();
    }

    public final String toString() {
        return this.f27040i;
    }
}
