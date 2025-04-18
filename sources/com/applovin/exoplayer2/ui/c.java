package com.applovin.exoplayer2.ui;

import android.graphics.Color;
import com.applovin.impl.xp;

/* loaded from: classes2.dex */
abstract class c {
    public static String a(String str) {
        return androidx.compose.foundation.text.input.a.m(".", str, ",.", str, " *");
    }

    public static String a(int i2) {
        return xp.a("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i2)), Integer.valueOf(Color.green(i2)), Integer.valueOf(Color.blue(i2)), Double.valueOf(Color.alpha(i2) / 255.0d));
    }
}
