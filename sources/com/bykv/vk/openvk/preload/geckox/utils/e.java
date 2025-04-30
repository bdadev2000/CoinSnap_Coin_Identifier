package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class e implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile e f13332a;

    public static e a() {
        if (f13332a == null) {
            synchronized (e.class) {
                try {
                    if (f13332a == null) {
                        f13332a = new e();
                    }
                } finally {
                }
            }
        }
        return f13332a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.c().execute(runnable);
    }
}
