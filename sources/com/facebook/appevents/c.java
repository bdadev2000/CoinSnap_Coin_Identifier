package com.facebook.appevents;

import android.preference.PreferenceManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ReentrantReadWriteLock f13472a = new ReentrantReadWriteLock();
    public static String b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f13473c;

    public static void a() {
        if (f13473c) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f13472a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f13473c) {
                reentrantReadWriteLock.writeLock().unlock();
                return;
            }
            b = PreferenceManager.getDefaultSharedPreferences(com.facebook.r.a()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
            f13473c = true;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            f13472a.writeLock().unlock();
            throw th;
        }
    }
}
