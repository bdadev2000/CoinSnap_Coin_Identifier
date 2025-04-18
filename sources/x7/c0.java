package x7;

import java.util.UUID;

/* loaded from: classes3.dex */
public final class c0 implements w7.b {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f27415d;
    public final UUID a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f27416b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27417c;

    static {
        boolean z10;
        if ("Amazon".equals(n9.h0.f22545c)) {
            String str = n9.h0.f22546d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f27415d = z10;
            }
        }
        z10 = false;
        f27415d = z10;
    }

    public c0(UUID uuid, byte[] bArr, boolean z10) {
        this.a = uuid;
        this.f27416b = bArr;
        this.f27417c = z10;
    }
}
