package androidx.compose.foundation.pager;

import b1.f0;
import kotlin.jvm.internal.r;
import p0.a;
import q0.p;

/* loaded from: classes.dex */
public final class DefaultPagerState$Companion$Saver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final DefaultPagerState$Companion$Saver$1 f5085a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        DefaultPagerState defaultPagerState = (DefaultPagerState) obj2;
        return f0.v(Integer.valueOf(defaultPagerState.j()), Float.valueOf(a.z(defaultPagerState.k(), -0.5f, 0.5f)), Integer.valueOf(defaultPagerState.m()));
    }
}
