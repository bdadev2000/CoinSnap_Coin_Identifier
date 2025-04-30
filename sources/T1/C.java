package T1;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* loaded from: classes.dex */
public final class C implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2960a;
    public final u b;

    public /* synthetic */ C(u uVar, int i9) {
        this.f2960a = i9;
        this.b = uVar;
    }

    @Override // T1.u
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.f2960a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override // T1.u
    public final t b(Object obj, int i9, int i10, N1.i iVar) {
        Uri uri;
        switch (this.f2960a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uri = null;
                } else if (str.charAt(0) == '/') {
                    uri = Uri.fromFile(new File(str));
                } else {
                    Uri parse = Uri.parse(str);
                    if (parse.getScheme() == null) {
                        uri = Uri.fromFile(new File(str));
                    } else {
                        uri = parse;
                    }
                }
                if (uri == null) {
                    return null;
                }
                u uVar = this.b;
                if (!uVar.a(uri)) {
                    return null;
                }
                return uVar.b(uri, i9, i10, iVar);
            default:
                return this.b.b(new k((URL) obj), i9, i10, iVar);
        }
    }
}
