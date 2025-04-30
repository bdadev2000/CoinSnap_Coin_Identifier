package O1;

import T1.D;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.e;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class b implements e {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final Comparable f2150c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2151d;

    /* renamed from: f, reason: collision with root package name */
    public Object f2152f;

    public /* synthetic */ b(int i9, Comparable comparable, Object obj) {
        this.b = i9;
        this.f2150c = comparable;
        this.f2151d = obj;
    }

    public static b c(Context context, Uri uri, c cVar) {
        return new b(0, uri, new d(com.bumptech.glide.b.a(context).f12792d.a().e(), cVar, com.bumptech.glide.b.a(context).f12793f, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.b) {
            case 0:
                return InputStream.class;
            case 1:
                ((D) this.f2151d).getClass();
                return InputStream.class;
            default:
                return ((D) this.f2151d).d();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        switch (this.b) {
            case 0:
                InputStream inputStream = (InputStream) this.f2152f;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                return;
            case 1:
                try {
                    D d2 = (D) this.f2151d;
                    ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) this.f2152f;
                    d2.getClass();
                    byteArrayInputStream.close();
                    return;
                } catch (IOException unused2) {
                    return;
                }
            default:
                Object obj = this.f2152f;
                if (obj != null) {
                    try {
                        ((D) this.f2151d).a(obj);
                        return;
                    } catch (IOException unused3) {
                        return;
                    }
                }
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i9 = this.b;
    }

    @Override // com.bumptech.glide.load.data.e
    public final int d() {
        switch (this.b) {
            case 0:
                return 1;
            case 1:
                return 1;
            default:
                return 1;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(g gVar, com.bumptech.glide.load.data.d dVar) {
        switch (this.b) {
            case 0:
                try {
                    InputStream i9 = i();
                    this.f2152f = i9;
                    dVar.h(i9);
                    return;
                } catch (FileNotFoundException e4) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e4);
                    }
                    dVar.c(e4);
                    return;
                }
            case 1:
                try {
                    D d2 = (D) this.f2151d;
                    String str = (String) this.f2150c;
                    d2.getClass();
                    ByteArrayInputStream c9 = D.c(str);
                    this.f2152f = c9;
                    dVar.h(c9);
                    return;
                } catch (IllegalArgumentException e9) {
                    dVar.c(e9);
                    return;
                }
            default:
                try {
                    Object e10 = ((D) this.f2151d).e((File) this.f2150c);
                    this.f2152f = e10;
                    dVar.h(e10);
                    return;
                } catch (FileNotFoundException e11) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e11);
                    }
                    dVar.c(e11);
                    return;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        if (r6 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x004f, code lost:
    
        if (r6 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0029: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:42), block:B:68:0x0029 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e8  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.InputStream i() {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.b.i():java.io.InputStream");
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
