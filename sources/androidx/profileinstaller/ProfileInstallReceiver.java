package androidx.profileinstaller;

import A0.c;
import C0.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import n1.C2475f;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            e.s(context, new c(0), new C2475f(this, 2), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    C2475f c2475f = new C2475f(this, 2);
                    try {
                        e.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        c2475f.a(10, null);
                        return;
                    } catch (PackageManager.NameNotFoundException e4) {
                        c2475f.a(7, e4);
                        return;
                    }
                }
                if ("DELETE_SKIP_FILE".equals(string)) {
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                    setResultCode(11);
                    return;
                }
                return;
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            Process.sendSignal(Process.myPid(), 10);
            Log.d("ProfileInstaller", "");
            setResultCode(12);
        } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            C2475f c2475f2 = new C2475f(this, 2);
            if ("DROP_SHADER_CACHE".equals(string2)) {
                if (e.c(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                    c2475f2.a(14, null);
                    return;
                } else {
                    c2475f2.a(15, null);
                    return;
                }
            }
            c2475f2.a(16, null);
        }
    }
}
