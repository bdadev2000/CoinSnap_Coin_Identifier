package p8;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class n extends l8.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f22427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f22428f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w8.f f22429g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22430h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, s sVar, int i9, w8.f fVar, int i10, boolean z8) {
        super(str, true);
        this.f22427e = sVar;
        this.f22428f = i9;
        this.f22429g = fVar;
        this.f22430h = i10;
    }

    @Override // l8.a
    public final long a() {
        try {
            C c9 = this.f22427e.f22456n;
            w8.f fVar = this.f22429g;
            int i9 = this.f22430h;
            c9.getClass();
            G7.j.e(fVar, "source");
            fVar.skip(i9);
            this.f22427e.f22445A.j(this.f22428f, EnumC2574b.CANCEL);
            synchronized (this.f22427e) {
                this.f22427e.f22447C.remove(Integer.valueOf(this.f22428f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
