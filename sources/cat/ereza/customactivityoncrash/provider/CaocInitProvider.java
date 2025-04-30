package cat.ereza.customactivityoncrash.provider;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import i1.AbstractC2337c;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public class CaocInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object, i1.b] */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        Application application = AbstractC2337c.f20638a;
        try {
            if (context == null) {
                Log.e("CustomActivityOnCrash", "Install failed: context is null!");
            } else {
                final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null && defaultUncaughtExceptionHandler.getClass().getName().startsWith("cat.ereza.customactivityoncrash")) {
                    Log.e("CustomActivityOnCrash", "CustomActivityOnCrash was already installed, doing nothing!");
                } else {
                    if (defaultUncaughtExceptionHandler != null && !defaultUncaughtExceptionHandler.getClass().getName().startsWith("com.android.internal.os")) {
                        Log.e("CustomActivityOnCrash", "IMPORTANT WARNING! You already have an UncaughtExceptionHandler, are you sure this is correct? If you use a custom UncaughtExceptionHandler, you must initialize it AFTER CustomActivityOnCrash! Installing anyway, but your original handler will not be called.");
                    }
                    AbstractC2337c.f20638a = (Application) context.getApplicationContext();
                    Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: i1.a
                        /* JADX WARN: Can't wrap try/catch for region: R(14:15|(9:17|18|19|(1:21)|22|23|(7:31|(4:32|(2:34|(1:40)(1:38))|42|43)|46|(1:48)|49|(5:51|(5:53|54|55|(3:57|(2:61|62)|66)|67)|71|(0)|67)|72)|27|(2:29|30))|79|(0)|22|23|(1:25)|31|(4:32|(0)|42|43)|46|(0)|49|(0)|72) */
                        /* JADX WARN: Code restructure failed: missing block: B:75:0x00ad, code lost:
                        
                            r6 = null;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
                        /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
                        /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
                        /* JADX WARN: Removed duplicated region for block: B:51:0x0135  */
                        /* JADX WARN: Removed duplicated region for block: B:57:0x0170  */
                        @Override // java.lang.Thread.UncaughtExceptionHandler
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void uncaughtException(java.lang.Thread r14, java.lang.Throwable r15) {
                            /*
                                Method dump skipped, instructions count: 457
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: i1.C2335a.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
                        }
                    });
                    Application application2 = AbstractC2337c.f20638a;
                    ?? obj = new Object();
                    obj.b = 0;
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                    application2.registerActivityLifecycleCallbacks(obj);
                }
                Log.i("CustomActivityOnCrash", "CustomActivityOnCrash has been installed.");
            }
        } catch (Throwable th) {
            Log.e("CustomActivityOnCrash", "An unknown error occurred while installing CustomActivityOnCrash, it may not have been properly initialized. Please report this as a bug if needed.", th);
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
