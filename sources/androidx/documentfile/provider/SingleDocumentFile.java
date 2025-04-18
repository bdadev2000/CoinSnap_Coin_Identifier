package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes4.dex */
class SingleDocumentFile extends DocumentFile {

    /* renamed from: a, reason: collision with root package name */
    public Context f19435a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f19436b;

    @Override // androidx.documentfile.provider.DocumentFile
    public final String b() {
        return DocumentsContractApi19.a(this.f19435a, this.f19436b, "_display_name");
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final String c() {
        String a2 = DocumentsContractApi19.a(this.f19435a, this.f19436b, "mime_type");
        if ("vnd.android.document/directory".equals(a2)) {
            return null;
        }
        return a2;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public final Uri d() {
        return this.f19436b;
    }
}
