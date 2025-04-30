package com.applovin.impl;

import java.util.UUID;

/* loaded from: classes.dex */
public final class j9 implements x4 {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f8418d;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f8419a;
    public final byte[] b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8420c;

    static {
        boolean z8;
        if ("Amazon".equals(yp.f12452c)) {
            String str = yp.f12453d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z8 = true;
                f8418d = z8;
            }
        }
        z8 = false;
        f8418d = z8;
    }

    public j9(UUID uuid, byte[] bArr, boolean z8) {
        this.f8419a = uuid;
        this.b = bArr;
        this.f8420c = z8;
    }
}
