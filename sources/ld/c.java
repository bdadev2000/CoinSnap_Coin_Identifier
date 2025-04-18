package ld;

import com.adjust.sdk.Constants;

/* loaded from: classes4.dex */
public enum c {
    /* JADX INFO: Fake field, exist only in values array */
    MINIMIZED("minimized"),
    /* JADX INFO: Fake field, exist only in values array */
    COLLAPSED("collapsed"),
    NORMAL(Constants.NORMAL),
    /* JADX INFO: Fake field, exist only in values array */
    EXPANDED("expanded"),
    FULLSCREEN("fullscreen");


    /* renamed from: b, reason: collision with root package name */
    public final String f21355b;

    c(String str) {
        this.f21355b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f21355b;
    }
}
