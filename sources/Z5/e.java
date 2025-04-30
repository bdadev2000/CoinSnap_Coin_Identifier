package Z5;

/* loaded from: classes3.dex */
public enum e {
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

    public final String b;

    e(String str) {
        this.b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.b;
    }
}
