package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements c2.b {
    @Override // c2.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // c2.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean create(Context context) {
        Object obj;
        m mVar = new m(context);
        if (l.f1504j == null) {
            synchronized (l.f1503i) {
                if (l.f1504j == null) {
                    l.f1504j = new l(mVar);
                }
            }
        }
        c2.a c10 = c2.a.c(context);
        c10.getClass();
        synchronized (c2.a.f2530e) {
            try {
                obj = c10.a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c10.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final androidx.lifecycle.p lifecycle = ((androidx.lifecycle.v) obj).getLifecycle();
        lifecycle.a(new androidx.lifecycle.f() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.f
            public final void b() {
                Handler handler;
                EmojiCompatInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = b.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new q(0), 500L);
                lifecycle.b(this);
            }
        });
        return Boolean.TRUE;
    }
}
