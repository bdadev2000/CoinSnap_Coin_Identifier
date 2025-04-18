package androidx.compose.runtime;

import h0.g;
import h0.j;
import h0.k;
import q0.l;

/* loaded from: classes3.dex */
public interface MonotonicFrameClock extends j {
    public static final /* synthetic */ int f8 = 0;

    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    /* loaded from: classes3.dex */
    public static final class Key implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Key f13830a = new Object();
    }

    Object b0(l lVar, g gVar);

    @Override // h0.j
    default k getKey() {
        return Key.f13830a;
    }
}
