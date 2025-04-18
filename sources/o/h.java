package o;

import androidx.collection.LruCache;

/* loaded from: classes2.dex */
public final class h extends LruCache {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f31178a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i2, i iVar) {
        super(i2);
        this.f31178a = iVar;
    }

    @Override // androidx.collection.LruCache
    public final void entryRemoved(boolean z2, Object obj, Object obj2, Object obj3) {
        g gVar = (g) obj2;
        this.f31178a.f31179a.c((c) obj, gVar.f31175a, gVar.f31176b, gVar.f31177c);
    }

    @Override // androidx.collection.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        return ((g) obj2).f31177c;
    }
}
