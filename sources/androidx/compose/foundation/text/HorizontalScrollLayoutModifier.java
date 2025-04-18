package androidx.compose.foundation.text;

import android.support.v4.media.d;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.common.api.Api;
import e0.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class HorizontalScrollLayoutModifier implements LayoutModifier {

    /* renamed from: a, reason: collision with root package name */
    public final TextFieldScrollerPosition f5973a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5974b;

    /* renamed from: c, reason: collision with root package name */
    public final TransformedText f5975c;
    public final q0.a d;

    public HorizontalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i2, TransformedText transformedText, q0.a aVar) {
        this.f5973a = textFieldScrollerPosition;
        this.f5974b = i2;
        this.f5975c = transformedText;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalScrollLayoutModifier)) {
            return false;
        }
        HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = (HorizontalScrollLayoutModifier) obj;
        return p0.a.g(this.f5973a, horizontalScrollLayoutModifier.f5973a) && this.f5974b == horizontalScrollLayoutModifier.f5974b && p0.a.g(this.f5975c, horizontalScrollLayoutModifier.f5975c) && p0.a.g(this.d, horizontalScrollLayoutModifier.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f5975c.hashCode() + d.c(this.f5974b, this.f5973a.hashCode() * 31, 31)) * 31);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable V = measurable.V(measurable.S(Constraints.h(j2)) < Constraints.i(j2) ? j2 : Constraints.b(j2, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0, 13));
        int min = Math.min(V.f15825a, Constraints.i(j2));
        return measureScope.T(min, V.f15826b, x.f30219a, new HorizontalScrollLayoutModifier$measure$1(measureScope, this, V, min));
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f5973a + ", cursorOffset=" + this.f5974b + ", transformedText=" + this.f5975c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
