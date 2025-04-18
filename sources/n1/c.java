package n1;

import java.io.File;
import java.io.FileFilter;

/* loaded from: classes.dex */
public final class c implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
