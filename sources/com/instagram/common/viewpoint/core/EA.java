package com.instagram.common.viewpoint.core;

import android.os.ConditionVariable;

/* loaded from: assets/audience_network.dex */
public class EA implements Runnable {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ EL A01;

    public EA(EL el, ConditionVariable conditionVariable) {
        this.A01 = el;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.open();
        } catch (Throwable th) {
            KQ.A00(th, this);
        }
    }
}
