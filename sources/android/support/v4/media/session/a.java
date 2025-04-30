package android.support.v4.media.session;

import F7.l;
import G7.j;
import K.f;
import T.InterfaceC0277j0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import c8.g;
import c8.h;
import com.bumptech.glide.c;
import com.facebook.appevents.n;
import com.google.android.gms.ads.AdError;
import d4.C;
import d4.N;
import d4.z;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentHashMap;
import l5.k;
import t7.AbstractC2712a;
import u7.AbstractC2815f;

/* loaded from: classes.dex */
public abstract class a implements InterfaceC0277j0 {

    /* renamed from: a, reason: collision with root package name */
    public static String[] f4117a;

    public a() {
        new ConcurrentHashMap();
    }

    public static final h d(String str, g[] gVarArr, l lVar) {
        if (!O7.g.L(str)) {
            c8.a aVar = new c8.a(str);
            lVar.invoke(aVar);
            return new h(str, c8.l.f5453d, aVar.b.size(), AbstractC2815f.D(gVarArr), aVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static final h e(String str, c cVar, g[] gVarArr, l lVar) {
        j.e(str, "serialName");
        j.e(lVar, "builder");
        if (!O7.g.L(str)) {
            if (!cVar.equals(c8.l.f5453d)) {
                c8.a aVar = new c8.a(str);
                lVar.invoke(aVar);
                return new h(str, cVar, aVar.b.size(), AbstractC2815f.D(gVarArr), aVar);
            }
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static final void f(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC2712a.a(th, th2);
            }
        }
    }

    public static AdError g(int i9, String str) {
        return new AdError(i9, str, "com.google.ads.mediation.mintegral");
    }

    public static AdError l(int i9, String str) {
        return new AdError(i9, str, "com.mbridge.msdk");
    }

    public static void m(String str, String str2, Object obj) {
        String s5 = s(str);
        if (Log.isLoggable(s5, 3)) {
            Log.d(s5, String.format(str2, obj));
        }
    }

    public static void n(String str, String str2, Exception exc) {
        String s5 = s(str);
        if (Log.isLoggable(s5, 6)) {
            Log.e(s5, str2, exc);
        }
    }

    public static ColorStateList p(Context context, TypedArray typedArray, int i9) {
        int resourceId;
        ColorStateList colorStateList;
        if (typedArray.hasValue(i9) && (resourceId = typedArray.getResourceId(i9, 0)) != 0 && (colorStateList = I.h.getColorStateList(context, resourceId)) != null) {
            return colorStateList;
        }
        return typedArray.getColorStateList(i9);
    }

    public static ColorStateList q(Context context, k kVar, int i9) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) kVar.b;
        if (typedArray.hasValue(i9) && (resourceId = typedArray.getResourceId(i9, 0)) != 0 && (colorStateList = I.h.getColorStateList(context, resourceId)) != null) {
            return colorStateList;
        }
        return kVar.d(i9);
    }

    public static Drawable r(Context context, TypedArray typedArray, int i9) {
        int resourceId;
        Drawable g9;
        if (typedArray.hasValue(i9) && (resourceId = typedArray.getResourceId(i9, 0)) != 0 && (g9 = n.g(context, resourceId)) != null) {
            return g9;
        }
        return typedArray.getDrawable(i9);
    }

    public static String s(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            String concat = "TRuntime.".concat(str);
            if (concat.length() > 23) {
                return concat.substring(0, 23);
            }
            return concat;
        }
        return "TRuntime.".concat(str);
    }

