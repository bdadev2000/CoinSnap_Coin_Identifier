package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;

/* loaded from: classes4.dex */
public class MutableLiveData<T> extends LiveData<T> {
    @Override // androidx.lifecycle.LiveData
    public void h(Object obj) {
        super.h(obj);
    }

    public final void i(Object obj) {
        boolean z2;
        synchronized (this.f20027a) {
            z2 = this.f20030f == LiveData.f20026k;
            this.f20030f = obj;
        }
        if (z2) {
            ArchTaskExecutor.a().b(this.f20034j);
        }
    }
}
