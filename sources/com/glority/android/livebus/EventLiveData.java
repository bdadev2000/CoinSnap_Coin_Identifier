package com.glority.android.livebus;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventLiveData.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u000e\u0010\n\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000bH\u0016J\u0017\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u000fJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/glority/android/livebus/EventLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "()V", "valueSeq", "Ljava/util/concurrent/atomic/AtomicInteger;", "observe", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "observeForever", "setValue", "value", "(Ljava/lang/Object;)V", "wrapObserver", "livebus_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class EventLiveData<T> extends MutableLiveData<T> {
    private final AtomicInteger valueSeq = new AtomicInteger(0);

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T value) {
        this.valueSeq.incrementAndGet();
        super.setValue(value);
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner owner, Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        super.observe(owner, wrapObserver(observer));
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        super.observeForever(wrapObserver(observer));
    }

    private final Observer<T> wrapObserver(final Observer<? super T> observer) {
        return new Observer<T>(this) { // from class: com.glority.android.livebus.EventLiveData$wrapObserver$1
            private final int initialSeq;
            final /* synthetic */ EventLiveData<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                AtomicInteger atomicInteger;
                this.this$0 = this;
                atomicInteger = ((EventLiveData) this).valueSeq;
                this.initialSeq = atomicInteger.get();
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(T value) {
                AtomicInteger atomicInteger;
                atomicInteger = ((EventLiveData) this.this$0).valueSeq;
                if (atomicInteger.get() != this.initialSeq) {
                    observer.onChanged(value);
                }
            }
        };
    }
}
