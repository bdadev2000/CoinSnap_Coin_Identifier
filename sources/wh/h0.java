package wh;

import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 {
    public final ki.l a;

    /* renamed from: b, reason: collision with root package name */
    public g0 f27064b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f27065c;

    public h0() {
        String boundary = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(boundary, "randomUUID().toString()");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        ki.l lVar = ki.l.f20996f;
        this.a = a0.p(boundary);
        this.f27064b = j0.f27080e;
        this.f27065c = new ArrayList();
    }
}
