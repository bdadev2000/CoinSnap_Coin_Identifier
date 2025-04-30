package i3;

import com.bumptech.glide.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import k3.l;

/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2342a implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final String f20643c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f20644d;

    /* renamed from: e, reason: collision with root package name */
    public static final C2342a f20645e;

    /* renamed from: f, reason: collision with root package name */
    public static final C2342a f20646f;

    /* renamed from: a, reason: collision with root package name */
    public final String f20647a;
    public final String b;

    static {
        String S8 = d.S("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f20643c = S8;
        String S9 = d.S("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String S10 = d.S("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f20644d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new h3.c("proto"), new h3.c("json"))));
        f20645e = new C2342a(S8, null);
        f20646f = new C2342a(S9, S10);
    }

    public C2342a(String str, String str2) {
        this.f20647a = str;
        this.b = str2;
    }

    public static C2342a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C2342a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }
}
