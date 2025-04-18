package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes.dex */
public final class RowColumnParentData {

    /* renamed from: a, reason: collision with root package name */
    public float f4084a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4085b = true;

    /* renamed from: c, reason: collision with root package name */
    public CrossAxisAlignment f4086c = null;
    public FlowLayoutData d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowColumnParentData)) {
            return false;
        }
        RowColumnParentData rowColumnParentData = (RowColumnParentData) obj;
        return Float.compare(this.f4084a, rowColumnParentData.f4084a) == 0 && this.f4085b == rowColumnParentData.f4085b && p0.a.g(this.f4086c, rowColumnParentData.f4086c) && p0.a.g(this.d, rowColumnParentData.d);
    }

    public final int hashCode() {
        int g2 = d.g(this.f4085b, Float.hashCode(this.f4084a) * 31, 31);
        CrossAxisAlignment crossAxisAlignment = this.f4086c;
        int hashCode = (g2 + (crossAxisAlignment == null ? 0 : crossAxisAlignment.hashCode())) * 31;
        FlowLayoutData flowLayoutData = this.d;
        return hashCode + (flowLayoutData != null ? Float.hashCode(flowLayoutData.f3909a) : 0);
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f4084a + ", fill=" + this.f4085b + ", crossAxisAlignment=" + this.f4086c + ", flowLayoutData=" + this.d + ')';
    }
}
