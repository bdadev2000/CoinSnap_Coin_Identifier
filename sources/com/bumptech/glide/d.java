package com.bumptech.glide;

import F7.p;
import G7.s;
import Q7.AbstractC0233a;
import T1.B;
import T1.C0299e;
import T1.C0300f;
import T1.C0301g;
import T1.D;
import W1.C;
import W1.C0317a;
import W1.C0318b;
import W1.C0319c;
import W1.C0322f;
import W1.C0323g;
import W1.H;
import W1.q;
import a2.C0332a;
import a2.C0333b;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.o;
import j5.C2400c;
import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n1.C2475f;
import t7.AbstractC2712a;
import t7.y;
import u7.AbstractC2815f;
import u7.AbstractC2829t;
import u7.C2826q;

/* loaded from: classes.dex */
public abstract class d implements d8.d, d8.b {

    /* renamed from: a, reason: collision with root package name */
    public static long f12799a;
    public static Method b;

    /* renamed from: c, reason: collision with root package name */
    public static Field f12800c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f12801d;

    /* renamed from: e, reason: collision with root package name */
    public static Class f12802e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f12803f;

    /* renamed from: g, reason: collision with root package name */
    public static Field f12804g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f12805h;

    /* renamed from: i, reason: collision with root package name */
    public static Field f12806i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f12807j;

    /* renamed from: k, reason: collision with root package name */
    public static long f12808k;

    public static int G(View view) {
        G7.j.e(view, "<this>");
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        int visibility = view.getVisibility();
        if (visibility != 0) {
            if (visibility == 4) {
                return 4;
            }
            if (visibility == 8) {
                return 3;
            }
            throw new IllegalArgumentException(o.h(visibility, "Unknown visibility "));
        }
        return 2;
    }

