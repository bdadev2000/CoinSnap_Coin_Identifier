package com.applovin.impl;

import java.util.UUID;

/* loaded from: classes.dex */
public final class j9 implements x4 {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5460d;
    public final UUID a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5461b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5462c;

    static {
        boolean z10;
        if ("Amazon".equals(yp.f9254c)) {
            String str = yp.f9255d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f5460d = z10;
            }
        }
        z10 = false;
        f5460d = z10;
    }

    public j9(UUID uuid, byte[] bArr, boolean z10) {
        this.a = uuid;
        this.f5461b = bArr;
        this.f5462c = z10;
    }
}
