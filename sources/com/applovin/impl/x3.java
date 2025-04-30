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
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public abstract class x3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f12145a = new HashMap(2);

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f12146a;
        int b;

        /* renamed from: c, reason: collision with root package name */
        int f12147c;

        /* renamed from: d, reason: collision with root package name */
        int f12148d;

        /* renamed from: com.applovin.impl.x3$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0044a {

            /* renamed from: a, reason: collision with root package name */
            private int f12149a;
            private int b;

            /* renamed from: c, reason: collision with root package name */
            private int f12150c;

            /* renamed from: d, reason: collision with root package name */
            private int f12151d;

            public C0044a a(int i9) {
                this.f12150c = i9;
                return this;
            }

            public C0044a b(int i9) {
                this.f12151d = i9;
                return this;
            }

            public C0044a c(int i9) {
                this.f12149a = i9;
                return this;
            }

            public C0044a d(int i9) {
                this.b = i9;
                return this;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=");
                sb.append(this.f12149a);
                sb.append(", topRight=");
                sb.append(this.b);
                sb.append(", bottomLeft=");
                sb.append(this.f12150c);
                sb.append(", bottomRight=");
                return AbstractC2914a.g(sb, this.f12151d, ")");
            }

            public a a() {
                return new a(this.f12149a, this.b, this.f12150c, this.f12151d);
            }
        }

        public a(int i9, int i10, int i11, int i12) {
            this.f12146a = i9;
            this.b = i10;
            this.f12147c = i11;
            this.f12148d = i12;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public int b() {
            return this.f12148d;
        }

        public int c() {
            return this.f12146a;
        }

        public int d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.a(this) && c() == aVar.c() && d() == aVar.d() && a() == aVar.a() && b() == aVar.b()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return b() + ((a() + ((d() + ((c() + 59) * 59)) * 59)) * 59);
        }

        public String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + c() + ", topRight=" + d() + ", bottomLeft=" + a() + ", bottomRight=" + b() + ")";
        }

        public int a() {
            return this.f12147c;
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
        Map map = f12145a;
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
        if (Build.VERSION.SDK_INT >= 34) {
            return true;
        }
        return false;
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
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public static boolean k() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public static boolean l() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    public static boolean m() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return false;
    }

    private static int a(int i9, Display display) {
        RoundedCorner roundedCorner;
        int radius;
        roundedCorner = display.getRoundedCorner(i9);
        if (roundedCorner == null) {
            return -1;
        }
        radius = roundedCorner.getRadius();
        return radius;
    }

    public static a a(Context context, com.applovin.impl.sdk.k kVar) {
        a aVar = null;
        if (((Boolean) kVar.a(oj.f9767g4)).booleanValue() && m()) {
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
