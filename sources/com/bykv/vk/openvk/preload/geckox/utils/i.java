package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class i implements Executor {
    private static volatile i a;

    public static i a() {
        if (a == null) {
            synchronized (i.class) {
                if (a == null) {
                    a = new i();
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
