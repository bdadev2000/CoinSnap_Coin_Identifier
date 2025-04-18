package com.applovin.impl;

import java.util.UUID;

/* loaded from: classes.dex */
public final class l9 implements z4 {
    public static final boolean d;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f25004a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f25005b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25006c;

    static {
        boolean z2;
        if ("Amazon".equals(xp.f27964c)) {
            String str = xp.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z2 = true;
                d = z2;
            }
        }
        z2 = false;
        d = z2;
    }

    public l9(UUID uuid, byte[] bArr, boolean z2) {
        this.f25004a = uuid;
        this.f25005b = bArr;
        this.f25006c = z2;
    }
}
