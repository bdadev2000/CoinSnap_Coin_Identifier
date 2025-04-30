package com.vungle.ads.internal.task;

import android.content.Context;
import com.vungle.ads.internal.util.x;

/* loaded from: classes3.dex */
public final class s implements e {
    private final Context context;
    private final x pathProvider;

    public s(Context context, x xVar) {
        G7.j.e(context, "context");
        G7.j.e(xVar, "pathProvider");
        this.context = context;
        this.pathProvider = xVar;
    }

    @Override // com.vungle.ads.internal.task.e
    public d create(String str) throws r {
        G7.j.e(str, "tag");
        if (str.length() != 0) {
            if (str.equals(c.TAG)) {
                return new c(this.context, this.pathProvider);
            }
            if (str.equals(p.TAG)) {
                return new p(this.context, this.pathProvider);
            }
            throw new r("Unknown Job Type ".concat(str));
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
