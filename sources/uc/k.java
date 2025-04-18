package uc;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class k implements Iterator {

    /* renamed from: c, reason: collision with root package name */
    public int f25770c;

    /* renamed from: d, reason: collision with root package name */
    public Map.Entry f25771d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f25773g;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25769b = 0;

    /* renamed from: f, reason: collision with root package name */
    public Map.Entry f25772f = null;

    public k(m mVar) {
        this.f25773g = mVar;
        this.f25771d = mVar.f25789h.f25777f;
        this.f25770c = mVar.f25788g;
    }

    public final l a() {
        l lVar = (l) this.f25771d;
        AbstractMap abstractMap = this.f25773g;
        if (lVar != ((m) abstractMap).f25789h) {
            if (((m) abstractMap).f25788g == this.f25770c) {
                this.f25771d = lVar.f25777f;
                this.f25772f = lVar;
                return lVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    public final yg.v b() {
        yg.v vVar = (yg.v) this.f25771d;
        AbstractMap abstractMap = this.f25773g;
        if (vVar != ((yg.w) abstractMap).f28282d) {
            if (((yg.w) abstractMap).f28284g == this.f25770c) {
                this.f25771d = vVar.f28273f;
                this.f25772f = vVar;
                return vVar;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractMap abstractMap = this.f25773g;
        switch (this.f25769b) {
            case 0:
                if (((l) this.f25771d) != ((m) abstractMap).f25789h) {
                    return true;
                }
                return false;
            default:
                if (((yg.v) this.f25771d) != ((yg.w) abstractMap).f28282d) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMap abstractMap = this.f25773g;
        switch (this.f25769b) {
            case 0:
                l lVar = (l) this.f25772f;
                if (lVar != null) {
                    m mVar = (m) abstractMap;
                    mVar.d(lVar, true);
                    this.f25772f = null;
                    this.f25770c = mVar.f25788g;
                    return;
                }
                throw new IllegalStateException();
            default:
                yg.v vVar = (yg.v) this.f25772f;
                if (vVar != null) {
                    yg.w wVar = (yg.w) abstractMap;
                    wVar.d(vVar, true);
                    this.f25772f = null;
                    this.f25770c = wVar.f28284g;
                    return;
                }
                throw new IllegalStateException();
        }
    }

    public k(yg.w wVar) {
        this.f25773g = wVar;
        this.f25771d = wVar.f28282d.f28273f;
        this.f25770c = wVar.f28284g;
    }
}
