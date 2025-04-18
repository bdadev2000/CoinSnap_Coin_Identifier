package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import com.facebook.internal.i;
import java.io.File;
import mi.a;
import o.q;
import v3.c;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        int i10 = 9;
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            a.q(context, new l.a(i10), new c(this, 9), true);
            return;
        }
        int i11 = 10;
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    l.a aVar = new l.a(i11);
                    c cVar = new c(this, 9);
                    try {
                        a.j(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        aVar.execute(new q(cVar, 10, (Object) null, 2));
                        return;
                    } catch (PackageManager.NameNotFoundException e2) {
                        aVar.execute(new q(cVar, 7, e2, 2));
                        return;
                    }
                }
                if ("DELETE_SKIP_FILE".equals(string)) {
                    l.a aVar2 = new l.a(11);
                    c cVar2 = new c(this, 9);
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    aVar2.execute(new q(cVar2, 11, (Object) null, 2));
                    return;
                }
                return;
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            c cVar3 = new c(this, 9);
            Process.sendSignal(Process.myPid(), 10);
            cVar3.f(12, null);
        } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            c cVar4 = new c(this, 9);
            if ("DROP_SHADER_CACHE".equals(string2)) {
                if (i.m(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                    cVar4.f(14, null);
                    return;
                } else {
                    cVar4.f(15, null);
                    return;
                }
            }
            cVar4.f(16, null);
        }
    }
}
