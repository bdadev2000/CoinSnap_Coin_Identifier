package com.apm.insight.l;

import android.annotation.TargetApi;
import android.app.ActivityManager;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    static final a f5935a = new b();

    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        public long a(ActivityManager.MemoryInfo memoryInfo) {
            return 0L;
        }
    }

    @TargetApi(16)
    /* loaded from: classes.dex */
    public static class b extends a {
        private b() {
            super();
        }

        @Override // com.apm.insight.l.n.a
        public long a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    public static long a(ActivityManager.MemoryInfo memoryInfo) {
        return f5935a.a(memoryInfo);
    }
}
