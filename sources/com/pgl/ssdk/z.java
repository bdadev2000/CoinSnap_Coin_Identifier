package com.pgl.ssdk;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public static int f19615a;
    public static int b;

    /* renamed from: c, reason: collision with root package name */
    public static int f19616c;

    private static void a(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            f19615a = point.x;
            b = point.y;
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
                    float f9 = displayMetrics.density;
                    f19616c = displayMetrics.densityDpi;
                } catch (Throwable unused) {
                }
            }
            new DisplayMetrics();
            float f10 = context.getResources().getDisplayMetrics().xdpi;
        } catch (Throwable unused2) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f19616c);
        sb.append("[<!>]");
        sb.append(f19615a);
        sb.append(",");
        return AbstractC2914a.g(sb, b, "[<!>]");
    }
}
