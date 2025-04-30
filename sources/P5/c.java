package P5;

import com.adjust.sdk.Constants;

/* loaded from: classes3.dex */
public enum c {
    /* JADX INFO: Fake field, exist only in values array */
    MINIMIZED("minimized"),
    /* JADX INFO: Fake field, exist only in values array */
    COLLAPSED("collapsed"),
    NORMAL(Constants.NORMAL),
    /* JADX INFO: Fake field, exist only in values array */
    EXPANDED("expanded"),
    FULLSCREEN("fullscreen");

    public final String b;

    c(String str) {
        this.b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.b;
    }
}
