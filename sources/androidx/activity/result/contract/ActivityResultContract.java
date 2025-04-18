package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes3.dex */
public abstract class ActivityResultContract<I, O> {

    /* loaded from: classes3.dex */
    public static final class SynchronousResult<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f303a;

        public SynchronousResult(Serializable serializable) {
            this.f303a = serializable;
        }
    }

    public abstract Intent createIntent(Context context, Object obj);

    @Nullable
    public SynchronousResult<O> getSynchronousResult(@NotNull Context context, I i2) {
        a.s(context, "context");
        return null;
    }

    public abstract Object parseResult(int i2, Intent intent);
}
