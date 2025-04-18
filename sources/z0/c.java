package z0;

import java.util.Iterator;
import q0.p;

/* loaded from: classes3.dex */
public final class c implements y0.j {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f31466a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31467b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31468c;
    public final p d;

    public c(CharSequence charSequence, int i2, int i3, l lVar) {
        p0.a.s(charSequence, "input");
        this.f31466a = charSequence;
        this.f31467b = i2;
        this.f31468c = i3;
        this.d = lVar;
    }

    @Override // y0.j
    public final Iterator iterator() {
        return new b(this);
    }
}
