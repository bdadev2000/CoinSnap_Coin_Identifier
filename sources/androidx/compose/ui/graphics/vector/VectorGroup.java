package androidx.compose.ui.graphics.vector;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import java.util.Iterator;
import java.util.List;
import r0.a;

@Immutable
/* loaded from: classes4.dex */
public final class VectorGroup extends VectorNode implements Iterable<VectorNode>, a {

    /* renamed from: a, reason: collision with root package name */
    public final String f15455a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15456b;

    /* renamed from: c, reason: collision with root package name */
    public final float f15457c;
    public final float d;

    /* renamed from: f, reason: collision with root package name */
    public final float f15458f;

    /* renamed from: g, reason: collision with root package name */
    public final float f15459g;

    /* renamed from: h, reason: collision with root package name */
    public final float f15460h;

    /* renamed from: i, reason: collision with root package name */
    public final float f15461i;

    /* renamed from: j, reason: collision with root package name */
    public final List f15462j;

    /* renamed from: k, reason: collision with root package name */
    public final List f15463k;

    public VectorGroup(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list, List list2) {
        this.f15455a = str;
        this.f15456b = f2;
        this.f15457c = f3;
        this.d = f4;
        this.f15458f = f5;
        this.f15459g = f6;
        this.f15460h = f7;
        this.f15461i = f8;
        this.f15462j = list;
        this.f15463k = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof VectorGroup)) {
            VectorGroup vectorGroup = (VectorGroup) obj;
            return p0.a.g(this.f15455a, vectorGroup.f15455a) && this.f15456b == vectorGroup.f15456b && this.f15457c == vectorGroup.f15457c && this.d == vectorGroup.d && this.f15458f == vectorGroup.f15458f && this.f15459g == vectorGroup.f15459g && this.f15460h == vectorGroup.f15460h && this.f15461i == vectorGroup.f15461i && p0.a.g(this.f15462j, vectorGroup.f15462j) && p0.a.g(this.f15463k, vectorGroup.f15463k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15463k.hashCode() + d.f(this.f15462j, d.b(this.f15461i, d.b(this.f15460h, d.b(this.f15459g, d.b(this.f15458f, d.b(this.d, d.b(this.f15457c, d.b(this.f15456b, this.f15455a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator<VectorNode> iterator() {
        return new VectorGroup$iterator$1(this);
    }
}
