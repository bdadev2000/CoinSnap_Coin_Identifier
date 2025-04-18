package com.applovin.exoplayer2.ui;

import android.graphics.Color;
import com.applovin.impl.yp;

/* loaded from: classes.dex */
abstract class c {
    public static String a(String str) {
        return a4.j.h(".", str, ",.", str, " *");
    }

    public static String a(int i10) {
        return yp.a("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(Color.alpha(i10) / 255.0d));
    }
}
