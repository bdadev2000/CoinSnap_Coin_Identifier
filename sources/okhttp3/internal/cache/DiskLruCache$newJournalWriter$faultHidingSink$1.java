package okhttp3.internal.cache;

import d0.b0;
import java.io.IOException;
import kotlin.jvm.internal.r;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends r implements l {
    final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.this$0 = diskLruCache;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull IOException iOException) {
        a.s(iOException, "it");
        DiskLruCache diskLruCache = this.this$0;
        if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
        }
        this.this$0.hasJournalErrors = true;
    }
}
