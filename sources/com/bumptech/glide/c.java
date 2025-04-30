package com.bumptech.glide;

import G7.s;
import T.AbstractC0279k0;
import a5.C0397a;
import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o4.C2496b;
import o4.C2500f;
import o4.C2501g;
import o4.C2502h;
import o4.C2503i;
import o4.q;

/* loaded from: classes.dex */
public abstract class c implements d8.c, d8.a, Z.j {
    public static final /* synthetic */ int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f12797c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12798a;

    public /* synthetic */ c(int i9) {
        this.f12798a = i9;
    }

    public static void F(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int G(Context context, float f9) {
        Resources resources = context.getResources();
        if (resources == null) {
            return 0;
        }
        return (int) TypedValue.applyDimension(1, f9 + 0.5f, resources.getDisplayMetrics());
    }

    public static boolean H(File file, Resources resources, int i9) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i9);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean I5 = I(inputStream, file);
            F(inputStream);
            return I5;
        } catch (Throwable th2) {
            th = th2;
            F(inputStream);
            throw th;
        }
    }

    public static boolean I(InputStream inputStream, File file) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream2.write(bArr, 0, read);
                        } else {
                            F(fileOutputStream2);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                    }
                } catch (IOException e4) {
                    e = e4;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    F(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    F(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e9) {
            e = e9;
        }
    }

    public static void K(ArrayList arrayList) {
        boolean z8;
        boolean z9;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i9 = 0;
            if (it.hasNext()) {
                C2496b c2496b = (C2496b) it.next();
                C2500f c2500f = new C2500f(c2496b);
                for (q qVar : c2496b.b) {
                    if (c2496b.f21947e == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z10 = !z9;
                    C2501g c2501g = new C2501g(qVar, z10);
                    if (!hashMap.containsKey(c2501g)) {
                        hashMap.put(c2501g, new HashSet());
                    }
                    Set set = (Set) hashMap.get(c2501g);
                    if (!set.isEmpty() && !z10) {
                        throw new IllegalArgumentException("Multiple components provide " + qVar + ".");
                    }
                    set.add(c2500f);
                }
            } else {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (C2500f c2500f2 : (Set) it2.next()) {
                        for (C2502h c2502h : c2500f2.f21957a.f21945c) {
                            if (c2502h.f21961c == 0) {
                                if (c2502h.b == 2) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                Set<C2500f> set2 = (Set) hashMap.get(new C2501g(c2502h.f21960a, z8));
                                if (set2 != null) {
                                    for (C2500f c2500f3 : set2) {
                                        c2500f2.b.add(c2500f3);
                                        c2500f3.f21958c.add(c2500f2);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C2500f c2500f4 = (C2500f) it4.next();
                    if (c2500f4.f21958c.isEmpty()) {
                        hashSet2.add(c2500f4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    C2500f c2500f5 = (C2500f) hashSet2.iterator().next();
                    hashSet2.remove(c2500f5);
                    i9++;
                    Iterator it5 = c2500f5.b.iterator();
                    while (it5.hasNext()) {
                        C2500f c2500f6 = (C2500f) it5.next();
                        c2500f6.f21958c.remove(c2500f5);
                        if (c2500f6.f21958c.isEmpty()) {
                            hashSet2.add(c2500f6);
                        }
                    }
                }
                if (i9 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    C2500f c2500f7 = (C2500f) it6.next();
                    if (!c2500f7.f21958c.isEmpty() && !c2500f7.b.isEmpty()) {
                        arrayList2.add(c2500f7.f21957a);
                    }
                }
                throw new C2503i(arrayList2);
            }
        }
    }

    public static final float L(Integer num, Context context) {
        G7.j.e(context, "context");
        return (context.getResources().getDisplayMetrics().densityDpi / 160) * num.floatValue();
    }

    public static File M(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i9 = 0; i9 < 100; i9++) {
            File file = new File(cacheDir, str + i9);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static boolean N(Context context) {
        Boolean bool = f12797c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f12797c = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e4) {
            C0397a.d().a("No perf logcat meta data found " + e4.getMessage());
            return false;
        }
    }

    public static MappedByteBuffer O(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, CampaignEx.JSON_KEY_AD_R, null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    openFileDescriptor.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static int R(long j7) {
        if (j7 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j7 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j7;
    }

    public static void S(Window window, boolean z8) {
        int i9;
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC0279k0.a(window, z8);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z8) {
            i9 = systemUiVisibility & (-1793);
        } else {
            i9 = systemUiVisibility | 1792;
        }
        decorView.setSystemUiVisibility(i9);
    }

    public static int T(Context context, int i9) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i9});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static AdError U(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            AdError g9 = android.support.v4.media.session.a.g(101, "Missing or invalid ad Unit ID configured for this ad source instance in the AdMob or Ad Manager UI.");
            Log.e(com.mbridge.msdk.foundation.controller.a.f15376a, g9.toString());
            return g9;
        }
        if (TextUtils.isEmpty(str2)) {
            AdError g10 = android.support.v4.media.session.a.g(101, "Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.");
            Log.e(com.mbridge.msdk.foundation.controller.a.f15376a, g10.toString());
            return g10;
        }
        return null;
    }

    public static AdError V(String str, String str2, String str3) {
        AdError U8 = U(str, str2);
        if (U8 != null) {
            return U8;
        }
        if (TextUtils.isEmpty(str3)) {
            AdError g9 = android.support.v4.media.session.a.g(103, "Missing or invalid Mintegral bidding signal in this ad request.");
            Log.w(com.mbridge.msdk.foundation.controller.a.f15376a, g9.toString());
            return g9;
        }
        return null;
    }

    @Override // d8.a
    public Object A(c8.g gVar, int i9, a8.b bVar, Object obj) {
        G7.j.e(gVar, "descriptor");
        G7.j.e(bVar, "deserializer");
        return u(bVar);
    }

    @Override // d8.c
    public abstract short B();

    @Override // d8.c
    public float C() {
        J();
        throw null;
    }

    @Override // d8.c
    public double D() {
        J();
        throw null;
    }

    @Override // d8.a
    public int E(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return m();
    }

    public void J() {
        throw new IllegalArgumentException(s.a(getClass()) + " can't retrieve untyped values");
    }

    public abstract void P(int i9);

    public abstract void Q(Typeface typeface, boolean z8);

    @Override // d8.c
    public d8.a b(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        return this;
    }

    @Override // d8.a
    public void c(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
    }

    @Override // d8.c
    public boolean e() {
        J();
        throw null;
    }

    @Override // d8.c
    public char f() {
        J();
        throw null;
    }

    @Override // d8.a
    public d8.c g(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return i(gVar.j(i9));
    }

    public int hashCode() {
        switch (this.f12798a) {
            case 7:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // d8.c
    public d8.c i(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        return this;
    }

    @Override // d8.a
    public boolean j(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return e();
    }

    @Override // d8.a
    public char k(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return f();
    }

    @Override // d8.c
    public abstract int m();

    @Override // d8.a
    public float n(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return C();
    }

    @Override // d8.a
    public long o(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return s();
    }

    @Override // d8.c
    public String p() {
        J();
        throw null;
    }

    @Override // d8.a
    public short q(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return B();
    }

    @Override // d8.a
    public double r(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return D();
    }

    @Override // d8.c
    public abstract long s();

    @Override // d8.c
    public int t(c8.g gVar) {
        G7.j.e(gVar, "enumDescriptor");
        J();
        throw null;
    }

    public String toString() {
        switch (this.f12798a) {
            case 7:
                String b8 = s.a(getClass()).b();
                G7.j.b(b8);
                return b8;
            default:
                return super.toString();
        }
    }

    @Override // d8.c
    public Object u(a8.b bVar) {
        G7.j.e(bVar, "deserializer");
        return bVar.deserialize(this);
    }

    @Override // d8.c
    public boolean v() {
        return true;
    }

    @Override // d8.a
    public String w(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return p();
    }

    @Override // d8.a
    public byte x(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        return y();
    }

    @Override // d8.c
    public abstract byte y();

    @Override // d8.a
    public Object z(c8.g gVar, int i9, a8.b bVar, Object obj) {
        G7.j.e(gVar, "descriptor");
        G7.j.e(bVar, "deserializer");
        if (!bVar.getDescriptor().c() && !v()) {
            return null;
        }
        return u(bVar);
    }
}
