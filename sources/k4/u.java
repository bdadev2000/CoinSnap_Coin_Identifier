package k4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final class u implements com.bumptech.glide.load.data.e {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f20263d = {"_data"};

    /* renamed from: b, reason: collision with root package name */
    public final Context f20264b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f20265c;

    public u(Context context, Uri uri) {
        this.f20264b = context;
        this.f20265c = uri;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return File.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final e4.a d() {
        return e4.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d dVar) {
        Cursor query = this.f20264b.getContentResolver().query(this.f20265c, f20263d, null, null, null);
        String str = null;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    str = query.getString(query.getColumnIndexOrThrow("_data"));
                }
            } finally {
                query.close();
            }
        }
        if (TextUtils.isEmpty(str)) {
            dVar.c(new FileNotFoundException("Failed to find file path for: " + this.f20265c));
            return;
        }
        dVar.f(new File(str));
    }
}
