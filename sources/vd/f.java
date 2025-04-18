package vd;

/* loaded from: classes4.dex */
public enum f {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED("unspecified"),
    /* JADX INFO: Fake field, exist only in values array */
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    /* JADX INFO: Fake field, exist only in values array */
    ONE_PIXEL("onePixel"),
    /* JADX INFO: Fake field, exist only in values array */
    VIEWABLE("viewable"),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIBLE("audible"),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER("other");


    /* renamed from: b, reason: collision with root package name */
    public final String f26502b;

    f(String str) {
        this.f26502b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f26502b;
    }
}
