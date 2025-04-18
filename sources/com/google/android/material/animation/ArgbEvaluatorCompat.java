package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.support.v4.media.d;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class ArgbEvaluatorCompat implements TypeEvaluator<Integer> {
    private static final ArgbEvaluatorCompat instance = new ArgbEvaluatorCompat();

    @NonNull
    public static ArgbEvaluatorCompat getInstance() {
        return instance;
    }

    @Override // android.animation.TypeEvaluator
    @NonNull
    public Integer evaluate(float f2, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f3 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float f4 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float a2 = d.a(f4, f3, f2, f3);
        float a3 = d.a(pow4, pow, f2, pow);
        float a4 = d.a(pow5, pow2, f2, pow2);
        float a5 = d.a(pow6, pow3, f2, pow3);
        float pow7 = ((float) Math.pow(a3, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(a4, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(a5, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(a2 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