    public static void H(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static final void I(View view, F7.l lVar) {
        G7.j.e(view, "<this>");
        view.setOnClickListener(new B3.m(lVar, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [T1.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, W1.F] */
    /* JADX WARN: Type inference failed for: r2v8, types: [N1.l, java.lang.Object] */
    public static i J(b bVar, List list) {
        N1.k c0322f;
        N1.k c0317a;
        int i9;
        Resources resources;
        String str;
        Q1.a aVar = bVar.b;
        e eVar = bVar.f12792d;
        Context applicationContext = eVar.getApplicationContext();
        f fVar = eVar.f12816h;
        i iVar = new i();
        Object obj = new Object();
        J1.k kVar = iVar.f12829g;
        synchronized (kVar) {
            kVar.f1526a.add(obj);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            Object obj2 = new Object();
            J1.k kVar2 = iVar.f12829g;
            synchronized (kVar2) {
                kVar2.f1526a.add(obj2);
            }
        }
        Resources resources2 = applicationContext.getResources();
        ArrayList e4 = iVar.e();
        Q1.f fVar2 = bVar.f12793f;
        C0332a c0332a = new C0332a(applicationContext, e4, aVar, fVar2);
        H h6 = new H(aVar, new Object());
        q qVar = new q(iVar.e(), resources2.getDisplayMetrics(), aVar, fVar2);
        if (i10 >= 28 && ((Map) fVar.f12819c).containsKey(c.class)) {
            c0317a = new C0323g(1);
            c0322f = new C0323g(0);
        } else {
            c0322f = new C0322f(qVar, 0);
            c0317a = new C0317a(2, qVar, fVar2);
        }
        if (i10 >= 28) {
            i9 = i10;
            resources = resources2;
            iVar.d("Animation", InputStream.class, Drawable.class, new Y1.a(new a7.b(15, e4, fVar2), 1));
            iVar.d("Animation", ByteBuffer.class, Drawable.class, new Y1.a(new a7.b(15, e4, fVar2), 0));
        } else {
            i9 = i10;
            resources = resources2;
        }
        Y1.c cVar = new Y1.c(applicationContext);
        C0318b c0318b = new C0318b(fVar2);
        B3.g gVar = new B3.g(5);
        b2.c cVar2 = new b2.c(1);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        iVar.a(ByteBuffer.class, new D(5));
        iVar.a(InputStream.class, new E1.c(fVar2, 17));
        iVar.d("Bitmap", ByteBuffer.class, Bitmap.class, c0322f);
        iVar.d("Bitmap", InputStream.class, Bitmap.class, c0317a);
        String str2 = Build.FINGERPRINT;
        if (!"robolectric".equals(str2)) {
            str = "Animation";
            iVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C0322f(qVar, 1));
        } else {
            str = "Animation";
        }
        iVar.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new H(aVar, new L4.f(12)));
        iVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, h6);
        D d2 = D.f2961c;
        iVar.c(Bitmap.class, Bitmap.class, d2);
        iVar.d("Bitmap", Bitmap.class, Bitmap.class, new C(0));
        iVar.b(Bitmap.class, c0318b);
        Resources resources3 = resources;
        iVar.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0317a(resources3, c0322f));
        iVar.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0317a(resources3, c0317a));
        iVar.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C0317a(resources3, h6));
        iVar.b(BitmapDrawable.class, new E1.d(16, aVar, c0318b));
        String str3 = str;
        iVar.d(str3, InputStream.class, C0333b.class, new a2.h(e4, c0332a, fVar2));
        iVar.d(str3, ByteBuffer.class, C0333b.class, c0332a);
        iVar.b(C0333b.class, new Object());
        iVar.c(M1.d.class, M1.d.class, d2);
        iVar.d("Bitmap", M1.d.class, Bitmap.class, new C0319c(aVar));
        iVar.d("legacy_append", Uri.class, Drawable.class, cVar);
        iVar.d("legacy_append", Uri.class, Bitmap.class, new C0317a(1, cVar, aVar));
        iVar.h(new X1.a(0));
        iVar.c(File.class, ByteBuffer.class, new D(6));
        iVar.c(File.class, InputStream.class, new B1.f(new D(9), 2));
        iVar.d("legacy_append", File.class, File.class, new C(2));
        iVar.c(File.class, ParcelFileDescriptor.class, new B1.f(new D(8), 2));
        iVar.c(File.class, File.class, d2);
        iVar.h(new com.bumptech.glide.load.data.l(fVar2));
        if (!"robolectric".equals(str2)) {
            iVar.h(new X1.a(2));
        }
        C0301g c0301g = new C0301g(applicationContext, 0);
        C0299e c0299e = new C0299e(applicationContext, 0);
        C0300f c0300f = new C0300f(applicationContext, 0);
        Class cls = Integer.TYPE;
        iVar.c(cls, InputStream.class, c0301g);
        iVar.c(Integer.class, InputStream.class, c0301g);
        iVar.c(cls, AssetFileDescriptor.class, c0299e);
        iVar.c(Integer.class, AssetFileDescriptor.class, c0299e);
        iVar.c(cls, Drawable.class, c0300f);
        iVar.c(Integer.class, Drawable.class, c0300f);
        iVar.c(Uri.class, InputStream.class, new C0300f(applicationContext, 1));
        iVar.c(Uri.class, AssetFileDescriptor.class, new C0299e(applicationContext, 2));
        B b8 = new B(resources3);
        C2400c c2400c = new C2400c(resources3, 14);
        C2475f c2475f = new C2475f(resources3, 13);
        iVar.c(Integer.class, Uri.class, b8);
        iVar.c(cls, Uri.class, b8);
        iVar.c(Integer.class, AssetFileDescriptor.class, c2400c);
        iVar.c(cls, AssetFileDescriptor.class, c2400c);
        iVar.c(Integer.class, InputStream.class, c2475f);
        iVar.c(cls, InputStream.class, c2475f);
        iVar.c(String.class, InputStream.class, new E1.c(15));
        iVar.c(Uri.class, InputStream.class, new E1.c(15));
        iVar.c(String.class, InputStream.class, new D(13));
        iVar.c(String.class, ParcelFileDescriptor.class, new D(12));
        iVar.c(String.class, AssetFileDescriptor.class, new D(11));
        iVar.c(Uri.class, InputStream.class, new C2475f(applicationContext.getAssets(), 11));
        iVar.c(Uri.class, AssetFileDescriptor.class, new C2400c(applicationContext.getAssets(), 13));
        iVar.c(Uri.class, InputStream.class, new C0300f(applicationContext, 2));
        iVar.c(Uri.class, InputStream.class, new C0301g(applicationContext, 1));
        if (i9 >= 29) {
            iVar.c(Uri.class, InputStream.class, new U1.b(applicationContext, InputStream.class));
            iVar.c(Uri.class, ParcelFileDescriptor.class, new U1.b(applicationContext, ParcelFileDescriptor.class));
        }
        iVar.c(Uri.class, InputStream.class, new E1.c(contentResolver, 18));
        iVar.c(Uri.class, ParcelFileDescriptor.class, new C2475f(contentResolver, 14));
        iVar.c(Uri.class, AssetFileDescriptor.class, new C2400c(contentResolver, 15));
        iVar.c(Uri.class, InputStream.class, new D(14));
        iVar.c(URL.class, InputStream.class, new Object());
        iVar.c(Uri.class, File.class, new C0299e(applicationContext, 1));
        iVar.c(T1.k.class, InputStream.class, new C2400c(18));
        iVar.c(byte[].class, ByteBuffer.class, new D(2));
        iVar.c(byte[].class, InputStream.class, new D(4));
        iVar.c(Uri.class, Uri.class, d2);
        iVar.c(Drawable.class, Drawable.class, d2);
        iVar.d("legacy_append", Drawable.class, Drawable.class, new C(1));
        iVar.i(Bitmap.class, BitmapDrawable.class, new B(resources3));
        iVar.i(Bitmap.class, byte[].class, gVar);
        iVar.i(Drawable.class, byte[].class, new C.c(aVar, gVar, cVar2, 16));
        iVar.i(C0333b.class, byte[].class, cVar2);
        H h9 = new H(aVar, new R3.e(12));
        iVar.d("legacy_append", ByteBuffer.class, Bitmap.class, h9);
        iVar.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C0317a(resources3, h9));
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return iVar;
        }
        o.v(it.next());
        throw null;
    }

    public static final void M(View view) {
        G7.j.e(view, "<this>");
        view.setVisibility(8);
    }

    public static HashSet N(Object... objArr) {
        HashSet hashSet = new HashSet(AbstractC2829t.Y(objArr.length));
        AbstractC2815f.C(objArr, hashSet);
        return hashSet;
    }

    public static boolean Q() {
        if (Build.VERSION.SDK_INT >= 29) {
            return L0.a.a();
        }
        try {
            if (b == null) {
                f12799a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) b.invoke(null, Long.valueOf(f12799a))).booleanValue();
        } catch (Exception e4) {
            if (e4 instanceof InvocationTargetException) {
                Throwable cause = e4.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e4);
            return false;
        }
    }

    public static Typeface R(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT >= 31 && B3.a.b(configuration) != Integer.MAX_VALUE && B3.a.b(configuration) != 0 && typeface != null) {
            return O3.e.d(typeface, F2.h.f(B3.a.b(configuration) + O3.e.a(typeface), 1, 1000), typeface.isItalic());
        }
        return null;
    }

    public static String S(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str2.length() + str.length());
            for (int i9 = 0; i9 < str.length(); i9++) {
                sb.append(str.charAt(i9));
                if (str2.length() > i9) {
                    sb.append(str2.charAt(i9));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public static final String T(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[FragmentTransaction.TRANSIT_EXIT_MASK];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        G7.j.d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static Set W(Object... objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2829t.Y(objArr.length));
                AbstractC2815f.C(objArr, linkedHashSet);
                return linkedHashSet;
            }
            Set singleton = Collections.singleton(objArr[0]);
            G7.j.d(singleton, "singleton(...)");
            return singleton;
        }
        return C2826q.b;
    }

    public static void Z(p pVar, AbstractC0233a abstractC0233a, AbstractC0233a abstractC0233a2) {
        try {
            V7.a.h(F2.h.x(F2.h.i(pVar, abstractC0233a, abstractC0233a2)), y.f23029a, null);
        } catch (Throwable th) {
            abstractC0233a2.e(AbstractC2712a.b(th));
            throw th;
        }
    }

    public static final void a0(View view) {
        G7.j.e(view, "<this>");
        view.setVisibility(0);
    }

    @Override // d8.b
    public void A(c8.g gVar, int i9, char c9) {
        G7.j.e(gVar, "descriptor");
        K(gVar, i9);
        r(c9);
    }

    @Override // d8.d
    public abstract void B(long j7);

    @Override // d8.b
    public void C(int i9, int i10, c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        K(gVar, i9);
        y(i10);
    }

    @Override // d8.d
    public void D(c8.g gVar, int i9) {
        G7.j.e(gVar, "enumDescriptor");
        L(Integer.valueOf(i9));
    }

    @Override // d8.d
    public void F(String str) {
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        L(str);
    }

    public void K(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
    }

    public void L(Object obj) {
        G7.j.e(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        throw new IllegalArgumentException("Non-serializable " + s.a(obj.getClass()) + " is not supported by " + s.a(getClass()) + " encoder");
    }

    public abstract void O(int i9);

    public abstract boolean P();

    public abstract void V(boolean z8);

    public abstract void X();

    public abstract void Y();

    @Override // d8.d
    public d8.b b(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        return this;
    }

    @Override // d8.b
    public void c(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
    }

    @Override // d8.b
    public void e(c8.g gVar, int i9, double d2) {
        G7.j.e(gVar, "descriptor");
        K(gVar, i9);
        h(d2);
    }

    @Override // d8.d
    public void f() {
        throw new IllegalArgumentException("'null' is not supported by default");
    }

    @Override // d8.d
    public void g(a8.b bVar, Object obj) {
        G7.j.e(bVar, "serializer");
        bVar.serialize(this, obj);
    }

    @Override // d8.d
    public void h(double d2) {
        L(Double.valueOf(d2));
    }

    @Override // d8.d
    public abstract void i(short s5);

    @Override // d8.d
    public abstract void j(byte b8);

    @Override // d8.b
    public void k(c8.g gVar, int i9, String str) {
        G7.j.e(gVar, "descriptor");
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        K(gVar, i9);
        F(str);
    }

    @Override // d8.d
    public void l(boolean z8) {
        L(Boolean.valueOf(z8));
    }

    @Override // d8.b
    public void m(c8.g gVar, int i9, a8.b bVar, Object obj) {
        G7.j.e(gVar, "descriptor");
        G7.j.e(bVar, "serializer");
        K(gVar, i9);
        g(bVar, obj);
    }

    @Override // d8.b
    public void n(c8.g gVar, int i9, byte b8) {
        G7.j.e(gVar, "descriptor");
        K(gVar, i9);
        j(b8);
    }

    @Override // d8.b
    public boolean o(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        return true;
    }

    @Override // d8.d
    public void p(float f9) {
        L(Float.valueOf(f9));
    }

    @Override // d8.d
    public d8.d q(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        return this;
    }

    @Override // d8.d
    public void r(char c9) {
        L(Character.valueOf(c9));
    }

    @Override // d8.d
    public d8.b s(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return b(gVar);
    }

    @Override // d8.b
    public void t(c8.g gVar, int i9, float f9) {
        G7.j.e(gVar, "descriptor");
        K(gVar, i9);
        p(f9);
    }

    @Override // d8.b
    public void u(c8.g gVar, int i9, a8.b bVar, Object obj) {
        G7.j.e(gVar, "descriptor");
        G7.j.e(bVar, "serializer");
        K(gVar, i9);
        com.facebook.appevents.g.f(this, bVar, obj);
    }

    @Override // d8.b
    public void v(c8.g gVar, int i9, boolean z8) {
        G7.j.e(gVar, "descriptor");
        K(gVar, i9);
        l(z8);
    }

    @Override // d8.b
    public void w(c8.g gVar, int i9, short s5) {
        G7.j.e(gVar, "descriptor");
        K(gVar, i9);
        i(s5);
    }

    @Override // d8.b
    public d8.d x(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        K(gVar, i9);
        return q(gVar.j(i9));
    }

    @Override // d8.d
    public abstract void y(int i9);

    @Override // d8.b
    public void z(c8.g gVar, int i9, long j7) {
        G7.j.e(gVar, "descriptor");
        K(gVar, i9);
        B(j7);
    }

    public void U(boolean z8) {
    }
}
