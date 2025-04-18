package f4;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.h;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c implements com.bumptech.glide.load.data.e {

    /* renamed from: b, reason: collision with root package name */
    public final Uri f17670b;

    /* renamed from: c, reason: collision with root package name */
    public final e f17671c;

    /* renamed from: d, reason: collision with root package name */
    public InputStream f17672d;

    public c(Uri uri, e eVar) {
        this.f17670b = uri;
        this.f17671c = eVar;
    }

    public static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.a(context).f9608d.a().d(), dVar, com.bumptech.glide.b.a(context).f9609f, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        InputStream inputStream = this.f17672d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final e4.a d() {
        return e4.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(h hVar, com.bumptech.glide.load.data.d dVar) {
        try {
            InputStream f10 = f();
            this.f17672d = f10;
            dVar.f(f10);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
            }
            dVar.c(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x004a, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if (r7 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0048, code lost:
    
        if (r7 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004d, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0025: MOVE (r5 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:38), block:B:70:0x0025 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ea  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.InputStream f() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.c.f():java.io.InputStream");
    }
}
