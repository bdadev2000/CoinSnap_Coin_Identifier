package he;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes4.dex */
public final class x implements OnCompleteListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f19107b;

    public x(CountDownLatch countDownLatch) {
        this.f19107b = countDownLatch;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f19107b.countDown();
    }
}
