package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;

@KeepForSdk
/* loaded from: classes3.dex */
public final class ListenerHolder<L> {
    private final Executor zaa;

    @Nullable
    private volatile Object zab;

    @Nullable
    private volatile ListenerKey zac;

    @KeepForSdk
    /* loaded from: classes3.dex */
    public static final class ListenerKey<L> {
        private final Object zaa;
        private final String zab;

        @KeepForSdk
        public ListenerKey(L l10, String str) {
            this.zaa = l10;
            this.zab = str;
        }

        @KeepForSdk
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            if (this.zaa == listenerKey.zaa && this.zab.equals(listenerKey.zab)) {
                return true;
            }
            return false;
        }

        @KeepForSdk
        public int hashCode() {
            return this.zab.hashCode() + (System.identityHashCode(this.zaa) * 31);
        }

        @NonNull
        @KeepForSdk
        public String toIdString() {
            return this.zab + "@" + System.identityHashCode(this.zaa);
        }
    }

    @KeepForSdk
    /* loaded from: classes3.dex */
    public interface Notifier<L> {
        @KeepForSdk
        void notifyListener(@NonNull L l10);

        @KeepForSdk
        void onNotifyListenerFailed();
    }

    @KeepForSdk
    public ListenerHolder(@NonNull Looper looper, @NonNull L l10, @NonNull String str) {
        this.zaa = new HandlerExecutor(looper);
        this.zab = Preconditions.checkNotNull(l10, "Listener must not be null");
        this.zac = new ListenerKey(l10, Preconditions.checkNotEmpty(str));
    }

    @KeepForSdk
    public void clear() {
        this.zab = null;
        this.zac = null;
    }

    @Nullable
    @KeepForSdk
    public ListenerKey<L> getListenerKey() {
        return this.zac;
    }

    @KeepForSdk
    public boolean hasListener() {
        return this.zab != null;
    }

    @KeepForSdk
    public void notifyListener(@NonNull final Notifier<? super L> notifier) {
        Preconditions.checkNotNull(notifier, "Notifier must not be null");
        this.zaa.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.zacb
            @Override // java.lang.Runnable
            public final void run() {
                ListenerHolder.this.zaa(notifier);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zaa(Notifier notifier) {
        Object obj = this.zab;
        if (obj == null) {
            notifier.onNotifyListenerFailed();
            return;
        }
        try {
            notifier.notifyListener(obj);
        } catch (RuntimeException e2) {
            notifier.onNotifyListenerFailed();
            throw e2;
        }
    }

    @KeepForSdk
    public ListenerHolder(@NonNull Executor executor, @NonNull L l10, @NonNull String str) {
        this.zaa = (Executor) Preconditions.checkNotNull(executor, "Executor must not be null");
        this.zab = Preconditions.checkNotNull(l10, "Listener must not be null");
        this.zac = new ListenerKey(l10, Preconditions.checkNotEmpty(str));
    }
}
