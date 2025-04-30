package Z5;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
public enum d {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    /* JADX INFO: Fake field, exist only in values array */
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO(MimeTypes.BASE_TYPE_VIDEO),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO(MimeTypes.BASE_TYPE_AUDIO);

    public final String b;

    d(String str) {
        this.b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.b;
    }
}
