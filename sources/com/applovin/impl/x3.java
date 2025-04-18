package com.applovin.impl;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class x3 {
    private static final Map a = new HashMap(2);

    /* loaded from: classes.dex */
    public static class a {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f8946b;

        /* renamed from: c, reason: collision with root package name */
        int f8947c;

        /* renamed from: d, reason: collision with root package name */
        int f8948d;

        /* renamed from: com.applovin.impl.x3$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0044a {
            private int a;

            /* renamed from: b, reason: collision with root package name */
            private int f8949b;

            /* renamed from: c, reason: collision with root package name */
            private int f8950c;

            /* renamed from: d, reason: collision with root package name */
            private int f8951d;

            public C0044a a(int i10) {
                this.f8950c = i10;
                return this;
            }

            public C0044a b(int i10) {
                this.f8951d = i10;
                return this;
            }

            public C0044a c(int i10) {
                this.a = i10;
                return this;
            }

            public C0044a d(int i10) {
                this.f8949b = i10;
                return this;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=");
                sb2.append(this.a);
                sb2.append(", topRight=");
                sb2.append(this.f8949b);
                sb2.append(", bottomLeft=");
                sb2.append(this.f8950c);
                sb2.append(", bottomRight=");
                return vd.e.g(sb2, this.f8951d, ")");
            }

            public a a() {
                return new a(this.a, this.f8949b, this.f8950c, this.f8951d);
            }
        }

        public a(int i10, int i11, int i12, int i13) {
            this.a = i10;
            this.f8946b = i11;
            this.f8947c = i12;
            this.f8948d = i13;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public int b() {
            return this.f8948d;
        }

        public int c() {
            return this.a;
        }

        public int d() {
            return this.f8946b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a(this) && c() == aVar.c() && d() == aVar.d() && a() == aVar.a() && b() == aVar.b();
        }

        public int hashCode() {
            return b() + ((a() + ((d() + ((c() + 59) * 59)) * 59)) * 59);
        }

        public String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + c() + ", topRight=" + d() + ", bottomLeft=" + a() + ", bottomRight=" + b() + ")";
        }

        public int a() {
            return this.f8947c;
        }
    }

    public static Point a(Context context) {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        Point point = new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
        StrictMode.setVmPolicy(vmPolicy);
        return point;
    }

    public static Point b(Context context) {
        WindowMetrics maximumWindowMetrics;
        Rect bounds;
        int orientation = AppLovinSdkUtils.getOrientation(context);
        Map map = a;
        if (map.containsKey(Integer.valueOf(orientation))) {
            return (Point) map.get(Integer.valueOf(orientation));
        }
        Point point = new Point();
        point.x = 480;
        point.y = 320;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (b()) {
                maximumWindowMetrics = windowManager.getMaximumWindowMetrics();
                bounds = maximumWindowMetrics.getBounds();
                point = new Point(bounds.width(), bounds.height());
            } else if (d()) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
        }
        StrictMode.setVmPolicy(vmPolicy);
        map.put(Integer.valueOf(orientation), point);
        return point;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static boolean d() {
        return true;
    }

    public static boolean e() {
        return true;
    }

    public static boolean f() {
        return true;
    }

    public static boolean g() {
        return true;
    }

    public static boolean h() {
        return true;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean m() {
        return Build.VERSION.SDK_INT >= 31;
    }

    private static int a(int i10, Display display) {
        RoundedCorner roundedCorner;
        int radius;
        roundedCorner = display.getRoundedCorner(i10);
        if (roundedCorner == null) {
            return -1;
        }
        radius = roundedCorner.getRadius();
        return radius;
    }

    public static a a(Context context, com.applovin.impl.sdk.k kVar) {
        a aVar = null;
        if (((Boolean) kVar.a(oj.f6661g4)).booleanValue() && m()) {
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                try {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    aVar = new a.C0044a().c(a(0, defaultDisplay)).d(a(1, defaultDisplay)).a(a(3, defaultDisplay)).b(a(2, defaultDisplay)).a();
                } catch (Throwable unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        }
        return aVar;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static void a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }
}
