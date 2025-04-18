package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import p0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class ContextMenuState {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f2956a;

    @StabilityInferred
    /* loaded from: classes.dex */
    public static abstract class Status {

        @StabilityInferred
        /* loaded from: classes.dex */
        public static final class Closed extends Status {

            /* renamed from: a, reason: collision with root package name */
            public static final Closed f2957a = new Object();

            public final String toString() {
                return "Closed";
            }
        }

        @StabilityInferred
        /* loaded from: classes.dex */
        public static final class Open extends Status {

            /* renamed from: a, reason: collision with root package name */
            public final long f2958a;

            public Open(long j2) {
                this.f2958a = j2;
                if (!OffsetKt.c(j2)) {
                    throw new IllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.".toString());
                }
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Open)) {
                    return false;
                }
                return Offset.d(this.f2958a, ((Open) obj).f2958a);
            }

            public final int hashCode() {
                return Long.hashCode(this.f2958a);
            }

            public final String toString() {
                return "Open(offset=" + ((Object) Offset.m(this.f2958a)) + ')';
            }
        }
    }

    public ContextMenuState() {
        ParcelableSnapshotMutableState f2;
        f2 = SnapshotStateKt.f(Status.Closed.f2957a, StructuralEqualityPolicy.f14078a);
        this.f2956a = f2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContextMenuState) {
            return a.g((Status) ((ContextMenuState) obj).f2956a.getValue(), (Status) this.f2956a.getValue());
        }
        return false;
    }

    public final int hashCode() {
        return ((Status) this.f2956a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((Status) this.f2956a.getValue()) + ')';
    }
}
