package g7;

import i7.k;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class a implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final String f18228c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f18229d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f18230e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f18231f;
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18232b;

    static {
        String r6 = com.bumptech.glide.d.r("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f18228c = r6;
        String r10 = com.bumptech.glide.d.r("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String r11 = com.bumptech.glide.d.r("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f18229d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new f7.c("proto"), new f7.c("json"))));
        f18230e = new a(r6, null);
        f18231f = new a(r10, r11);
    }

    public a(String str, String str2) {
        this.a = str;
        this.f18232b = str2;
    }

    public static a a(byte[] bArr) {
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
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }
}
