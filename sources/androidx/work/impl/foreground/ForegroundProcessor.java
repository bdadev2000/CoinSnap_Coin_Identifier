package androidx.work.impl.foreground;

import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;

@RestrictTo
/* loaded from: classes.dex */
public interface ForegroundProcessor {
    void a(String str);

    void b(String str, ForegroundInfo foregroundInfo);
}
