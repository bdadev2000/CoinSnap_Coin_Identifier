package androidx.work;

import android.content.Context;
import androidx.work.impl.utils.futures.SettableFuture;
import java.util.UUID;

/* loaded from: classes2.dex */
public interface ForegroundUpdater {
    SettableFuture a(Context context, UUID uuid, ForegroundInfo foregroundInfo);
}
