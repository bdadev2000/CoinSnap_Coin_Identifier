package l4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.e;
import e4.m;
import java.io.File;
import java.io.FileNotFoundException;
import k4.x;
import k4.y;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f21124m = {"_data"};

    /* renamed from: b, reason: collision with root package name */
    public final Context f21125b;

    /* renamed from: c, reason: collision with root package name */
    public final y f21126c;

    /* renamed from: d, reason: collision with root package name */
    public final y f21127d;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f21128f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21129g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21130h;

    /* renamed from: i, reason: collision with root package name */
    public final m f21131i;

    /* renamed from: j, reason: collision with root package name */
    public final Class f21132j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f21133k;

    /* renamed from: l, reason: collision with root package name */
    public volatile e f21134l;

    public c(Context context, y yVar, y yVar2, Uri uri, int i10, int i11, m mVar, Class cls) {
        this.f21125b = context.getApplicationContext();
        this.f21126c = yVar;
        this.f21127d = yVar2;
        this.f21128f = uri;
        this.f21129g = i10;
        this.f21130h = i11;
        this.f21131i = mVar;
        this.f21132j = cls;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f21132j;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        e eVar = this.f21134l;
        if (eVar != null) {
            eVar.b();
        }
    }

    public final e c() {
        boolean isExternalStorageLegacy;
        boolean z10;
        x b3;
        isExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        m mVar = this.f21131i;
        int i10 = this.f21130h;
        int i11 = this.f21129g;
        Context context = this.f21125b;
        if (isExternalStorageLegacy) {
            Uri uri = this.f21128f;
            try {
                Cursor query = context.getContentResolver().query(uri, f21124m, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(query.getColumnIndexOrThrow("_data"));
                            if (!TextUtils.isEmpty(string)) {
                                File file = new File(string);
                                query.close();
                                b3 = this.f21126c.b(file, i11, i10, mVar);
                            } else {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Uri uri2 = this.f21128f;
            if (z10) {
                uri2 = MediaStore.setRequireOriginal(uri2);
            }
            b3 = this.f21127d.b(uri2, i11, i10, mVar);
        }
        if (b3 == null) {
            return null;
        }
        return b3.f20271c;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f21133k = true;
        e eVar = this.f21134l;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final e4.a d() {
        return e4.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(h hVar, com.bumptech.glide.load.data.d dVar) {
        try {
            e c10 = c();
            if (c10 == null) {
                dVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f21128f));
            } else {
                this.f21134l = c10;
                if (this.f21133k) {
                    cancel();
                } else {
                    c10.e(hVar, dVar);
                }
            }
        } catch (FileNotFoundException e2) {
            dVar.c(e2);
        }
    }
}
