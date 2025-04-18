package com.apm.insight.g;

import com.apm.insight.i;
import com.apm.insight.l.q;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public class e {
    public static boolean a(long j3) {
        if (q.a(2)) {
            return true;
        }
        if (q.a(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) {
            return false;
        }
        return (com.apm.insight.runtime.a.b.c() == -1 || j3 - com.apm.insight.runtime.a.b.c() <= i.i().getLaunchCrashInterval()) && !(i.m() && i.p() == 0);
    }
}
