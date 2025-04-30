package com.applovin.impl;

/* loaded from: classes.dex */
abstract class ia {
    public static int a(int i9, double d2) {
        int max = Math.max(i9, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d2 * highestOneBit))) {
            return highestOneBit;
        }
        int i10 = highestOneBit << 1;
        if (i10 > 0) {
            return i10;
        }
        return 1073741824;
    }

    public static int a(int i9) {
        return (int) (Integer.rotateLeft((int) (i9 * (-862048943)), 15) * 461845907);
    }

    public static int a(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
