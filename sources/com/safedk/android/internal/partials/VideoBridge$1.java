package com.safedk.android.internal.partials;

import com.safedk.android.SafeDK;

/* loaded from: classes.dex */
class VideoBridge$1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SafeDK f30002a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f30003b;

    VideoBridge$1(SafeDK safeDK, String str) {
        this.f30002a = safeDK;
        this.f30003b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f30002a.z().h("", this.f30003b);
    }
}
