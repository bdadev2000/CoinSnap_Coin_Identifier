package i4;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class i implements x4.b {

    /* renamed from: b, reason: collision with root package name */
    public final MessageDigest f19152b;

    /* renamed from: c, reason: collision with root package name */
    public final x4.d f19153c = new x4.d();

    public i(MessageDigest messageDigest) {
        this.f19152b = messageDigest;
    }

    @Override // x4.b
    public final x4.d b() {
        return this.f19153c;
    }
}
