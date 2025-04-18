package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements Initializer<Result> {

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Choreographer16Impl {
        @DoNotInline
        public static void a(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.c
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j2) {
                    runnable.run();
                }
            });
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Handler28Impl {
        @DoNotInline
        public static Handler a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    /* loaded from: classes.dex */
    public static class Result {
    }

    public static void a(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        profileInstallerInitializer.getClass();
        (Build.VERSION.SDK_INT >= 28 ? Handler28Impl.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new b(context, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
    }

    @Override // androidx.startup.Initializer
    public final Object create(Context context) {
        Choreographer16Impl.a(new androidx.core.content.res.a(4, this, context.getApplicationContext()));
        return new Object();
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return Collections.emptyList();
    }
}
