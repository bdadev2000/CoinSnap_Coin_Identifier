package com.applovin.impl;

import com.google.common.primitives.Ints;

/* loaded from: classes.dex */
abstract class ka {
    public static int a(int i2, double d) {
        int max = Math.max(i2, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d * highestOneBit))) {
            return highestOneBit;
        }
        int i3 = highestOneBit << 1;
        return i3 > 0 ? i3 : Ints.MAX_POWER_OF_TWO;
    }

    public static int a(int i2) {
        return (int) (Integer.rotateLeft((int) (i2 * (-862048943)), 15) * 461845907);
    }

    public static int a(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
