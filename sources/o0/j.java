package o0;

import e0.p;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class j implements Iterator, r0.a {

    /* renamed from: a, reason: collision with root package name */
    public String f31201a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f31203c;

    public j(p pVar) {
        this.f31203c = pVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f31201a == null && !this.f31202b) {
            String readLine = ((BufferedReader) this.f31203c.f30216b).readLine();
            this.f31201a = readLine;
            if (readLine == null) {
                this.f31202b = true;
            }
        }
        return this.f31201a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f31201a;
        this.f31201a = null;
        p0.a.p(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
