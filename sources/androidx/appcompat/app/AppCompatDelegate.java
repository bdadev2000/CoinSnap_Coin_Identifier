package androidx.appcompat.app;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.ArraySet;
import androidx.collection.IndexBasedArrayIterator;
import androidx.core.os.LocaleListCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class AppCompatDelegate {

    /* renamed from: a, reason: collision with root package name */
    public static final SerialExecutor f396a = new SerialExecutor(new Object());

    /* renamed from: b, reason: collision with root package name */
    public static final int f397b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static LocaleListCompat f398c = null;
    public static LocaleListCompat d = null;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f399f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f400g = false;

    /* renamed from: h, reason: collision with root package name */
    public static final ArraySet f401h = new ArraySet();

    /* renamed from: i, reason: collision with root package name */
    public static final Object f402i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static final Object f403j = new Object();

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api24Impl {
        @DoNotInline
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api33Impl {
        @DoNotInline
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        @DoNotInline
        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface NightMode {
    }

    /* loaded from: classes.dex */
    public static class SerialExecutor implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Object f404a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public final ArrayDeque f405b = new ArrayDeque();

        /* renamed from: c, reason: collision with root package name */
        public final Executor f406c;
        public Runnable d;

        public SerialExecutor(Executor executor) {
            this.f406c = executor;
        }

        public final void a() {
            synchronized (this.f404a) {
                try {
                    Runnable runnable = (Runnable) this.f405b.poll();
                    this.d = runnable;
                    if (runnable != null) {
                        this.f406c.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(final Runnable runnable) {
            synchronized (this.f404a) {
                try {
                    this.f405b.add(new Runnable() { // from class: androidx.appcompat.app.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            Runnable runnable2 = runnable;
                            AppCompatDelegate.SerialExecutor serialExecutor = AppCompatDelegate.SerialExecutor.this;
                            serialExecutor.getClass();
                            try {
                                runnable2.run();
                            } finally {
                                serialExecutor.a();
                            }
                        }
                    });
                    if (this.d == null) {
                        a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class ThreadPerTaskExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static boolean k(Context context) {
        if (f399f == null) {
            try {
                int i2 = AppLocalesMetadataHolderService.f474a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), AppLocalesMetadataHolderService.Api24Impl.a() | 128).metaData;
                if (bundle != null) {
                    f399f = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f399f = Boolean.FALSE;
            }
        }
        return f399f.booleanValue();
    }

    public static void t(AppCompatDelegate appCompatDelegate) {
        synchronized (f402i) {
            try {
                Iterator it = f401h.iterator();
                while (true) {
                    IndexBasedArrayIterator indexBasedArrayIterator = (IndexBasedArrayIterator) it;
                    if (indexBasedArrayIterator.hasNext()) {
                        AppCompatDelegate appCompatDelegate2 = (AppCompatDelegate) ((WeakReference) indexBasedArrayIterator.next()).get();
                        if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                            indexBasedArrayIterator.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void A(CharSequence charSequence);

    public abstract ActionMode B(ActionMode.Callback callback);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public Context b(Context context) {
        return context;
    }

    public abstract View c(int i2);

    public Context d() {
        return null;
    }

    public abstract ActionBarDrawerToggle.Delegate e();

    public int f() {
        return -100;
    }

    public abstract MenuInflater g();

    public abstract ActionBar h();

    public abstract void i();

    public abstract void j();

    public abstract void l(Configuration configuration);

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract boolean u(int i2);

    public abstract void v(int i2);

    public abstract void w(View view);

    public abstract void x(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void y(Toolbar toolbar);

    public void z(int i2) {
    }
}
