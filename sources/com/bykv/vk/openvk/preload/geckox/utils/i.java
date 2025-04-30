package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class i implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile i f13335a;

    public static i a() {
        if (f13335a == null) {
            synchronized (i.class) {
                try {
                    if (f13335a == null) {
                        f13335a = new i();
                    }
                } finally {
                }
            }
        }
        return f13335a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.c().execute(runnable);
    }
}
