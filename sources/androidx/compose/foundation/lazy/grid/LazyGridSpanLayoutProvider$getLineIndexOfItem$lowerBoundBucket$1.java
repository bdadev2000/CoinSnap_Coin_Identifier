package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4602a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1(int i2) {
        super(1);
        this.f4602a = i2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return Integer.valueOf(((LazyGridSpanLayoutProvider.Bucket) obj).f4597a - this.f4602a);
    }
}
