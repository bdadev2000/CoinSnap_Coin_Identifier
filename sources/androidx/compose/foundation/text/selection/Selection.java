package androidx.compose.foundation.text.selection;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.style.ResolvedTextDirection;

@Immutable
/* loaded from: classes2.dex */
public final class Selection {

    /* renamed from: a, reason: collision with root package name */
    public final AnchorInfo f7083a;

    /* renamed from: b, reason: collision with root package name */
    public final AnchorInfo f7084b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7085c;

    @Immutable
    /* loaded from: classes2.dex */
    public static final class AnchorInfo {

        /* renamed from: a, reason: collision with root package name */
        public final ResolvedTextDirection f7086a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7087b;

        /* renamed from: c, reason: collision with root package name */
        public final long f7088c;

        public AnchorInfo(ResolvedTextDirection resolvedTextDirection, int i2, long j2) {
            this.f7086a = resolvedTextDirection;
            this.f7087b = i2;
            this.f7088c = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnchorInfo)) {
                return false;
            }
            AnchorInfo anchorInfo = (AnchorInfo) obj;
            return this.f7086a == anchorInfo.f7086a && this.f7087b == anchorInfo.f7087b && this.f7088c == anchorInfo.f7088c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f7088c) + d.c(this.f7087b, this.f7086a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "AnchorInfo(direction=" + this.f7086a + ", offset=" + this.f7087b + ", selectableId=" + this.f7088c + ')';
        }
    }

    public Selection(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z2) {
        this.f7083a = anchorInfo;
        this.f7084b = anchorInfo2;
        this.f7085c = z2;
    }

    public static Selection a(Selection selection, AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            anchorInfo = selection.f7083a;
        }
        if ((i2 & 2) != 0) {
            anchorInfo2 = selection.f7084b;
        }
        if ((i2 & 4) != 0) {
            z2 = selection.f7085c;
        }
        selection.getClass();
        return new Selection(anchorInfo, anchorInfo2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) obj;
        return p0.a.g(this.f7083a, selection.f7083a) && p0.a.g(this.f7084b, selection.f7084b) && this.f7085c == selection.f7085c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7085c) + ((this.f7084b.hashCode() + (this.f7083a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.f7083a);
        sb.append(", end=");
        sb.append(this.f7084b);
        sb.append(", handlesCrossed=");
        return d.s(sb, this.f7085c, ')');
    }
}
