package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import h0.j;
import h0.k;

@Stable
/* loaded from: classes.dex */
public interface MotionDurationScale extends j {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    /* loaded from: classes.dex */
    public static final class Key implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Key f14701a = new Object();
    }

    @Override // h0.j
    default k getKey() {
        return Key.f14701a;
    }

    float o();
}
