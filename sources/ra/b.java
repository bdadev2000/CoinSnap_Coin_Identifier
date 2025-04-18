package ra;

import v8.u0;

/* loaded from: classes3.dex */
public abstract class b implements j {
    public int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        u0.k(i10, length);
        while (i10 < length) {
            if (!b(charSequence.charAt(i10))) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }

    @Override // ra.j
    public final boolean apply(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c10);
}
