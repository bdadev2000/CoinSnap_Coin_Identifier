package com.glority.android.core.ext;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.app.AppContext;
import com.glority.utils.stability.LogUtils;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonExtensions.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0000\u001a\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a3\u0010\u0006\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\t\u001a)\u0010\u0006\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0004H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\n\u001a;\u0010\u000b\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0000\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0004H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"lock", "R", "Ljava/util/concurrent/locks/Lock;", "block", "Lkotlin/Function0;", "(Ljava/util/concurrent/locks/Lock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "tryCatch", "tried", "catch", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "tryLock", "delayed", "", "(Ljava/util/concurrent/locks/Lock;JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "fwk-core_release"}, k = 2, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class CommonExtensionsKt {
    public static final <R> R tryCatch(Function0<? extends R> tried, Function0<? extends R> function0) {
        Intrinsics.checkNotNullParameter(tried, "tried");
        Intrinsics.checkNotNullParameter(function0, "catch");
        try {
            return tried.invoke();
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            return function0.invoke();
        }
    }

    public static final <R> R lock(Lock lock, Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            lock.lock();
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            lock.unlock();
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ Object tryLock$default(Lock lock, long j, Function0 block, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!lock.tryLock(j, TimeUnit.MILLISECONDS)) {
            return null;
        }
        try {
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            lock.unlock();
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <R> R tryLock(Lock lock, long j, Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!lock.tryLock(j, TimeUnit.MILLISECONDS)) {
            return null;
        }
        try {
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            lock.unlock();
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <R> R tryCatch(Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke();
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            return null;
        }
    }
}
