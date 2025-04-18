package androidx.compose.ui.platform;

import android.os.Trace;
import android.view.MotionEvent;
import androidx.collection.MutableIntList;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16723b;

    public /* synthetic */ e(Object obj, int i2) {
        this.f16722a = i2;
        this.f16723b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f16722a;
        Object obj = this.f16723b;
        switch (i2) {
            case 0:
                ((q0.a) obj).invoke();
                return;
            case 1:
                AndroidComposeView androidComposeView = (AndroidComposeView) obj;
                androidComposeView.f16234w0 = false;
                MotionEvent motionEvent = androidComposeView.f16223q0;
                p0.a.p(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
                }
                androidComposeView.P(motionEvent);
                return;
            default:
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = (AndroidComposeViewAccessibilityDelegateCompat) obj;
                MutableIntList mutableIntList = AndroidComposeViewAccessibilityDelegateCompat.K;
                Trace.beginSection("measureAndLayout");
                try {
                    androidComposeViewAccessibilityDelegateCompat.f16267a.a(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        androidComposeViewAccessibilityDelegateCompat.e();
                        Trace.endSection();
                        androidComposeViewAccessibilityDelegateCompat.G = false;
                        return;
                    } finally {
                    }
                } finally {
                }
        }
    }
}
