package com.safedk.android.internal.partials;

import com.fyber.inneractive.sdk.external.VideoContentListener;

/* loaded from: classes.dex */
class VideoBridge$2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ VideoContentListener f30004a;

    VideoBridge$2(VideoContentListener videoContentListener) {
        this.f30004a = videoContentListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        VideoBridge.a(this.f30004a);
    }
}
