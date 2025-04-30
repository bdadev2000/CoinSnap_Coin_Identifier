package com.apm.insight.l;

import android.annotation.TargetApi;
import android.os.Debug;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    static final a f5921a = new b();

    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        public int a(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public int b(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        public int c(Debug.MemoryInfo memoryInfo) {
            return -1;
        }
    }

    @TargetApi(19)
    /* loaded from: classes.dex */
    public static class b extends a {
        private b() {
            super();
        }

        @Override // com.apm.insight.l.c.a
        public int a(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        @Override // com.apm.insight.l.c.a
        public int b(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        @Override // com.apm.insight.l.c.a
        public int c(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }
    }

    public static int a(Debug.MemoryInfo memoryInfo) {
        return f5921a.a(memoryInfo);
    }

    public static int b(Debug.MemoryInfo memoryInfo) {
        return f5921a.b(memoryInfo);
    }

    public static int c(Debug.MemoryInfo memoryInfo) {
        return f5921a.c(memoryInfo);
    }
}
