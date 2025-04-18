package com.facebook.appevents;

import android.preference.PreferenceManager;
import com.facebook.x;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes3.dex */
public abstract class c {
    public static final ReentrantReadWriteLock a = new ReentrantReadWriteLock();

    /* renamed from: b, reason: collision with root package name */
    public static String f10925b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f10926c;

    public static void a() {
        if (f10926c) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!f10926c) {
                f10925b = PreferenceManager.getDefaultSharedPreferences(x.a()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                f10926c = true;
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th2) {
            a.writeLock().unlock();
            throw th2;
        }
    }
}
