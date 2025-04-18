package androidx.work;

import androidx.work.impl.utils.futures.SettableFuture;
import java.util.UUID;

/* loaded from: classes3.dex */
public interface ProgressUpdater {
    SettableFuture a(UUID uuid, Data data);
}
