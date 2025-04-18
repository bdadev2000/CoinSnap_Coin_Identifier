package com.facebook.internal;

import com.facebook.internal.FileLruCache;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28587a;

    public /* synthetic */ c(int i2) {
        this.f28587a = i2;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f28587a) {
            case 0:
                return FileLruCache.BufferFile.b(file, str);
            case 1:
                return FileLruCache.BufferFile.a(file, str);
            default:
                return Utility.b(file, str);
        }
    }
}
