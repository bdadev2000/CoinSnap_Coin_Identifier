package g4;

/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18140d;

    @Override // g4.p
    public final boolean a(e4.a aVar) {
        switch (this.f18140d) {
            case 1:
                return false;
            case 2:
                if (aVar != e4.a.DATA_DISK_CACHE && aVar != e4.a.MEMORY_CACHE) {
                    return true;
                }
                return false;
            default:
                if (aVar == e4.a.REMOTE) {
                    return true;
                }
                return false;
        }
    }
}
