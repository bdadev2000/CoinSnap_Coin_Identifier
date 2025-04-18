package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public abstract class AlignmentLineProvider {

    @StabilityInferred
    /* loaded from: classes4.dex */
    public static final class Block extends AlignmentLineProvider {

        /* renamed from: a, reason: collision with root package name */
        public final l f3765a;

        public Block(l lVar) {
            this.f3765a = lVar;
        }

        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        public final int a(Placeable placeable) {
            return ((Number) this.f3765a.invoke(placeable)).intValue();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Block) && p0.a.g(this.f3765a, ((Block) obj).f3765a);
        }

        public final int hashCode() {
            return this.f3765a.hashCode();
        }

        public final String toString() {
            return "Block(lineProviderBlock=" + this.f3765a + ')';
        }
    }

    @StabilityInferred
    /* loaded from: classes4.dex */
    public static final class Value extends AlignmentLineProvider {

        /* renamed from: a, reason: collision with root package name */
        public final AlignmentLine f3766a;

        public Value(AlignmentLine alignmentLine) {
            this.f3766a = alignmentLine;
        }

        @Override // androidx.compose.foundation.layout.AlignmentLineProvider
        public final int a(Placeable placeable) {
            return placeable.Z(this.f3766a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Value) && p0.a.g(this.f3766a, ((Value) obj).f3766a);
        }

        public final int hashCode() {
            return this.f3766a.hashCode();
        }

        public final String toString() {
            return "Value(alignmentLine=" + this.f3766a + ')';
        }
    }

    public abstract int a(Placeable placeable);
}
