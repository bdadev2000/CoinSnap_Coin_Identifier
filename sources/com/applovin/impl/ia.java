package com.applovin.impl;

/* loaded from: classes.dex */
abstract class ia {
    public static int a(int i10, double d10) {
        int max = Math.max(i10, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d10 * highestOneBit))) {
            return highestOneBit;
        }
        int i11 = highestOneBit << 1;
        if (i11 > 0) {
            return i11;
        }
        return 1073741824;
    }

    public static int a(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    public static int a(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
