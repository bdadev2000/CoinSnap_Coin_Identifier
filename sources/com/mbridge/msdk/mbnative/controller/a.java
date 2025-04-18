package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;

/* loaded from: classes4.dex */
public abstract class a {
    public Handler a;

    public abstract void a(int i10, long j3, int i11, String str);

    public final synchronized void a(long j3, int i10, boolean z10, String str, String str2) {
        a(1, j3, i10, str2);
    }
}
