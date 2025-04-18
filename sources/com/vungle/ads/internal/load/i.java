package com.vungle.ads.internal.load;

import com.vungle.ads.internal.util.d0;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes4.dex */
public final class i implements d0 {
    final /* synthetic */ List<String> $existingPaths;

    public i(List<String> list) {
        this.$existingPaths = list;
    }

    @Override // com.vungle.ads.internal.util.d0
    public boolean matches(String str) {
        boolean z10;
        boolean startsWith$default;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return true;
        }
        File file = new File(str);
        Iterator<String> it = this.$existingPaths.iterator();
        while (it.hasNext()) {
            File file2 = new File(it.next());
            if (Intrinsics.areEqual(file2, file)) {
                return false;
            }
            String path = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "toExtract.path");
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(path, file2.getPath() + File.separator, false, 2, null);
            if (startsWith$default) {
                return false;
            }
        }
        return true;
    }
}
