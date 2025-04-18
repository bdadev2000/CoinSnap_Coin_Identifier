package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b implements e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9690b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9691c;

    /* renamed from: d, reason: collision with root package name */
    public final Comparable f9692d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9693f;

    public /* synthetic */ b(Object obj, Comparable comparable, int i10) {
        this.f9690b = i10;
        this.f9693f = obj;
        this.f9692d = comparable;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        switch (this.f9690b) {
            case 0:
                Object obj = this.f9691c;
                if (obj != null) {
                    try {
                        c(obj);
                    } catch (IOException unused) {
                        return;
                    }
                }
                return;
            default:
                Object obj2 = this.f9691c;
                if (obj2 != null) {
                    try {
                        c(obj2);
                        return;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                return;
        }
    }

    public abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final e4.a d() {
        return e4.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, d dVar) {
        int i10 = this.f9690b;
        Comparable comparable = this.f9692d;
        Object obj = this.f9693f;
        switch (i10) {
            case 0:
                try {
                    Closeable f10 = f((AssetManager) obj, (String) comparable);
                    this.f9691c = f10;
                    dVar.f(f10);
                    return;
                } catch (IOException e2) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e2);
                    }
                    dVar.c(e2);
                    return;
                }
            default:
                try {
                    Object g10 = g((ContentResolver) obj, (Uri) comparable);
                    this.f9691c = g10;
                    dVar.f(g10);
                    return;
                } catch (FileNotFoundException e10) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e10);
                    }
                    dVar.c(e10);
                    return;
                }
        }
    }

    public abstract Closeable f(AssetManager assetManager, String str);

    public abstract Object g(ContentResolver contentResolver, Uri uri);
}
