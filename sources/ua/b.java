package ua;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public interface b extends Future {
    void addListener(Runnable runnable, Executor executor);
}
