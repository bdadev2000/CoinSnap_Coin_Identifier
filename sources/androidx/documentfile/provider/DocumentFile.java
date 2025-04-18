package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes4.dex */
public abstract class DocumentFile {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.documentfile.provider.DocumentFile, java.lang.Object, androidx.documentfile.provider.SingleDocumentFile] */
    public static DocumentFile a(Context context, Uri uri) {
        ?? obj = new Object();
        obj.f19435a = context;
        obj.f19436b = uri;
        return obj;
    }

    public abstract String b();

    public abstract String c();

    public abstract Uri d();
}
