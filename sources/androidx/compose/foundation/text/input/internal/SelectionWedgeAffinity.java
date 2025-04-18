package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class SelectionWedgeAffinity {

    /* renamed from: a, reason: collision with root package name */
    public final WedgeAffinity f6480a;

    /* renamed from: b, reason: collision with root package name */
    public final WedgeAffinity f6481b;

    public SelectionWedgeAffinity(WedgeAffinity wedgeAffinity) {
        this.f6480a = wedgeAffinity;
        this.f6481b = wedgeAffinity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionWedgeAffinity)) {
            return false;
        }
        SelectionWedgeAffinity selectionWedgeAffinity = (SelectionWedgeAffinity) obj;
        return this.f6480a == selectionWedgeAffinity.f6480a && this.f6481b == selectionWedgeAffinity.f6481b;
    }

    public final int hashCode() {
        return this.f6481b.hashCode() + (this.f6480a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.f6480a + ", endAffinity=" + this.f6481b + ')';
    }
}
