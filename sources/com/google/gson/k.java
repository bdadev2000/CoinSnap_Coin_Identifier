package com.google.gson;

/* loaded from: classes3.dex */
public final class k extends c0 {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12105b;

    public /* synthetic */ k(Object obj, int i10) {
        this.a = i10;
        this.f12105b = obj;
    }

    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        switch (this.a) {
            case 0:
                if (aVar.b0() == 9) {
                    aVar.X();
                    return null;
                }
                return Double.valueOf(aVar.x());
            case 1:
                if (aVar.b0() == 9) {
                    aVar.X();
                    return null;
                }
                return Float.valueOf((float) aVar.x());
            default:
                aVar.i0();
                return null;
        }
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        switch (this.a) {
            case 0:
                d(bVar, (Number) obj);
                return;
            case 1:
                d(bVar, (Number) obj);
                return;
            default:
                bVar.t();
                return;
        }
    }

    public final void d(zc.b bVar, Number number) {
        switch (this.a) {
            case 0:
                if (number == null) {
                    bVar.t();
                    return;
                }
                double doubleValue = number.doubleValue();
                n.a(doubleValue);
                bVar.T(doubleValue);
                return;
            default:
                if (number == null) {
                    bVar.t();
                    return;
                }
                float floatValue = number.floatValue();
                n.a(floatValue);
                if (!(number instanceof Float)) {
                    number = Float.valueOf(floatValue);
                }
                bVar.W(number);
                return;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
