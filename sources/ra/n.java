package ra;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v8.u0;

/* loaded from: classes3.dex */
public abstract class n implements Iterator {

    /* renamed from: c, reason: collision with root package name */
    public String f24059c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f24060d;

    /* renamed from: f, reason: collision with root package name */
    public final b f24061f;

    /* renamed from: i, reason: collision with root package name */
    public int f24064i;

    /* renamed from: b, reason: collision with root package name */
    public int f24058b = 2;

    /* renamed from: h, reason: collision with root package name */
    public int f24063h = 0;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24062g = false;

    public n(o oVar, CharSequence charSequence) {
        this.f24061f = oVar.a;
        this.f24064i = oVar.f24066c;
        this.f24060d = charSequence;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean hasNext() {
        boolean z10;
        String str;
        int a;
        CharSequence charSequence;
        b bVar;
        if (this.f24058b != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.o(z10);
        int b3 = t.h.b(this.f24058b);
        if (b3 == 0) {
            return true;
        }
        if (b3 == 2) {
            return false;
        }
        this.f24058b = 4;
        int i10 = this.f24063h;
        while (true) {
            int i11 = this.f24063h;
            if (i11 != -1) {
                m mVar = (m) this;
                a = ((b) mVar.f24057j.f28007b).a(mVar.f24060d, i11);
                charSequence = this.f24060d;
                if (a == -1) {
                    a = charSequence.length();
                    this.f24063h = -1;
                } else {
                    this.f24063h = a + 1;
                }
                int i12 = this.f24063h;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f24063h = i13;
                    if (i13 > charSequence.length()) {
                        this.f24063h = -1;
                    }
                } else {
                    while (true) {
                        bVar = this.f24061f;
                        if (i10 >= a || !bVar.b(charSequence.charAt(i10))) {
                            break;
                        }
                        i10++;
                    }
                    while (a > i10) {
                        int i14 = a - 1;
                        if (!bVar.b(charSequence.charAt(i14))) {
                            break;
                        }
                        a = i14;
                    }
                    if (!this.f24062g || i10 != a) {
                        break;
                    }
                    i10 = this.f24063h;
                }
            } else {
                this.f24058b = 3;
                str = null;
                break;
            }
        }
        int i15 = this.f24064i;
        if (i15 == 1) {
            a = charSequence.length();
            this.f24063h = -1;
            while (a > i10) {
                int i16 = a - 1;
                if (!bVar.b(charSequence.charAt(i16))) {
                    break;
                }
                a = i16;
            }
        } else {
            this.f24064i = i15 - 1;
        }
        str = charSequence.subSequence(i10, a).toString();
        this.f24059c = str;
        if (this.f24058b == 3) {
            return false;
        }
        this.f24058b = 1;
        return true;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (hasNext()) {
            this.f24058b = 2;
            String str = this.f24059c;
            this.f24059c = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
