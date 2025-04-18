package yg;

/* loaded from: classes4.dex */
public abstract class l {
    public abstract Object fromJson(p pVar);

    public final l nullSafe() {
        if (this instanceof zg.a) {
            return this;
        }
        return new zg.a(this);
    }

    public abstract void toJson(s sVar, Object obj);
}
