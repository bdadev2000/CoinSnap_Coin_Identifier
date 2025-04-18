package c3;

import android.content.Context;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2554b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2555c = true;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f2556d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jb.g f2557f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f2558g;

    public /* synthetic */ g(j jVar, Context context, wg.a aVar, int i10) {
        this.f2554b = i10;
        this.f2558g = jVar;
        this.f2556d = context;
        this.f2557f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2554b;
        Context context = this.f2556d;
        jb.g gVar = this.f2557f;
        boolean z10 = this.f2555c;
        j jVar = this.f2558g;
        switch (i10) {
            case 0:
                if (jVar.f2575k != null) {
                    if (z10) {
                        jVar.e((h.m) context, gVar);
                        return;
                    } else {
                        gVar.getClass();
                        return;
                    }
                }
                jVar.f2572h = true;
                return;
            default:
                jVar.f2569e = true;
                if (jVar.f2575k != null) {
                    if (z10) {
                        jVar.e((h.m) context, gVar);
                        return;
                    } else {
                        gVar.getClass();
                        return;
                    }
                }
                if (gVar != null) {
                    gVar.w();
                    jVar.f2571g = false;
                    return;
                }
                return;
        }
    }
}
