package j7;

import android.content.Context;
import i7.m;

/* loaded from: classes3.dex */
public final class f implements k7.b {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final rh.a f19779b;

    /* renamed from: c, reason: collision with root package name */
    public final rh.a f19780c;

    /* renamed from: d, reason: collision with root package name */
    public final rh.a f19781d;

    public /* synthetic */ f(rh.a aVar, m mVar, m mVar2, int i10) {
        this.a = i10;
        this.f19779b = aVar;
        this.f19780c = mVar;
        this.f19781d = mVar2;
    }

    @Override // rh.a
    public final Object get() {
        int i10 = this.a;
        rh.a aVar = this.f19781d;
        rh.a aVar2 = this.f19780c;
        rh.a aVar3 = this.f19779b;
        switch (i10) {
            case 0:
                return new e((Context) aVar3.get(), (q7.a) aVar2.get(), (q7.a) aVar.get());
            default:
                return new o7.m((Context) aVar3.get(), (String) aVar2.get(), ((Integer) aVar.get()).intValue());
        }
    }
}
