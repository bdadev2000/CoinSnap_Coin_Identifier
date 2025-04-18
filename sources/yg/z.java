package yg;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class z {
    public final ArrayList a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f28293b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public boolean f28294c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f28295d;

    public z(a0 a0Var) {
        this.f28295d = a0Var;
    }

    public final IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        if (this.f28294c) {
            return illegalArgumentException;
        }
        this.f28294c = true;
        ArrayDeque arrayDeque = this.f28293b;
        if (arrayDeque.size() == 1 && ((y) arrayDeque.getFirst()).f28290b == null) {
            return illegalArgumentException;
        }
        StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
        Iterator descendingIterator = arrayDeque.descendingIterator();
        while (descendingIterator.hasNext()) {
            y yVar = (y) descendingIterator.next();
            sb2.append("\nfor ");
            sb2.append(yVar.a);
            String str = yVar.f28290b;
            if (str != null) {
                sb2.append(' ');
                sb2.append(str);
            }
        }
        return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
    }

    public final void b(boolean z10) {
        this.f28293b.removeLast();
        if (!this.f28293b.isEmpty()) {
            return;
        }
        this.f28295d.f28214b.remove();
        if (z10) {
            synchronized (this.f28295d.f28215c) {
                int size = this.a.size();
                for (int i10 = 0; i10 < size; i10++) {
                    y yVar = (y) this.a.get(i10);
                    l lVar = (l) this.f28295d.f28215c.put(yVar.f28291c, yVar.f28292d);
                    if (lVar != null) {
                        yVar.f28292d = lVar;
                        this.f28295d.f28215c.put(yVar.f28291c, lVar);
                    }
                }
            }
        }
    }
}
