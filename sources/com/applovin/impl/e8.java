package com.applovin.impl;

/* loaded from: classes.dex */
public final class e8 extends RuntimeException {
    public final int a;

    public e8(int i10) {
        super(a(i10));
        this.a = i10;
    }

    private static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
