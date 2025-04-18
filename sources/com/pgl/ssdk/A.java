package com.pgl.ssdk;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes4.dex */
public class A {
    public static int a;

    /* renamed from: b, reason: collision with root package name */
    public static int f16498b;

    /* renamed from: c, reason: collision with root package name */
    public static int f16499c;

    private static void a(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            a = point.x;
            f16498b = point.y;
        } catch (Throwable unused) {
        }
    }

    public static String b(Context context) {
        try {
            a(context);
            if (context != null) {
                try {
                    new DisplayMetrics();
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f10 = displayMetrics.density;
                    f16499c = displayMetrics.densityDpi;
                } catch (Throwable unused) {
                }
            }
            new DisplayMetrics();
            float f11 = context.getResources().getDisplayMetrics().xdpi;
        } catch (Throwable unused2) {
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f16499c);
        sb2.append("[<!>]");
        sb2.append(a);
        sb2.append(",");
        return vd.e.g(sb2, f16498b, "[<!>]");
    }
}
