package okio;

import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class _JvmPlatformKt {
    @NotNull
    public static final byte[] asUtf8ToByteArray(@NotNull String str) {
        p0.a.s(str, "<this>");
        byte[] bytes = str.getBytes(z0.a.f31458a);
        p0.a.r(bytes, "getBytes(...)");
        return bytes;
    }

    @NotNull
    public static final ReentrantLock newLock() {
        return new ReentrantLock();
    }

    @NotNull
    public static final String toUtf8String(@NotNull byte[] bArr) {
        p0.a.s(bArr, "<this>");
        return new String(bArr, z0.a.f31458a);
    }

    public static final <T> T withLock(@NotNull ReentrantLock reentrantLock, @NotNull q0.a aVar) {
        p0.a.s(reentrantLock, "<this>");
        p0.a.s(aVar, "action");
        reentrantLock.lock();
        try {
            return (T) aVar.invoke();
        } finally {
            reentrantLock.unlock();
        }
    }
}
