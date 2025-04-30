package O7;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class c implements N7.f {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2251a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2252c;

    /* renamed from: d, reason: collision with root package name */
    public final F7.p f2253d;

    public c(CharSequence charSequence, int i9, int i10, F7.p pVar) {
        G7.j.e(charSequence, "input");
        this.f2251a = charSequence;
        this.b = i9;
        this.f2252c = i10;
        this.f2253d = pVar;
    }

    @Override // N7.f
    public final Iterator iterator() {
        return new b(this);
    }
}
