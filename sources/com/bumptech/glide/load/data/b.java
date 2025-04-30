package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b implements e {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public Object f12849c;

    /* renamed from: d, reason: collision with root package name */
    public final Comparable f12850d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f12851f;

    public /* synthetic */ b(int i9, Comparable comparable, Object obj) {
        this.b = i9;
        this.f12851f = obj;
        this.f12850d = comparable;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        switch (this.b) {
            case 0:
                Object obj = this.f12849c;
                if (obj != null) {
                    try {
                        g(obj);
                    } catch (IOException unused) {
                        return;
                    }
                }
                return;
            default:
                Object obj2 = this.f12849c;
                if (obj2 != null) {
                    try {
                        g(obj2);
                        return;
                    } catch (IOException unused2) {
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
            default:
                return 1;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, d dVar) {
        switch (this.b) {
            case 0:
                try {
                    Object i9 = i((AssetManager) this.f12851f, (String) this.f12850d);
                    this.f12849c = i9;
                    dVar.h(i9);
                    return;
                } catch (IOException e4) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e4);
                    }
                    dVar.c(e4);
                    return;
                }
            default:
                try {
                    Object h6 = h((ContentResolver) this.f12851f, (Uri) this.f12850d);
                    this.f12849c = h6;
                    dVar.h(h6);
                    return;
                } catch (FileNotFoundException e9) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e9);
                    }
                    dVar.c(e9);
                    return;
                }
        }
    }

    public abstract void g(Object obj);

    public abstract Object h(ContentResolver contentResolver, Uri uri);

    public abstract Object i(AssetManager assetManager, String str);

    private final void c() {
    }

    private final void f() {
    }
}
