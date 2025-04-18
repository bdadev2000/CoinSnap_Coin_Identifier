package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;
import n9.h0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1490b;

    public /* synthetic */ a(String str, int i10) {
        this.a = i10;
        this.f1490b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i10 = this.a;
        String str = this.f1490b;
        switch (i10) {
            case 0:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            default:
                int i11 = h0.a;
                return new Thread(runnable, str);
        }
    }
}