    public static boolean t(Comparator comparator, Iterable iterable) {
        Object obj;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            obj = ((SortedSet) iterable).comparator();
            if (obj == null) {
                obj = C.b;
            }
        } else if (iterable instanceof N) {
            obj = ((z) ((N) iterable)).f19889f;
        } else {
            return false;
        }
        return comparator.equals(obj);
    }

    public static boolean u(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static final boolean v(Context context) {
        NetworkInfo activeNetworkInfo;
        j.e(context, "<this>");
        Object systemService = context.getSystemService("connectivity");
        j.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (connectivityManager.getActiveNetworkInfo() != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public static List w(Object obj) {
        List singletonList = Collections.singletonList(obj);
        j.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final a8.b x(a5.C0398b r5, M7.d r6, boolean r7) {
        /*
            M7.b r0 = e8.W.f(r6)
            r1 = r6
            G7.x r1 = (G7.x) r1
            int r2 = r1.f1338c
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto Le
            goto Lf
        Le:
            r3 = 0
        Lf:
            java.util.List r1 = r1.b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = u7.AbstractC2818i.E(r1, r4)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4e
            java.lang.Object r4 = r1.next()
            M7.f r4 = (M7.f) r4
            M7.d r4 = r4.b
            if (r4 == 0) goto L36
            r2.add(r4)
            goto L22
        L36:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Star projections in type arguments are not allowed, but had "
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L4e:
            boolean r6 = r2.isEmpty()
            java.lang.String r1 = "clazz"
            r4 = 0
            if (r6 == 0) goto L70
            a7.b r6 = a8.k.f4088a
            G7.j.e(r0, r1)
            if (r3 != 0) goto L69
            a7.b r6 = a8.k.f4088a
            a8.b r6 = r6.o(r0)
            if (r6 == 0) goto L67
            goto L96
        L67:
            r6 = r4
            goto L96
        L69:
            a7.b r6 = a8.k.b
            a8.b r6 = r6.o(r0)
            goto L96
        L70:
            a7.b r6 = a8.k.f4088a
            G7.j.e(r0, r1)
            if (r3 != 0) goto L7e
            E1.d r6 = a8.k.f4089c
            java.lang.Object r6 = r6.i(r0, r2)
            goto L84
        L7e:
            E1.d r6 = a8.k.f4090d
            java.lang.Object r6 = r6.i(r0, r2)
        L84:
            if (r7 == 0) goto L8e
            boolean r1 = r6 instanceof t7.C2721j
            if (r1 == 0) goto L8b
            r6 = r4
        L8b:
            a8.b r6 = (a8.b) r6
            goto L96
        L8e:
            java.lang.Throwable r1 = t7.C2722k.a(r6)
            if (r1 != 0) goto Lc2
            a8.b r6 = (a8.b) r6
        L96:
            if (r6 == 0) goto L99
            return r6
        L99:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto La6
            u7.o r6 = u7.C2824o.b
            r5.t(r0, r6)
        La4:
            r7 = r4
            goto Lb7
        La6:
            java.util.ArrayList r6 = a.AbstractC0325a.r(r5, r2, r7)
            if (r6 != 0) goto Lad
            return r4
        Lad:
            a8.b r7 = a.AbstractC0325a.k(r0, r2, r6)
            if (r7 != 0) goto Lb7
            r5.t(r0, r6)
            goto La4
        Lb7:
            if (r7 == 0) goto Lc2
            if (r3 == 0) goto Lc1
            a8.b r5 = M0.C0219j.r(r7)
            r4 = r5
            goto Lc2
        Lc1:
            r4 = r7
        Lc2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.a.x(a5.b, M7.d, boolean):a8.b");
    }

    public abstract Typeface h(Context context, f fVar, Resources resources, int i9);

    public abstract Typeface i(Context context, Q.g[] gVarArr, int i9);

    public Typeface j(Context context, InputStream inputStream) {
        File M8 = c.M(context);
        if (M8 == null) {
            return null;
        }
        try {
            if (!c.I(inputStream, M8)) {
                return null;
            }
            return Typeface.createFromFile(M8.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            M8.delete();
        }
    }

    public Typeface k(Context context, Resources resources, int i9, String str, int i10) {
        File M8 = c.M(context);
        if (M8 == null) {
            return null;
        }
        try {
            if (!c.H(M8, resources, i9)) {
                return null;
            }
            return Typeface.createFromFile(M8.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            M8.delete();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a5.b, java.lang.Object] */
    public Q.g o(Q.g[] gVarArr, int i9) {
        int i10;
        boolean z8;
        int i11;
        ?? obj = new Object();
        if ((i9 & 1) == 0) {
            i10 = 400;
        } else {
            i10 = 700;
        }
        if ((i9 & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Q.g gVar = null;
        int i12 = Integer.MAX_VALUE;
        for (Q.g gVar2 : gVarArr) {
            int abs = Math.abs(obj.w(gVar2) - i10) * 2;
            if (obj.z(gVar2) == z8) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            int i13 = abs + i11;
            if (gVar == null || i12 > i13) {
                gVar = gVar2;
                i12 = i13;
            }
        }
        return gVar;
    }

    @Override // T.InterfaceC0277j0
    public void a() {
    }

    @Override // T.InterfaceC0277j0
    public void b() {
    }
}
