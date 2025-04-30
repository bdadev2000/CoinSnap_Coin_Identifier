package com.applovin.exoplayer2.ui;

import Q7.n0;
import android.graphics.Color;
import com.applovin.impl.yp;

/* loaded from: classes.dex */
abstract class c {
    public static String a(int i9) {
        return yp.a("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i9)), Integer.valueOf(Color.green(i9)), Integer.valueOf(Color.blue(i9)), Double.valueOf(Color.alpha(i9) / 255.0d));
    }

    public static String a(String str) {
        return n0.j(".", str, ",.", str, " *");
    }
}
