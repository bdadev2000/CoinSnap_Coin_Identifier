package com.applovin.impl;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class r3 {
    public static int a(int i9, Context context) {
        if (x3.g()) {
            return context.getColor(i9);
        }
        return context.getResources().getColor(i9);
    }
}
