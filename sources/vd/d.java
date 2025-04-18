package vd;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes4.dex */
public enum d {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    /* JADX INFO: Fake field, exist only in values array */
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO(MimeTypes.BASE_TYPE_VIDEO),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO(MimeTypes.BASE_TYPE_AUDIO);


    /* renamed from: b, reason: collision with root package name */
    public final String f26498b;

    d(String str) {
        this.f26498b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f26498b;
    }
}
