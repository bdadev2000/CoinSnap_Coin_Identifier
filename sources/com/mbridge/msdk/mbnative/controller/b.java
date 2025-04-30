package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;
import com.mbridge.msdk.c.k;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    protected Handler f16502a;

    public abstract void a(int i9, long j7, int i10, k kVar, String str, String str2, com.mbridge.msdk.b.a.a aVar, boolean z8);

    public final synchronized void a(int i9, long j7, int i10, k kVar, String str, String str2, boolean z8, com.mbridge.msdk.b.a.a aVar) {
        try {
            a(i9, j7, i10, kVar, str, str2, aVar, z8);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }
}
