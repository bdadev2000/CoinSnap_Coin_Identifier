package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.provider.FontRequestWorker;
import androidx.core.provider.FontsContractCompat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class CallbackWithHandler {

    /* renamed from: a, reason: collision with root package name */
    public final FontsContractCompat.FontRequestCallback f18617a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f18618b;

    public CallbackWithHandler(TypefaceCompat.ResourcesCallbackAdapter resourcesCallbackAdapter, Handler handler) {
        this.f18617a = resourcesCallbackAdapter;
        this.f18618b = handler;
    }

    public final void a(FontRequestWorker.TypefaceResult typefaceResult) {
        final int i2 = typefaceResult.f18640b;
        Handler handler = this.f18618b;
        final FontsContractCompat.FontRequestCallback fontRequestCallback = this.f18617a;
        if (i2 != 0) {
            handler.post(new Runnable() { // from class: androidx.core.provider.CallbackWithHandler.2
                @Override // java.lang.Runnable
                public final void run() {
                    FontsContractCompat.FontRequestCallback.this.a(i2);
                }
            });
        } else {
            final Typeface typeface = typefaceResult.f18639a;
            handler.post(new Runnable() { // from class: androidx.core.provider.CallbackWithHandler.1
                @Override // java.lang.Runnable
                public final void run() {
                    FontsContractCompat.FontRequestCallback.this.b(typeface);
                }
            });
        }
    }
}
