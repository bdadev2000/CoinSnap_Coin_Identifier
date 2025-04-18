package k4;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* loaded from: classes.dex */
public final class f0 implements y {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final y f20235b;

    public /* synthetic */ f0(y yVar, int i10) {
        this.a = i10;
        this.f20235b = yVar;
    }

    @Override // k4.y
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override // k4.y
    public final x b(Object obj, int i10, int i11, e4.m mVar) {
        Uri uri;
        int i12 = this.a;
        y yVar = this.f20235b;
        switch (i12) {
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
                if (uri == null || !yVar.a(uri)) {
                    return null;
                }
                return yVar.b(uri, i10, i11, mVar);
            default:
                return yVar.b(new p((URL) obj), i10, i11, mVar);
        }
    }
}
