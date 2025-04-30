package com.applovin.impl;

/* loaded from: classes.dex */
public final class e8 extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final int f7386a;

    public e8(int i9) {
        super(a(i9));
        this.f7386a = i9;
    }

    private static String a(int i9) {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    return "Undefined timeout.";
                }
                return "Detaching surface timed out.";
            }
            return "Setting foreground mode timed out.";
        }
        return "Player release timed out.";
    }
}
