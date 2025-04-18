package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.impl.model.WorkSpec;

@RestrictTo
/* loaded from: classes4.dex */
public interface Scheduler {
    void a(String str);

    void c(WorkSpec... workSpecArr);

    boolean d();
}
