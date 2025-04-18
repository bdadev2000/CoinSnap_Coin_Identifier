package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.util.Pools;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes2.dex */
public final class AsyncLayoutInflater {

    /* renamed from: androidx.asynclayoutinflater.view.AsyncLayoutInflater$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            ((InflateRequest) message.obj).getClass();
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static class BasicInflater extends LayoutInflater {

        /* renamed from: a, reason: collision with root package name */
        public static final String[] f1321a = {"android.widget.", "android.webkit.", "android.app."};

        @Override // android.view.LayoutInflater
        public final LayoutInflater cloneInContext(Context context) {
            return new LayoutInflater(context);
        }

        @Override // android.view.LayoutInflater
        public final View onCreateView(String str, AttributeSet attributeSet) {
            View createView;
            String[] strArr = f1321a;
            for (int i2 = 0; i2 < 3; i2++) {
                try {
                    createView = createView(str, strArr[i2], attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (createView != null) {
                    return createView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* loaded from: classes2.dex */
    public static class InflateRequest {
    }

    /* loaded from: classes2.dex */
    public static class InflateThread extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public ArrayBlockingQueue f1322a;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Thread, androidx.asynclayoutinflater.view.AsyncLayoutInflater$InflateThread] */
        static {
            ?? thread = new Thread();
            thread.f1322a = new ArrayBlockingQueue(10);
            new Pools.SynchronizedPool(10);
            thread.start();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            InflateRequest inflateRequest;
            while (true) {
                try {
                    inflateRequest = (InflateRequest) this.f1322a.take();
                    break;
                } catch (InterruptedException e) {
                    Log.w("AsyncLayoutInflater", e);
                }
            }
            try {
                inflateRequest.getClass();
                throw null;
            } catch (RuntimeException e2) {
                Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e2);
                inflateRequest.getClass();
                throw null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface OnInflateFinishedListener {
    }
}
