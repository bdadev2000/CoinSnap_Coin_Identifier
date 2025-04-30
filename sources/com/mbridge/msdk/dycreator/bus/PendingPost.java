package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class PendingPost {

    /* renamed from: d, reason: collision with root package name */
    private static final List<PendingPost> f15257d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    Object f15258a;
    Subscription b;

    /* renamed from: c, reason: collision with root package name */
    PendingPost f15259c;

    private PendingPost(Object obj, Subscription subscription) {
        this.f15258a = obj;
        this.b = subscription;
    }

    public static PendingPost a(Subscription subscription, Object obj) {
        List<PendingPost> list = f15257d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size > 0) {
                    PendingPost remove = list.remove(size - 1);
                    remove.f15258a = obj;
                    remove.b = subscription;
                    remove.f15259c = null;
                    return remove;
                }
                return new PendingPost(obj, subscription);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(PendingPost pendingPost) {
        pendingPost.f15258a = null;
        pendingPost.b = null;
        pendingPost.f15259c = null;
        List<PendingPost> list = f15257d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(pendingPost);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
