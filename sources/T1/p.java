package T1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final class p implements com.bumptech.glide.load.data.e {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f2986f = {"_data"};
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2987c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2988d;

    public /* synthetic */ p(int i9, Object obj, Object obj2) {
        this.b = i9;
        this.f2987c = obj;
        this.f2988d = obj2;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.b) {
            case 0:
                return File.class;
            default:
                return ((D) this.f2988d).d();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        int i9 = this.b;
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
            default:
                return 1;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        switch (this.b) {
            case 0:
                Cursor query = ((Context) this.f2987c).getContentResolver().query((Uri) this.f2988d, f2986f, null, null, null);
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
                    dVar.c(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f2988d)));
                    return;
                }
                dVar.h(new File(str));
                return;
            default:
                dVar.h(((D) this.f2988d).b((byte[]) this.f2987c));
                return;
        }
    }

    private final void c() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
