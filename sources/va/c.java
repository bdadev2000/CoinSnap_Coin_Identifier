package va;

import android.content.Context;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements cc.c {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26384c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.f26383b = obj;
        this.f26384c = obj2;
    }

    @Override // cc.c
    public final Object get() {
        int i10 = this.a;
        Object obj = this.f26384c;
        Object obj2 = this.f26383b;
        switch (i10) {
            case 0:
                g gVar = (g) obj2;
                String d10 = gVar.d();
                return new gc.a((Context) obj, d10);
            case 1:
                db.g gVar2 = (db.g) obj2;
                db.a aVar = (db.a) obj;
                gVar2.getClass();
                return aVar.f16943f.c(new ob.c(aVar, gVar2));
            default:
                return new ac.h((Context) obj, (String) obj2);
        }
    }

    public /* synthetic */ c(Context context, String str) {
        this.a = 2;
        this.f26384c = context;
        this.f26383b = str;
    }
}
