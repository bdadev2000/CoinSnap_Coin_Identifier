package cat.ereza.customactivityoncrash.provider;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.lang.Thread;
import y2.b;
import y2.c;

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

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        Application application = c.a;
        try {
            if (context == null) {
                Log.e("CustomActivityOnCrash", "Install failed: context is null!");
                return false;
            }
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null && defaultUncaughtExceptionHandler.getClass().getName().startsWith("cat.ereza.customactivityoncrash")) {
                Log.e("CustomActivityOnCrash", "CustomActivityOnCrash was already installed, doing nothing!");
            } else {
                if (defaultUncaughtExceptionHandler != null && !defaultUncaughtExceptionHandler.getClass().getName().startsWith("com.android.internal.os")) {
                    Log.e("CustomActivityOnCrash", "IMPORTANT WARNING! You already have an UncaughtExceptionHandler, are you sure this is correct? If you use a custom UncaughtExceptionHandler, you must initialize it AFTER CustomActivityOnCrash! Installing anyway, but your original handler will not be called.");
                }
                c.a = (Application) context.getApplicationContext();
                Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: y2.a
                    /* JADX WARN: Can't wrap try/catch for region: R(10:18|(8:20|21|22|(1:24)|25|26|(2:63|(3:64|(1:(1:74)(2:66|(1:72)(1:70)))|79))(0)|(2:31|(2:33|34))(5:35|(1:37)|38|(5:40|(5:42|43|44|(4:46|(3:50|51|52)|56|52)|57)|61|(0)|57)|62))|85|(0)|25|26|(1:28)|63|(3:64|(2:(0)(0)|72)|79)|(0)(0)) */
                    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ed, code lost:
                    
                        r4 = r4.getCause();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f1, code lost:
                    
                        if (r4 != null) goto L87;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f3, code lost:
                    
                        r11 = false;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ba, code lost:
                    
                        r10 = null;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
                    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
                    /* JADX WARN: Removed duplicated region for block: B:35:0x0102  */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x0181  */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x00ed A[EDGE_INSN: B:74:0x00ed->B:75:0x00ed BREAK  A[LOOP:1: B:65:0x00cd->B:72:0x00ea], SYNTHETIC] */
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void uncaughtException(java.lang.Thread r17, java.lang.Throwable r18) {
                        /*
                            Method dump skipped, instructions count: 475
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: y2.a.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
                    }
                });
                c.a.registerActivityLifecycleCallbacks(new b());
            }
            Log.i("CustomActivityOnCrash", "CustomActivityOnCrash has been installed.");
            return false;
        } catch (Throwable th2) {
            Log.e("CustomActivityOnCrash", "An unknown error occurred while installing CustomActivityOnCrash, it may not have been properly initialized. Please report this as a bug if needed.", th2);
            return false;
        }
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
