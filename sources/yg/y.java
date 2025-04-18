package yg;

import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public final class y extends l {
    public final Type a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28290b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f28291c;

    /* renamed from: d, reason: collision with root package name */
    public l f28292d;

    public y(Type type, String str, Object obj) {
        this.a = type;
        this.f28290b = str;
        this.f28291c = obj;
    }

    @Override // yg.l
    public final Object fromJson(p pVar) {
        l lVar = this.f28292d;
        if (lVar != null) {
            return lVar.fromJson(pVar);
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }

    @Override // yg.l
    public final void toJson(s sVar, Object obj) {
        l lVar = this.f28292d;
        if (lVar != null) {
            lVar.toJson(sVar, obj);
            return;
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }

    public final String toString() {
        l lVar = this.f28292d;
        return lVar != null ? lVar.toString() : super.toString();
    }
}
