package U1;

import N1.i;
import T1.t;
import T1.u;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.g;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final class d implements com.bumptech.glide.load.data.e {
    public static final String[] m = {"_data"};
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final u f3115c;

    /* renamed from: d, reason: collision with root package name */
    public final u f3116d;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f3117f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3118g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3119h;

    /* renamed from: i, reason: collision with root package name */
    public final i f3120i;

    /* renamed from: j, reason: collision with root package name */
    public final Class f3121j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f3122k;
    public volatile com.bumptech.glide.load.data.e l;

    public d(Context context, u uVar, u uVar2, Uri uri, int i9, int i10, i iVar, Class cls) {
        this.b = context.getApplicationContext();
        this.f3115c = uVar;
        this.f3116d = uVar2;
        this.f3117f = uri;
        this.f3118g = i9;
        this.f3119h = i10;
        this.f3120i = iVar;
        this.f3121j = cls;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f3121j;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        com.bumptech.glide.load.data.e eVar = this.l;
        if (eVar != null) {
            eVar.b();
        }
    }

    public final com.bumptech.glide.load.data.e c() {
        boolean isExternalStorageLegacy;
        t b;
        isExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.b;
        i iVar = this.f3120i;
        int i9 = this.f3119h;
        int i10 = this.f3118g;
        if (isExternalStorageLegacy) {
            Uri uri = this.f3117f;
            try {
                Cursor query = context.getContentResolver().query(uri, m, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(query.getColumnIndexOrThrow("_data"));
                            if (!TextUtils.isEmpty(string)) {
                                File file = new File(string);
                                query.close();
                                b = this.f3115c.b(file, i10, i9, iVar);
                            } else {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri uri2 = this.f3117f;
            boolean s5 = R2.b.s(uri2);
            u uVar = this.f3116d;
            if (s5 && uri2.getPathSegments().contains("picker")) {
                b = uVar.b(uri2, i10, i9, iVar);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    uri2 = MediaStore.setRequireOriginal(uri2);
                }
                b = uVar.b(uri2, i10, i9, iVar);
            }
        }
        if (b == null) {
            return null;
        }
        return b.f2994c;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f3122k = true;
        com.bumptech.glide.load.data.e eVar = this.l;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int d() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(g gVar, com.bumptech.glide.load.data.d dVar) {
        try {
            com.bumptech.glide.load.data.e c9 = c();
            if (c9 == null) {
                dVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f3117f));
            } else {
                this.l = c9;
                if (this.f3122k) {
                    cancel();
                } else {
                    c9.e(gVar, dVar);
                }
            }
        } catch (FileNotFoundException e4) {
            dVar.c(e4);
        }
    }
}
