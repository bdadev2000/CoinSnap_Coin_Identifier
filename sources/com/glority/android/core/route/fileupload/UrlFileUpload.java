package com.glority.android.core.route.fileupload;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlFileUpload.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/glority/android/core/route/fileupload/UrlFileUpload;", "", "()V", "MODULE", "", "URL_INIT", "getURL_INIT", "()Ljava/lang/String;", "setURL_INIT", "(Ljava/lang/String;)V", "URL_UPDATE_CREDENTIALS", "getURL_UPDATE_CREDENTIALS", "setURL_UPDATE_CREDENTIALS", "URL_UPLOAD", "getURL_UPLOAD", "setURL_UPLOAD", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlFileUpload {
    public static final UrlFileUpload INSTANCE = new UrlFileUpload();
    private static String MODULE;
    private static String URL_INIT;
    private static String URL_UPDATE_CREDENTIALS;
    private static String URL_UPLOAD;

    private UrlFileUpload() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), "fileUpload");
        MODULE = stringPlus;
        URL_INIT = Intrinsics.stringPlus(stringPlus, "/init");
        URL_UPDATE_CREDENTIALS = Intrinsics.stringPlus(MODULE, "/updateCredentials");
        URL_UPLOAD = Intrinsics.stringPlus(MODULE, "/upload");
    }

    public final String getURL_INIT() {
        return URL_INIT;
    }

    public final void setURL_INIT(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_INIT = str;
    }

    public final String getURL_UPDATE_CREDENTIALS() {
        return URL_UPDATE_CREDENTIALS;
    }

    public final void setURL_UPDATE_CREDENTIALS(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_UPDATE_CREDENTIALS = str;
    }

    public final String getURL_UPLOAD() {
        return URL_UPLOAD;
    }

    public final void setURL_UPLOAD(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_UPLOAD = str;
    }
}
