package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
final class zzccd extends ScheduledThreadPoolExecutor {
    public zzccd(int i9, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
