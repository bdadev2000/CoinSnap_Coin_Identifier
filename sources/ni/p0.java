package ni;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 {

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f22827l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f22828m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final wh.d0 f22829b;

    /* renamed from: c, reason: collision with root package name */
    public String f22830c;

    /* renamed from: d, reason: collision with root package name */
    public wh.b0 f22831d;

    /* renamed from: e, reason: collision with root package name */
    public final wh.n0 f22832e = new wh.n0();

    /* renamed from: f, reason: collision with root package name */
    public final a4.s f22833f;

    /* renamed from: g, reason: collision with root package name */
    public wh.g0 f22834g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f22835h;

    /* renamed from: i, reason: collision with root package name */
    public final wh.h0 f22836i;

    /* renamed from: j, reason: collision with root package name */
    public final wh.v f22837j;

    /* renamed from: k, reason: collision with root package name */
    public wh.s0 f22838k;

    public p0(String str, wh.d0 d0Var, String str2, wh.z zVar, wh.g0 g0Var, boolean z10, boolean z11, boolean z12) {
        this.a = str;
        this.f22829b = d0Var;
        this.f22830c = str2;
        this.f22834g = g0Var;
        this.f22835h = z10;
        if (zVar != null) {
            this.f22833f = zVar.c();
        } else {
            this.f22833f = new a4.s();
        }
        if (z11) {
            this.f22837j = new wh.v();
            return;
        }
        if (z12) {
            wh.h0 h0Var = new wh.h0();
            this.f22836i = h0Var;
            wh.g0 type = wh.j0.f27081f;
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.areEqual(type.f27061b, "multipart")) {
                h0Var.f27064b = type;
                return;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("multipart != ", type).toString());
        }
    }

    public final void a(String name, String value, boolean z10) {
        wh.v vVar = this.f22837j;
        if (z10) {
            vVar.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList arrayList = vVar.a;
            char[] cArr = wh.d0.f27032k;
            arrayList.add(wh.c0.e(name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, 83));
            vVar.f27227b.add(wh.c0.e(value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, 83));
            return;
        }
        vVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList2 = vVar.a;
        char[] cArr2 = wh.d0.f27032k;
        arrayList2.add(wh.c0.e(name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, 91));
        vVar.f27227b.add(wh.c0.e(value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, 91));
    }

    public final void b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Pattern pattern = wh.g0.f27059d;
                this.f22834g = wh.a0.r(str2);
                return;
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException(vd.e.e("Malformed content type: ", str2), e2);
            }
        }
        this.f22833f.a(str, str2);
    }

    public final void c(String name, String str, boolean z10) {
        wh.b0 b0Var;
        String link = this.f22830c;
        String str2 = null;
        if (link != null) {
            wh.d0 d0Var = this.f22829b;
            d0Var.getClass();
            Intrinsics.checkNotNullParameter(link, "link");
            try {
                b0Var = new wh.b0();
                b0Var.c(d0Var, link);
            } catch (IllegalArgumentException unused) {
                b0Var = null;
            }
            this.f22831d = b0Var;
            if (b0Var != null) {
                this.f22830c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + d0Var + ", Relative: " + this.f22830c);
            }
        }
        if (z10) {
            wh.b0 b0Var2 = this.f22831d;
            b0Var2.getClass();
            Intrinsics.checkNotNullParameter(name, "encodedName");
            if (b0Var2.f27025g == null) {
                b0Var2.f27025g = new ArrayList();
            }
            List list = b0Var2.f27025g;
            Intrinsics.checkNotNull(list);
            char[] cArr = wh.d0.f27032k;
            list.add(wh.c0.e(name, 0, 0, " \"'<>#&=", true, false, true, false, 211));
            List list2 = b0Var2.f27025g;
            Intrinsics.checkNotNull(list2);
            if (str != null) {
                str2 = wh.c0.e(str, 0, 0, " \"'<>#&=", true, false, true, false, 211);
            }
            list2.add(str2);
            return;
        }
        wh.b0 b0Var3 = this.f22831d;
        b0Var3.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        if (b0Var3.f27025g == null) {
            b0Var3.f27025g = new ArrayList();
        }
        List list3 = b0Var3.f27025g;
        Intrinsics.checkNotNull(list3);
        char[] cArr2 = wh.d0.f27032k;
        list3.add(wh.c0.e(name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219));
        List list4 = b0Var3.f27025g;
        Intrinsics.checkNotNull(list4);
        if (str != null) {
            str2 = wh.c0.e(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219);
        }
        list4.add(str2);
    }
}
