package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import b1.d0;
import q0.l;

@ExperimentalSharedTransitionApi
@Stable
/* loaded from: classes2.dex */
public final class SharedTransitionScopeImpl implements SharedTransitionScope, LookaheadScope {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f1914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LookaheadScope f1915b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f1916c;
    public final q0.a d;

    /* renamed from: f, reason: collision with root package name */
    public final l f1917f;

    /* renamed from: g, reason: collision with root package name */
    public LayoutCoordinates f1918g;

    /* renamed from: h, reason: collision with root package name */
    public LayoutCoordinates f1919h;

    /* renamed from: i, reason: collision with root package name */
    public final SnapshotStateList f1920i;

    /* renamed from: j, reason: collision with root package name */
    public final MutableScatterMap f1921j;

    /* loaded from: classes2.dex */
    public static final class ShapeBasedClip implements SharedTransitionScope.OverlayClip {
        @Override // androidx.compose.animation.SharedTransitionScope.OverlayClip
        public final Path a(SharedTransitionScope.SharedContentState sharedContentState) {
            throw null;
        }
    }

    public SharedTransitionScopeImpl(LookaheadScope lookaheadScope, d0 d0Var) {
        ParcelableSnapshotMutableState f2;
        this.f1914a = d0Var;
        this.f1915b = lookaheadScope;
        f2 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
        this.f1916c = f2;
        this.d = new SharedTransitionScopeImpl$observeAnimatingBlock$1(this);
        this.f1917f = new SharedTransitionScopeImpl$updateTransitionActiveness$1(this);
        this.f1920i = new SnapshotStateList();
        this.f1921j = new MutableScatterMap();
    }

    public final boolean a() {
        return ((Boolean) this.f1916c.getValue()).booleanValue();
    }
}
