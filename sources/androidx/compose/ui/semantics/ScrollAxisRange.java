package androidx.compose.ui.semantics;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import q0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ScrollAxisRange {

    /* renamed from: a, reason: collision with root package name */
    public final a f16790a;

    /* renamed from: b, reason: collision with root package name */
    public final a f16791b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16792c;

    public ScrollAxisRange(a aVar, a aVar2, boolean z2) {
        this.f16790a = aVar;
        this.f16791b = aVar2;
        this.f16792c = z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(((Number) this.f16790a.invoke()).floatValue());
        sb.append(", maxValue=");
        sb.append(((Number) this.f16791b.invoke()).floatValue());
        sb.append(", reverseScrolling=");
        return d.s(sb, this.f16792c, ')');
    }
}
