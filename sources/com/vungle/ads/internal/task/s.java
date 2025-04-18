package com.vungle.ads.internal.task;

import android.content.Context;
import com.vungle.ads.internal.util.x;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s implements e {
    private final Context context;
    private final x pathProvider;

    public s(Context context, x pathProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    @Override // com.vungle.ads.internal.task.e
    public d create(String tag) throws r {
        boolean z10;
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (Intrinsics.areEqual(tag, c.TAG)) {
                return new c(this.context, this.pathProvider);
            }
            if (Intrinsics.areEqual(tag, p.TAG)) {
                return new p(this.context, this.pathProvider);
            }
            throw new r(vd.e.e("Unknown Job Type ", tag));
        }
        throw new r("Job tag is null");
    }

    public final Context getContext() {
        return this.context;
    }

    public final x getPathProvider() {
        return this.pathProvider;
    }
}
