package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;

@RestrictTo
/* loaded from: classes3.dex */
public class StartWorkRunnable implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public WorkManagerImpl f22202a;

    /* renamed from: b, reason: collision with root package name */
    public String f22203b;

    /* renamed from: c, reason: collision with root package name */
    public WorkerParameters.RuntimeExtras f22204c;

    @Override // java.lang.Runnable
    public final void run() {
        this.f22202a.f21972f.h(this.f22203b, this.f22204c);
    }
}
