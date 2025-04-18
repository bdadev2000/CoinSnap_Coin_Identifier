package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f876b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f877c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f878d;

    public /* synthetic */ j(int i10, Object obj, Object obj2) {
        this.f876b = i10;
        this.f878d = obj;
        this.f877c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x044b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1186
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.run():void");
    }

    public final String toString() {
        switch (this.f876b) {
            case 19:
                ra.h hVar = new ra.h(j.class.getSimpleName());
                ua.a aVar = (ua.a) this.f878d;
                h.c cVar = new h.c();
                hVar.f24054c.f18525f = cVar;
                hVar.f24054c = cVar;
                cVar.f18524d = aVar;
                return hVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ j(Object obj, Object obj2, int i10) {
        this.f876b = i10;
        this.f877c = obj;
        this.f878d = obj2;
    }

    public j(pd.c cVar) {
        this.f876b = 20;
        this.f878d = cVar;
        this.f877c = cVar.f23599g;
    }

    public j(yd.c cVar) {
        this.f876b = 21;
        this.f878d = cVar;
        this.f877c = cVar.f28171f;
    }
}
