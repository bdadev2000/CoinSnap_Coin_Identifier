package i8;

import com.adjust.sdk.Constants;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: k, reason: collision with root package name */
    public static final char[] f20883k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f20884a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20885c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20886d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20887e;

    /* renamed from: f, reason: collision with root package name */
    public final List f20888f;

    /* renamed from: g, reason: collision with root package name */
    public final List f20889g;

    /* renamed from: h, reason: collision with root package name */
    public final String f20890h;

    /* renamed from: i, reason: collision with root package name */
    public final String f20891i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f20892j;

    public u(String str, String str2, String str3, String str4, int i9, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        G7.j.e(str, "scheme");
        G7.j.e(str4, "host");
        this.f20884a = str;
        this.b = str2;
        this.f20885c = str3;
        this.f20886d = str4;
        this.f20887e = i9;
        this.f20889g = arrayList2;
        this.f20890h = str5;
        this.f20891i = str6;
        this.f20892j = str.equals(Constants.SCHEME);
    }

    public final String a() {
        if (this.f20885c.length() == 0) {
            return "";
        }
        int length = this.f20884a.length() + 3;
        String str = this.f20891i;
        String substring = str.substring(O7.g.I(str, ':', length, false, 4) + 1, O7.g.I(str, '@', 0, false, 6));
        G7.j.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.f20884a.length() + 3;
        String str = this.f20891i;
        int I5 = O7.g.I(str, '/', length, false, 4);
        String substring = str.substring(I5, j8.b.e(I5, str.length(), str, "?#"));
        G7.j.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.f20884a.length() + 3;
        String str = this.f20891i;
        int I5 = O7.g.I(str, '/', length, false, 4);
        int e4 = j8.b.e(I5, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (I5 < e4) {
            int i9 = I5 + 1;
            int f9 = j8.b.f(str, i9, e4, '/');
            String substring = str.substring(i9, f9);
            G7.j.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            I5 = f9;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f20889g == null) {
            return null;
        }
        String str = this.f20891i;
        int I5 = O7.g.I(str, '?', 0, false, 6) + 1;
        String substring = str.substring(I5, j8.b.f(str, I5, str.length(), '#'));
        G7.j.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.f20884a.length() + 3;
        String str = this.f20891i;
        String substring = str.substring(length, j8.b.e(length, str.length(), str, ":@"));
        G7.j.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof u) && G7.j.a(((u) obj).f20891i, this.f20891i)) {
            return true;
        }
        return false;
    }

    public final t f() {
        int i9;
        ArrayList g9;
        t tVar = new t();
        String str = this.f20884a;
        tVar.f20878e = str;
        tVar.f20879f = e();
        tVar.f20880g = a();
        tVar.f20881h = this.f20886d;
        G7.j.e(str, "scheme");
        int i10 = -1;
        if (str.equals("http")) {
            i9 = 80;
        } else if (str.equals(Constants.SCHEME)) {
            i9 = 443;
        } else {
            i9 = -1;
        }
        int i11 = this.f20887e;
        if (i11 != i9) {
            i10 = i11;
        }
        tVar.f20876c = i10;
        ArrayList arrayList = tVar.f20877d;
        arrayList.clear();
        arrayList.addAll(c());
        String d2 = d();
        String str2 = null;
        if (d2 == null) {
            g9 = null;
        } else {
            g9 = C2365b.g(C2365b.b(d2, 0, 0, " \"'<>#", true, false, true, false, 211));
        }
        tVar.b = g9;
        if (this.f20890h != null) {
            String str3 = this.f20891i;
            str2 = str3.substring(O7.g.I(str3, '#', 0, false, 6) + 1);
            G7.j.d(str2, "this as java.lang.String).substring(startIndex)");
        }
        tVar.f20882i = str2;
        return tVar;
    }

    public final URI g() {
        String replaceAll;
        String b;
        t f9 = f();
        String str = (String) f9.f20881h;
        String str2 = null;
        if (str == null) {
            replaceAll = null;
        } else {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            G7.j.d(compile, "compile(...)");
            replaceAll = compile.matcher(str).replaceAll("");
            G7.j.d(replaceAll, "replaceAll(...)");
        }
        f9.f20881h = replaceAll;
        ArrayList arrayList = f9.f20877d;
        int size = arrayList.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.set(i10, C2365b.b((String) arrayList.get(i10), 0, 0, "[]", true, true, false, false, 227));
        }
        List list = f9.b;
        if (list != null) {
            int size2 = list.size();
            while (i9 < size2) {
                int i11 = i9 + 1;
                String str3 = (String) list.get(i9);
                if (str3 == null) {
                    b = null;
                } else {
                    b = C2365b.b(str3, 0, 0, "\\^`{|}", true, true, true, false, 195);
                }
                list.set(i9, b);
                i9 = i11;
            }
        }
        String str4 = (String) f9.f20882i;
        if (str4 != null) {
            str2 = C2365b.b(str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163);
        }
        f9.f20882i = str2;
        String tVar = f9.toString();
        try {
            return new URI(tVar);
        } catch (URISyntaxException e4) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                G7.j.d(compile2, "compile(...)");
                String replaceAll2 = compile2.matcher(tVar).replaceAll("");
                G7.j.d(replaceAll2, "replaceAll(...)");
                URI create = URI.create(replaceAll2);
                G7.j.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e4);
            }
        }
    }

    public final URL h() {
        try {
            return new URL(this.f20891i);
        } catch (MalformedURLException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final int hashCode() {
        return this.f20891i.hashCode();
    }

    public final String toString() {
        return this.f20891i;
    }
}
