package R1;

import java.security.MessageDigest;
import k2.InterfaceC2430b;

/* loaded from: classes.dex */
public final class g implements InterfaceC2430b {
    public final MessageDigest b;

    /* renamed from: c, reason: collision with root package name */
    public final k2.e f2634c = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k2.e] */
    public g(MessageDigest messageDigest) {
        this.b = messageDigest;
    }

    @Override // k2.InterfaceC2430b
    public final k2.e b() {
        return this.f2634c;
    }
}
