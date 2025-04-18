package androidx.compose.material3;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.StructuralEqualityPolicy;
import b1.k;
import b1.l;
import i1.d;
import i1.e;

@Stable
/* loaded from: classes2.dex */
public final class SnackbarHostState {

    /* renamed from: a, reason: collision with root package name */
    public final d f11534a = e.a();

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f11535b;

    /* loaded from: classes2.dex */
    public static final class SnackbarDataImpl implements SnackbarData {

        /* renamed from: a, reason: collision with root package name */
        public final SnackbarVisuals f11536a;

        /* renamed from: b, reason: collision with root package name */
        public final k f11537b;

        public SnackbarDataImpl(SnackbarVisuals snackbarVisuals, l lVar) {
            this.f11536a = snackbarVisuals;
            this.f11537b = lVar;
        }

        @Override // androidx.compose.material3.SnackbarData
        public final SnackbarVisuals a() {
            return this.f11536a;
        }

        @Override // androidx.compose.material3.SnackbarData
        public final void b() {
            k kVar = this.f11537b;
            if (kVar.isActive()) {
                kVar.resumeWith(SnackbarResult.f11609b);
            }
        }

        @Override // androidx.compose.material3.SnackbarData
        public final void dismiss() {
            k kVar = this.f11537b;
            if (kVar.isActive()) {
                kVar.resumeWith(SnackbarResult.f11608a);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SnackbarDataImpl.class != obj.getClass()) {
                return false;
            }
            SnackbarDataImpl snackbarDataImpl = (SnackbarDataImpl) obj;
            return p0.a.g(this.f11536a, snackbarDataImpl.f11536a) && p0.a.g(this.f11537b, snackbarDataImpl.f11537b);
        }

        public final int hashCode() {
            return this.f11537b.hashCode() + (this.f11536a.hashCode() * 31);
        }
    }

    /* loaded from: classes2.dex */
    public static final class SnackbarVisualsImpl implements SnackbarVisuals {
        @Override // androidx.compose.material3.SnackbarVisuals
        public final void a() {
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public final void b() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SnackbarVisualsImpl.class != obj.getClass()) {
                return false;
            }
            return p0.a.g(null, null) && p0.a.g(null, null);
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public final void getDuration() {
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public final void getMessage() {
        }

        public final int hashCode() {
            throw null;
        }
    }

    public SnackbarHostState() {
        ParcelableSnapshotMutableState f2;
        f2 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f11535b = f2;
    }
}
