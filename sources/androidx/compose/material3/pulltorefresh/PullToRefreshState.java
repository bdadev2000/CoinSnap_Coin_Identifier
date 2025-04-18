package androidx.compose.material3.pulltorefresh;

import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Stable;
import h0.g;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes4.dex */
public interface PullToRefreshState {
    Object a(g gVar);

    Object b(float f2, g gVar);

    float c();

    Object d(g gVar);

    default boolean e() {
        return false;
    }
}
