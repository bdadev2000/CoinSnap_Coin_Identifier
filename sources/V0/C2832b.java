package v0;

import java.io.File;
import java.io.FileFilter;

/* renamed from: v0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2832b implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
