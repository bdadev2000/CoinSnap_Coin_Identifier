package com.applovin.impl;

/* loaded from: classes3.dex */
public final class g8 extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final int f24056a;

    public g8(int i2) {
        super(a(i2));
        this.f24056a = i2;
    }

    private static String a(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
