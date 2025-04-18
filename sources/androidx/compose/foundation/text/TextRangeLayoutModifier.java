package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.unit.Density;

@StabilityInferred
/* loaded from: classes2.dex */
public final class TextRangeLayoutModifier implements ParentDataModifier {

    /* renamed from: a, reason: collision with root package name */
    public final TextRangeScopeMeasurePolicy f6244a;

    public TextRangeLayoutModifier(b bVar) {
        this.f6244a = bVar;
    }

    @Override // androidx.compose.ui.layout.ParentDataModifier
    public final Object J(Density density, Object obj) {
        return this;
    }
}
