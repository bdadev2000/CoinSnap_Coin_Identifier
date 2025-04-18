package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
final class PendingPost {

    /* renamed from: d, reason: collision with root package name */
    private static final List<PendingPost> f12906d = new ArrayList();
    Object a;

    /* renamed from: b, reason: collision with root package name */
    Subscription f12907b;

    /* renamed from: c, reason: collision with root package name */
    PendingPost f12908c;

    private PendingPost(Object obj, Subscription subscription) {
        this.a = obj;
        this.f12907b = subscription;
    }

    public static PendingPost a(Subscription subscription, Object obj) {
        List<PendingPost> list = f12906d;
        synchronized (list) {
            int size = list.size();
            if (size > 0) {
                PendingPost remove = list.remove(size - 1);
                remove.a = obj;
                remove.f12907b = subscription;
                remove.f12908c = null;
                return remove;
            }
            return new PendingPost(obj, subscription);
        }
    }

    public static void a(PendingPost pendingPost) {
        pendingPost.a = null;
        pendingPost.f12907b = null;
        pendingPost.f12908c = null;
        List<PendingPost> list = f12906d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(pendingPost);
            }
        }
    }
}
