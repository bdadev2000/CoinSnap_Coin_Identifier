package ci;

import kotlin.jvm.internal.Intrinsics;
import wh.m0;

/* loaded from: classes5.dex */
public final class h {
    public final m0 a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2810b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2811c;

    public h(m0 protocol, int i10, String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.a = protocol;
        this.f2810b = i10;
        this.f2811c = message;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.a == m0.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f2810b);
        sb2.append(' ');
        sb2.append(this.f2811c);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
