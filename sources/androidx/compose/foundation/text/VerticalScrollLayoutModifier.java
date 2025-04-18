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
/* loaded from: classes2.dex */
public final class VerticalScrollLayoutModifier implements LayoutModifier {

    /* renamed from: a, reason: collision with root package name */
    public final TextFieldScrollerPosition f6255a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6256b;

    /* renamed from: c, reason: collision with root package name */
    public final TransformedText f6257c;
    public final q0.a d;

    public VerticalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i2, TransformedText transformedText, q0.a aVar) {
        this.f6255a = textFieldScrollerPosition;
        this.f6256b = i2;
        this.f6257c = transformedText;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalScrollLayoutModifier)) {
            return false;
        }
        VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier) obj;
        return p0.a.g(this.f6255a, verticalScrollLayoutModifier.f6255a) && this.f6256b == verticalScrollLayoutModifier.f6256b && p0.a.g(this.f6257c, verticalScrollLayoutModifier.f6257c) && p0.a.g(this.d, verticalScrollLayoutModifier.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f6257c.hashCode() + d.c(this.f6256b, this.f6255a.hashCode() * 31, 31)) * 31);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable V = measurable.V(Constraints.b(j2, 0, 0, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 7));
        int min = Math.min(V.f15826b, Constraints.h(j2));
        return measureScope.T(V.f15825a, min, x.f30219a, new VerticalScrollLayoutModifier$measure$1(measureScope, this, V, min));
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f6255a + ", cursorOffset=" + this.f6256b + ", transformedText=" + this.f6257c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
