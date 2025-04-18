package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class e implements Executor {
    private static volatile e a;

    public static e a() {
        if (a == null) {
            synchronized (e.class) {
                if (a == null) {
                    a = new e();
                }
            }
        }
        return a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.c().execute(runnable);
    }
}
