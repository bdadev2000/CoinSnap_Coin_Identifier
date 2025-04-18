package com.pgl.ssdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class Q extends Handler {
    protected WeakReference<a> a;

    /* loaded from: classes4.dex */
    public interface a {
        void a(Message message);
    }

    public Q(Looper looper, a aVar) {
        super(looper);
        if (aVar != null) {
            this.a = new WeakReference<>(aVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar;
        WeakReference<a> weakReference = this.a;
        if (weakReference != null && (aVar = weakReference.get()) != null && message != null) {
            aVar.a(message);
        }
    }
}
