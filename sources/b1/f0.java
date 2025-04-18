package b1;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okio.Path;

/* loaded from: classes4.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final android.support.v4.media.session.i f22306a = new android.support.v4.media.session.i("RESUME_TOKEN");

    /* renamed from: b, reason: collision with root package name */
    public static final android.support.v4.media.session.i f22307b = new android.support.v4.media.session.i("REMOVED_TASK");

    /* renamed from: c, reason: collision with root package name */
    public static final android.support.v4.media.session.i f22308c = new android.support.v4.media.session.i("CLOSED_EMPTY");
    public static final android.support.v4.media.session.i d = new android.support.v4.media.session.i("COMPLETING_ALREADY");
    public static final android.support.v4.media.session.i e = new android.support.v4.media.session.i("COMPLETING_WAITING_CHILDREN");

    /* renamed from: f, reason: collision with root package name */
    public static final android.support.v4.media.session.i f22309f = new android.support.v4.media.session.i("COMPLETING_RETRY");

    /* renamed from: g, reason: collision with root package name */
    public static final android.support.v4.media.session.i f22310g = new android.support.v4.media.session.i("TOO_LATE_TO_CANCEL");

    /* renamed from: h, reason: collision with root package name */
    public static final android.support.v4.media.session.i f22311h = new android.support.v4.media.session.i("SEALED");

    /* renamed from: i, reason: collision with root package name */
    public static final s0 f22312i = new s0(false);

    /* renamed from: j, reason: collision with root package name */
    public static final s0 f22313j = new s0(true);

    public static final String A(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        p0.a.r(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static Set B(Object obj) {
        Set singleton = Collections.singleton(obj);
        p0.a.r(singleton, "singleton(...)");
        return singleton;
    }

    public static Set C(Object... objArr) {
        return objArr.length > 0 ? e0.q.q0(objArr) : e0.y.f30220a;
    }

    public static void D() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final d0.k E(Object obj, Serializable serializable) {
        return new d0.k(obj, serializable);
    }

    public static final String F(h0.g gVar) {
        Object d2;
        if (gVar instanceof g1.i) {
            return gVar.toString();
        }
        try {
            d2 = gVar + '@' + o(gVar);
        } catch (Throwable th) {
            d2 = kotlin.jvm.internal.q.d(th);
        }
        if (d0.n.a(d2) != null) {
            d2 = gVar.getClass().getName() + '@' + o(gVar);
        }
        return (String) d2;
    }

    public static final List G(ArrayList arrayList) {
        int size = arrayList.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(arrayList)) : Collections.singletonList(e0.u.E0(arrayList)) : e0.w.f30218a;
    }

    public static final Map H(Map map) {
        int size = map.size();
        if (size == 0) {
            return e0.x.f30219a;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) e0.u.D0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final Object I(Object obj) {
        d1 d1Var;
        e1 e1Var = obj instanceof e1 ? (e1) obj : null;
        return (e1Var == null || (d1Var = e1Var.f22299a) == null) ? obj : d1Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, p.h] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, p.h] */
    public static final p.h a(Context context, p.g gVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager == null || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return new Object();
        }
        try {
            return new p.j(connectivityManager, gVar);
        } catch (Exception unused) {
            return new Object();
        }
    }

    public static ArrayList b(Object... objArr) {
        p0.a.s(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new e0.m(objArr, true));
    }

    public static int c(int i2, int i3, List list, q0.l lVar) {
        p0.a.s(list, "<this>");
        z(list.size(), i2, i3);
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int intValue = ((Number) lVar.invoke(list.get(i5))).intValue();
            if (intValue < 0) {
                i2 = i5 + 1;
            } else {
                if (intValue <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static int d(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        p0.a.s(arrayList, "<this>");
        int i2 = 0;
        z(arrayList.size(), 0, size);
        int i3 = size - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int c2 = kotlin.jvm.internal.q.c((Comparable) arrayList.get(i4), comparable);
            if (c2 < 0) {
                i2 = i4 + 1;
            } else {
                if (c2 <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static f0.c e(f0.c cVar) {
        if (cVar.f30421f != null) {
            throw new IllegalStateException();
        }
        cVar.j();
        cVar.d = true;
        return cVar.f30420c > 0 ? cVar : f0.c.f30417h;
    }

    public static f0.l f(f0.l lVar) {
        f0.g gVar = lVar.f30449a;
        gVar.c();
        gVar.f30441n = true;
        if (gVar.f30437j <= 0) {
            p0.a.q(f0.g.f30429o, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        return gVar.f30437j > 0 ? lVar : f0.l.f30448b;
    }

    public static boolean g(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            Object obj2 = objArr2[i2];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!g((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if (!p0.a.g(obj, obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final void h(int i2, int i3) {
        if (i2 > i3) {
            throw new IndexOutOfBoundsException(android.support.v4.media.d.l("toIndex (", i2, ") is greater than size (", i3, ")."));
        }
    }

    public static void i(InputStream inputStream, OutputStream outputStream) {
        p0.a.s(inputStream, "<this>");
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h0.g j(Object obj, h0.g gVar, q0.p pVar) {
        p0.a.s(pVar, "<this>");
        p0.a.s(gVar, "completion");
        if (pVar instanceof j0.a) {
            return ((j0.a) pVar).create(obj, gVar);
        }
        h0.l context = gVar.getContext();
        return context == h0.m.f30726a ? new i0.b(obj, gVar, pVar) : new i0.c(gVar, context, pVar, obj);
    }

    public static final void k(i.g gVar, Path path) {
        try {
            IOException iOException = null;
            for (Path path2 : gVar.list(path)) {
                try {
                    if (gVar.metadata(path2).isDirectory()) {
                        k(gVar, path2);
                    }
                    gVar.delete(path2);
                } catch (IOException e2) {
                    if (iOException == null) {
                        iOException = e2;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final k0.b l(Enum[] enumArr) {
        p0.a.s(enumArr, RemoteConfigConstants.ResponseFieldKey.ENTRIES);
        return new k0.b(enumArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [y0.a] */
    public static final void m(BufferedReader bufferedReader, q0.l lVar) {
        p0.a.s(lVar, "action");
        try {
            e0.p pVar = new e0.p(bufferedReader);
            if (!(pVar instanceof y0.a)) {
                pVar = new y0.a(pVar);
            }
            Iterator it = pVar.iterator();
            while (it.hasNext()) {
                lVar.invoke(it.next());
            }
            kotlin.jvm.internal.q.b(bufferedReader, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.jvm.internal.q.b(bufferedReader, th);
                throw th2;
            }
        }
    }

    public static final int n(Bitmap bitmap) {
        int i2 = 1;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                if (config != Bitmap.Config.ALPHA_8) {
                    i2 = 2;
                    if (config != Bitmap.Config.RGB_565 && config != Bitmap.Config.ARGB_4444) {
                        i2 = config == Bitmap.Config.RGBA_F16 ? 8 : 4;
                    }
                }
                return height * i2;
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static final String o(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static int p(List list) {
        p0.a.s(list, "<this>");
        return list.size() - 1;
    }

    public static HashSet q(Object... objArr) {
        HashSet hashSet = new HashSet(kotlin.jvm.internal.q.g(objArr.length));
        e0.q.j0(hashSet, objArr);
        return hashSet;
    }

    public static h0.g r(h0.g gVar) {
        h0.g intercepted;
        p0.a.s(gVar, "<this>");
        j0.c cVar = gVar instanceof j0.c ? (j0.c) gVar : null;
        return (cVar == null || (intercepted = cVar.intercepted()) == null) ? gVar : intercepted;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [d0.o, d0.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [d0.c0, d0.h, java.lang.Object] */
    public static d0.h s(d0.i iVar, q0.a aVar) {
        p0.a.s(aVar, "initializer");
        int ordinal = iVar.ordinal();
        if (ordinal == 0) {
            return new d0.p(aVar);
        }
        d0.x xVar = d0.x.f30144a;
        if (ordinal == 1) {
            ?? obj = new Object();
            obj.f30139a = aVar;
            obj.f30140b = xVar;
            return obj;
        }
        if (ordinal != 2) {
            throw new RuntimeException();
        }
        ?? obj2 = new Object();
        obj2.f30126a = aVar;
        obj2.f30127b = xVar;
        return obj2;
    }

    public static d0.p t(q0.a aVar) {
        p0.a.s(aVar, "initializer");
        return new d0.p(aVar);
    }

    public static List u(Object obj) {
        List singletonList = Collections.singletonList(obj);
        p0.a.r(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static List v(Object... objArr) {
        p0.a.s(objArr, "elements");
        return objArr.length > 0 ? e0.q.J(objArr) : e0.w.f30218a;
    }

    public static ArrayList w(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new e0.m(objArr, true));
    }

    public static final List x(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : u(list.get(0)) : e0.w.f30218a;
    }

    public static h0.l y(h0.l lVar, h0.l lVar2) {
        p0.a.s(lVar2, "context");
        return lVar2 == h0.m.f30726a ? lVar : (h0.l) lVar2.H(lVar, h0.d.f30719c);
    }

    public static final void z(int i2, int i3, int i4) {
        if (i3 > i4) {
            throw new IllegalArgumentException(android.support.v4.media.d.l("fromIndex (", i3, ") is greater than toIndex (", i4, ")."));
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(android.support.v4.media.d.j("fromIndex (", i3, ") is less than zero."));
        }
        if (i4 > i2) {
            throw new IndexOutOfBoundsException(android.support.v4.media.d.l("toIndex (", i4, ") is greater than size (", i2, ")."));
        }
    }
}
