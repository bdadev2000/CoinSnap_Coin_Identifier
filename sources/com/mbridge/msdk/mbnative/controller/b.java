package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;
import com.mbridge.msdk.c.k;

/* loaded from: classes4.dex */
public abstract class b {
    protected Handler a;

    public abstract void a(int i10, long j3, int i11, k kVar, String str, String str2, com.mbridge.msdk.b.a.a aVar, boolean z10);

    public final synchronized void a(int i10, long j3, int i11, k kVar, String str, String str2, boolean z10, com.mbridge.msdk.b.a.a aVar) {
        try {
            a(i10, j3, i11, kVar, str, str2, aVar, z10);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
