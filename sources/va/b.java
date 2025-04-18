package va;

import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.domains.IapDomain;
import i7.m;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ni.p0;
import wh.d0;

/* loaded from: classes3.dex */
public abstract class b {
    public static final m2.g a;

    /* renamed from: b, reason: collision with root package name */
    public static final m2.g f26376b;

    /* renamed from: c, reason: collision with root package name */
    public static final m2.g f26377c;

    /* renamed from: d, reason: collision with root package name */
    public static final m2.g f26378d;

    /* renamed from: e, reason: collision with root package name */
    public static final m2.g f26379e;

    /* renamed from: f, reason: collision with root package name */
    public static final m2.g f26380f;

    /* renamed from: g, reason: collision with root package name */
    public static final m2.g f26381g;

    /* renamed from: h, reason: collision with root package name */
    public static final m f26382h = new m(5);

    static {
        int i10 = 1;
        int i11 = 2;
        a = new m2.g(i10, i11, 0);
        int i12 = 3;
        int i13 = 4;
        f26376b = new m2.g(i12, i13, i10);
        int i14 = 5;
        f26377c = new m2.g(i13, i14, i11);
        int i15 = 6;
        int i16 = 7;
        f26378d = new m2.g(i15, i16, i12);
        int i17 = 8;
        f26379e = new m2.g(i16, i17, i13);
        f26380f = new m2.g(i17, 9, i14);
        f26381g = new m2.g(11, 12, i15);
    }

    public /* synthetic */ b() {
    }

    public static int k(int i10, int i11) {
        if (i11 >= 0) {
            int i12 = i10 + (i10 >> 1) + 1;
            if (i12 < i11) {
                i12 = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (i12 < 0) {
                return Integer.MAX_VALUE;
            }
            return i12;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public static IapDomain l() {
        return new IapDomain("iap_plantid_5.99_100scans", "100 scans", null, 100, 1, false, R.string.number_scans_res, 36, null);
    }

    public static List m() {
        return CollectionsKt.mutableListOf(new IapDomain("sub_yearly_plantid_25", "Yearly", null, 0, 0, true, R.string.yearly, 28, null), new IapDomain("iap_plantid_3.99_50scans", "50 scans", null, 50, 1, false, R.string.number_scans_res, 36, null), new IapDomain("iap_planid_15_200scans", "200 scans", null, 200, 1, false, R.string.number_scans_res, 36, null));
    }

    public static List n() {
        return CollectionsKt.mutableListOf(new IapDomain("sub_yearly_plantid_29.99", "Yearly", null, 0, 0, true, R.string.yearly, 28, null), new IapDomain("iap_plantid_3.99_50scans", "50 scans", null, 50, 1, false, R.string.number_scans_res, 36, null), new IapDomain("iap_planid_9.99_200scans", "200 scans", null, 200, 1, false, R.string.number_scans_res, 36, null));
    }

    public static String s(d0 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String b3 = url.b();
        String d10 = url.d();
        if (d10 != null) {
            return b3 + '?' + ((Object) d10);
        }
        return b3;
    }

    public abstract File a(String str);

    public abstract void b(String str);

    public abstract void c(String str);

    public abstract b d(Object obj);

    public abstract void e(p0 p0Var, Object obj);

    public ni.d0 f() {
        return new ni.d0(this, 1);
    }

    public abstract boolean g(w2.h hVar, w2.c cVar, w2.c cVar2);

    public abstract boolean h(w2.h hVar, Object obj, Object obj2);

    public abstract boolean i(w2.h hVar, w2.g gVar, w2.g gVar2);

    public abstract Map j();

    public abstract String o(int i10);

    public ni.d0 p() {
        return new ni.d0(this, 0);
    }

    public abstract void q(w2.g gVar, w2.g gVar2);

    public abstract void r(w2.g gVar, Thread thread);

    public abstract File t(String str);

    public /* synthetic */ b(Object obj) {
    }
}
