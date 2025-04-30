package com.vungle.ads.internal.load;

import com.vungle.ads.internal.util.D;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class i implements D {
    final /* synthetic */ List<String> $existingPaths;

    public i(List<String> list) {
        this.$existingPaths = list;
    }

    @Override // com.vungle.ads.internal.util.D
    public boolean matches(String str) {
        if (str != null && str.length() != 0) {
            File file = new File(str);
            Iterator<String> it = this.$existingPaths.iterator();
            while (it.hasNext()) {
                File file2 = new File(it.next());
                if (file2.equals(file)) {
                    return false;
                }
                String path = file.getPath();
                G7.j.d(path, "toExtract.path");
                if (O7.o.C(path, file2.getPath() + File.separator, false)) {
                    return false;
                }
            }
        }
        return true;
    }
}
